/**
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.toursdsl;

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
 *   <li>{@link co.edu.uniandes.toursdsl.Tour#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.toursdsl.Tour#getPlaces <em>Places</em>}</li>
 *   <li>{@link co.edu.uniandes.toursdsl.Tour#getCOMMAplaces <em>COMM Aplaces</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.toursdsl.ToursdslPackage#getTour()
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
   * @see co.edu.uniandes.toursdsl.ToursdslPackage#getTour_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.toursdsl.Tour#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Places</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.toursdsl.Panorama}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Places</em>' containment reference list.
   * @see co.edu.uniandes.toursdsl.ToursdslPackage#getTour_Places()
   * @model containment="true"
   * @generated
   */
  EList<Panorama> getPlaces();

  /**
   * Returns the value of the '<em><b>COMM Aplaces</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.toursdsl.Panorama}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>COMM Aplaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>COMM Aplaces</em>' containment reference list.
   * @see co.edu.uniandes.toursdsl.ToursdslPackage#getTour_COMMAplaces()
   * @model containment="true"
   * @generated
   */
  EList<Panorama> getCOMMAplaces();

} // Tour