/**
 */
package datadropModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datadropModel.Profile#getName <em>Name</em>}</li>
 *   <li>{@link datadropModel.Profile#getMandatory_files <em>Mandatory files</em>}</li>
 * </ul>
 *
 * @see datadropModel.DatadropModelPackage#getProfile()
 * @model
 * @generated
 */
public interface Profile extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see datadropModel.DatadropModelPackage#getProfile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link datadropModel.Profile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory files</b></em>' reference list.
	 * The list contents are of type {@link datadropModel.File}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory files</em>' reference list.
	 * @see datadropModel.DatadropModelPackage#getProfile_Mandatory_files()
	 * @model
	 * @generated
	 */
	EList<File> getMandatory_files();

} // Profile
