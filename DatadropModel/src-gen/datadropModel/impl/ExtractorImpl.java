/**
 */
package datadropModel.impl;

import datadropModel.DatadropModelPackage;
import datadropModel.Extractor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datadropModel.impl.ExtractorImpl#getId <em>Id</em>}</li>
 *   <li>{@link datadropModel.impl.ExtractorImpl#getMandatoryKeys <em>Mandatory Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtractorImpl extends MinimalEObjectImpl.Container implements Extractor {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMandatoryKeys() <em>Mandatory Keys</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mandatoryKeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatadropModelPackage.Literals.EXTRACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadropModelPackage.EXTRACTOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMandatoryKeys() {
		if (mandatoryKeys == null) {
			mandatoryKeys = new EDataTypeUniqueEList<String>(String.class, this,
					DatadropModelPackage.EXTRACTOR__MANDATORY_KEYS);
		}
		return mandatoryKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DatadropModelPackage.EXTRACTOR__ID:
			return getId();
		case DatadropModelPackage.EXTRACTOR__MANDATORY_KEYS:
			return getMandatoryKeys();
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
		case DatadropModelPackage.EXTRACTOR__ID:
			setId((Integer) newValue);
			return;
		case DatadropModelPackage.EXTRACTOR__MANDATORY_KEYS:
			getMandatoryKeys().clear();
			getMandatoryKeys().addAll((Collection<? extends String>) newValue);
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
		case DatadropModelPackage.EXTRACTOR__ID:
			setId(ID_EDEFAULT);
			return;
		case DatadropModelPackage.EXTRACTOR__MANDATORY_KEYS:
			getMandatoryKeys().clear();
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
		case DatadropModelPackage.EXTRACTOR__ID:
			return id != ID_EDEFAULT;
		case DatadropModelPackage.EXTRACTOR__MANDATORY_KEYS:
			return mandatoryKeys != null && !mandatoryKeys.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", mandatoryKeys: ");
		result.append(mandatoryKeys);
		result.append(')');
		return result.toString();
	}

} //ExtractorImpl
