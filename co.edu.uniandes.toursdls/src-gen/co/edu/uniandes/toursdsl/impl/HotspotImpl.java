/**
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.toursdsl.impl;

import co.edu.uniandes.toursdsl.Coordenada;
import co.edu.uniandes.toursdsl.Hotspot;
import co.edu.uniandes.toursdsl.Panorama;
import co.edu.uniandes.toursdsl.ToursdslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link co.edu.uniandes.toursdsl.impl.HotspotImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.toursdsl.impl.HotspotImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link co.edu.uniandes.toursdsl.impl.HotspotImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link co.edu.uniandes.toursdsl.impl.HotspotImpl#getPosicion <em>Posicion</em>}</li>
 *   <li>{@link co.edu.uniandes.toursdsl.impl.HotspotImpl#getRotacion <em>Rotacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HotspotImpl extends MinimalEObjectImpl.Container implements Hotspot
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getPosicion() <em>Posicion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosicion()
   * @generated
   * @ordered
   */
  protected Coordenada posicion;

  /**
   * The cached value of the '{@link #getRotacion() <em>Rotacion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotacion()
   * @generated
   * @ordered
   */
  protected Coordenada rotacion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HotspotImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ToursdslPackage.Literals.HOTSPOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToursdslPackage.HOTSPOT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Panorama getDestino()
  {
    if (destino != null && destino.eIsProxy())
    {
      InternalEObject oldDestino = (InternalEObject)destino;
      destino = (Panorama)eResolveProxy(oldDestino);
      if (destino != oldDestino)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToursdslPackage.HOTSPOT__DESTINO, oldDestino, destino));
      }
    }
    return destino;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Panorama basicGetDestino()
  {
    return destino;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestino(Panorama newDestino)
  {
    Panorama oldDestino = destino;
    destino = newDestino;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToursdslPackage.HOTSPOT__DESTINO, oldDestino, destino));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Panorama getOrigen()
  {
    if (origen != null && origen.eIsProxy())
    {
      InternalEObject oldOrigen = (InternalEObject)origen;
      origen = (Panorama)eResolveProxy(oldOrigen);
      if (origen != oldOrigen)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToursdslPackage.HOTSPOT__ORIGEN, oldOrigen, origen));
      }
    }
    return origen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Panorama basicGetOrigen()
  {
    return origen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrigen(Panorama newOrigen)
  {
    Panorama oldOrigen = origen;
    origen = newOrigen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToursdslPackage.HOTSPOT__ORIGEN, oldOrigen, origen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coordenada getPosicion()
  {
    return posicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPosicion(Coordenada newPosicion, NotificationChain msgs)
  {
    Coordenada oldPosicion = posicion;
    posicion = newPosicion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToursdslPackage.HOTSPOT__POSICION, oldPosicion, newPosicion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosicion(Coordenada newPosicion)
  {
    if (newPosicion != posicion)
    {
      NotificationChain msgs = null;
      if (posicion != null)
        msgs = ((InternalEObject)posicion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToursdslPackage.HOTSPOT__POSICION, null, msgs);
      if (newPosicion != null)
        msgs = ((InternalEObject)newPosicion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToursdslPackage.HOTSPOT__POSICION, null, msgs);
      msgs = basicSetPosicion(newPosicion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToursdslPackage.HOTSPOT__POSICION, newPosicion, newPosicion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coordenada getRotacion()
  {
    return rotacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRotacion(Coordenada newRotacion, NotificationChain msgs)
  {
    Coordenada oldRotacion = rotacion;
    rotacion = newRotacion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToursdslPackage.HOTSPOT__ROTACION, oldRotacion, newRotacion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRotacion(Coordenada newRotacion)
  {
    if (newRotacion != rotacion)
    {
      NotificationChain msgs = null;
      if (rotacion != null)
        msgs = ((InternalEObject)rotacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToursdslPackage.HOTSPOT__ROTACION, null, msgs);
      if (newRotacion != null)
        msgs = ((InternalEObject)newRotacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToursdslPackage.HOTSPOT__ROTACION, null, msgs);
      msgs = basicSetRotacion(newRotacion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToursdslPackage.HOTSPOT__ROTACION, newRotacion, newRotacion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ToursdslPackage.HOTSPOT__POSICION:
        return basicSetPosicion(null, msgs);
      case ToursdslPackage.HOTSPOT__ROTACION:
        return basicSetRotacion(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ToursdslPackage.HOTSPOT__NAME:
        return getName();
      case ToursdslPackage.HOTSPOT__DESTINO:
        if (resolve) return getDestino();
        return basicGetDestino();
      case ToursdslPackage.HOTSPOT__ORIGEN:
        if (resolve) return getOrigen();
        return basicGetOrigen();
      case ToursdslPackage.HOTSPOT__POSICION:
        return getPosicion();
      case ToursdslPackage.HOTSPOT__ROTACION:
        return getRotacion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ToursdslPackage.HOTSPOT__NAME:
        setName((String)newValue);
        return;
      case ToursdslPackage.HOTSPOT__DESTINO:
        setDestino((Panorama)newValue);
        return;
      case ToursdslPackage.HOTSPOT__ORIGEN:
        setOrigen((Panorama)newValue);
        return;
      case ToursdslPackage.HOTSPOT__POSICION:
        setPosicion((Coordenada)newValue);
        return;
      case ToursdslPackage.HOTSPOT__ROTACION:
        setRotacion((Coordenada)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ToursdslPackage.HOTSPOT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ToursdslPackage.HOTSPOT__DESTINO:
        setDestino((Panorama)null);
        return;
      case ToursdslPackage.HOTSPOT__ORIGEN:
        setOrigen((Panorama)null);
        return;
      case ToursdslPackage.HOTSPOT__POSICION:
        setPosicion((Coordenada)null);
        return;
      case ToursdslPackage.HOTSPOT__ROTACION:
        setRotacion((Coordenada)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ToursdslPackage.HOTSPOT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ToursdslPackage.HOTSPOT__DESTINO:
        return destino != null;
      case ToursdslPackage.HOTSPOT__ORIGEN:
        return origen != null;
      case ToursdslPackage.HOTSPOT__POSICION:
        return posicion != null;
      case ToursdslPackage.HOTSPOT__ROTACION:
        return rotacion != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //HotspotImpl
