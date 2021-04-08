/**
 */
package datadropModel.impl;

import datadropModel.DataDropRepository;
import datadropModel.DatadropModelPackage;
import datadropModel.Project;
import datadropModel.Repository;

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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datadropModel.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datadropModel.impl.ProjectImpl#getProject_id <em>Project id</em>}</li>
 *   <li>{@link datadropModel.impl.ProjectImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link datadropModel.impl.ProjectImpl#getData_drop_repository <em>Data drop repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
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
	 * The default value of the '{@link #getProject_id() <em>Project id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject_id()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProject_id() <em>Project id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject_id()
	 * @generated
	 * @ordered
	 */
	protected String project_id = PROJECT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;

	/**
	 * The cached value of the '{@link #getData_drop_repository() <em>Data drop repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_drop_repository()
	 * @generated
	 * @ordered
	 */
	protected DataDropRepository data_drop_repository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatadropModelPackage.Literals.PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatadropModelPackage.PROJECT__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProject_id() {
		return project_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject_id(String newProject_id) {
		String oldProject_id = project_id;
		project_id = newProject_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadropModelPackage.PROJECT__PROJECT_ID,
					oldProject_id, project_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Repository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<Repository>(Repository.class, this,
					DatadropModelPackage.PROJECT__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDropRepository getData_drop_repository() {
		return data_drop_repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData_drop_repository(DataDropRepository newData_drop_repository,
			NotificationChain msgs) {
		DataDropRepository oldData_drop_repository = data_drop_repository;
		data_drop_repository = newData_drop_repository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DatadropModelPackage.PROJECT__DATA_DROP_REPOSITORY, oldData_drop_repository,
					newData_drop_repository);
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
	public void setData_drop_repository(DataDropRepository newData_drop_repository) {
		if (newData_drop_repository != data_drop_repository) {
			NotificationChain msgs = null;
			if (data_drop_repository != null)
				msgs = ((InternalEObject) data_drop_repository).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DatadropModelPackage.PROJECT__DATA_DROP_REPOSITORY, null, msgs);
			if (newData_drop_repository != null)
				msgs = ((InternalEObject) newData_drop_repository).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DatadropModelPackage.PROJECT__DATA_DROP_REPOSITORY, null, msgs);
			msgs = basicSetData_drop_repository(newData_drop_repository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadropModelPackage.PROJECT__DATA_DROP_REPOSITORY,
					newData_drop_repository, newData_drop_repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DatadropModelPackage.PROJECT__REPOSITORIES:
			return ((InternalEList<?>) getRepositories()).basicRemove(otherEnd, msgs);
		case DatadropModelPackage.PROJECT__DATA_DROP_REPOSITORY:
			return basicSetData_drop_repository(null, msgs);
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
		case DatadropModelPackage.PROJECT__DESCRIPTION:
			return getDescription();
		case DatadropModelPackage.PROJECT__PROJECT_ID:
			return getProject_id();
		case DatadropModelPackage.PROJECT__REPOSITORIES:
			return getRepositories();
		case DatadropModelPackage.PROJECT__DATA_DROP_REPOSITORY:
			return getData_drop_repository();
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
		case DatadropModelPackage.PROJECT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case DatadropModelPackage.PROJECT__PROJECT_ID:
			setProject_id((String) newValue);
			return;
		case DatadropModelPackage.PROJECT__REPOSITORIES:
			getRepositories().clear();
			getRepositories().addAll((Collection<? extends Repository>) newValue);
			return;
		case DatadropModelPackage.PROJECT__DATA_DROP_REPOSITORY:
			setData_drop_repository((DataDropRepository) newValue);
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
		case DatadropModelPackage.PROJECT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case DatadropModelPackage.PROJECT__PROJECT_ID:
			setProject_id(PROJECT_ID_EDEFAULT);
			return;
		case DatadropModelPackage.PROJECT__REPOSITORIES:
			getRepositories().clear();
			return;
		case DatadropModelPackage.PROJECT__DATA_DROP_REPOSITORY:
			setData_drop_repository((DataDropRepository) null);
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
		case DatadropModelPackage.PROJECT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case DatadropModelPackage.PROJECT__PROJECT_ID:
			return PROJECT_ID_EDEFAULT == null ? project_id != null : !PROJECT_ID_EDEFAULT.equals(project_id);
		case DatadropModelPackage.PROJECT__REPOSITORIES:
			return repositories != null && !repositories.isEmpty();
		case DatadropModelPackage.PROJECT__DATA_DROP_REPOSITORY:
			return data_drop_repository != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", project_id: ");
		result.append(project_id);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
