/**
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.tours.tours;

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
 *   <li>{@link co.edu.uniandes.tours.tours.Hotspot#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.tours.tours.Hotspot#getTo <em>To</em>}</li>
 *   <li>{@link co.edu.uniandes.tours.tours.Hotspot#getPosition <em>Position</em>}</li>
 *   <li>{@link co.edu.uniandes.tours.tours.Hotspot#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.tours.tours.ToursPackage#getHotspot()
 * @model
 * @generated
 */
public interface Hotspot extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.edu.uniandes.tours.tours.ToursPackage#getHotspot_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.tours.tours.Hotspot#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(Panorama)
   * @see co.edu.uniandes.tours.tours.ToursPackage#getHotspot_To()
   * @model
   * @generated
   */
  Panorama getTo();

  /**
   * Sets the value of the '{@link co.edu.uniandes.tours.tours.Hotspot#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Panorama value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' containment reference.
   * @see #setPosition(Position)
   * @see co.edu.uniandes.tours.tours.ToursPackage#getHotspot_Position()
   * @model containment="true"
   * @generated
   */
  Position getPosition();

  /**
   * Sets the value of the '{@link co.edu.uniandes.tours.tours.Hotspot#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(Position value);

  /**
   * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rotation</em>' containment reference.
   * @see #setRotation(Rotation)
   * @see co.edu.uniandes.tours.tours.ToursPackage#getHotspot_Rotation()
   * @model containment="true"
   * @generated
   */
  Rotation getRotation();

  /**
   * Sets the value of the '{@link co.edu.uniandes.tours.tours.Hotspot#getRotation <em>Rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rotation</em>' containment reference.
   * @see #getRotation()
   * @generated
   */
  void setRotation(Rotation value);

} // Hotspot
