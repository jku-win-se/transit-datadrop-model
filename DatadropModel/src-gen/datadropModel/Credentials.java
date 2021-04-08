/**
 */
package datadropModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credentials</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datadropModel.Credentials#getAuth_token <em>Auth token</em>}</li>
 * </ul>
 *
 * @see datadropModel.DatadropModelPackage#getCredentials()
 * @model
 * @generated
 */
public interface Credentials extends EObject {
	/**
	 * Returns the value of the '<em><b>Auth token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth token</em>' attribute.
	 * @see #setAuth_token(String)
	 * @see datadropModel.DatadropModelPackage#getCredentials_Auth_token()
	 * @model
	 * @generated
	 */
	String getAuth_token();

	/**
	 * Sets the value of the '{@link datadropModel.Credentials#getAuth_token <em>Auth token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth token</em>' attribute.
	 * @see #getAuth_token()
	 * @generated
	 */
	void setAuth_token(String value);

} // Credentials
