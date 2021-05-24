/**
 */
package fr.inria.gag.specification.model.specification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.gag.specification.model.specification.SpecificationPackage
 * @generated
 */
public interface SpecificationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecificationFactory eINSTANCE = fr.inria.gag.specification.model.specification.impl.SpecificationFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>GAG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GAG</em>'.
	 * @generated
	 */
	GAG createGAG();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Decomposition Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decomposition Rule</em>'.
	 * @generated
	 */
	DecompositionRule createDecompositionRule();

	/**
	 * Returns a new object of class '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard</em>'.
	 * @generated
	 */
	Guard createGuard();

	/**
	 * Returns a new object of class '<em>Semantic Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Rule</em>'.
	 * @generated
	 */
	SemanticRule createSemanticRule();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Declaration</em>'.
	 * @generated
	 */
	FunctionDeclaration createFunctionDeclaration();

	/**
	 * Returns a new object of class '<em>Equation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equation</em>'.
	 * @generated
	 */
	Equation createEquation();

	/**
	 * Returns a new object of class '<em>Id Expresssion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Expresssion</em>'.
	 * @generated
	 */
	IdExpresssion createIdExpresssion();

	/**
	 * Returns a new object of class '<em>Function Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Expression</em>'.
	 * @generated
	 */
	FunctionExpression createFunctionExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpecificationPackage getSpecificationPackage();

} //SpecificationFactory
