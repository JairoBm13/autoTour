/**
 */
package Tours.tests;

import Tours.Coordenada;
import Tours.ToursFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Coordenada</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordenadaTest extends TestCase {

	/**
	 * The fixture for this Coordenada test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Coordenada fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CoordenadaTest.class);
	}

	/**
	 * Constructs a new Coordenada test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordenadaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Coordenada test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Coordenada fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Coordenada test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Coordenada getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToursFactory.eINSTANCE.createCoordenada());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CoordenadaTest
