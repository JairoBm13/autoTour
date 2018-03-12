/**
 */
package Tours;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordenada</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Tours.Coordenada#getPosx <em>Posx</em>}</li>
 *   <li>{@link Tours.Coordenada#getPosy <em>Posy</em>}</li>
 *   <li>{@link Tours.Coordenada#getPosz <em>Posz</em>}</li>
 * </ul>
 *
 * @see Tours.ToursPackage#getCoordenada()
 * @model abstract="true"
 * @generated
 */
public interface Coordenada extends EObject {
	/**
	 * Returns the value of the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posx</em>' attribute.
	 * @see #setPosx(double)
	 * @see Tours.ToursPackage#getCoordenada_Posx()
	 * @model
	 * @generated
	 */
	double getPosx();

	/**
	 * Sets the value of the '{@link Tours.Coordenada#getPosx <em>Posx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posx</em>' attribute.
	 * @see #getPosx()
	 * @generated
	 */
	void setPosx(double value);

	/**
	 * Returns the value of the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posy</em>' attribute.
	 * @see #setPosy(double)
	 * @see Tours.ToursPackage#getCoordenada_Posy()
	 * @model
	 * @generated
	 */
	double getPosy();

	/**
	 * Sets the value of the '{@link Tours.Coordenada#getPosy <em>Posy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posy</em>' attribute.
	 * @see #getPosy()
	 * @generated
	 */
	void setPosy(double value);

	/**
	 * Returns the value of the '<em><b>Posz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posz</em>' attribute.
	 * @see #setPosz(double)
	 * @see Tours.ToursPackage#getCoordenada_Posz()
	 * @model
	 * @generated
	 */
	double getPosz();

	/**
	 * Sets the value of the '{@link Tours.Coordenada#getPosz <em>Posz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posz</em>' attribute.
	 * @see #getPosz()
	 * @generated
	 */
	void setPosz(double value);

} // Coordenada
