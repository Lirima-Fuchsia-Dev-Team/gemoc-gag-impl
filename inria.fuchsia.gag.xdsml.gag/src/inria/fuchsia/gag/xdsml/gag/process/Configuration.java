/**
 */
package inria.fuchsia.gag.xdsml.gag.process;

import inria.fuchsia.gag.xdsml.gag.specification.GAG;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.process.Configuration#getRoot <em>Root</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.process.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.process.Configuration#getConsistent_to <em>Consistent to</em>}</li>
 * </ul>
 *
 * @see inria.fuchsia.gag.xdsml.gag.process.ProcessPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Task)
	 * @see inria.fuchsia.gag.xdsml.gag.process.ProcessPackage#getConfiguration_Root()
	 * @model required="true"
	 * @generated
	 */
	Task getRoot();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.xdsml.gag.process.Configuration#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Task value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see inria.fuchsia.gag.xdsml.gag.process.ProcessPackage#getConfiguration_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.xdsml.gag.process.Configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Consistent to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consistent to</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consistent to</em>' reference.
	 * @see #setConsistent_to(GAG)
	 * @see inria.fuchsia.gag.xdsml.gag.process.ProcessPackage#getConfiguration_Consistent_to()
	 * @model required="true"
	 * @generated
	 */
	GAG getConsistent_to();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.xdsml.gag.process.Configuration#getConsistent_to <em>Consistent to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistent to</em>' reference.
	 * @see #getConsistent_to()
	 * @generated
	 */
	void setConsistent_to(GAG value);

} // Configuration
