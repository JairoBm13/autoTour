/**
 */
package Tours;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Tours.Tour#getPanoramas <em>Panoramas</em>}</li>
 *   <li>{@link Tours.Tour#getHotspots <em>Hotspots</em>}</li>
 *   <li>{@link Tours.Tour#getCoordenada <em>Coordenada</em>}</li>
 *   <li>{@link Tours.Tour#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see Tours.ToursPackage#getTour()
 * @model
 * @generated
 */
public interface Tour extends EObject {
	/**
	 * Returns the value of the '<em><b>Panoramas</b></em>' containment reference list.
	 * The list contents are of type {@link Tours.Panorama}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panoramas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panoramas</em>' containment reference list.
	 * @see Tours.ToursPackage#getTour_Panoramas()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Panorama> getPanoramas();

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
	 * @see Tours.ToursPackage#getTour_Hotspots()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Hotspot> getHotspots();

	/**
	 * Returns the value of the '<em><b>Coordenada</b></em>' containment reference list.
	 * The list contents are of type {@link Tours.Coordenada}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordenada</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordenada</em>' containment reference list.
	 * @see Tours.ToursPackage#getTour_Coordenada()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Coordenada> getCoordenada();

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
	 * @see Tours.ToursPackage#getTour_Nombre()
	 * @model default="\"\""
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Tours.Tour#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Tour
