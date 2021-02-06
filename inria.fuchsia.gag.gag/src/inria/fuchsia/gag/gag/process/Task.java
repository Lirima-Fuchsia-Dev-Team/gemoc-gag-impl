/**
 */
package inria.fuchsia.gag.gag.process;

import inria.fuchsia.gag.gag.specification.Rule;
import inria.fuchsia.gag.gag.specification.Service;

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
 *   <li>{@link inria.fuchsia.gag.gag.process.Task#getId <em>Id</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gag.process.Task#getName <em>Name</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gag.process.Task#isIs_open <em>Is open</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gag.process.Task#getAppliedRule <em>Applied Rule</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gag.process.Task#getAssociated_to <em>Associated to</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gag.process.Task#getSub_task <em>Sub task</em>}</li>
 * </ul>
 *
 * @see inria.fuchsia.gag.gag.process.ProcessPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see inria.fuchsia.gag.gag.process.ProcessPackage#getTask_Id()
	 * @model required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gag.process.Task#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

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
	 * @see inria.fuchsia.gag.gag.process.ProcessPackage#getTask_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gag.process.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is open</em>' attribute.
	 * @see #setIs_open(boolean)
	 * @see inria.fuchsia.gag.gag.process.ProcessPackage#getTask_Is_open()
	 * @model
	 * @generated
	 */
	boolean isIs_open();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gag.process.Task#isIs_open <em>Is open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is open</em>' attribute.
	 * @see #isIs_open()
	 * @generated
	 */
	void setIs_open(boolean value);

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
	 * @see inria.fuchsia.gag.gag.process.ProcessPackage#getTask_AppliedRule()
	 * @model
	 * @generated
	 */
	String getAppliedRule();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gag.process.Task#getAppliedRule <em>Applied Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Rule</em>' attribute.
	 * @see #getAppliedRule()
	 * @generated
	 */
	void setAppliedRule(String value);

	/**
	 * Returns the value of the '<em><b>Associated to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated to</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated to</em>' reference.
	 * @see #setAssociated_to(Service)
	 * @see inria.fuchsia.gag.gag.process.ProcessPackage#getTask_Associated_to()
	 * @model
	 * @generated
	 */
	Service getAssociated_to();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gag.process.Task#getAssociated_to <em>Associated to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated to</em>' reference.
	 * @see #getAssociated_to()
	 * @generated
	 */
	void setAssociated_to(Service value);

	/**
	 * Returns the value of the '<em><b>Sub task</b></em>' containment reference list.
	 * The list contents are of type {@link inria.fuchsia.gag.gag.process.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub task</em>' containment reference list.
	 * @see inria.fuchsia.gag.gag.process.ProcessPackage#getTask_Sub_task()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getSub_task();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void applyRule(Rule rule);

} // Task
