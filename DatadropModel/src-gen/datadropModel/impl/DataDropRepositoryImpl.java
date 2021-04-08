/**
 */
package datadropModel.impl;

import datadropModel.Credentials;
import datadropModel.DataDropRepository;
import datadropModel.DatadropModelPackage;
import datadropModel.Profile;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Drop Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datadropModel.impl.DataDropRepositoryImpl#getRepository_id <em>Repository id</em>}</li>
 *   <li>{@link datadropModel.impl.DataDropRepositoryImpl#getRepository_name <em>Repository name</em>}</li>
 *   <li>{@link datadropModel.impl.DataDropRepositoryImpl#getRemote_url <em>Remote url</em>}</li>
 *   <li>{@link datadropModel.impl.DataDropRepositoryImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link datadropModel.impl.DataDropRepositoryImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDropRepositoryImpl extends MinimalEObjectImpl.Container implements DataDropRepository {
	/**
	 * The default value of the '{@link #getRepository_id() <em>Repository id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository_id()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepository_id() <em>Repository id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository_id()
	 * @generated
	 * @ordered
	 */
	protected String repository_id = REPOSITORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepository_name() <em>Repository name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository_name()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepository_name() <em>Repository name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository_name()
	 * @generated
	 * @ordered
	 */
	protected String repository_name = REPOSITORY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemote_url() <em>Remote url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote_url()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemote_url() <em>Remote url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote_url()
	 * @generated
	 * @ordered
	 */
	protected String remote_url = REMOTE_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected Credentials credentials;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<Profile> profile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDropRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatadropModelPackage.Literals.DATA_DROP_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepository_id() {
		return repository_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository_id(String newRepository_id) {
		String oldRepository_id = repository_id;
		repository_id = newRepository_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatadropModelPackage.DATA_DROP_REPOSITORY__REPOSITORY_ID, oldRepository_id, repository_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepository_name() {
		return repository_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository_name(String newRepository_name) {
		String oldRepository_name = repository_name;
		repository_name = newRepository_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatadropModelPackage.DATA_DROP_REPOSITORY__REPOSITORY_NAME, oldRepository_name, repository_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemote_url() {
		return remote_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote_url(String newRemote_url) {
		String oldRemote_url = remote_url;
		remote_url = newRemote_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadropModelPackage.DATA_DROP_REPOSITORY__REMOTE_URL,
					oldRemote_url, remote_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Credentials getCredentials() {
		if (credentials != null && credentials.eIsProxy()) {
			InternalEObject oldCredentials = (InternalEObject) credentials;
			credentials = (Credentials) eResolveProxy(oldCredentials);
			if (credentials != oldCredentials) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DatadropModelPackage.DATA_DROP_REPOSITORY__CREDENTIALS, oldCredentials, credentials));
			}
		}
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Credentials basicGetCredentials() {
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredentials(Credentials newCredentials) {
		Credentials oldCredentials = credentials;
		credentials = newCredentials;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatadropModelPackage.DATA_DROP_REPOSITORY__CREDENTIALS, oldCredentials, credentials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Profile> getProfile() {
		if (profile == null) {
			profile = new EObjectContainmentEList<Profile>(Profile.class, this,
					DatadropModelPackage.DATA_DROP_REPOSITORY__PROFILE);
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DatadropModelPackage.DATA_DROP_REPOSITORY__PROFILE:
			return ((InternalEList<?>) getProfile()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DatadropModelPackage.DATA_DROP_REPOSITORY__REPOSITORY_ID:
			return getRepository_id();
		case DatadropModelPackage.DATA_DROP_REPOSITORY__REPOSITORY_NAME:
			return getRepository_name();
		case DatadropModelPackage.DATA_DROP_REPOSITORY__REMOTE_URL:
			return getRemote_url();
		case DatadropModelPackage.DATA_DROP_REPOSITORY__CREDENTIALS:
			if (resolve)
				return getCredentials();
			return basicGetCredentials();
		case DatadropModelPackage.DATA_DROP_REPOSITORY__PROFILE:
			return getProfile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DatadropModelPackage.DATA_DROP_REPOSITORY__REPOSITORY_ID:
			setRepository_id((String) newValue);
			return;
		case DatadropModelPackage.DATA_DROP_REPOSITORY__REPOSITORY_NAME:
			setRepository_name((String) newValue);
			return;
		case DatadropModelPackage.DATA_DROP_REPOSITORY__REMOTE_URL:
			setRemote_url((String) newValue);
			return;
		case DatadropModelPackage.DATA_DROP_REPOSITORY__CREDENTIALS:
			setCredentials((Credentials) newValue);
			return;
		case DatadropModelPackage.DATA_DROP_REPOSITORY__PROFILE:
			getProfile().clear();
			getProfile().addAll((Collection<? extends Profile>) newValue);
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
		case DatadropModelPackage.DATA_DROP_REPOSITORY__REPOSITORY_ID:
			setRepository_id(REPOSITORY_ID_EDEFAULT);
			return;
		case DatadropModelPackage.DATA_DROP_REPOSITORY__REPOSITORY_NAME:
			setRepository_name(REPOSITORY_NAME_EDEFAULT);
			return;
		case DatadropModelPackage.DATA_DROP_REPOSITORY__REMOTE_URL:
			setRemote_url(REMOTE_URL_EDEFAULT);
			return;
		case DatadropModelPackage.DATA_DROP_REPOSITORY__CREDENTIALS:
			setCredentials((Credentials) null);
			return;
		case DatadropModelPackage.DATA_DROP_REPOSITORY__PROFILE:
			getProfile().clear();
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
		case DatadropModelPackage.DATA_DROP_REPOSITORY__REPOSITORY_ID:
			return REPOSITORY_ID_EDEFAULT == null ? repository_id != null
					: !REPOSITORY_ID_EDEFAULT.equals(repository_id);
		case DatadropModelPackage.DATA_DROP_REPOSITORY__REPOSITORY_NAME:
			return REPOSITORY_NAME_EDEFAULT == null ? repository_name != null
					: !REPOSITORY_NAME_EDEFAULT.equals(repository_name);
		case DatadropModelPackage.DATA_DROP_REPOSITORY__REMOTE_URL:
			return REMOTE_URL_EDEFAULT == null ? remote_url != null : !REMOTE_URL_EDEFAULT.equals(remote_url);
		case DatadropModelPackage.DATA_DROP_REPOSITORY__CREDENTIALS:
			return credentials != null;
		case DatadropModelPackage.DATA_DROP_REPOSITORY__PROFILE:
			return profile != null && !profile.isEmpty();
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
		result.append(" (repository_id: ");
		result.append(repository_id);
		result.append(", repository_name: ");
		result.append(repository_name);
		result.append(", remote_url: ");
		result.append(remote_url);
		result.append(')');
		return result.toString();
	}

} //DataDropRepositoryImpl
