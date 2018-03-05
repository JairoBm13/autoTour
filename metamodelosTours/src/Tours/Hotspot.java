/**
 */
package Tours;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotspot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Tours.Hotspot#getRotacion <em>Rotacion</em>}</li>
 *   <li>{@link Tours.Hotspot#getPosicion <em>Posicion</em>}</li>
 *   <li>{@link Tours.Hotspot#getDestino <em>Destino</em>}</li>
 *   <li>{@link Tours.Hotspot#getOrigen <em>Origen</em>}</li>
 *   <li>{@link Tours.Hotspot#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see Tours.ToursPackage#getHotspot()
 * @model
 * @generated
 */
public interface Hotspot extends EObject {
	/**
	 * Returns the value of the '<em><b>Rotacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotacion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotacion</em>' reference.
	 * @see #setRotacion(Coordenada)
	 * @see Tours.ToursPackage#getHotspot_Rotacion()
	 * @model required="true"
	 * @generated
	 */
	Coordenada getRotacion();

	/**
	 * Sets the value of the '{@link Tours.Hotspot#getRotacion <em>Rotacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotacion</em>' reference.
	 * @see #getRotacion()
	 * @generated
	 */
	void setRotacion(Coordenada value);

	/**
	 * Returns the value of the '<em><b>Posicion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posicion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posicion</em>' reference.
	 * @see #setPosicion(Coordenada)
	 * @see Tours.ToursPackage#getHotspot_Posicion()
	 * @model required="true"
	 * @generated
	 */
	Coordenada getPosicion();

	/**
	 * Sets the value of the '{@link Tours.Hotspot#getPosicion <em>Posicion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posicion</em>' reference.
	 * @see #getPosicion()
	 * @generated
	 */
	void setPosicion(Coordenada value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Panorama)
	 * @see Tours.ToursPackage#getHotspot_Destino()
	 * @model required="true"
	 * @generated
	 */
	Panorama getDestino();

	/**
	 * Sets the value of the '{@link Tours.Hotspot#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Panorama value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Panorama)
	 * @see Tours.ToursPackage#getHotspot_Origen()
	 * @model required="true"
	 * @generated
	 */
	Panorama getOrigen();

	/**
	 * Sets the value of the '{@link Tours.Hotspot#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Panorama value);

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
	 * @see Tours.ToursPackage#getHotspot_Nombre()
	 * @model default="\"\""
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Tours.Hotspot#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Hotspot
