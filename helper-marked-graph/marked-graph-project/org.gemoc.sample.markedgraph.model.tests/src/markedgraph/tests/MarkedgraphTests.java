/**
 */
package markedgraph.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>markedgraph</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkedgraphTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MarkedgraphTests("markedgraph Tests");
		suite.addTestSuite(MarkedGraphTest.class);
		suite.addTestSuite(TransitionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkedgraphTests(String name) {
		super(name);
	}

} //MarkedgraphTests
