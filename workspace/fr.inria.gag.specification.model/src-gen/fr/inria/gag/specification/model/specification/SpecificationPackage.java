/**
 */
package fr.inria.gag.specification.model.specification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.gag.specification.model.specification.SpecificationFactory
 * @model kind="package"
 * @generated
 */
public interface SpecificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "specification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inria.fr/gag/specification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "specification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecificationPackage eINSTANCE = fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.GAGImpl <em>GAG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.GAGImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getGAG()
	 * @generated
	 */
	int GAG = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAG__SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAG__NAME = 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAG__CONFIGURATION = 2;

	/**
	 * The number of structural features of the '<em>GAG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GAG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.ServiceImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RULES = 0;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INPUT_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Output Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OUTPUT_PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Is Axiom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IS_AXIOM = 4;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.DecompositionRuleImpl <em>Decomposition Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.DecompositionRuleImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getDecompositionRule()
	 * @generated
	 */
	int DECOMPOSITION_RULE = 2;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__GUARD = 0;

	/**
	 * The feature id for the '<em><b>Semantic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__SEMANTIC = 1;

	/**
	 * The feature id for the '<em><b>Sub Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__SUB_SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Decomposition Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Decomposition Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.GuardImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__METHOD = 1;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.SemanticRuleImpl <em>Semantic Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.SemanticRuleImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getSemanticRule()
	 * @generated
	 */
	int SEMANTIC_RULE = 4;

	/**
	 * The feature id for the '<em><b>Function Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_RULE__FUNCTION_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Equations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_RULE__EQUATIONS = 1;

	/**
	 * The number of structural features of the '<em>Semantic Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Semantic Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.ParameterImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.RuntimeDataImpl <em>Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.RuntimeDataImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getRuntimeData()
	 * @generated
	 */
	int RUNTIME_DATA = 6;

	/**
	 * The number of structural features of the '<em>Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DATA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.FunctionDeclarationImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getFunctionDeclaration()
	 * @generated
	 */
	int FUNCTION_DECLARATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.EquationImpl <em>Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.EquationImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getEquation()
	 * @generated
	 */
	int EQUATION = 8;

	/**
	 * The feature id for the '<em><b>Leftpart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__LEFTPART = 0;

	/**
	 * The feature id for the '<em><b>Rightpart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__RIGHTPART = 1;

	/**
	 * The number of structural features of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.ExpressionImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.RightPartExpressionImpl <em>Right Part Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.RightPartExpressionImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getRightPartExpression()
	 * @generated
	 */
	int RIGHT_PART_EXPRESSION = 13;

	/**
	 * The number of structural features of the '<em>Right Part Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PART_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right Part Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PART_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.IdExpressionImpl <em>Id Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.IdExpressionImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getIdExpression()
	 * @generated
	 */
	int ID_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EXPRESSION__SERVICE_NAME = RIGHT_PART_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EXPRESSION__PARAMETER_NAME = RIGHT_PART_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Id Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EXPRESSION_FEATURE_COUNT = RIGHT_PART_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Id Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_EXPRESSION_OPERATION_COUNT = RIGHT_PART_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.FunctionExpressionImpl <em>Function Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.FunctionExpressionImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getFunctionExpression()
	 * @generated
	 */
	int FUNCTION_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXPRESSION__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXPRESSION__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.specification.model.specification.impl.LocalDataImpl <em>Local Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.specification.model.specification.impl.LocalDataImpl
	 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getLocalData()
	 * @generated
	 */
	int LOCAL_DATA = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA__NAME = RIGHT_PART_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA_FEATURE_COUNT = RIGHT_PART_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Local Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA_OPERATION_COUNT = RIGHT_PART_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.GAG <em>GAG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GAG</em>'.
	 * @see fr.inria.gag.specification.model.specification.GAG
	 * @generated
	 */
	EClass getGAG();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.gag.specification.model.specification.GAG#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see fr.inria.gag.specification.model.specification.GAG#getServices()
	 * @see #getGAG()
	 * @generated
	 */
	EReference getGAG_Services();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.GAG#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.gag.specification.model.specification.GAG#getName()
	 * @see #getGAG()
	 * @generated
	 */
	EAttribute getGAG_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.gag.specification.model.specification.GAG#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see fr.inria.gag.specification.model.specification.GAG#getConfiguration()
	 * @see #getGAG()
	 * @generated
	 */
	EReference getGAG_Configuration();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see fr.inria.gag.specification.model.specification.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.gag.specification.model.specification.Service#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see fr.inria.gag.specification.model.specification.Service#getRules()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.gag.specification.model.specification.Service#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameters</em>'.
	 * @see fr.inria.gag.specification.model.specification.Service#getInputParameters()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_InputParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.gag.specification.model.specification.Service#getOutputParameters <em>Output Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameters</em>'.
	 * @see fr.inria.gag.specification.model.specification.Service#getOutputParameters()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_OutputParameters();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.gag.specification.model.specification.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.Service#isIsAxiom <em>Is Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Axiom</em>'.
	 * @see fr.inria.gag.specification.model.specification.Service#isIsAxiom()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_IsAxiom();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.DecompositionRule <em>Decomposition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition Rule</em>'.
	 * @see fr.inria.gag.specification.model.specification.DecompositionRule
	 * @generated
	 */
	EClass getDecompositionRule();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.gag.specification.model.specification.DecompositionRule#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see fr.inria.gag.specification.model.specification.DecompositionRule#getGuard()
	 * @see #getDecompositionRule()
	 * @generated
	 */
	EReference getDecompositionRule_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.gag.specification.model.specification.DecompositionRule#getSemantic <em>Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semantic</em>'.
	 * @see fr.inria.gag.specification.model.specification.DecompositionRule#getSemantic()
	 * @see #getDecompositionRule()
	 * @generated
	 */
	EReference getDecompositionRule_Semantic();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.gag.specification.model.specification.DecompositionRule#getSubServices <em>Sub Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Services</em>'.
	 * @see fr.inria.gag.specification.model.specification.DecompositionRule#getSubServices()
	 * @see #getDecompositionRule()
	 * @generated
	 */
	EReference getDecompositionRule_SubServices();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.DecompositionRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.gag.specification.model.specification.DecompositionRule#getName()
	 * @see #getDecompositionRule()
	 * @generated
	 */
	EAttribute getDecompositionRule_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see fr.inria.gag.specification.model.specification.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.Guard#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see fr.inria.gag.specification.model.specification.Guard#getLocation()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_Location();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.Guard#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see fr.inria.gag.specification.model.specification.Guard#getMethod()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_Method();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.SemanticRule <em>Semantic Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Rule</em>'.
	 * @see fr.inria.gag.specification.model.specification.SemanticRule
	 * @generated
	 */
	EClass getSemanticRule();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.gag.specification.model.specification.SemanticRule#getFunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Declaration</em>'.
	 * @see fr.inria.gag.specification.model.specification.SemanticRule#getFunctionDeclaration()
	 * @see #getSemanticRule()
	 * @generated
	 */
	EReference getSemanticRule_FunctionDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.gag.specification.model.specification.SemanticRule#getEquations <em>Equations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equations</em>'.
	 * @see fr.inria.gag.specification.model.specification.SemanticRule#getEquations()
	 * @see #getSemanticRule()
	 * @generated
	 */
	EReference getSemanticRule_Equations();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see fr.inria.gag.specification.model.specification.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.gag.specification.model.specification.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.RuntimeData <em>Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Data</em>'.
	 * @see fr.inria.gag.specification.model.specification.RuntimeData
	 * @generated
	 */
	EClass getRuntimeData();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.FunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Declaration</em>'.
	 * @see fr.inria.gag.specification.model.specification.FunctionDeclaration
	 * @generated
	 */
	EClass getFunctionDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.FunctionDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.gag.specification.model.specification.FunctionDeclaration#getName()
	 * @see #getFunctionDeclaration()
	 * @generated
	 */
	EAttribute getFunctionDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.FunctionDeclaration#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see fr.inria.gag.specification.model.specification.FunctionDeclaration#getMethod()
	 * @see #getFunctionDeclaration()
	 * @generated
	 */
	EAttribute getFunctionDeclaration_Method();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.FunctionDeclaration#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see fr.inria.gag.specification.model.specification.FunctionDeclaration#getLocation()
	 * @see #getFunctionDeclaration()
	 * @generated
	 */
	EAttribute getFunctionDeclaration_Location();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation</em>'.
	 * @see fr.inria.gag.specification.model.specification.Equation
	 * @generated
	 */
	EClass getEquation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.gag.specification.model.specification.Equation#getLeftpart <em>Leftpart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leftpart</em>'.
	 * @see fr.inria.gag.specification.model.specification.Equation#getLeftpart()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_Leftpart();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.gag.specification.model.specification.Equation#getRightpart <em>Rightpart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rightpart</em>'.
	 * @see fr.inria.gag.specification.model.specification.Equation#getRightpart()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_Rightpart();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.IdExpression <em>Id Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Expression</em>'.
	 * @see fr.inria.gag.specification.model.specification.IdExpression
	 * @generated
	 */
	EClass getIdExpression();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.IdExpression#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see fr.inria.gag.specification.model.specification.IdExpression#getServiceName()
	 * @see #getIdExpression()
	 * @generated
	 */
	EAttribute getIdExpression_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.IdExpression#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see fr.inria.gag.specification.model.specification.IdExpression#getParameterName()
	 * @see #getIdExpression()
	 * @generated
	 */
	EAttribute getIdExpression_ParameterName();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see fr.inria.gag.specification.model.specification.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.FunctionExpression <em>Function Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Expression</em>'.
	 * @see fr.inria.gag.specification.model.specification.FunctionExpression
	 * @generated
	 */
	EClass getFunctionExpression();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.gag.specification.model.specification.FunctionExpression#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see fr.inria.gag.specification.model.specification.FunctionExpression#getFunction()
	 * @see #getFunctionExpression()
	 * @generated
	 */
	EReference getFunctionExpression_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.gag.specification.model.specification.FunctionExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see fr.inria.gag.specification.model.specification.FunctionExpression#getExpressions()
	 * @see #getFunctionExpression()
	 * @generated
	 */
	EReference getFunctionExpression_Expressions();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.LocalData <em>Local Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Data</em>'.
	 * @see fr.inria.gag.specification.model.specification.LocalData
	 * @generated
	 */
	EClass getLocalData();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.LocalData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.gag.specification.model.specification.LocalData#getName()
	 * @see #getLocalData()
	 * @generated
	 */
	EAttribute getLocalData_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.specification.model.specification.RightPartExpression <em>Right Part Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Part Expression</em>'.
	 * @see fr.inria.gag.specification.model.specification.RightPartExpression
	 * @generated
	 */
	EClass getRightPartExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecificationFactory getSpecificationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.GAGImpl <em>GAG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.GAGImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getGAG()
		 * @generated
		 */
		EClass GAG = eINSTANCE.getGAG();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAG__SERVICES = eINSTANCE.getGAG_Services();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAG__NAME = eINSTANCE.getGAG_Name();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAG__CONFIGURATION = eINSTANCE.getGAG_Configuration();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.ServiceImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__RULES = eINSTANCE.getService_Rules();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__INPUT_PARAMETERS = eINSTANCE.getService_InputParameters();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__OUTPUT_PARAMETERS = eINSTANCE.getService_OutputParameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Is Axiom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__IS_AXIOM = eINSTANCE.getService_IsAxiom();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.DecompositionRuleImpl <em>Decomposition Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.DecompositionRuleImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getDecompositionRule()
		 * @generated
		 */
		EClass DECOMPOSITION_RULE = eINSTANCE.getDecompositionRule();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION_RULE__GUARD = eINSTANCE.getDecompositionRule_Guard();

		/**
		 * The meta object literal for the '<em><b>Semantic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION_RULE__SEMANTIC = eINSTANCE.getDecompositionRule_Semantic();

		/**
		 * The meta object literal for the '<em><b>Sub Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION_RULE__SUB_SERVICES = eINSTANCE.getDecompositionRule_SubServices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECOMPOSITION_RULE__NAME = eINSTANCE.getDecompositionRule_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.GuardImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__LOCATION = eINSTANCE.getGuard_Location();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__METHOD = eINSTANCE.getGuard_Method();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.SemanticRuleImpl <em>Semantic Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.SemanticRuleImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getSemanticRule()
		 * @generated
		 */
		EClass SEMANTIC_RULE = eINSTANCE.getSemanticRule();

		/**
		 * The meta object literal for the '<em><b>Function Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_RULE__FUNCTION_DECLARATION = eINSTANCE.getSemanticRule_FunctionDeclaration();

		/**
		 * The meta object literal for the '<em><b>Equations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_RULE__EQUATIONS = eINSTANCE.getSemanticRule_Equations();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.ParameterImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.RuntimeDataImpl <em>Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.RuntimeDataImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getRuntimeData()
		 * @generated
		 */
		EClass RUNTIME_DATA = eINSTANCE.getRuntimeData();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.FunctionDeclarationImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getFunctionDeclaration()
		 * @generated
		 */
		EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DECLARATION__NAME = eINSTANCE.getFunctionDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DECLARATION__METHOD = eINSTANCE.getFunctionDeclaration_Method();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DECLARATION__LOCATION = eINSTANCE.getFunctionDeclaration_Location();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.EquationImpl <em>Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.EquationImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getEquation()
		 * @generated
		 */
		EClass EQUATION = eINSTANCE.getEquation();

		/**
		 * The meta object literal for the '<em><b>Leftpart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__LEFTPART = eINSTANCE.getEquation_Leftpart();

		/**
		 * The meta object literal for the '<em><b>Rightpart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__RIGHTPART = eINSTANCE.getEquation_Rightpart();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.IdExpressionImpl <em>Id Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.IdExpressionImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getIdExpression()
		 * @generated
		 */
		EClass ID_EXPRESSION = eINSTANCE.getIdExpression();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_EXPRESSION__SERVICE_NAME = eINSTANCE.getIdExpression_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_EXPRESSION__PARAMETER_NAME = eINSTANCE.getIdExpression_ParameterName();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.ExpressionImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.FunctionExpressionImpl <em>Function Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.FunctionExpressionImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getFunctionExpression()
		 * @generated
		 */
		EClass FUNCTION_EXPRESSION = eINSTANCE.getFunctionExpression();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_EXPRESSION__FUNCTION = eINSTANCE.getFunctionExpression_Function();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_EXPRESSION__EXPRESSIONS = eINSTANCE.getFunctionExpression_Expressions();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.LocalDataImpl <em>Local Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.LocalDataImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getLocalData()
		 * @generated
		 */
		EClass LOCAL_DATA = eINSTANCE.getLocalData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_DATA__NAME = eINSTANCE.getLocalData_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.specification.model.specification.impl.RightPartExpressionImpl <em>Right Part Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.specification.model.specification.impl.RightPartExpressionImpl
		 * @see fr.inria.gag.specification.model.specification.impl.SpecificationPackageImpl#getRightPartExpression()
		 * @generated
		 */
		EClass RIGHT_PART_EXPRESSION = eINSTANCE.getRightPartExpression();

	}

} //SpecificationPackage
