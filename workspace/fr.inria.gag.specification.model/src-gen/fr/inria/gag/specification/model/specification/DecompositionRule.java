/**
 */
package fr.inria.gag.specification.model.specification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposition Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.specification.model.specification.DecompositionRule#getGuard <em>Guard</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.DecompositionRule#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.DecompositionRule#getSubServices <em>Sub Services</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.DecompositionRule#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getDecompositionRule()
 * @model
 * @generated
 */
public interface DecompositionRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Guard)
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getDecompositionRule_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Guard getGuard();

	/**
	 * Sets the value of the '{@link fr.inria.gag.specification.model.specification.DecompositionRule#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Guard value);

	/**
	 * Returns the value of the '<em><b>Semantic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic</em>' containment reference.
	 * @see #setSemantic(SemanticRule)
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getDecompositionRule_Semantic()
	 * @model containment="true"
	 * @generated
	 */
	SemanticRule getSemantic();

	/**
	 * Sets the value of the '{@link fr.inria.gag.specification.model.specification.DecompositionRule#getSemantic <em>Semantic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic</em>' containment reference.
	 * @see #getSemantic()
	 * @generated
	 */
	void setSemantic(SemanticRule value);

	/**
	 * Returns the value of the '<em><b>Sub Services</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.gag.specification.model.specification.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Services</em>' reference list.
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getDecompositionRule_SubServices()
	 * @model
	 * @generated
	 */
	EList<Service> getSubServices();

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
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getDecompositionRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.gag.specification.model.specification.DecompositionRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DecompositionRule
