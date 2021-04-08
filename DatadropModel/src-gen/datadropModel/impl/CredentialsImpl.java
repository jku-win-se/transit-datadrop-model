/**
 */
package datadropModel.impl;

import datadropModel.Credentials;
import datadropModel.DatadropModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credentials</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datadropModel.impl.CredentialsImpl#getAuth_token <em>Auth token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CredentialsImpl extends MinimalEObjectImpl.Container implements Credentials {
	/**
	 * The default value of the '{@link #getAuth_token() <em>Auth token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuth_token()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuth_token() <em>Auth token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuth_token()
	 * @generated
	 * @ordered
	 */
	protected String auth_token = AUTH_TOKEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CredentialsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatadropModelPackage.Literals.CREDENTIALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuth_token() {
		return auth_token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuth_token(String newAuth_token) {
		String oldAuth_token = auth_token;
		auth_token = newAuth_token;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadropModelPackage.CREDENTIALS__AUTH_TOKEN,
					oldAuth_token, auth_token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DatadropModelPackage.CREDENTIALS__AUTH_TOKEN:
			return getAuth_token();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DatadropModelPackage.CREDENTIALS__AUTH_TOKEN:
			setAuth_token((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DatadropModelPackage.CREDENTIALS__AUTH_TOKEN:
			setAuth_token(AUTH_TOKEN_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DatadropModelPackage.CREDENTIALS__AUTH_TOKEN:
			return AUTH_TOKEN_EDEFAULT == null ? auth_token != null : !AUTH_TOKEN_EDEFAULT.equals(auth_token);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (auth_token: ");
		result.append(auth_token);
		result.append(')');
		return result.toString();
	}

} //CredentialsImpl
