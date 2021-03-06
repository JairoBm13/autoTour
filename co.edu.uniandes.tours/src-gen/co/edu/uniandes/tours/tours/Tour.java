/**
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.tours.tours;

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
 *   <li>{@link co.edu.uniandes.tours.tours.Tour#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.tours.tours.Tour#getPanoramas <em>Panoramas</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.tours.tours.ToursPackage#getTour()
 * @model
 * @generated
 */
public interface Tour extends EObject
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
   * @see co.edu.uniandes.tours.tours.ToursPackage#getTour_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.tours.tours.Tour#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Panoramas</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.tours.tours.Panorama}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Panoramas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Panoramas</em>' containment reference list.
   * @see co.edu.uniandes.tours.tours.ToursPackage#getTour_Panoramas()
   * @model containment="true"
   * @generated
   */
  EList<Panorama> getPanoramas();

} // Tour
