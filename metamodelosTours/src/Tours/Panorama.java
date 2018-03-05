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
 *   <li>{@link Tours.Panorama#getHotspots <em>Hotspots</em>}</li>
 *   <li>{@link Tours.Panorama#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see Tours.ToursPackage#getPanorama()
 * @model
 * @generated
 */
public interface Panorama extends EObject {
	/**
	 * Returns the value of the '<em><b>Hotspots</b></em>' reference list.
	 * The list contents are of type {@link Tours.Hotspot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hotspots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotspots</em>' reference list.
	 * @see Tours.ToursPackage#getPanorama_Hotspots()
	 * @model required="true"
	 * @generated
	 */
	EList<Hotspot> getHotspots();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The default value is <code>"\"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see Tours.ToursPackage#getPanorama_Nombre()
	 * @model default="\"\""
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Tours.Panorama#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Panorama
