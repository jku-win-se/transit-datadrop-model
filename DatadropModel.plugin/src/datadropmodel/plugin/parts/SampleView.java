package datadropmodel.plugin.parts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.emfjson.jackson.resource.JsonResourceFactory;

import datadropModel.DatadropModelPackage;

public class SampleView {

	private static final Logger LOGGER = Util.getLogger(SampleView.class.getName());
	private static final String OUTPUT_DIR_STRING_PREFIX = "Output directory: ";
	private static final String NO_OUTPUT_DIR_STRING = OUTPUT_DIR_STRING_PREFIX + "No directory specified!";
	private static final GridData GD_CENTERED = new GridData(SWT.CENTER, SWT.BEGINNING, false, false);
	private Composite content;
	private String outputDirPath;
	private Label dirLabel;

	private EObject getDummyEObject() {
		LOGGER.fine("getting dummy object");
		final EClass eClass = DatadropModelPackage.eINSTANCE.getProject();
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
		LOGGER.fine("creating composite paraent");
		final EObject ecoreViewModelObj = getDummyEObject();
		try {
			this.content = new Composite(parent, SWT.NONE);

			// create window layout
			this.content.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
			GridData gridData = new GridData(GridData.FILL, GridData.FILL, true, false);
			this.content.setLayoutData(gridData);
			GridLayout windowLayout = new GridLayout(1, false);
			windowLayout.marginBottom = 10;
			this.content.setLayout(windowLayout);

			// render ecore viewmodel
			ECPSWTViewRenderer.INSTANCE.render(this.content, ecoreViewModelObj);

			//////////////////////////////////////////
			///////// Additional UI Elements /////////
			//////////////////////////////////////////

			// output directory label
			this.dirLabel = new Label(this.content, SWT.NONE);
			this.dirLabel.setLayoutData(GD_CENTERED);
			this.dirLabel.setText(NO_OUTPUT_DIR_STRING);

			// browse button for output directory
			final Button btnBrowse = new Button(this.content, SWT.NONE);
			btnBrowse.setLayoutData(GD_CENTERED);
			btnBrowse.setText("Browse directories...");
			// called when browse button clicked
			btnBrowse.addListener(SWT.Selection, e -> {
				// open dialog and save directory path
				Shell tempShell = new Shell(this.content.getShell());
				DirectoryDialog dirDialog = new DirectoryDialog(tempShell);
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

			// create JSON export checkbox
			final Button jsonCheckboxBtn = new Button(this.content, SWT.CHECK);
			jsonCheckboxBtn.setLayoutData(GD_CENTERED);
			jsonCheckboxBtn.setText("Create an additional JSON export");

			// add export to XMI button
			final Button exportToXMIButton = new Button(this.content, SWT.PUSH);
			exportToXMIButton.setText("Export to XMI");
			exportToXMIButton.setLayoutData(GD_CENTERED);

			// export button click event
			exportToXMIButton.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent arg0) {
					if (outputDirPath == null || outputDirPath.isBlank()) {
						// no output directory specified
						Shell errorShell = new Shell(content.getShell());
						MessageDialog.openError(errorShell, "Error", "No output directory specified!");
						LOGGER.info("No output directory specified");
					} else {
						clickedExport(ecoreViewModelObj, jsonCheckboxBtn.getSelection());
					}
				}
			});

			this.content.layout();
		} catch (final ECPRendererException e) {
			LOGGER.severe("failed to create composite parent");
			e.printStackTrace();
		}
		parent.layout();
	}

	/***
	 * Called when clicking the 'Export to XMI'-button
	 * 
	 * @param ecoreViewModelObj the EObject that the viewmodel is based on
	 * @param b
	 */
	protected void clickedExport(EObject ecoreViewModelObj, boolean doJsonExport) {
		LOGGER.info("------Clicked export button------");
		LOGGER.info("EObject Data: " + ecoreViewModelObj.toString());

		String fileName = getFileName();
		try {
			exportToXMI(fileName + ".xml", ecoreViewModelObj);
		} catch (IOException e) {
			LOGGER.severe("Unable to save EObject data to XMI file");
			e.printStackTrace();
		}

		// only if the checkbox is selected
		if (doJsonExport) {
			try {
				exportToJson(fileName + ".json", ecoreViewModelObj);
			} catch (IOException e) {
				LOGGER.severe("Unable to save EObject data to JSON file");
				e.printStackTrace();
			}
		}
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
		// TODO: export not successful yet
		// TODO: style ui
		LOGGER.info("-----exporting to JSON-----");
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
		Resource jsonResource = resourceSet.createResource(URI.createFileURI(fileName));

		jsonResource.getContents().add(ecoreViewModelObj);
		jsonResource.save(null);
	}

	/***
	 * Creates a filepath with filename that consists of the browsed filepath, a
	 * timestamp and '_export.xml'
	 * 
	 * @return
	 */
	private String getFileName() {
		String timePrefix = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		String fileName = outputDirPath + File.separator + timePrefix + "_export";
		LOGGER.info("Filename: " + fileName);
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
		Resource resource = resSet.createResource(URI.createFileURI(fileName));
		resource.getContents().add(data);
		resource.save(Collections.emptyMap());

		showSuccessDialog();
		resetOutputDirData();
	}

	/***
	 * Displays a export success message.
	 * 
	 * @param fileName the filename of the created export.
	 */
	private void showSuccessDialog() {
		Shell infoShell = new Shell(this.content.getShell());
		MessageDialog.openInformation(infoShell, "Export sucessful",
				"The exports have been sucessfully created at " + outputDirPath);
	}

	/***
	 * Resets the output directory variables to be prepared for new export.
	 */
	private void resetOutputDirData() {
		outputDirPath = "";
		this.dirLabel.setText(NO_OUTPUT_DIR_STRING);
	}
}
