/**
 */
package datadropModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extractor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datadropModel.Extractor#getId <em>Id</em>}</li>
 *   <li>{@link datadropModel.Extractor#getMandatoryKeys <em>Mandatory Keys</em>}</li>
 * </ul>
 *
 * @see datadropModel.DatadropModelPackage#getExtractor()
 * @model
 * @generated
 */
public interface Extractor extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see datadropModel.DatadropModelPackage#getExtractor_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link datadropModel.Extractor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Mandatory Keys</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Keys</em>' attribute list.
	 * @see datadropModel.DatadropModelPackage#getExtractor_MandatoryKeys()
	 * @model
	 * @generated
	 */
	EList<String> getMandatoryKeys();

} // Extractor
