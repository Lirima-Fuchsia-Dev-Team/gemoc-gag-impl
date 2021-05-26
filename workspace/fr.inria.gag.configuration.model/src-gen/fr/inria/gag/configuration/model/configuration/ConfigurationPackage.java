/**
 */
package fr.inria.gag.configuration.model.configuration;

import fr.inria.gag.specification.model.specification.SpecificationPackage;
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
 * @see fr.inria.gag.configuration.model.configuration.ConfigurationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' specification='../../fr.inria.gag.specification.model/model/specification.ecore#/'"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inria.fr/gag/configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = fr.inria.gag.configuration.model.configuration.impl.ConfigurationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.inria.gag.configuration.model.configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.configuration.model.configuration.impl.ConfigurationImpl
	 * @see fr.inria.gag.configuration.model.configuration.impl.ConfigurationPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ROOT = SpecificationPackage.RUNTIME_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pending Local Computation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PENDING_LOCAL_COMPUTATION = SpecificationPackage.RUNTIME_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = SpecificationPackage.RUNTIME_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = SpecificationPackage.RUNTIME_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.configuration.model.configuration.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.configuration.model.configuration.impl.DataImpl
	 * @see fr.inria.gag.configuration.model.configuration.impl.ConfigurationPackageImpl#getData()
	 * @generated
	 */
	int DATA = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.configuration.model.configuration.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.configuration.model.configuration.impl.TaskImpl
	 * @see fr.inria.gag.configuration.model.configuration.impl.ConfigurationPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Sub Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUB_TASKS = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUTS = 2;

	/**
	 * The feature id for the '<em><b>Applied Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__APPLIED_RULE = 3;

	/**
	 * The feature id for the '<em><b>Is Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_OPEN = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SERVICE = 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.gag.configuration.model.configuration.impl.PendingLocalFunctionComputationImpl <em>Pending Local Function Computation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.gag.configuration.model.configuration.impl.PendingLocalFunctionComputationImpl
	 * @see fr.inria.gag.configuration.model.configuration.impl.ConfigurationPackageImpl#getPendingLocalFunctionComputation()
	 * @generated
	 */
	int PENDING_LOCAL_FUNCTION_COMPUTATION = 3;

	/**
	 * The feature id for the '<em><b>Functiondeclaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_LOCAL_FUNCTION_COMPUTATION__FUNCTIONDECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_LOCAL_FUNCTION_COMPUTATION__DATA = 1;

	/**
	 * The number of structural features of the '<em>Pending Local Function Computation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_LOCAL_FUNCTION_COMPUTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pending Local Function Computation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_LOCAL_FUNCTION_COMPUTATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.configuration.model.configuration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.gag.configuration.model.configuration.Configuration#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Configuration#getRoot()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.gag.configuration.model.configuration.Configuration#getPendingLocalComputation <em>Pending Local Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pending Local Computation</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Configuration#getPendingLocalComputation()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_PendingLocalComputation();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.configuration.model.configuration.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.configuration.model.configuration.Data#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Data#getValue()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Value();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.gag.configuration.model.configuration.Data#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Data#getParameter()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Parameter();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.configuration.model.configuration.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.gag.configuration.model.configuration.Task#getSubTasks <em>Sub Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Tasks</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Task#getSubTasks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_SubTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.gag.configuration.model.configuration.Task#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Task#getInputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.gag.configuration.model.configuration.Task#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Task#getOutputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.configuration.model.configuration.Task#getAppliedRule <em>Applied Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applied Rule</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Task#getAppliedRule()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_AppliedRule();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.gag.configuration.model.configuration.Task#isIsOpen <em>Is Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Open</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Task#isIsOpen()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_IsOpen();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.gag.configuration.model.configuration.Task#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.Task#getService()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Service();

	/**
	 * Returns the meta object for class '{@link fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation <em>Pending Local Function Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pending Local Function Computation</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation
	 * @generated
	 */
	EClass getPendingLocalFunctionComputation();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation#getFunctiondeclaration <em>Functiondeclaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Functiondeclaration</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation#getFunctiondeclaration()
	 * @see #getPendingLocalFunctionComputation()
	 * @generated
	 */
	EReference getPendingLocalFunctionComputation_Functiondeclaration();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation#getData()
	 * @see #getPendingLocalFunctionComputation()
	 * @generated
	 */
	EReference getPendingLocalFunctionComputation_Data();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

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
		 * The meta object literal for the '{@link fr.inria.gag.configuration.model.configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.configuration.model.configuration.impl.ConfigurationImpl
		 * @see fr.inria.gag.configuration.model.configuration.impl.ConfigurationPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ROOT = eINSTANCE.getConfiguration_Root();

		/**
		 * The meta object literal for the '<em><b>Pending Local Computation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PENDING_LOCAL_COMPUTATION = eINSTANCE.getConfiguration_PendingLocalComputation();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.configuration.model.configuration.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.configuration.model.configuration.impl.DataImpl
		 * @see fr.inria.gag.configuration.model.configuration.impl.ConfigurationPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__VALUE = eINSTANCE.getData_Value();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__PARAMETER = eINSTANCE.getData_Parameter();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.configuration.model.configuration.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.configuration.model.configuration.impl.TaskImpl
		 * @see fr.inria.gag.configuration.model.configuration.impl.ConfigurationPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Sub Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SUB_TASKS = eINSTANCE.getTask_SubTasks();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUTS = eINSTANCE.getTask_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTPUTS = eINSTANCE.getTask_Outputs();

		/**
		 * The meta object literal for the '<em><b>Applied Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__APPLIED_RULE = eINSTANCE.getTask_AppliedRule();

		/**
		 * The meta object literal for the '<em><b>Is Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IS_OPEN = eINSTANCE.getTask_IsOpen();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SERVICE = eINSTANCE.getTask_Service();

		/**
		 * The meta object literal for the '{@link fr.inria.gag.configuration.model.configuration.impl.PendingLocalFunctionComputationImpl <em>Pending Local Function Computation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.gag.configuration.model.configuration.impl.PendingLocalFunctionComputationImpl
		 * @see fr.inria.gag.configuration.model.configuration.impl.ConfigurationPackageImpl#getPendingLocalFunctionComputation()
		 * @generated
		 */
		EClass PENDING_LOCAL_FUNCTION_COMPUTATION = eINSTANCE.getPendingLocalFunctionComputation();

		/**
		 * The meta object literal for the '<em><b>Functiondeclaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PENDING_LOCAL_FUNCTION_COMPUTATION__FUNCTIONDECLARATION = eINSTANCE
				.getPendingLocalFunctionComputation_Functiondeclaration();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PENDING_LOCAL_FUNCTION_COMPUTATION__DATA = eINSTANCE.getPendingLocalFunctionComputation_Data();

	}

} //ConfigurationPackage
