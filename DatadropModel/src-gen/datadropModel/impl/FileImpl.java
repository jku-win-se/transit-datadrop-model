/**
 */
package datadropModel.impl;

import datadropModel.DatadropModelPackage;
import datadropModel.Extractor;
import datadropModel.File;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datadropModel.impl.FileImpl#getName <em>Name</em>}</li>
 *   <li>{@link datadropModel.impl.FileImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link datadropModel.impl.FileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datadropModel.impl.FileImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link datadropModel.impl.FileImpl#getExtractor <em>Extractor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtractor() <em>Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractor()
	 * @generated
	 * @ordered
	 */
	protected Extractor extractor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatadropModelPackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadropModelPackage.FILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadropModelPackage.FILE__EXTENSION, oldExtension,
					extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadropModelPackage.FILE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadropModelPackage.FILE__MANDATORY, oldMandatory,
					mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extractor getExtractor() {
		return extractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtractor(Extractor newExtractor, NotificationChain msgs) {
		Extractor oldExtractor = extractor;
		extractor = newExtractor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DatadropModelPackage.FILE__EXTRACTOR, oldExtractor, newExtractor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractor(Extractor newExtractor) {
		if (newExtractor != extractor) {
			NotificationChain msgs = null;
			if (extractor != null)
				msgs = ((InternalEObject) extractor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DatadropModelPackage.FILE__EXTRACTOR, null, msgs);
			if (newExtractor != null)
				msgs = ((InternalEObject) newExtractor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DatadropModelPackage.FILE__EXTRACTOR, null, msgs);
			msgs = basicSetExtractor(newExtractor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadropModelPackage.FILE__EXTRACTOR, newExtractor,
					newExtractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DatadropModelPackage.FILE__EXTRACTOR:
			return basicSetExtractor(null, msgs);
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
		case DatadropModelPackage.FILE__NAME:
			return getName();
		case DatadropModelPackage.FILE__EXTENSION:
			return getExtension();
		case DatadropModelPackage.FILE__DESCRIPTION:
			return getDescription();
		case DatadropModelPackage.FILE__MANDATORY:
			return isMandatory();
		case DatadropModelPackage.FILE__EXTRACTOR:
			return getExtractor();
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
		case DatadropModelPackage.FILE__NAME:
			setName((String) newValue);
			return;
		case DatadropModelPackage.FILE__EXTENSION:
			setExtension((String) newValue);
			return;
		case DatadropModelPackage.FILE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case DatadropModelPackage.FILE__MANDATORY:
			setMandatory((Boolean) newValue);
			return;
		case DatadropModelPackage.FILE__EXTRACTOR:
			setExtractor((Extractor) newValue);
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
		case DatadropModelPackage.FILE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DatadropModelPackage.FILE__EXTENSION:
			setExtension(EXTENSION_EDEFAULT);
			return;
		case DatadropModelPackage.FILE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case DatadropModelPackage.FILE__MANDATORY:
			setMandatory(MANDATORY_EDEFAULT);
			return;
		case DatadropModelPackage.FILE__EXTRACTOR:
			setExtractor((Extractor) null);
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
		case DatadropModelPackage.FILE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DatadropModelPackage.FILE__EXTENSION:
			return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
		case DatadropModelPackage.FILE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case DatadropModelPackage.FILE__MANDATORY:
			return mandatory != MANDATORY_EDEFAULT;
		case DatadropModelPackage.FILE__EXTRACTOR:
			return extractor != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", extension: ");
		result.append(extension);
		result.append(", description: ");
		result.append(description);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(')');
		return result.toString();
	}

} //FileImpl
