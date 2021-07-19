/**
 */
package datadropModel;

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
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference.
	 * @see #setArtifact(Artifact)
	 * @see datadropModel.DatadropModelPackage#getRepository_Artifact()
	 * @model containment="true"
	 * @generated
	 */
	Artifact getArtifact();

	/**
	 * Sets the value of the '{@link datadropModel.Repository#getArtifact <em>Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' containment reference.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(Artifact value);

} // Repository
