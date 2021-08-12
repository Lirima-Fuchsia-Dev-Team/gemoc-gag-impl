/**
 */
package fr.inria.gag.specification.model.specification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.specification.model.specification.Equation#getLeftpart <em>Leftpart</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.Equation#getRightpart <em>Rightpart</em>}</li>
 * </ul>
 *
 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getEquation()
 * @model
 * @generated
 */
public interface Equation extends EObject {
	/**
	 * Returns the value of the '<em><b>Leftpart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leftpart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leftpart</em>' containment reference.
	 * @see #setLeftpart(RighPartExpression)
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getEquation_Leftpart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RighPartExpression getLeftpart();

	/**
	 * Sets the value of the '{@link fr.inria.gag.specification.model.specification.Equation#getLeftpart <em>Leftpart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leftpart</em>' containment reference.
	 * @see #getLeftpart()
	 * @generated
	 */
	void setLeftpart(RighPartExpression value);

	/**
	 * Returns the value of the '<em><b>Rightpart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rightpart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rightpart</em>' containment reference.
	 * @see #setRightpart(Expression)
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getEquation_Rightpart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightpart();

	/**
	 * Sets the value of the '{@link fr.inria.gag.specification.model.specification.Equation#getRightpart <em>Rightpart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rightpart</em>' containment reference.
	 * @see #getRightpart()
	 * @generated
	 */
	void setRightpart(Expression value);

} // Equation
