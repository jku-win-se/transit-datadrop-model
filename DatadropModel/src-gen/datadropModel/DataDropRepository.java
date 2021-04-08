/**
 */
package datadropModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Drop Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datadropModel.DataDropRepository#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see datadropModel.DatadropModelPackage#getDataDropRepository()
 * @model
 * @generated
 */
public interface DataDropRepository extends RepositoryInterface {
	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link datadropModel.Profile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see datadropModel.DatadropModelPackage#getDataDropRepository_Profile()
	 * @model containment="true"
	 * @generated
	 */
	EList<Profile> getProfile();

} // DataDropRepository
