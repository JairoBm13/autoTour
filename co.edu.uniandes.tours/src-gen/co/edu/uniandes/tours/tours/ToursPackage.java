/**
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.tours.tours;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.tours.tours.ToursFactory
 * @model kind="package"
 * @generated
 */
public interface ToursPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tours";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.edu.co/uniandes/Tours";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tours";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ToursPackage eINSTANCE = co.edu.uniandes.tours.tours.impl.ToursPackageImpl.init();

  /**
   * The meta object id for the '{@link co.edu.uniandes.tours.tours.impl.TourImpl <em>Tour</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.tours.tours.impl.TourImpl
   * @see co.edu.uniandes.tours.tours.impl.ToursPackageImpl#getTour()
   * @generated
   */
  int TOUR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOUR__NAME = 0;

  /**
   * The feature id for the '<em><b>Panoramas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOUR__PANORAMAS = 1;

  /**
   * The number of structural features of the '<em>Tour</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOUR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.tours.tours.impl.PanoramaImpl <em>Panorama</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.tours.tours.impl.PanoramaImpl
   * @see co.edu.uniandes.tours.tours.impl.ToursPackageImpl#getPanorama()
   * @generated
   */
  int PANORAMA = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PANORAMA__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PANORAMA__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Hotspots</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PANORAMA__HOTSPOTS = 2;

  /**
   * The number of structural features of the '<em>Panorama</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PANORAMA_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link co.edu.uniandes.tours.tours.impl.HotspotImpl <em>Hotspot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.tours.tours.impl.HotspotImpl
   * @see co.edu.uniandes.tours.tours.impl.ToursPackageImpl#getHotspot()
   * @generated
   */
  int HOTSPOT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOTSPOT__NAME = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOTSPOT__TO = 1;

  /**
   * The feature id for the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOTSPOT__POSITION = 2;

  /**
   * The feature id for the '<em><b>Rotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOTSPOT__ROTATION = 3;

  /**
   * The number of structural features of the '<em>Hotspot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOTSPOT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.tours.tours.impl.PositionImpl <em>Position</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.tours.tours.impl.PositionImpl
   * @see co.edu.uniandes.tours.tours.impl.ToursPackageImpl#getPosition()
   * @generated
   */
  int POSITION = 3;

  /**
   * The feature id for the '<em><b>Posx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION__POSX = 0;

  /**
   * The feature id for the '<em><b>Posy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION__POSY = 1;

  /**
   * The feature id for the '<em><b>Posz</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION__POSZ = 2;

  /**
   * The number of structural features of the '<em>Position</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link co.edu.uniandes.tours.tours.impl.RotationImpl <em>Rotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.tours.tours.impl.RotationImpl
   * @see co.edu.uniandes.tours.tours.impl.ToursPackageImpl#getRotation()
   * @generated
   */
  int ROTATION = 4;

  /**
   * The feature id for the '<em><b>Posx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATION__POSX = 0;

  /**
   * The feature id for the '<em><b>Posy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATION__POSY = 1;

  /**
   * The feature id for the '<em><b>Posz</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATION__POSZ = 2;

  /**
   * The number of structural features of the '<em>Rotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link co.edu.uniandes.tours.tours.Tour <em>Tour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tour</em>'.
   * @see co.edu.uniandes.tours.tours.Tour
   * @generated
   */
  EClass getTour();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.tours.tours.Tour#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.tours.tours.Tour#getName()
   * @see #getTour()
   * @generated
   */
  EAttribute getTour_Name();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.tours.tours.Tour#getPanoramas <em>Panoramas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Panoramas</em>'.
   * @see co.edu.uniandes.tours.tours.Tour#getPanoramas()
   * @see #getTour()
   * @generated
   */
  EReference getTour_Panoramas();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.tours.tours.Panorama <em>Panorama</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Panorama</em>'.
   * @see co.edu.uniandes.tours.tours.Panorama
   * @generated
   */
  EClass getPanorama();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.tours.tours.Panorama#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.tours.tours.Panorama#getName()
   * @see #getPanorama()
   * @generated
   */
  EAttribute getPanorama_Name();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.tours.tours.Panorama#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see co.edu.uniandes.tours.tours.Panorama#getDescription()
   * @see #getPanorama()
   * @generated
   */
  EAttribute getPanorama_Description();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.tours.tours.Panorama#getHotspots <em>Hotspots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hotspots</em>'.
   * @see co.edu.uniandes.tours.tours.Panorama#getHotspots()
   * @see #getPanorama()
   * @generated
   */
  EReference getPanorama_Hotspots();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.tours.tours.Hotspot <em>Hotspot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hotspot</em>'.
   * @see co.edu.uniandes.tours.tours.Hotspot
   * @generated
   */
  EClass getHotspot();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.tours.tours.Hotspot#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.tours.tours.Hotspot#getName()
   * @see #getHotspot()
   * @generated
   */
  EAttribute getHotspot_Name();

  /**
   * Returns the meta object for the reference '{@link co.edu.uniandes.tours.tours.Hotspot#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see co.edu.uniandes.tours.tours.Hotspot#getTo()
   * @see #getHotspot()
   * @generated
   */
  EReference getHotspot_To();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.tours.tours.Hotspot#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Position</em>'.
   * @see co.edu.uniandes.tours.tours.Hotspot#getPosition()
   * @see #getHotspot()
   * @generated
   */
  EReference getHotspot_Position();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.tours.tours.Hotspot#getRotation <em>Rotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rotation</em>'.
   * @see co.edu.uniandes.tours.tours.Hotspot#getRotation()
   * @see #getHotspot()
   * @generated
   */
  EReference getHotspot_Rotation();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.tours.tours.Position <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Position</em>'.
   * @see co.edu.uniandes.tours.tours.Position
   * @generated
   */
  EClass getPosition();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.tours.tours.Position#getPosx <em>Posx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Posx</em>'.
   * @see co.edu.uniandes.tours.tours.Position#getPosx()
   * @see #getPosition()
   * @generated
   */
  EAttribute getPosition_Posx();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.tours.tours.Position#getPosy <em>Posy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Posy</em>'.
   * @see co.edu.uniandes.tours.tours.Position#getPosy()
   * @see #getPosition()
   * @generated
   */
  EAttribute getPosition_Posy();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.tours.tours.Position#getPosz <em>Posz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Posz</em>'.
   * @see co.edu.uniandes.tours.tours.Position#getPosz()
   * @see #getPosition()
   * @generated
   */
  EAttribute getPosition_Posz();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.tours.tours.Rotation <em>Rotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rotation</em>'.
   * @see co.edu.uniandes.tours.tours.Rotation
   * @generated
   */
  EClass getRotation();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.tours.tours.Rotation#getPosx <em>Posx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Posx</em>'.
   * @see co.edu.uniandes.tours.tours.Rotation#getPosx()
   * @see #getRotation()
   * @generated
   */
  EAttribute getRotation_Posx();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.tours.tours.Rotation#getPosy <em>Posy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Posy</em>'.
   * @see co.edu.uniandes.tours.tours.Rotation#getPosy()
   * @see #getRotation()
   * @generated
   */
  EAttribute getRotation_Posy();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.tours.tours.Rotation#getPosz <em>Posz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Posz</em>'.
   * @see co.edu.uniandes.tours.tours.Rotation#getPosz()
   * @see #getRotation()
   * @generated
   */
  EAttribute getRotation_Posz();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ToursFactory getToursFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link co.edu.uniandes.tours.tours.impl.TourImpl <em>Tour</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.tours.tours.impl.TourImpl
     * @see co.edu.uniandes.tours.tours.impl.ToursPackageImpl#getTour()
     * @generated
     */
    EClass TOUR = eINSTANCE.getTour();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOUR__NAME = eINSTANCE.getTour_Name();

    /**
     * The meta object literal for the '<em><b>Panoramas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOUR__PANORAMAS = eINSTANCE.getTour_Panoramas();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.tours.tours.impl.PanoramaImpl <em>Panorama</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.tours.tours.impl.PanoramaImpl
     * @see co.edu.uniandes.tours.tours.impl.ToursPackageImpl#getPanorama()
     * @generated
     */
    EClass PANORAMA = eINSTANCE.getPanorama();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PANORAMA__NAME = eINSTANCE.getPanorama_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PANORAMA__DESCRIPTION = eINSTANCE.getPanorama_Description();

    /**
     * The meta object literal for the '<em><b>Hotspots</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PANORAMA__HOTSPOTS = eINSTANCE.getPanorama_Hotspots();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.tours.tours.impl.HotspotImpl <em>Hotspot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.tours.tours.impl.HotspotImpl
     * @see co.edu.uniandes.tours.tours.impl.ToursPackageImpl#getHotspot()
     * @generated
     */
    EClass HOTSPOT = eINSTANCE.getHotspot();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOTSPOT__NAME = eINSTANCE.getHotspot_Name();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOTSPOT__TO = eINSTANCE.getHotspot_To();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOTSPOT__POSITION = eINSTANCE.getHotspot_Position();

    /**
     * The meta object literal for the '<em><b>Rotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOTSPOT__ROTATION = eINSTANCE.getHotspot_Rotation();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.tours.tours.impl.PositionImpl <em>Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.tours.tours.impl.PositionImpl
     * @see co.edu.uniandes.tours.tours.impl.ToursPackageImpl#getPosition()
     * @generated
     */
    EClass POSITION = eINSTANCE.getPosition();

    /**
     * The meta object literal for the '<em><b>Posx</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSITION__POSX = eINSTANCE.getPosition_Posx();

    /**
     * The meta object literal for the '<em><b>Posy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSITION__POSY = eINSTANCE.getPosition_Posy();

    /**
     * The meta object literal for the '<em><b>Posz</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSITION__POSZ = eINSTANCE.getPosition_Posz();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.tours.tours.impl.RotationImpl <em>Rotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.tours.tours.impl.RotationImpl
     * @see co.edu.uniandes.tours.tours.impl.ToursPackageImpl#getRotation()
     * @generated
     */
    EClass ROTATION = eINSTANCE.getRotation();

    /**
     * The meta object literal for the '<em><b>Posx</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROTATION__POSX = eINSTANCE.getRotation_Posx();

    /**
     * The meta object literal for the '<em><b>Posy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROTATION__POSY = eINSTANCE.getRotation_Posy();

    /**
     * The meta object literal for the '<em><b>Posz</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROTATION__POSZ = eINSTANCE.getRotation_Posz();

  }

} //ToursPackage
