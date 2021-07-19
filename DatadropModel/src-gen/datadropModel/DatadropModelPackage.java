/**
 */
package datadropModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see datadropModel.DatadropModelFactory
 * @model kind="package"
 * @generated
 */
public interface DatadropModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datadropModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/datadropModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datadropModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatadropModelPackage eINSTANCE = datadropModel.impl.DatadropModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link datadropModel.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datadropModel.impl.ProjectImpl
	 * @see datadropModel.impl.DatadropModelPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Project id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_ID = 1;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REPOSITORIES = 2;

	/**
	 * The feature id for the '<em><b>Data drop repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DATA_DROP_REPOSITORY = 3;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link datadropModel.RepositoryInterface <em>Repository Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datadropModel.RepositoryInterface
	 * @see datadropModel.impl.DatadropModelPackageImpl#getRepositoryInterface()
	 * @generated
	 */
	int REPOSITORY_INTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Repository id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_INTERFACE__REPOSITORY_ID = 0;

	/**
	 * The feature id for the '<em><b>Repository name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_INTERFACE__REPOSITORY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Remote url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_INTERFACE__REMOTE_URL = 2;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_INTERFACE__CREDENTIALS = 3;

	/**
	 * The number of structural features of the '<em>Repository Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_INTERFACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Repository Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link datadropModel.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datadropModel.impl.RepositoryImpl
	 * @see datadropModel.impl.DatadropModelPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Repository id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REPOSITORY_ID = REPOSITORY_INTERFACE__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Repository name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REPOSITORY_NAME = REPOSITORY_INTERFACE__REPOSITORY_NAME;

	/**
	 * The feature id for the '<em><b>Remote url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REMOTE_URL = REPOSITORY_INTERFACE__REMOTE_URL;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CREDENTIALS = REPOSITORY_INTERFACE__CREDENTIALS;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ARTIFACT = REPOSITORY_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = REPOSITORY_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = REPOSITORY_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link datadropModel.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datadropModel.impl.ArtifactImpl
	 * @see datadropModel.impl.DatadropModelPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__FILES = 2;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link datadropModel.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datadropModel.impl.FileImpl
	 * @see datadropModel.impl.DatadropModelPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MANDATORY = 3;

	/**
	 * The feature id for the '<em><b>Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXTRACTOR = 4;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link datadropModel.impl.CredentialsImpl <em>Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datadropModel.impl.CredentialsImpl
	 * @see datadropModel.impl.DatadropModelPackageImpl#getCredentials()
	 * @generated
	 */
	int CREDENTIALS = 4;

	/**
	 * The feature id for the '<em><b>Auth token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__AUTH_TOKEN = 0;

	/**
	 * The number of structural features of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link datadropModel.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datadropModel.impl.ProfileImpl
	 * @see datadropModel.impl.DatadropModelPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mandatory files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__MANDATORY_FILES = 1;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link datadropModel.impl.DataDropRepositoryImpl <em>Data Drop Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datadropModel.impl.DataDropRepositoryImpl
	 * @see datadropModel.impl.DatadropModelPackageImpl#getDataDropRepository()
	 * @generated
	 */
	int DATA_DROP_REPOSITORY = 7;

	/**
	 * The feature id for the '<em><b>Repository id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DROP_REPOSITORY__REPOSITORY_ID = REPOSITORY_INTERFACE__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Repository name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DROP_REPOSITORY__REPOSITORY_NAME = REPOSITORY_INTERFACE__REPOSITORY_NAME;

	/**
	 * The feature id for the '<em><b>Remote url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DROP_REPOSITORY__REMOTE_URL = REPOSITORY_INTERFACE__REMOTE_URL;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DROP_REPOSITORY__CREDENTIALS = REPOSITORY_INTERFACE__CREDENTIALS;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DROP_REPOSITORY__PROFILE = REPOSITORY_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Drop Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DROP_REPOSITORY_FEATURE_COUNT = REPOSITORY_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Drop Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DROP_REPOSITORY_OPERATION_COUNT = REPOSITORY_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link datadropModel.impl.ExtractorImpl <em>Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datadropModel.impl.ExtractorImpl
	 * @see datadropModel.impl.DatadropModelPackageImpl#getExtractor()
	 * @generated
	 */
	int EXTRACTOR = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Mandatory Keys</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__MANDATORY_KEYS = 1;

	/**
	 * The number of structural features of the '<em>Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link datadropModel.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see datadropModel.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see datadropModel.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.Project#getProject_id <em>Project id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project id</em>'.
	 * @see datadropModel.Project#getProject_id()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Project_id();

	/**
	 * Returns the meta object for the containment reference list '{@link datadropModel.Project#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see datadropModel.Project#getRepositories()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Repositories();

	/**
	 * Returns the meta object for the containment reference '{@link datadropModel.Project#getData_drop_repository <em>Data drop repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data drop repository</em>'.
	 * @see datadropModel.Project#getData_drop_repository()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Data_drop_repository();

	/**
	 * Returns the meta object for class '{@link datadropModel.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see datadropModel.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference '{@link datadropModel.Repository#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact</em>'.
	 * @see datadropModel.Repository#getArtifact()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Artifact();

	/**
	 * Returns the meta object for class '{@link datadropModel.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see datadropModel.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.Artifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see datadropModel.Artifact#getType()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Type();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see datadropModel.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link datadropModel.Artifact#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see datadropModel.Artifact#getFiles()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Files();

	/**
	 * Returns the meta object for class '{@link datadropModel.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see datadropModel.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see datadropModel.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.File#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see datadropModel.File#getExtension()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Extension();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.File#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see datadropModel.File#getDescription()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Description();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.File#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see datadropModel.File#isMandatory()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Mandatory();

	/**
	 * Returns the meta object for the containment reference '{@link datadropModel.File#getExtractor <em>Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extractor</em>'.
	 * @see datadropModel.File#getExtractor()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Extractor();

	/**
	 * Returns the meta object for class '{@link datadropModel.Credentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credentials</em>'.
	 * @see datadropModel.Credentials
	 * @generated
	 */
	EClass getCredentials();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.Credentials#getAuth_token <em>Auth token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth token</em>'.
	 * @see datadropModel.Credentials#getAuth_token()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_Auth_token();

	/**
	 * Returns the meta object for class '{@link datadropModel.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see datadropModel.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.Profile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see datadropModel.Profile#getName()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Name();

	/**
	 * Returns the meta object for the reference list '{@link datadropModel.Profile#getMandatory_files <em>Mandatory files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory files</em>'.
	 * @see datadropModel.Profile#getMandatory_files()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Mandatory_files();

	/**
	 * Returns the meta object for class '{@link datadropModel.RepositoryInterface <em>Repository Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Interface</em>'.
	 * @see datadropModel.RepositoryInterface
	 * @generated
	 */
	EClass getRepositoryInterface();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.RepositoryInterface#getRepository_id <em>Repository id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository id</em>'.
	 * @see datadropModel.RepositoryInterface#getRepository_id()
	 * @see #getRepositoryInterface()
	 * @generated
	 */
	EAttribute getRepositoryInterface_Repository_id();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.RepositoryInterface#getRepository_name <em>Repository name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository name</em>'.
	 * @see datadropModel.RepositoryInterface#getRepository_name()
	 * @see #getRepositoryInterface()
	 * @generated
	 */
	EAttribute getRepositoryInterface_Repository_name();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.RepositoryInterface#getRemote_url <em>Remote url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote url</em>'.
	 * @see datadropModel.RepositoryInterface#getRemote_url()
	 * @see #getRepositoryInterface()
	 * @generated
	 */
	EAttribute getRepositoryInterface_Remote_url();

	/**
	 * Returns the meta object for the containment reference '{@link datadropModel.RepositoryInterface#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credentials</em>'.
	 * @see datadropModel.RepositoryInterface#getCredentials()
	 * @see #getRepositoryInterface()
	 * @generated
	 */
	EReference getRepositoryInterface_Credentials();

	/**
	 * Returns the meta object for class '{@link datadropModel.DataDropRepository <em>Data Drop Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Drop Repository</em>'.
	 * @see datadropModel.DataDropRepository
	 * @generated
	 */
	EClass getDataDropRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link datadropModel.DataDropRepository#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profile</em>'.
	 * @see datadropModel.DataDropRepository#getProfile()
	 * @see #getDataDropRepository()
	 * @generated
	 */
	EReference getDataDropRepository_Profile();

	/**
	 * Returns the meta object for class '{@link datadropModel.Extractor <em>Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor</em>'.
	 * @see datadropModel.Extractor
	 * @generated
	 */
	EClass getExtractor();

	/**
	 * Returns the meta object for the attribute '{@link datadropModel.Extractor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see datadropModel.Extractor#getId()
	 * @see #getExtractor()
	 * @generated
	 */
	EAttribute getExtractor_Id();

	/**
	 * Returns the meta object for the attribute list '{@link datadropModel.Extractor#getMandatoryKeys <em>Mandatory Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mandatory Keys</em>'.
	 * @see datadropModel.Extractor#getMandatoryKeys()
	 * @see #getExtractor()
	 * @generated
	 */
	EAttribute getExtractor_MandatoryKeys();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatadropModelFactory getDatadropModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link datadropModel.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datadropModel.impl.ProjectImpl
		 * @see datadropModel.impl.DatadropModelPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

		/**
		 * The meta object literal for the '<em><b>Project id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT_ID = eINSTANCE.getProject_Project_id();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__REPOSITORIES = eINSTANCE.getProject_Repositories();

		/**
		 * The meta object literal for the '<em><b>Data drop repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DATA_DROP_REPOSITORY = eINSTANCE.getProject_Data_drop_repository();

		/**
		 * The meta object literal for the '{@link datadropModel.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datadropModel.impl.RepositoryImpl
		 * @see datadropModel.impl.DatadropModelPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__ARTIFACT = eINSTANCE.getRepository_Artifact();

		/**
		 * The meta object literal for the '{@link datadropModel.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datadropModel.impl.ArtifactImpl
		 * @see datadropModel.impl.DatadropModelPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__TYPE = eINSTANCE.getArtifact_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__FILES = eINSTANCE.getArtifact_Files();

		/**
		 * The meta object literal for the '{@link datadropModel.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datadropModel.impl.FileImpl
		 * @see datadropModel.impl.DatadropModelPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__EXTENSION = eINSTANCE.getFile_Extension();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__DESCRIPTION = eINSTANCE.getFile_Description();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__MANDATORY = eINSTANCE.getFile_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Extractor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__EXTRACTOR = eINSTANCE.getFile_Extractor();

		/**
		 * The meta object literal for the '{@link datadropModel.impl.CredentialsImpl <em>Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datadropModel.impl.CredentialsImpl
		 * @see datadropModel.impl.DatadropModelPackageImpl#getCredentials()
		 * @generated
		 */
		EClass CREDENTIALS = eINSTANCE.getCredentials();

		/**
		 * The meta object literal for the '<em><b>Auth token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__AUTH_TOKEN = eINSTANCE.getCredentials_Auth_token();

		/**
		 * The meta object literal for the '{@link datadropModel.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datadropModel.impl.ProfileImpl
		 * @see datadropModel.impl.DatadropModelPackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__NAME = eINSTANCE.getProfile_Name();

		/**
		 * The meta object literal for the '<em><b>Mandatory files</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__MANDATORY_FILES = eINSTANCE.getProfile_Mandatory_files();

		/**
		 * The meta object literal for the '{@link datadropModel.RepositoryInterface <em>Repository Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datadropModel.RepositoryInterface
		 * @see datadropModel.impl.DatadropModelPackageImpl#getRepositoryInterface()
		 * @generated
		 */
		EClass REPOSITORY_INTERFACE = eINSTANCE.getRepositoryInterface();

		/**
		 * The meta object literal for the '<em><b>Repository id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_INTERFACE__REPOSITORY_ID = eINSTANCE.getRepositoryInterface_Repository_id();

		/**
		 * The meta object literal for the '<em><b>Repository name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_INTERFACE__REPOSITORY_NAME = eINSTANCE.getRepositoryInterface_Repository_name();

		/**
		 * The meta object literal for the '<em><b>Remote url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_INTERFACE__REMOTE_URL = eINSTANCE.getRepositoryInterface_Remote_url();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_INTERFACE__CREDENTIALS = eINSTANCE.getRepositoryInterface_Credentials();

		/**
		 * The meta object literal for the '{@link datadropModel.impl.DataDropRepositoryImpl <em>Data Drop Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datadropModel.impl.DataDropRepositoryImpl
		 * @see datadropModel.impl.DatadropModelPackageImpl#getDataDropRepository()
		 * @generated
		 */
		EClass DATA_DROP_REPOSITORY = eINSTANCE.getDataDropRepository();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DROP_REPOSITORY__PROFILE = eINSTANCE.getDataDropRepository_Profile();

		/**
		 * The meta object literal for the '{@link datadropModel.impl.ExtractorImpl <em>Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datadropModel.impl.ExtractorImpl
		 * @see datadropModel.impl.DatadropModelPackageImpl#getExtractor()
		 * @generated
		 */
		EClass EXTRACTOR = eINSTANCE.getExtractor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR__ID = eINSTANCE.getExtractor_Id();

		/**
		 * The meta object literal for the '<em><b>Mandatory Keys</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR__MANDATORY_KEYS = eINSTANCE.getExtractor_MandatoryKeys();

	}

} //DatadropModelPackage
