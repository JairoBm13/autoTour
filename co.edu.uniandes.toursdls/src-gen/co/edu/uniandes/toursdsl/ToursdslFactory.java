/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.toursdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.toursdsl.ToursdslPackage
 * @generated
 */
public interface ToursdslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ToursdslFactory eINSTANCE = co.edu.uniandes.toursdsl.impl.ToursdslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Tour</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tour</em>'.
   * @generated
   */
  Tour createTour();

  /**
   * Returns a new object of class '<em>Panorama</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Panorama</em>'.
   * @generated
   */
  Panorama createPanorama();

  /**
   * Returns a new object of class '<em>Hotspot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hotspot</em>'.
   * @generated
   */
  Hotspot createHotspot();

  /**
   * Returns a new object of class '<em>Coordenada</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Coordenada</em>'.
   * @generated
   */
  Coordenada createCoordenada();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ToursdslPackage getToursdslPackage();

} //ToursdslFactory
