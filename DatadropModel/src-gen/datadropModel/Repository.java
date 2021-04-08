/**
 */
package datadropModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datadropModel.Repository#getArtifact <em>Artifact</em>}</li>
 * </ul>
 *
 * @see datadropModel.DatadropModelPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends RepositoryInterface {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link datadropModel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference list.
	 * @see datadropModel.DatadropModelPackage#getRepository_Artifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifact();

} // Repository
