/**
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.toursdsl.impl;

import co.edu.uniandes.toursdsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToursdslFactoryImpl extends EFactoryImpl implements ToursdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ToursdslFactory init()
  {
    try
    {
      ToursdslFactory theToursdslFactory = (ToursdslFactory)EPackage.Registry.INSTANCE.getEFactory(ToursdslPackage.eNS_URI);
      if (theToursdslFactory != null)
      {
        return theToursdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ToursdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToursdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ToursdslPackage.TOUR: return createTour();
      case ToursdslPackage.PANORAMA: return createPanorama();
      case ToursdslPackage.HOTSPOT: return createHotspot();
      case ToursdslPackage.COORDENADA: return createCoordenada();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tour createTour()
  {
    TourImpl tour = new TourImpl();
    return tour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Panorama createPanorama()
  {
    PanoramaImpl panorama = new PanoramaImpl();
    return panorama;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hotspot createHotspot()
  {
    HotspotImpl hotspot = new HotspotImpl();
    return hotspot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coordenada createCoordenada()
  {
    CoordenadaImpl coordenada = new CoordenadaImpl();
    return coordenada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToursdslPackage getToursdslPackage()
  {
    return (ToursdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ToursdslPackage getPackage()
  {
    return ToursdslPackage.eINSTANCE;
  }

} //ToursdslFactoryImpl