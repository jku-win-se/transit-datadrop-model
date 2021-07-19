package datadropmodel.plugin.parts;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import datadropModel.DatadropModelPackage;

/***
 * 
 * @author Marco
 *
 */
public class EditorView {

	private static final String FILE_STRING_ID = "file";
	private static final String MANDATORY_FILES_JSON_ID = "mandatory_files";
	private static final String EXTENSION_STRING_ID = "extension";
	private static final String TYPE_STRING_ID = "type";
	private static final Logger LOGGER = LoggerFactory.getLogger(EditorView.class);
	private static final String OUTPUT_DIR_STRING_PREFIX = "Output directory: ";
	private static final String NO_OUTPUT_DIR_STRING = OUTPUT_DIR_STRING_PREFIX + "No directory specified!";
	private static final GridData GD_FILLED = new GridData(SWT.FILL, SWT.FILL, true, true);
	private static final GridData GD_CENTERED = new GridData(SWT.CENTER, SWT.FILL, true, false);

	private Button xmiCheckboxBtn;
	private Button jsonCheckboxBtn;
	private Composite content;
	private String outputDirPath;
	private Label dirLabel;
	private EObject ecoreViewModelObj;
	private Group mainMenuGroup;
	private Group exportMenuGroup;
	private Group backNavMenuGroup;
	private ECPSWTView modelEditorView;
	private MandatoryFile mandatoryFile;
	private boolean modelContainsUnresolvableMandFile;

	/***
	 * Creates an empty EObject of the Project ecore Object instance.
	 * 
	 * @return an EObject of the DatadropModelPackage Project instance.
	 */
	private EObject getDummyEObject() {
		LOGGER.info("getting dummy object");
		final var eClass = DatadropModelPackage.eINSTANCE.getProject();
		return EcoreUtil.create(eClass);
	}

	/**
	 * Render the editor.
	 *
	 * @param parent the {@link Composite} to render to
	 */
	@PostConstruct
	public void createComposite(Composite parent) {
		LOGGER.info("#######################    Starting View    #######################");

		content = new Composite(parent, SWT.NONE);

		// create window layout
		content.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		var gridData = new GridData(GridData.FILL, GridData.FILL, true, false);
		content.setLayoutData(gridData);
		var windowLayout = new GridLayout(1, false);
		windowLayout.marginBottom = 10;
		content.setLayout(windowLayout);

		// show the source menu
		showMainMenu();

	}

