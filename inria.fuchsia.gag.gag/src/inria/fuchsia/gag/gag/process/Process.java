/**
 */
package inria.fuchsia.gag.gag.process;

import inria.fuchsia.gag.gag.specification.GAG;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link inria.fuchsia.gag.gag.process.Process#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gag.process.Process#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see inria.fuchsia.gag.gag.process.ProcessPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Configuration)
	 * @see inria.fuchsia.gag.gag.process.ProcessPackage#getProcess_Configuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gag.process.Process#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(GAG)
	 * @see inria.fuchsia.gag.gag.process.ProcessPackage#getProcess_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GAG getSpecification();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gag.process.Process#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(GAG value);

} // Process
