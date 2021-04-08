/**
 */
package datadropModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datadropModel.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link datadropModel.Project#getProject_id <em>Project id</em>}</li>
 *   <li>{@link datadropModel.Project#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link datadropModel.Project#getData_drop_repository <em>Data drop repository</em>}</li>
 * </ul>
 *
 * @see datadropModel.DatadropModelPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see datadropModel.DatadropModelPackage#getProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link datadropModel.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Project id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project id</em>' attribute.
	 * @see #setProject_id(String)
	 * @see datadropModel.DatadropModelPackage#getProject_Project_id()
	 * @model
	 * @generated
	 */
	String getProject_id();

	/**
	 * Sets the value of the '{@link datadropModel.Project#getProject_id <em>Project id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project id</em>' attribute.
	 * @see #getProject_id()
	 * @generated
	 */
	void setProject_id(String value);

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link datadropModel.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see datadropModel.DatadropModelPackage#getProject_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Data drop repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data drop repository</em>' containment reference.
	 * @see #setData_drop_repository(DataDropRepository)
	 * @see datadropModel.DatadropModelPackage#getProject_Data_drop_repository()
	 * @model containment="true"
	 * @generated
	 */
	DataDropRepository getData_drop_repository();

	/**
	 * Sets the value of the '{@link datadropModel.Project#getData_drop_repository <em>Data drop repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data drop repository</em>' containment reference.
	 * @see #getData_drop_repository()
	 * @generated
	 */
	void setData_drop_repository(DataDropRepository value);

} // Project
