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
	 * The feature id for the '<em><b>Hotspots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__HOTSPOTS = 1;

	/**
	 * The feature id for the '<em><b>Coordenada</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__COORDENADA = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__NOMBRE = 3;

	/**
	 * The number of structural features of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Hotspots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA__HOTSPOTS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA__NOMBRE = 1;

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
	 * The feature id for the '<em><b>Rotacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__ROTACION = 0;

	/**
	 * The feature id for the '<em><b>Posicion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__POSICION = 1;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__DESTINO = 2;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__ORIGEN = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__NOMBRE = 4;

	/**
	 * The number of structural features of the '<em>Hotspot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDENADA__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDENADA__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDENADA__Z = 2;

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
	 * Returns the meta object for the containment reference list '{@link Tours.Tour#getHotspots <em>Hotspots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hotspots</em>'.
	 * @see Tours.Tour#getHotspots()
	 * @see #getTour()
	 * @generated
	 */
	EReference getTour_Hotspots();

	/**
	 * Returns the meta object for the containment reference list '{@link Tours.Tour#getCoordenada <em>Coordenada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordenada</em>'.
	 * @see Tours.Tour#getCoordenada()
	 * @see #getTour()
	 * @generated
	 */
	EReference getTour_Coordenada();

	/**
	 * Returns the meta object for the attribute '{@link Tours.Tour#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Tours.Tour#getNombre()
	 * @see #getTour()
	 * @generated
	 */
	EAttribute getTour_Nombre();

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
	 * Returns the meta object for the reference list '{@link Tours.Panorama#getHotspots <em>Hotspots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hotspots</em>'.
	 * @see Tours.Panorama#getHotspots()
	 * @see #getPanorama()
	 * @generated
	 */
	EReference getPanorama_Hotspots();

	/**
	 * Returns the meta object for the attribute '{@link Tours.Panorama#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Tours.Panorama#getNombre()
	 * @see #getPanorama()
	 * @generated
	 */
	EAttribute getPanorama_Nombre();

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
	 * Returns the meta object for the reference '{@link Tours.Hotspot#getRotacion <em>Rotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rotacion</em>'.
	 * @see Tours.Hotspot#getRotacion()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_Rotacion();

	/**
	 * Returns the meta object for the reference '{@link Tours.Hotspot#getPosicion <em>Posicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Posicion</em>'.
	 * @see Tours.Hotspot#getPosicion()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_Posicion();

	/**
	 * Returns the meta object for the reference '{@link Tours.Hotspot#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see Tours.Hotspot#getDestino()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_Destino();

	/**
	 * Returns the meta object for the reference '{@link Tours.Hotspot#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see Tours.Hotspot#getOrigen()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_Origen();

	/**
	 * Returns the meta object for the attribute '{@link Tours.Hotspot#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Tours.Hotspot#getNombre()
	 * @see #getHotspot()
	 * @generated
	 */
	EAttribute getHotspot_Nombre();

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
	 * Returns the meta object for the attribute '{@link Tours.Coordenada#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see Tours.Coordenada#getX()
	 * @see #getCoordenada()
	 * @generated
	 */
	EAttribute getCoordenada_X();

	/**
	 * Returns the meta object for the attribute '{@link Tours.Coordenada#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see Tours.Coordenada#getY()
	 * @see #getCoordenada()
	 * @generated
	 */
	EAttribute getCoordenada_Y();

	/**
	 * Returns the meta object for the attribute '{@link Tours.Coordenada#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see Tours.Coordenada#getZ()
	 * @see #getCoordenada()
	 * @generated
	 */
	EAttribute getCoordenada_Z();

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
		 * The meta object literal for the '<em><b>Hotspots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR__HOTSPOTS = eINSTANCE.getTour_Hotspots();

		/**
		 * The meta object literal for the '<em><b>Coordenada</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR__COORDENADA = eINSTANCE.getTour_Coordenada();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUR__NOMBRE = eINSTANCE.getTour_Nombre();

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
		 * The meta object literal for the '<em><b>Hotspots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANORAMA__HOTSPOTS = eINSTANCE.getPanorama_Hotspots();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANORAMA__NOMBRE = eINSTANCE.getPanorama_Nombre();

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
		 * The meta object literal for the '<em><b>Rotacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTSPOT__ROTACION = eINSTANCE.getHotspot_Rotacion();

		/**
		 * The meta object literal for the '<em><b>Posicion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTSPOT__POSICION = eINSTANCE.getHotspot_Posicion();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTSPOT__DESTINO = eINSTANCE.getHotspot_Destino();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTSPOT__ORIGEN = eINSTANCE.getHotspot_Origen();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTSPOT__NOMBRE = eINSTANCE.getHotspot_Nombre();

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
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDENADA__X = eINSTANCE.getCoordenada_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDENADA__Y = eINSTANCE.getCoordenada_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDENADA__Z = eINSTANCE.getCoordenada_Z();

	}

} //ToursPackage
