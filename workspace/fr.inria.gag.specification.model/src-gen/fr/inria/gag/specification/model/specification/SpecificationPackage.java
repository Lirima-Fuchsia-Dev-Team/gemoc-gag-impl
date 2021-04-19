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
	 * The number of structural features of the '<em>GAG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAG_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__CLASS_PATH = 0;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 1;

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
	 * The number of structural features of the '<em>Semantic Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_RULE_FEATURE_COUNT = 0;

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
	 * Returns the meta object for the attribute '{@link fr.inria.gag.specification.model.specification.Guard#getClassPath <em>Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Path</em>'.
	 * @see fr.inria.gag.specification.model.specification.Guard#getClassPath()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_ClassPath();

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
		 * The meta object literal for the '<em><b>Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__CLASS_PATH = eINSTANCE.getGuard_ClassPath();

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

	}

} //SpecificationPackage
