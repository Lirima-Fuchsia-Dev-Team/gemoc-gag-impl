/**
 */
package inria.fuchsia.gag.xdsml.gag.specification;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see inria.fuchsia.gag.xdsml.gag.specification.SpecificationFactory
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
	String eNS_URI = "http://inria.fuchsia.gag.xdsml.gag/specification/";

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
	SpecificationPackage eINSTANCE = inria.fuchsia.gag.xdsml.gag.specification.impl.SpecificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link inria.fuchsia.gag.xdsml.gag.specification.impl.GAGImpl <em>GAG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.GAGImpl
	 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.SpecificationPackageImpl#getGAG()
	 * @generated
	 */
	int GAG = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAG__RULE = 0;

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
	 * The meta object id for the '{@link inria.fuchsia.gag.xdsml.gag.specification.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.ValueImpl
	 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.SpecificationPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 1;

	/**
	 * The feature id for the '<em><b>Sub value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__SUB_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Defined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DEFINED = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link inria.fuchsia.gag.xdsml.gag.specification.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.ServiceImpl
	 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.SpecificationPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link inria.fuchsia.gag.xdsml.gag.specification.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.GuardImpl
	 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.SpecificationPackageImpl#getGuard()
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
	 * The meta object id for the '{@link inria.fuchsia.gag.xdsml.gag.specification.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.RuleImpl
	 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.SpecificationPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 4;

	/**
	 * The feature id for the '<em><b>Left hand side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LEFT_HAND_SIDE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Right hand side service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RIGHT_HAND_SIDE_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__GUARD = 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link inria.fuchsia.gag.xdsml.gag.specification.GAG <em>GAG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GAG</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.GAG
	 * @generated
	 */
	EClass getGAG();

	/**
	 * Returns the meta object for the containment reference list '{@link inria.fuchsia.gag.xdsml.gag.specification.GAG#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.GAG#getRule()
	 * @see #getGAG()
	 * @generated
	 */
	EReference getGAG_Rule();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.xdsml.gag.specification.GAG#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.GAG#getName()
	 * @see #getGAG()
	 * @generated
	 */
	EAttribute getGAG_Name();

	/**
	 * Returns the meta object for class '{@link inria.fuchsia.gag.xdsml.gag.specification.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the containment reference list '{@link inria.fuchsia.gag.xdsml.gag.specification.Value#getSub_value <em>Sub value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub value</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Value#getSub_value()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Sub_value();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.xdsml.gag.specification.Value#isDefined <em>Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defined</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Value#isDefined()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Defined();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.xdsml.gag.specification.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.xdsml.gag.specification.Value#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Value#getName()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Name();

	/**
	 * Returns the meta object for class '{@link inria.fuchsia.gag.xdsml.gag.specification.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link inria.fuchsia.gag.xdsml.gag.specification.Service#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Service#getInput()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link inria.fuchsia.gag.xdsml.gag.specification.Service#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Service#getOutput()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Output();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.xdsml.gag.specification.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for class '{@link inria.fuchsia.gag.xdsml.gag.specification.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.xdsml.gag.specification.Guard#getClassPath <em>Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Path</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Guard#getClassPath()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_ClassPath();

	/**
	 * Returns the meta object for class '{@link inria.fuchsia.gag.xdsml.gag.specification.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the reference '{@link inria.fuchsia.gag.xdsml.gag.specification.Rule#getLeft_hand_side <em>Left hand side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left hand side</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Rule#getLeft_hand_side()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Left_hand_side();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.xdsml.gag.specification.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.xdsml.gag.specification.Rule#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Rule#getParameters()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link inria.fuchsia.gag.xdsml.gag.specification.Rule#getRight_hand_side_service <em>Right hand side service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right hand side service</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Rule#getRight_hand_side_service()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Right_hand_side_service();

	/**
	 * Returns the meta object for the reference '{@link inria.fuchsia.gag.xdsml.gag.specification.Rule#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see inria.fuchsia.gag.xdsml.gag.specification.Rule#getGuard()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Guard();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link inria.fuchsia.gag.xdsml.gag.specification.impl.GAGImpl <em>GAG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.GAGImpl
		 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.SpecificationPackageImpl#getGAG()
		 * @generated
		 */
		EClass GAG = eINSTANCE.getGAG();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAG__RULE = eINSTANCE.getGAG_Rule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAG__NAME = eINSTANCE.getGAG_Name();

		/**
		 * The meta object literal for the '{@link inria.fuchsia.gag.xdsml.gag.specification.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.ValueImpl
		 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.SpecificationPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Sub value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__SUB_VALUE = eINSTANCE.getValue_Sub_value();

		/**
		 * The meta object literal for the '<em><b>Defined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__DEFINED = eINSTANCE.getValue_Defined();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__NAME = eINSTANCE.getValue_Name();

		/**
		 * The meta object literal for the '{@link inria.fuchsia.gag.xdsml.gag.specification.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.ServiceImpl
		 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.SpecificationPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__INPUT = eINSTANCE.getService_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__OUTPUT = eINSTANCE.getService_Output();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '{@link inria.fuchsia.gag.xdsml.gag.specification.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.GuardImpl
		 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.SpecificationPackageImpl#getGuard()
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
		 * The meta object literal for the '{@link inria.fuchsia.gag.xdsml.gag.specification.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.RuleImpl
		 * @see inria.fuchsia.gag.xdsml.gag.specification.impl.SpecificationPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Left hand side</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__LEFT_HAND_SIDE = eINSTANCE.getRule_Left_hand_side();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__PARAMETERS = eINSTANCE.getRule_Parameters();

		/**
		 * The meta object literal for the '<em><b>Right hand side service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RIGHT_HAND_SIDE_SERVICE = eINSTANCE.getRule_Right_hand_side_service();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__GUARD = eINSTANCE.getRule_Guard();

	}

} //SpecificationPackage