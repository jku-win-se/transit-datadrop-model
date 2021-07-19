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
 *   <li>{@link datadropModel.DataDropRepository#getProfiles <em>Profiles</em>}</li>
 * </ul>
 *
 * @see datadropModel.DatadropModelPackage#getDataDropRepository()
 * @model
 * @generated
 */
public interface DataDropRepository extends RepositoryInterface {
	/**
	 * Returns the value of the '<em><b>Profiles</b></em>' containment reference list.
	 * The list contents are of type {@link datadropModel.Profile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profiles</em>' containment reference list.
	 * @see datadropModel.DatadropModelPackage#getDataDropRepository_Profiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Profile> getProfiles();

} // DataDropRepository
