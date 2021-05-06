package datadropmodel.plugin.parts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.emfjson.jackson.resource.JsonResourceFactory;

import datadropModel.DatadropModelPackage;

/***
 * 
 * @author Marco
 *
 */
public class SampleView {

	private static final Logger LOGGER = Logger.getLogger(SampleView.class.getName());
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

	private EObject getDummyEObject() {
		LOGGER.fine("getting dummy object");
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
		LOGGER.info("###################################################################");
		LOGGER.info("#######################    Starting View    #######################");
		LOGGER.info("###################################################################");

		this.content = new Composite(parent, SWT.NONE);

		// create window layout
		this.content.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		var gridData = new GridData(GridData.FILL, GridData.FILL, true, false);
		this.content.setLayoutData(gridData);
		var windowLayout = new GridLayout(1, false);
		windowLayout.marginBottom = 10;
		this.content.setLayout(windowLayout);

		//////////////////////////////////////////
		///////// Additional UI Elements /////////
		//////////////////////////////////////////

		// input directory label
		var inputDir = new Label(this.content, SWT.NONE);
		inputDir.setText("Select input xmi file");

		// add import button
		final var importXMIButton = new Button(this.content, SWT.PUSH);
		importXMIButton.setLayoutData(GD_CENTERED);
		importXMIButton.setText("    Import...    ");

		// import button click event
		importXMIButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				LOGGER.info("-----importing from XMI-----");
				// file import dialog
				var tempShell = new Shell(content.getShell());
				var fileDialog = new FileDialog(tempShell);
				fileDialog.setText("Select XMI file to import");
				String fileImportPath = fileDialog.open();

				if (fileImportPath.isBlank() || fileImportPath.isEmpty()) {
					LOGGER.info("Fileimport path is empty");
				} else {
					LOGGER.info("Importing file:" + fileImportPath);
					ecoreViewModelObj = importModelFromPath(fileImportPath);
					try {
						// render ecore viewmodel
						ECPSWTViewRenderer.INSTANCE.render(content, ecoreViewModelObj);
					} catch (final ECPRendererException e) {
						LOGGER.severe("failed to create composite parent");
						e.printStackTrace();
					}
					removeStartMenu();
					addExportButtons();
				}
			}
		});

		// input directory label
		var newModelLabel = new Label(this.content, SWT.NONE);
		newModelLabel.setText("Create new model");

		// new model button
		final var newModelButton = new Button(this.content, SWT.PUSH);
		newModelButton.setLayoutData(GD_CENTERED);
		newModelButton.setText("    Create new Model    ");
		newModelButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				try {
					// render ecore viewmodel
					LOGGER.info("creating new model");
					ecoreViewModelObj = getDummyEObject();
					ECPSWTViewRenderer.INSTANCE.render(content, ecoreViewModelObj);
					removeStartMenu();
					addExportButtons();
				} catch (final ECPRendererException e) {
					LOGGER.severe("failed to create composite parent");
					e.printStackTrace();
				}
			}
		});

		this.content.layout(true);
		parent.layout(true);
	}

	protected void removeStartMenu() {
		// TODO remove new model and import
		// TODO create reset button
	}

	protected void addExportButtons() {
		// output directory label
		this.dirLabel = new Label(this.content, SWT.NONE);
		this.dirLabel.setText(NO_OUTPUT_DIR_STRING);
		this.dirLabel.setLayoutData(GD_FILLED);

		// browse button for output directory
		final var btnBrowse = new Button(this.content, SWT.NONE);
		btnBrowse.setText("    Browse...    ");
		btnBrowse.setLayoutData(GD_CENTERED);
		this.content.layout(true);

		// called when browse button clicked
		btnBrowse.addListener(SWT.Selection, e -> {
			// open dialog and save directory path
			var tempShell = new Shell(this.content.getShell());
			var dirDialog = new DirectoryDialog(tempShell);
			dirDialog.setText("Select the parent directory for tools");
			outputDirPath = dirDialog.open();
			LOGGER.info("Chosen output directory: " + outputDirPath);

			// update label
			this.dirLabel.setText(OUTPUT_DIR_STRING_PREFIX + outputDirPath);
			while (!tempShell.isDisposed()) {
				if (!tempShell.getDisplay().readAndDispatch()) {
					tempShell.getDisplay().sleep();
				}
			}
			tempShell.getDisplay().dispose();

		});

		// create XMI export checkbox
		this.xmiCheckboxBtn = new Button(this.content, SWT.CHECK);
		this.xmiCheckboxBtn.setText("Create XMI export");
		this.xmiCheckboxBtn.setLayoutData(GD_FILLED);

		// create JSON export checkbox
		this.jsonCheckboxBtn = new Button(this.content, SWT.CHECK);
		this.jsonCheckboxBtn.setText("Create JSON export");
		this.jsonCheckboxBtn.setLayoutData(GD_FILLED);

		// add export to XMI button
		final var exportToXMIButton = new Button(this.content, SWT.PUSH);
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

		this.content.layout();
	}

	/***
	 * 
	 * @return an EObject representation of the values in the forms-editor
	 * @deprecated
	 */
	@Deprecated(since = "0.1")
	protected EObject getFormObject() {
//		return this.renderedComposite.getViewModelContext().getDomainModel();
		return null;
	}

	/***
	 * Shows an error dialog with a specified message
	 * 
	 * @param msg the message that shall be displayed in the dialog.
	 */
	protected void showErrorDialog(String msg) {
		var errorShell = new Shell(content.getShell());
		MessageDialog.openError(errorShell, "Error", msg);
		LOGGER.info(msg);
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

		LOGGER.log(Level.INFO, "EObject Data: {0}", ecoreViewModelObj);

		// create a filename
		String fileName = getFileName();

		// only if the XMI checkbox is selected
		if (doXMIExport) {
			try {
				exportToXMI(fileName + ".xmi", ecoreViewModelObj);
			} catch (IOException e) {
				LOGGER.severe("Unable to save EObject data to XMI file");
				e.printStackTrace();
			}
		}

		// only if the JSON checkbox is selected
		if (doJSONExport) {
			try {
				exportToJson(fileName + ".json", ecoreViewModelObj);
			} catch (IOException e) {
				LOGGER.severe("Unable to save EObject data to JSON file");
				e.printStackTrace();
			}
		}

		// show a dialog that the export finished
		showExportFinishedDialog();

		// reset the export directory and the corresponding values for next export
		resetOutputDirData();
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
		jsonResource.save(null);
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
		LOGGER.log(Level.INFO, "Filename: {0}", fileName);
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
		var infoShell = new Shell(this.content.getShell());
		MessageDialog.openInformation(infoShell, "Created Exports", "Finished, created exports at " + outputDirPath);
	}

	/***
	 * Resets the dialog to be prepared for the next export.
	 */
	private void resetOutputDirData() {
		// reset directory selection
		outputDirPath = "";
		this.dirLabel.setText(NO_OUTPUT_DIR_STRING);

		// reset checkboxes
		this.xmiCheckboxBtn.setSelection(false);
		this.jsonCheckboxBtn.setSelection(false);
	}

	public static EObject importModelFromPath(String path) {
		// normalize to URI
		path = convertToFileURL(path);

		// Initialize Models
		DatadropModelPackage.eINSTANCE.getProject();

		// Create a new Resource set to store the EObjects from the file
		ResourceSet resSet = new ResourceSetImpl();

		// get the resource of your ecore file
		var resource = resSet.getResource(URI.createURI(path), true);

		// Get the first element = root of your model hierarchy
		return resource.getContents().get(0);
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

}
