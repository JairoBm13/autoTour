/**
 */
package Tours;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panorama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Tours.Panorama#getName <em>Name</em>}</li>
 *   <li>{@link Tours.Panorama#getHotspots <em>Hotspots</em>}</li>
 * </ul>
 *
 * @see Tours.ToursPackage#getPanorama()
 * @model
 * @generated
 */
public interface Panorama extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"\"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Tours.ToursPackage#getPanorama_Name()
	 * @model default="\"\""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Tours.Panorama#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hotspots</b></em>' containment reference list.
	 * The list contents are of type {@link Tours.Hotspot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hotspots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotspots</em>' containment reference list.
	 * @see Tours.ToursPackage#getPanorama_Hotspots()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Hotspot> getHotspots();

} // Panorama
