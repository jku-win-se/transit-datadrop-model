/**
 */
package datadropModel.util;

import datadropModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see datadropModel.DatadropModelPackage
 * @generated
 */
public class DatadropModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatadropModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatadropModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatadropModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatadropModelSwitch<Adapter> modelSwitch = new DatadropModelSwitch<Adapter>() {
		@Override
		public Adapter caseProject(Project object) {
			return createProjectAdapter();
		}

		@Override
		public Adapter caseRepository(Repository object) {
			return createRepositoryAdapter();
		}

		@Override
		public Adapter caseArtifact(Artifact object) {
			return createArtifactAdapter();
		}

		@Override
		public Adapter caseFile(File object) {
			return createFileAdapter();
		}

		@Override
		public Adapter caseCredentials(Credentials object) {
			return createCredentialsAdapter();
		}

		@Override
		public Adapter caseProfile(Profile object) {
			return createProfileAdapter();
		}

		@Override
		public Adapter caseRepositoryInterface(RepositoryInterface object) {
			return createRepositoryInterfaceAdapter();
		}

		@Override
		public Adapter caseDataDropRepository(DataDropRepository object) {
			return createDataDropRepositoryAdapter();
		}

		@Override
		public Adapter caseExtractor(Extractor object) {
			return createExtractorAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link datadropModel.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datadropModel.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datadropModel.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datadropModel.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datadropModel.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datadropModel.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datadropModel.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datadropModel.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datadropModel.Credentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datadropModel.Credentials
	 * @generated
	 */
	public Adapter createCredentialsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datadropModel.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datadropModel.Profile
	 * @generated
	 */
	public Adapter createProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datadropModel.RepositoryInterface <em>Repository Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datadropModel.RepositoryInterface
	 * @generated
	 */
	public Adapter createRepositoryInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datadropModel.DataDropRepository <em>Data Drop Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datadropModel.DataDropRepository
	 * @generated
	 */
	public Adapter createDataDropRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datadropModel.Extractor <em>Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datadropModel.Extractor
	 * @generated
	 */
	public Adapter createExtractorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DatadropModelAdapterFactory
