/**
 */
package fr.inria.gag.specification.model.specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.specification.model.specification.FunctionExpression#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.FunctionExpression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getFunctionExpression()
 * @model
 * @generated
 */
public interface FunctionExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(FunctionDeclaration)
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getFunctionExpression_Function()
	 * @model required="true"
	 * @generated
	 */
	FunctionDeclaration getFunction();

	/**
	 * Sets the value of the '{@link fr.inria.gag.specification.model.specification.FunctionExpression#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunctionDeclaration value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.gag.specification.model.specification.LeftPartExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getFunctionExpression_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<LeftPartExpression> getExpressions();

} // FunctionExpression