	/***
	 * Shows a main menu in order to choose between a model import or creating a
	 * model from scratch.
	 */
	private void showMainMenu() {
		mainMenuGroup = new Group(content, SWT.NONE);
		mainMenuGroup.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true));
		mainMenuGroup.setLayout(new GridLayout(2, true));
		mainMenuGroup.setText("Main Menu");

		// input directory label
		var inputDir = new Label(mainMenuGroup, SWT.NONE);
		inputDir.setText("Select input xmi file");

		// add import button
		final var importXMIButton = new Button(mainMenuGroup, SWT.PUSH);
		importXMIButton.setText("    Import XMI    ");

		// import button click event
		importXMIButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				LOGGER.info("-----importing from XMI-----");

				// file import dialog
				var tempShell = new Shell(content.getShell());
				var fileDialog = new FileDialog(tempShell);

				// only allow XMI files as input
				fileDialog.setFilterNames(new String[] { "XML Metadata Interchange (*.xmi)" });
				fileDialog.setFilterExtensions(new String[] { "*.xmi" });

				// set dialog text
				fileDialog.setText("Select XMI file to import");

				// get the selected path
				String fileImportPath = fileDialog.open();

				if (fileImportPath == null || fileImportPath.isBlank() || fileImportPath.isEmpty()) {
					LOGGER.info("Fileimport path is empty");
				} else {
					LOGGER.info("Importing file: {}", fileImportPath);
					ecoreViewModelObj = importModelFromPath(fileImportPath);
					try {
						// render form editor
						modelEditorView = ECPSWTViewRenderer.INSTANCE.render(content, ecoreViewModelObj);

						// remove main menu
						removeMainMenu();

						// show export menu
						showExportMenu();

						// show back button
						showNavigationMenu();
					} catch (final ECPRendererException e) {
						LOGGER.error("failed to create composite parent");
						e.printStackTrace();
					}
				}
			}
		});

		// input directory label
		var newModelLabel = new Label(mainMenuGroup, SWT.NONE);
		newModelLabel.setText("Create new model");

		// new model button
		final var newModelButton = new Button(mainMenuGroup, SWT.PUSH);
		newModelButton.setText("    Create new Model    ");
		newModelButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				try {
					// render ecore viewmodel
					LOGGER.info("creating new model");
					ecoreViewModelObj = getDummyEObject();

					// render form editor
					modelEditorView = ECPSWTViewRenderer.INSTANCE.render(content, ecoreViewModelObj);

					// remove main menu
					removeMainMenu();

					// show export menu
					showExportMenu();

					// show back button
					showNavigationMenu();
				} catch (final ECPRendererException e) {
					LOGGER.error("failed to create composite parent");
					e.printStackTrace();
				}
			}
		});

		// help documentation
		var helpLabel = new Label(mainMenuGroup, SWT.NONE);
		helpLabel.setText("Documentation:");

		var helpLink = new Link(mainMenuGroup, SWT.PUSH);
		helpLink.setText("<a href=\"https://github.com/jku-win-se/transit-datadrop-model#readme\">GitHub Link</a>");

		// Event handling when users click on links.
		helpLink.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				Program.launch("https://github.com/jku-win-se/transit-datadrop-model#readme");
			}

		});

		content.layout(true, true);
	}

	/***
	 * Disposes the main menu and updates the window.
	 */
	protected void removeMainMenu() {
		mainMenuGroup.dispose();
		content.layout(true, true);
	}

	/**
	 * Shows a navigation menu with a back button to navigate back to he main menu.
	 */
	protected void showNavigationMenu() {
		// group contents
		backNavMenuGroup = new Group(content, SWT.NONE);
		backNavMenuGroup.setLayoutData(GD_FILLED);
		backNavMenuGroup.setLayout(new GridLayout(1, true));
		backNavMenuGroup.setText("Navigation Menu");

		// add back button
		final var backButton = new Button(backNavMenuGroup, SWT.PUSH);
		backButton.setLayoutData(GD_CENTERED);
		backButton.setText("    <- Back    ");

		// on click
		backButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				backToMainMenu();
			}
		});

		// refresh window
		content.layout(true, true);
	}

	/***
	 * Removes model editor, export menu and the navigation menu and shows
	 * afterwards the main menu.
	 */
	protected void backToMainMenu() {
		// remove the model editor
		removeModelEditor();

		// remove export menu
		removeExportMenu();

		// remove navigation menu
		removeNavMenu();

		// show main menu
		showMainMenu();
	}

	/***
	 * Disposes the model editor assigned to modelEditorView.
	 */
	protected void removeModelEditor() {
		modelEditorView.dispose();
		content.layout(true, true);
	}

	/***
	 * Disposes the export menu.
	 */
	protected void removeExportMenu() {
		exportMenuGroup.dispose();
		content.layout(true, true);
	}

	/***
	 * Disposes the navigation menu.
	 */
	protected void removeNavMenu() {
		backNavMenuGroup.dispose();
		content.layout(true, true);
	}

	/***
	 * Creates an export menu to create JSON and XMI files.
	 */
	protected void showExportMenu() {
		// UI elements in a group
		exportMenuGroup = new Group(content, SWT.NONE);
		exportMenuGroup.setLayoutData(GD_FILLED);
		exportMenuGroup.setLayout(new GridLayout(1, true));
		exportMenuGroup.setText("Export Menu");

		// output directory label
		dirLabel = new Label(exportMenuGroup, SWT.NONE);
		dirLabel.setText(NO_OUTPUT_DIR_STRING);
		dirLabel.setLayoutData(GD_FILLED);

		// browse button for output directory
		final var btnBrowse = new Button(exportMenuGroup, SWT.NONE);
		btnBrowse.setText("    Browse...    ");
		btnBrowse.setLayoutData(GD_CENTERED);
		content.layout(true, true);

		// called when browse button clicked
		btnBrowse.addListener(SWT.Selection, e -> {
			// open dialog and save directory path
			var tempShell = new Shell(content.getShell());
			var dirDialog = new DirectoryDialog(tempShell);
			dirDialog.setText("Select the parent directory for tools");
			outputDirPath = dirDialog.open();
			LOGGER.info("Chosen output directory: {}", outputDirPath);

			// update label
			dirLabel.setText(OUTPUT_DIR_STRING_PREFIX + outputDirPath);
			while (!tempShell.isDisposed() && !tempShell.getDisplay().isDisposed()) {
				if (!tempShell.getDisplay().readAndDispatch()) {
					tempShell.getDisplay().sleep();
				}
			}

			if (!tempShell.isDisposed() && !tempShell.getDisplay().isDisposed()) {
				tempShell.getDisplay().dispose();
			}
		});

		// create XMI export checkbox
		xmiCheckboxBtn = new Button(exportMenuGroup, SWT.CHECK);
		xmiCheckboxBtn.setText("Create XMI export");
		xmiCheckboxBtn.setLayoutData(GD_FILLED);
		// force XMI export
		xmiCheckboxBtn.setSelection(true);
		xmiCheckboxBtn.setEnabled(false);

		// create JSON export checkbox
		jsonCheckboxBtn = new Button(exportMenuGroup, SWT.CHECK);
		jsonCheckboxBtn.setText("Create JSON export");
		jsonCheckboxBtn.setLayoutData(GD_FILLED);

		// add export to XMI button
		final var exportToXMIButton = new Button(exportMenuGroup, SWT.PUSH);
		exportToXMIButton.setLayoutData(GD_CENTERED);
		exportToXMIButton.setText("    Export    ");

		// export button click event
		exportToXMIButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (outputDirPath == null || outputDirPath.isBlank()) {
					// no output directory specified
					showErrorDialog("No output directory specified!");
				} else {
					clickedExport(ecoreViewModelObj, jsonCheckboxBtn.getSelection(), xmiCheckboxBtn.getSelection());
				}
			}
		});

		// update view
		content.layout(true, true);
	}

	/***
	 * Shows an error dialog with a specified message
	 * 
	 * @param msg the message that shall be displayed in the dialog.
	 */
	protected void showErrorDialog(String msg) {
		var errorShell = new Shell(content.getShell());
		MessageDialog.openError(errorShell, "Error", msg);
		String logMsg = msg.replace("\n", " ").replace("\r", " ");
		LOGGER.info(logMsg);
	}

	/***
	 * Shows an error dialog with a specified message
	 * 
	 * @param msg the message that shall be displayed in the dialog.
	 */
	protected void showWarningDialog(String msg) {
		var errorShell = new Shell(content.getShell());
		MessageDialog.openWarning(errorShell, "Warning", msg);
		String logMsg = msg.replace("\n", " ").replace("\r", " ");
		LOGGER.info(logMsg);
	}

	/***
	 * Called when clicking the 'Export to XMI'-button
	 * 
	 * @param ecoreViewModelObj the EObject that the viewmodel is based on
	 * @param doJSONExport      true, if an export to JSON file shall be performed
	 * @param doXMIExport       true, if an export to XMI file shall be performed
	 */
	protected void clickedExport(EObject ecoreViewModelObj, boolean doJSONExport, boolean doXMIExport) {
		LOGGER.info("------Clicked export button------");
		if (!doXMIExport && !doJSONExport) {
			// no export selected, show error message
			showErrorDialog("No export selected!");
			return;
		}

		LOGGER.info("EObject Data: {}", ecoreViewModelObj);

		// create a filename
		String fileName = getFileName();

		// only if the XMI checkbox is selected
		if (doXMIExport) {
			try {
				exportToXMI(fileName + ".xmi", ecoreViewModelObj);
			} catch (IOException e) {
				LOGGER.error("Unable to save EObject data to XMI file");
				e.printStackTrace();
			}
		}

		// only if the JSON checkbox is selected
		if (doJSONExport) {
			try {
				exportToJson(fileName + ".json", ecoreViewModelObj);
			} catch (IOException e) {
				LOGGER.error("Unable to save EObject data to JSON file");
				e.printStackTrace();
			}
		}

		// inform about unresolved mandatory files
		if (modelContainsUnresolvableMandFile) {
			showWarningDialog(
					"""
							At least one of the mandatory files added to the profiles is not referenced in any artifact.
							Make sure that you reference only existing files as mandatory files in the profiles instead of adding new ones!

							Unresolvable files have been ignored in the JSON export.""");

			// reset boolean
			modelContainsUnresolvableMandFile = false;
		}

		// show a dialog that the export finished
		showExportFinishedDialog();

		// reset the export directory and the corresponding values for next export
		resetOutputDirData();

		// go back to main menu afterwards
		backToMainMenu();

	}

	/***
	 * Creates a JSON export file in the specified output directory.
	 * 
	 * @param fileName          the JSON filename with path where at the location
	 *                          where the file shall be saved.
	 * @param ecoreViewModelObj the EObject containing the data to be exported.
	 * @throws IOException When the file could't be saved.
	 */
	private void exportToJson(String fileName, EObject ecoreViewModelObj) throws IOException {

		LOGGER.info("-----exporting to JSON-----");
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
		var jsonResource = resourceSet.createResource(URI.createFileURI(fileName));

		jsonResource.getContents().add(ecoreViewModelObj);

		jsonResource.save(null); // save to file

		// read JSON file as string
		var jsonString = Files.readString(Paths.get(fileName));
		LOGGER.info("JSON File = {}", jsonString);

		// map file to JsonNode
		var objectMapper = new ObjectMapper();
		var rootNode = objectMapper.readTree(jsonString);

		// check if there are mandatory files that need to be replaced
		var mandFileJsonNode = rootNode.findValue(MANDATORY_FILES_JSON_ID);
		if (mandFileJsonNode == null || mandFileJsonNode.isEmpty() || mandFileJsonNode.size() == 0) {
			LOGGER.info("No mandatory files found!");
		} else {
			// iterate over profiles

			// get current profiles
			var profiles = rootNode.findValue("profiles");
			for (JsonNode profileNode : profiles) {

				List<JsonNode> refListNode = profileNode.findValues("$ref");
				List<JsonNode> newNodes = new ArrayList<>();

				for (JsonNode referenceToFile : refListNode) {

					// the reference as string
					var refAsString = referenceToFile.textValue();

					// check if the mandatory file is a new added file without actual reference
					if (refAsString.contains("VIRTAUAL_URI")) {
						modelContainsUnresolvableMandFile = true;
						continue;
					}
					// reset
					mandatoryFile = new MandatoryFile(null, null, null);

					// get the realFile
					navigateToJsonNode(rootNode, refAsString, true);

					// create a JsonNode
					var realFileJsonNode = getMandatoryFileJsonNode(mandatoryFile.getType(), mandatoryFile.getFile(),
							mandatoryFile.getExtension());

					// add it to the list
					newNodes.add(realFileJsonNode);

				}

				// delete old reference nodes
				if (profileNode instanceof ObjectNode) {
					ObjectNode object = (ObjectNode) profileNode;
					object.remove(MANDATORY_FILES_JSON_ID);
				}

				// add the new nodes
				var arrayNode = objectMapper.convertValue(newNodes, ArrayNode.class);
				((ObjectNode) profileNode).set(MANDATORY_FILES_JSON_ID, arrayNode);
			}

			// delete eClass nodes
			List<JsonNode> eClassParentList = rootNode.findParents("eClass");
			for (JsonNode eClassNode : eClassParentList) {
				((ObjectNode) eClassNode).remove("eClass");
			}

			// save the new JSON object
			var file = new File(fileName);
			objectMapper.writeValue(file, rootNode);
		}

	}

	/***
	 * Searches for the real object of a given reference in a JsonNode and saves the
	 * data into into the <code>mandatoryFile</code> field.
	 * 
	 * @param rootNode    the current JsonNode root object
	 * @param refAsString the reference string, e.g.
	 *                    <code>//@repositories.0/@artifact/@files.2</code>
	 * @param isFirst     a boolean indicating if this is the initial root object /
	 *                    indicating if this is the first iteration
	 */
	private void navigateToJsonNode(JsonNode rootNode, String refAsString, boolean isFirst) {
		String[] tempArr = refAsString.substring(1).split("/");
		String currRef = tempArr[0];
		if (isFirst && currRef.isBlank()) {
			// it is the root node, just go one iteration further
			navigateToJsonNode(rootNode, refAsString.substring(1), false);
		} else {

			String key;
			int idx;

			if (currRef.equals("@artifact")) {
				// there is only one artifact
				key = currRef.substring(1); // @artifact -----> artifact
				rootNode = rootNode.get(key);
			} else {
				key = currRef.substring(1, currRef.indexOf(".")); // @repositories.0 -----> repositories
				idx = Integer.parseInt(currRef.substring(currRef.indexOf(".") + 1)); // @repositories.0 -----> 0
				// go to next node
				rootNode = rootNode.get(key).get(idx);
			}

			// check if current node yields data
			if (key.equals("files")) {
				// set filename and extension - return afterwards
				if (rootNode.get("name") != null) {
					mandatoryFile.setFile(rootNode.get("name").textValue());
				}
				LOGGER.info("file={}", mandatoryFile.getFile());
				if (rootNode.get(EXTENSION_STRING_ID) != null) {
					mandatoryFile.setExtension(rootNode.get(EXTENSION_STRING_ID).textValue());
				}
				LOGGER.info("extension={}\n", mandatoryFile.getExtension());
				return;
			} else if (key.equals("artifact")) {
				// set the type
				if (rootNode.get(TYPE_STRING_ID) != null) {
					mandatoryFile.setType(rootNode.get(TYPE_STRING_ID).textValue());
				}
				LOGGER.info("type={}", mandatoryFile.getType());
			}

			navigateToJsonNode(rootNode, refAsString.substring(refAsString.indexOf("/", 1)), false);
		}
	}

	/***
	 * Creates a JsonNode representation of a MandatoryFile object.
	 * 
	 * @param type      the mandatory file type
	 * @param file      the mandatory file name
	 * @param extension the mandatory file extension
	 * @return a JsonNode representation of the MandatoryFile
	 */
	private JsonNode getMandatoryFileJsonNode(String type, String file, String extension) {
		var newNode = JsonNodeFactory.instance.objectNode();
		newNode.put(TYPE_STRING_ID, type);
		newNode.put(FILE_STRING_ID, file);
		newNode.put(EXTENSION_STRING_ID, extension);
		return newNode;
	}

	/***
	 * Creates a filepath with filename that consists of the browsed filepath, a
	 * timestamp and '_export'
	 * 
	 * @return a String in the format
	 *         <code>*outputdir*\YYYY-MM-DD_HH-mm-ss_export</code>
	 */
	private String getFileName() {
		String timePrefix = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		String fileName = outputDirPath + File.separator + timePrefix + "_export";
		LOGGER.info("Filename: {}", fileName);
		return fileName;
	}

	/***
	 * Saves the data of an EObject to a XML/XMI file.
	 * 
	 * @param fileName the filename/path as a String to which the data will be saved
	 * @param data     the EObject that contains the data which shall be saved
	 * @throws IOException when an exception happens during file creation
	 */
	private void exportToXMI(String fileName, EObject data) throws IOException {
		LOGGER.info("-----exporting to XMI-----");
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("project", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		var resource = resSet.createResource(URI.createFileURI(fileName));
		resource.getContents().add(data);
		resource.save(Collections.emptyMap());
	}

	/***
	 * Displays a export success message.
	 * 
	 * @param fileName the filename of the created export.
	 */
	private void showExportFinishedDialog() {
		var infoShell = new Shell(content.getShell());
		MessageDialog.openInformation(infoShell, "Created Export(s)",
				"Finished, created export(s) at " + outputDirPath);
	}

	/***
	 * Resets the dialog to be prepared for the next export.
	 */
	private void resetOutputDirData() {
		// reset directory selection
		outputDirPath = "";
		dirLabel.setText(NO_OUTPUT_DIR_STRING);

		// reset checkboxes
		xmiCheckboxBtn.setSelection(false);
		jsonCheckboxBtn.setSelection(false);
	}

	/***
	 * Takes a complete filepath XMI as input and returns the EObject as Project
	 * instance.
	 * 
	 * @param path the filepath to the XMI file
	 * @return an EObject of type Project that is in assumed to be in the XMI file
	 * 
	 */
	@SuppressWarnings("java:S1854") // suppress rule java:S1854
	public EObject importModelFromPath(String path) {
		// normalize to URI
		path = convertToFileURL(path);

		// initialize an empty object for editing domain
		var newEObject = getDummyEObject();

		// Create a new Resource set to store the EObjects from the file
		ResourceSet resSet = new ResourceSetImpl();

		// get the resource of your ecore file
		var resource = resSet.getResource(URI.createURI(path), true);

		// Get the first element = root of your model hierarchy
		EObject importedObject = resource.getContents().get(0);

		// copy the imported contents into the generated one to keep the created
		// adapters of the new empty object
		newEObject = EcoreUtil.copy(importedObject);

		return newEObject;
	}

	/**
	 * Convert from a filename to a file URL.
	 * 
	 * @param filename the filename that shall be converted to a String URI
	 *                 representation
	 * @return a File URI representation of a given filepath.
	 */
	private static String convertToFileURL(String filename) {
		String path = new File(filename).getAbsolutePath();
		if (File.separatorChar != '/') {
			path = path.replace(File.separatorChar, '/');
		}
		if (!path.startsWith("/")) {
			var stringBuilder = new StringBuilder();
			stringBuilder.append("/");
			stringBuilder.append(path);
			path = stringBuilder.toString();
		}
		return "file:" + path;
	}

	/**
	 * Copies all the properties from one object to anoter.
	 *
	 * @param source The object to copy from.
	 * @param target The object to copy to.
	 */
	public static void copyEObject(EObject source, EObject target) {
		for (EStructuralFeature feature : source.eClass().getEStructuralFeatures()) {
			target.eSet(feature, source.eGet(feature));
		}
	}

}
