/**
 */
package fr.inria.gag.specification.model.specification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.specification.model.specification.SemanticRule#getFunctionDeclaration <em>Function Declaration</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.SemanticRule#getEquations <em>Equations</em>}</li>
 * </ul>
 *
 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getSemanticRule()
 * @model
 * @generated
 */
public interface SemanticRule extends EObject {

	/**
	 * Returns the value of the '<em><b>Function Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.gag.specification.model.specification.FunctionDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Declaration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Declaration</em>' containment reference list.
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getSemanticRule_FunctionDeclaration()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionDeclaration> getFunctionDeclaration();

	/**
	 * Returns the value of the '<em><b>Equations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.gag.specification.model.specification.Equation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equations</em>' containment reference list.
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getSemanticRule_Equations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Equation> getEquations();
} // SemanticRule
