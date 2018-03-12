/**
 */
package Tours;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Tours.ToursFactory
 * @model kind="package"
 * @generated
 */
public interface ToursPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Tours";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uniandes.edu.co/Tours";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Tours";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToursPackage eINSTANCE = Tours.impl.ToursPackageImpl.init();

	/**
	 * The meta object id for the '{@link Tours.impl.TourImpl <em>Tour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Tours.impl.TourImpl
	 * @see Tours.impl.ToursPackageImpl#getTour()
	 * @generated
	 */
	int TOUR = 0;

	/**
	 * The feature id for the '<em><b>Panoramas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__PANORAMAS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__NAME = 1;

	/**
	 * The number of structural features of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Tours.impl.PanoramaImpl <em>Panorama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Tours.impl.PanoramaImpl
	 * @see Tours.impl.ToursPackageImpl#getPanorama()
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
	 * The feature id for the '<em><b>Hotspots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA__HOTSPOTS = 1;

	/**
	 * The number of structural features of the '<em>Panorama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Panorama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Tours.impl.HotspotImpl <em>Hotspot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Tours.impl.HotspotImpl
	 * @see Tours.impl.ToursPackageImpl#getHotspot()
	 * @generated
	 */
	int HOTSPOT = 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__TO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__NAME = 1;

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
	 * The number of operations of the '<em>Hotspot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Tours.impl.CoordenadaImpl <em>Coordenada</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Tours.impl.CoordenadaImpl
	 * @see Tours.impl.ToursPackageImpl#getCoordenada()
	 * @generated
	 */
	int COORDENADA = 3;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDENADA__POSX = 0;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDENADA__POSY = 1;

	/**
	 * The feature id for the '<em><b>Posz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDENADA__POSZ = 2;

	/**
	 * The number of structural features of the '<em>Coordenada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDENADA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Coordenada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDENADA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Tours.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Tours.impl.PositionImpl
	 * @see Tours.impl.ToursPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 4;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__POSX = COORDENADA__POSX;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__POSY = COORDENADA__POSY;

	/**
	 * The feature id for the '<em><b>Posz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__POSZ = COORDENADA__POSZ;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = COORDENADA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = COORDENADA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Tours.impl.RotationImpl <em>Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Tours.impl.RotationImpl
	 * @see Tours.impl.ToursPackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 5;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__POSX = COORDENADA__POSX;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__POSY = COORDENADA__POSY;

	/**
	 * The feature id for the '<em><b>Posz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__POSZ = COORDENADA__POSZ;

	/**
	 * The number of structural features of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_FEATURE_COUNT = COORDENADA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_OPERATION_COUNT = COORDENADA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Tours.Tour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tour</em>'.
	 * @see Tours.Tour
	 * @generated
	 */
	EClass getTour();

	/**
	 * Returns the meta object for the containment reference list '{@link Tours.Tour#getPanoramas <em>Panoramas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Panoramas</em>'.
	 * @see Tours.Tour#getPanoramas()
	 * @see #getTour()
	 * @generated
	 */
	EReference getTour_Panoramas();

	/**
	 * Returns the meta object for the attribute '{@link Tours.Tour#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Tours.Tour#getName()
	 * @see #getTour()
	 * @generated
	 */
	EAttribute getTour_Name();

	/**
	 * Returns the meta object for class '{@link Tours.Panorama <em>Panorama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panorama</em>'.
	 * @see Tours.Panorama
	 * @generated
	 */
	EClass getPanorama();

	/**
	 * Returns the meta object for the attribute '{@link Tours.Panorama#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Tours.Panorama#getName()
	 * @see #getPanorama()
	 * @generated
	 */
	EAttribute getPanorama_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Tours.Panorama#getHotspots <em>Hotspots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hotspots</em>'.
	 * @see Tours.Panorama#getHotspots()
	 * @see #getPanorama()
	 * @generated
	 */
	EReference getPanorama_Hotspots();

	/**
	 * Returns the meta object for class '{@link Tours.Hotspot <em>Hotspot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotspot</em>'.
	 * @see Tours.Hotspot
	 * @generated
	 */
	EClass getHotspot();

	/**
	 * Returns the meta object for the reference '{@link Tours.Hotspot#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see Tours.Hotspot#getTo()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_To();

	/**
	 * Returns the meta object for the attribute '{@link Tours.Hotspot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Tours.Hotspot#getName()
	 * @see #getHotspot()
	 * @generated
	 */
	EAttribute getHotspot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Tours.Hotspot#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see Tours.Hotspot#getPosition()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_Position();

	/**
	 * Returns the meta object for the containment reference '{@link Tours.Hotspot#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see Tours.Hotspot#getRotation()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_Rotation();

	/**
	 * Returns the meta object for class '{@link Tours.Coordenada <em>Coordenada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordenada</em>'.
	 * @see Tours.Coordenada
	 * @generated
	 */
	EClass getCoordenada();

	/**
	 * Returns the meta object for the attribute '{@link Tours.Coordenada#getPosx <em>Posx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posx</em>'.
	 * @see Tours.Coordenada#getPosx()
	 * @see #getCoordenada()
	 * @generated
	 */
	EAttribute getCoordenada_Posx();

	/**
	 * Returns the meta object for the attribute '{@link Tours.Coordenada#getPosy <em>Posy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posy</em>'.
	 * @see Tours.Coordenada#getPosy()
	 * @see #getCoordenada()
	 * @generated
	 */
	EAttribute getCoordenada_Posy();

	/**
	 * Returns the meta object for the attribute '{@link Tours.Coordenada#getPosz <em>Posz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posz</em>'.
	 * @see Tours.Coordenada#getPosz()
	 * @see #getCoordenada()
	 * @generated
	 */
	EAttribute getCoordenada_Posz();

	/**
	 * Returns the meta object for class '{@link Tours.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see Tours.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for class '{@link Tours.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation</em>'.
	 * @see Tours.Rotation
	 * @generated
	 */
	EClass getRotation();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Tours.impl.TourImpl <em>Tour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Tours.impl.TourImpl
		 * @see Tours.impl.ToursPackageImpl#getTour()
		 * @generated
		 */
		EClass TOUR = eINSTANCE.getTour();

		/**
		 * The meta object literal for the '<em><b>Panoramas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR__PANORAMAS = eINSTANCE.getTour_Panoramas();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUR__NAME = eINSTANCE.getTour_Name();

		/**
		 * The meta object literal for the '{@link Tours.impl.PanoramaImpl <em>Panorama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Tours.impl.PanoramaImpl
		 * @see Tours.impl.ToursPackageImpl#getPanorama()
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
		 * The meta object literal for the '<em><b>Hotspots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANORAMA__HOTSPOTS = eINSTANCE.getPanorama_Hotspots();

		/**
		 * The meta object literal for the '{@link Tours.impl.HotspotImpl <em>Hotspot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Tours.impl.HotspotImpl
		 * @see Tours.impl.ToursPackageImpl#getHotspot()
		 * @generated
		 */
		EClass HOTSPOT = eINSTANCE.getHotspot();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTSPOT__TO = eINSTANCE.getHotspot_To();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTSPOT__NAME = eINSTANCE.getHotspot_Name();

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
		 * The meta object literal for the '{@link Tours.impl.CoordenadaImpl <em>Coordenada</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Tours.impl.CoordenadaImpl
		 * @see Tours.impl.ToursPackageImpl#getCoordenada()
		 * @generated
		 */
		EClass COORDENADA = eINSTANCE.getCoordenada();

		/**
		 * The meta object literal for the '<em><b>Posx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDENADA__POSX = eINSTANCE.getCoordenada_Posx();

		/**
		 * The meta object literal for the '<em><b>Posy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDENADA__POSY = eINSTANCE.getCoordenada_Posy();

		/**
		 * The meta object literal for the '<em><b>Posz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDENADA__POSZ = eINSTANCE.getCoordenada_Posz();

		/**
		 * The meta object literal for the '{@link Tours.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Tours.impl.PositionImpl
		 * @see Tours.impl.ToursPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link Tours.impl.RotationImpl <em>Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Tours.impl.RotationImpl
		 * @see Tours.impl.ToursPackageImpl#getRotation()
		 * @generated
		 */
		EClass ROTATION = eINSTANCE.getRotation();

	}

} //ToursPackage
