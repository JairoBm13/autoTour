/**
 */
package Tours.impl;

import Tours.Coordenada;
import Tours.Hotspot;
import Tours.Panorama;
import Tours.Tour;
import Tours.ToursPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Tours.impl.TourImpl#getPanoramas <em>Panoramas</em>}</li>
 *   <li>{@link Tours.impl.TourImpl#getHotspots <em>Hotspots</em>}</li>
 *   <li>{@link Tours.impl.TourImpl#getCoordenada <em>Coordenada</em>}</li>
 *   <li>{@link Tours.impl.TourImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TourImpl extends MinimalEObjectImpl.Container implements Tour {
	/**
	 * The cached value of the '{@link #getPanoramas() <em>Panoramas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanoramas()
	 * @generated
	 * @ordered
	 */
	protected EList<Panorama> panoramas;

	/**
	 * The cached value of the '{@link #getHotspots() <em>Hotspots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotspots()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotspot> hotspots;

	/**
	 * The cached value of the '{@link #getCoordenada() <em>Coordenada</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordenada()
	 * @generated
	 * @ordered
	 */
	protected EList<Coordenada> coordenada;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = "\"\"";

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToursPackage.Literals.TOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Panorama> getPanoramas() {
		if (panoramas == null) {
			panoramas = new EObjectContainmentEList<Panorama>(Panorama.class, this, ToursPackage.TOUR__PANORAMAS);
		}
		return panoramas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotspot> getHotspots() {
		if (hotspots == null) {
			hotspots = new EObjectContainmentEList<Hotspot>(Hotspot.class, this, ToursPackage.TOUR__HOTSPOTS);
		}
		return hotspots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coordenada> getCoordenada() {
		if (coordenada == null) {
			coordenada = new EObjectContainmentEList<Coordenada>(Coordenada.class, this, ToursPackage.TOUR__COORDENADA);
		}
		return coordenada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.TOUR__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToursPackage.TOUR__PANORAMAS:
				return ((InternalEList<?>)getPanoramas()).basicRemove(otherEnd, msgs);
			case ToursPackage.TOUR__HOTSPOTS:
				return ((InternalEList<?>)getHotspots()).basicRemove(otherEnd, msgs);
			case ToursPackage.TOUR__COORDENADA:
				return ((InternalEList<?>)getCoordenada()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToursPackage.TOUR__PANORAMAS:
				return getPanoramas();
			case ToursPackage.TOUR__HOTSPOTS:
				return getHotspots();
			case ToursPackage.TOUR__COORDENADA:
				return getCoordenada();
			case ToursPackage.TOUR__NOMBRE:
				return getNombre();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToursPackage.TOUR__PANORAMAS:
				getPanoramas().clear();
				getPanoramas().addAll((Collection<? extends Panorama>)newValue);
				return;
			case ToursPackage.TOUR__HOTSPOTS:
				getHotspots().clear();
				getHotspots().addAll((Collection<? extends Hotspot>)newValue);
				return;
			case ToursPackage.TOUR__COORDENADA:
				getCoordenada().clear();
				getCoordenada().addAll((Collection<? extends Coordenada>)newValue);
				return;
			case ToursPackage.TOUR__NOMBRE:
				setNombre((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ToursPackage.TOUR__PANORAMAS:
				getPanoramas().clear();
				return;
			case ToursPackage.TOUR__HOTSPOTS:
				getHotspots().clear();
				return;
			case ToursPackage.TOUR__COORDENADA:
				getCoordenada().clear();
				return;
			case ToursPackage.TOUR__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToursPackage.TOUR__PANORAMAS:
				return panoramas != null && !panoramas.isEmpty();
			case ToursPackage.TOUR__HOTSPOTS:
				return hotspots != null && !hotspots.isEmpty();
			case ToursPackage.TOUR__COORDENADA:
				return coordenada != null && !coordenada.isEmpty();
			case ToursPackage.TOUR__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //TourImpl
