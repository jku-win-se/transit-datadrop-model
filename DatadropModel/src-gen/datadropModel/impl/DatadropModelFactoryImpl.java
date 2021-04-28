/**
 */
package datadropModel.impl;

import datadropModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatadropModelFactoryImpl extends EFactoryImpl implements DatadropModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatadropModelFactory init() {
		try {
			DatadropModelFactory theDatadropModelFactory = (DatadropModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(DatadropModelPackage.eNS_URI);
			if (theDatadropModelFactory != null) {
				return theDatadropModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatadropModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatadropModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DatadropModelPackage.PROJECT:
			return createProject();
		case DatadropModelPackage.REPOSITORY:
			return createRepository();
		case DatadropModelPackage.ARTIFACT:
			return createArtifact();
		case DatadropModelPackage.FILE:
			return createFile();
		case DatadropModelPackage.CREDENTIALS:
			return createCredentials();
		case DatadropModelPackage.PROFILE:
			return createProfile();
		case DatadropModelPackage.DATA_DROP_REPOSITORY:
			return createDataDropRepository();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Credentials createCredentials() {
		CredentialsImpl credentials = new CredentialsImpl();
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDropRepository createDataDropRepository() {
		DataDropRepositoryImpl dataDropRepository = new DataDropRepositoryImpl();
		return dataDropRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatadropModelPackage getDatadropModelPackage() {
		return (DatadropModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	//@Deprecated
	public static DatadropModelPackage getPackage() {
		return DatadropModelPackage.eINSTANCE;
	}

} //DatadropModelFactoryImpl
