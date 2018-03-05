/**
 */
package Tours.impl;

import Tours.Coordenada;
import Tours.Hotspot;
import Tours.Panorama;
import Tours.ToursPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotspot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Tours.impl.HotspotImpl#getRotacion <em>Rotacion</em>}</li>
 *   <li>{@link Tours.impl.HotspotImpl#getPosicion <em>Posicion</em>}</li>
 *   <li>{@link Tours.impl.HotspotImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link Tours.impl.HotspotImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link Tours.impl.HotspotImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HotspotImpl extends MinimalEObjectImpl.Container implements Hotspot {
	/**
	 * The cached value of the '{@link #getRotacion() <em>Rotacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotacion()
	 * @generated
	 * @ordered
	 */
	protected Coordenada rotacion;

	/**
	 * The cached value of the '{@link #getPosicion() <em>Posicion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosicion()
	 * @generated
	 * @ordered
	 */
	protected Coordenada posicion;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Panorama destino;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected Panorama origen;

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
	protected HotspotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToursPackage.Literals.HOTSPOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordenada getRotacion() {
		if (rotacion != null && rotacion.eIsProxy()) {
			InternalEObject oldRotacion = (InternalEObject)rotacion;
			rotacion = (Coordenada)eResolveProxy(oldRotacion);
			if (rotacion != oldRotacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToursPackage.HOTSPOT__ROTACION, oldRotacion, rotacion));
			}
		}
		return rotacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordenada basicGetRotacion() {
		return rotacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotacion(Coordenada newRotacion) {
		Coordenada oldRotacion = rotacion;
		rotacion = newRotacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.HOTSPOT__ROTACION, oldRotacion, rotacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordenada getPosicion() {
		if (posicion != null && posicion.eIsProxy()) {
			InternalEObject oldPosicion = (InternalEObject)posicion;
			posicion = (Coordenada)eResolveProxy(oldPosicion);
			if (posicion != oldPosicion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToursPackage.HOTSPOT__POSICION, oldPosicion, posicion));
			}
		}
		return posicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordenada basicGetPosicion() {
		return posicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosicion(Coordenada newPosicion) {
		Coordenada oldPosicion = posicion;
		posicion = newPosicion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.HOTSPOT__POSICION, oldPosicion, posicion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panorama getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject)destino;
			destino = (Panorama)eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToursPackage.HOTSPOT__DESTINO, oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panorama basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestino(Panorama newDestino) {
		Panorama oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.HOTSPOT__DESTINO, oldDestino, destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panorama getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject)origen;
			origen = (Panorama)eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToursPackage.HOTSPOT__ORIGEN, oldOrigen, origen));
			}
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panorama basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(Panorama newOrigen) {
		Panorama oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.HOTSPOT__ORIGEN, oldOrigen, origen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.HOTSPOT__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToursPackage.HOTSPOT__ROTACION:
				if (resolve) return getRotacion();
				return basicGetRotacion();
			case ToursPackage.HOTSPOT__POSICION:
				if (resolve) return getPosicion();
				return basicGetPosicion();
			case ToursPackage.HOTSPOT__DESTINO:
				if (resolve) return getDestino();
				return basicGetDestino();
			case ToursPackage.HOTSPOT__ORIGEN:
				if (resolve) return getOrigen();
				return basicGetOrigen();
			case ToursPackage.HOTSPOT__NOMBRE:
				return getNombre();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToursPackage.HOTSPOT__ROTACION:
				setRotacion((Coordenada)newValue);
				return;
			case ToursPackage.HOTSPOT__POSICION:
				setPosicion((Coordenada)newValue);
				return;
			case ToursPackage.HOTSPOT__DESTINO:
				setDestino((Panorama)newValue);
				return;
			case ToursPackage.HOTSPOT__ORIGEN:
				setOrigen((Panorama)newValue);
				return;
			case ToursPackage.HOTSPOT__NOMBRE:
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
			case ToursPackage.HOTSPOT__ROTACION:
				setRotacion((Coordenada)null);
				return;
			case ToursPackage.HOTSPOT__POSICION:
				setPosicion((Coordenada)null);
				return;
			case ToursPackage.HOTSPOT__DESTINO:
				setDestino((Panorama)null);
				return;
			case ToursPackage.HOTSPOT__ORIGEN:
				setOrigen((Panorama)null);
				return;
			case ToursPackage.HOTSPOT__NOMBRE:
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
			case ToursPackage.HOTSPOT__ROTACION:
				return rotacion != null;
			case ToursPackage.HOTSPOT__POSICION:
				return posicion != null;
			case ToursPackage.HOTSPOT__DESTINO:
				return destino != null;
			case ToursPackage.HOTSPOT__ORIGEN:
				return origen != null;
			case ToursPackage.HOTSPOT__NOMBRE:
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

} //HotspotImpl
