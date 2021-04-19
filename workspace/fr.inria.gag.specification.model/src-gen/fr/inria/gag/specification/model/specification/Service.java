/**
 */
package fr.inria.gag.specification.model.specification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.specification.model.specification.Service#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.Service#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.Service#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.Service#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.Service#isIsAxiom <em>Is Axiom</em>}</li>
 * </ul>
 *
 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.gag.specification.model.specification.DecompositionRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getService_Rules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DecompositionRule> getRules();

	/**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.gag.specification.model.specification.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters</em>' containment reference list.
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getService_InputParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getInputParameters();

	/**
	 * Returns the value of the '<em><b>Output Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.gag.specification.model.specification.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameters</em>' containment reference list.
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getService_OutputParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOutputParameters();

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
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getService_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.gag.specification.model.specification.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Axiom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Axiom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Axiom</em>' attribute.
	 * @see #setIsAxiom(boolean)
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getService_IsAxiom()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsAxiom();

	/**
	 * Sets the value of the '{@link fr.inria.gag.specification.model.specification.Service#isIsAxiom <em>Is Axiom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Axiom</em>' attribute.
	 * @see #isIsAxiom()
	 * @generated
	 */
	void setIsAxiom(boolean value);

} // Service
