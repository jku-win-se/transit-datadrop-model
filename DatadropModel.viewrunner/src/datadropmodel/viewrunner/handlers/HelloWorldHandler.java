package datadropmodel.viewrunner.handlers;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import datadropModel.DatadropModelPackage;

public class HelloWorldHandler {

	private final static Logger LOGGER = Logger.getLogger(HelloWorldHandler.class.getName());

	private EObject getDummyEObject() {

		LOGGER.log(Level.INFO, "getDummyEObject");
		// Replace this with your own model EClass to test the application with a custom
		// model
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
		System.out.println("#####################Test#####################");
		LOGGER.log(Level.INFO, "createComposite");
		final EObject dummyObject = getDummyEObject();
		try {
			final Composite content = new Composite(parent, SWT.NONE);
			content.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
			content.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10).create());

			ECPSWTViewRenderer.INSTANCE.render(content, dummyObject);
			content.layout();
		} catch (final ECPRendererException e) {
			e.printStackTrace();
		}
		parent.layout();
	}

}
