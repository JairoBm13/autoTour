/**
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.tours.tours.impl;

import co.edu.uniandes.tours.tours.Rotation;
import co.edu.uniandes.tours.tours.ToursPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.tours.tours.impl.RotationImpl#getPosx <em>Posx</em>}</li>
 *   <li>{@link co.edu.uniandes.tours.tours.impl.RotationImpl#getPosy <em>Posy</em>}</li>
 *   <li>{@link co.edu.uniandes.tours.tours.impl.RotationImpl#getPosz <em>Posz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotationImpl extends MinimalEObjectImpl.Container implements Rotation
{
  /**
   * The default value of the '{@link #getPosx() <em>Posx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosx()
   * @generated
   * @ordered
   */
  protected static final double POSX_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getPosx() <em>Posx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosx()
   * @generated
   * @ordered
   */
  protected double posx = POSX_EDEFAULT;

  /**
   * The default value of the '{@link #getPosy() <em>Posy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosy()
   * @generated
   * @ordered
   */
  protected static final double POSY_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getPosy() <em>Posy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosy()
   * @generated
   * @ordered
   */
  protected double posy = POSY_EDEFAULT;

  /**
   * The default value of the '{@link #getPosz() <em>Posz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosz()
   * @generated
   * @ordered
   */
  protected static final double POSZ_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getPosz() <em>Posz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosz()
   * @generated
   * @ordered
   */
  protected double posz = POSZ_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RotationImpl()
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
    return ToursPackage.Literals.ROTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getPosx()
  {
    return posx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosx(double newPosx)
  {
    double oldPosx = posx;
    posx = newPosx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.ROTATION__POSX, oldPosx, posx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getPosy()
  {
    return posy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosy(double newPosy)
  {
    double oldPosy = posy;
    posy = newPosy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.ROTATION__POSY, oldPosy, posy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getPosz()
  {
    return posz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosz(double newPosz)
  {
    double oldPosz = posz;
    posz = newPosz;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.ROTATION__POSZ, oldPosz, posz));
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
      case ToursPackage.ROTATION__POSX:
        return getPosx();
      case ToursPackage.ROTATION__POSY:
        return getPosy();
      case ToursPackage.ROTATION__POSZ:
        return getPosz();
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
      case ToursPackage.ROTATION__POSX:
        setPosx((Double)newValue);
        return;
      case ToursPackage.ROTATION__POSY:
        setPosy((Double)newValue);
        return;
      case ToursPackage.ROTATION__POSZ:
        setPosz((Double)newValue);
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
      case ToursPackage.ROTATION__POSX:
        setPosx(POSX_EDEFAULT);
        return;
      case ToursPackage.ROTATION__POSY:
        setPosy(POSY_EDEFAULT);
        return;
      case ToursPackage.ROTATION__POSZ:
        setPosz(POSZ_EDEFAULT);
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
      case ToursPackage.ROTATION__POSX:
        return posx != POSX_EDEFAULT;
      case ToursPackage.ROTATION__POSY:
        return posy != POSY_EDEFAULT;
      case ToursPackage.ROTATION__POSZ:
        return posz != POSZ_EDEFAULT;
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
    result.append(" (posx: ");
    result.append(posx);
    result.append(", posy: ");
    result.append(posy);
    result.append(", posz: ");
    result.append(posz);
    result.append(')');
    return result.toString();
  }

} //RotationImpl