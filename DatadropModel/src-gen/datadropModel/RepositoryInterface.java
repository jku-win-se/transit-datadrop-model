/**
 */
package datadropModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datadropModel.RepositoryInterface#getRepository_id <em>Repository id</em>}</li>
 *   <li>{@link datadropModel.RepositoryInterface#getRepository_name <em>Repository name</em>}</li>
 *   <li>{@link datadropModel.RepositoryInterface#getRemote_url <em>Remote url</em>}</li>
 *   <li>{@link datadropModel.RepositoryInterface#getCredentials <em>Credentials</em>}</li>
 * </ul>
 *
 * @see datadropModel.DatadropModelPackage#getRepositoryInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RepositoryInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository id</em>' attribute.
	 * @see #setRepository_id(String)
	 * @see datadropModel.DatadropModelPackage#getRepositoryInterface_Repository_id()
	 * @model
	 * @generated
	 */
	String getRepository_id();

	/**
	 * Sets the value of the '{@link datadropModel.RepositoryInterface#getRepository_id <em>Repository id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository id</em>' attribute.
	 * @see #getRepository_id()
	 * @generated
	 */
	void setRepository_id(String value);

	/**
	 * Returns the value of the '<em><b>Repository name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository name</em>' attribute.
	 * @see #setRepository_name(String)
	 * @see datadropModel.DatadropModelPackage#getRepositoryInterface_Repository_name()
	 * @model
	 * @generated
	 */
	String getRepository_name();

	/**
	 * Sets the value of the '{@link datadropModel.RepositoryInterface#getRepository_name <em>Repository name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository name</em>' attribute.
	 * @see #getRepository_name()
	 * @generated
	 */
	void setRepository_name(String value);

	/**
	 * Returns the value of the '<em><b>Remote url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote url</em>' attribute.
	 * @see #setRemote_url(String)
	 * @see datadropModel.DatadropModelPackage#getRepositoryInterface_Remote_url()
	 * @model
	 * @generated
	 */
	String getRemote_url();

	/**
	 * Sets the value of the '{@link datadropModel.RepositoryInterface#getRemote_url <em>Remote url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote url</em>' attribute.
	 * @see #getRemote_url()
	 * @generated
	 */
	void setRemote_url(String value);

	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' containment reference.
	 * @see #setCredentials(Credentials)
	 * @see datadropModel.DatadropModelPackage#getRepositoryInterface_Credentials()
	 * @model containment="true"
	 * @generated
	 */
	Credentials getCredentials();

	/**
	 * Sets the value of the '{@link datadropModel.RepositoryInterface#getCredentials <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials</em>' containment reference.
	 * @see #getCredentials()
	 * @generated
	 */
	void setCredentials(Credentials value);

} // RepositoryInterface
