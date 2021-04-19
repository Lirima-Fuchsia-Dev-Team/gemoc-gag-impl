/**
 */
package fr.inria.gag.configuration.model.configuration;

import fr.inria.gag.specification.model.specification.Service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.Task#getSubTasks <em>Sub Tasks</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.Task#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.Task#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.Task#getAppliedRule <em>Applied Rule</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.Task#isIsOpen <em>Is Open</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.Task#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.gag.configuration.model.configuration.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Tasks</em>' containment reference list.
	 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getTask_SubTasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getSubTasks();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.gag.configuration.model.configuration.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getTask_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.gag.configuration.model.configuration.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getTask_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getOutputs();

	/**
	 * Returns the value of the '<em><b>Applied Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Rule</em>' attribute.
	 * @see #setAppliedRule(String)
	 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getTask_AppliedRule()
	 * @model
	 * @generated
	 */
	String getAppliedRule();

	/**
	 * Sets the value of the '{@link fr.inria.gag.configuration.model.configuration.Task#getAppliedRule <em>Applied Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Rule</em>' attribute.
	 * @see #getAppliedRule()
	 * @generated
	 */
	void setAppliedRule(String value);

	/**
	 * Returns the value of the '<em><b>Is Open</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Open</em>' attribute.
	 * @see #setIsOpen(boolean)
	 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getTask_IsOpen()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsOpen();

	/**
	 * Sets the value of the '{@link fr.inria.gag.configuration.model.configuration.Task#isIsOpen <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Open</em>' attribute.
	 * @see #isIsOpen()
	 * @generated
	 */
	void setIsOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getTask_Service()
	 * @model
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link fr.inria.gag.configuration.model.configuration.Task#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

} // Task
