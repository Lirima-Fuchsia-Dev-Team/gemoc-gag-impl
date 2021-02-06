/**
 */
package inria.fuchsia.gag.gagmt.process;

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
 * @see inria.fuchsia.gag.gagmt.process.ProcessFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "process";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inria.fuchsia.gag.gagmt/process/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "process";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessPackage eINSTANCE = inria.fuchsia.gag.gagmt.process.impl.ProcessPackageImpl.init();

	/**
	 * The meta object id for the '{@link inria.fuchsia.gag.gagmt.process.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inria.fuchsia.gag.gagmt.process.impl.TaskImpl
	 * @see inria.fuchsia.gag.gagmt.process.impl.ProcessPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_OPEN = 2;

	/**
	 * The feature id for the '<em><b>Applied Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__APPLIED_RULE = 3;

	/**
	 * The feature id for the '<em><b>Associated to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ASSOCIATED_TO = 4;

	/**
	 * The feature id for the '<em><b>Sub task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUB_TASK = 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link inria.fuchsia.gag.gagmt.process.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inria.fuchsia.gag.gagmt.process.impl.ConfigurationImpl
	 * @see inria.fuchsia.gag.gagmt.process.impl.ProcessPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ROOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Consistent to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONSISTENT_TO = 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link inria.fuchsia.gag.gagmt.process.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see inria.fuchsia.gag.gagmt.process.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.gagmt.process.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see inria.fuchsia.gag.gagmt.process.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.gagmt.process.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see inria.fuchsia.gag.gagmt.process.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.gagmt.process.Task#isIs_open <em>Is open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is open</em>'.
	 * @see inria.fuchsia.gag.gagmt.process.Task#isIs_open()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Is_open();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.gagmt.process.Task#getAppliedRule <em>Applied Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applied Rule</em>'.
	 * @see inria.fuchsia.gag.gagmt.process.Task#getAppliedRule()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_AppliedRule();

	/**
	 * Returns the meta object for the reference '{@link inria.fuchsia.gag.gagmt.process.Task#getAssociated_to <em>Associated to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated to</em>'.
	 * @see inria.fuchsia.gag.gagmt.process.Task#getAssociated_to()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Associated_to();

	/**
	 * Returns the meta object for the containment reference list '{@link inria.fuchsia.gag.gagmt.process.Task#getSub_task <em>Sub task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub task</em>'.
	 * @see inria.fuchsia.gag.gagmt.process.Task#getSub_task()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Sub_task();

	/**
	 * Returns the meta object for class '{@link inria.fuchsia.gag.gagmt.process.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see inria.fuchsia.gag.gagmt.process.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference '{@link inria.fuchsia.gag.gagmt.process.Configuration#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see inria.fuchsia.gag.gagmt.process.Configuration#getRoot()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Root();

	/**
	 * Returns the meta object for the attribute '{@link inria.fuchsia.gag.gagmt.process.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see inria.fuchsia.gag.gagmt.process.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for the reference '{@link inria.fuchsia.gag.gagmt.process.Configuration#getConsistent_to <em>Consistent to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consistent to</em>'.
	 * @see inria.fuchsia.gag.gagmt.process.Configuration#getConsistent_to()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Consistent_to();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessFactory getProcessFactory();

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
		 * The meta object literal for the '{@link inria.fuchsia.gag.gagmt.process.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inria.fuchsia.gag.gagmt.process.impl.TaskImpl
		 * @see inria.fuchsia.gag.gagmt.process.impl.ProcessPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Is open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IS_OPEN = eINSTANCE.getTask_Is_open();

		/**
		 * The meta object literal for the '<em><b>Applied Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__APPLIED_RULE = eINSTANCE.getTask_AppliedRule();

		/**
		 * The meta object literal for the '<em><b>Associated to</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ASSOCIATED_TO = eINSTANCE.getTask_Associated_to();

		/**
		 * The meta object literal for the '<em><b>Sub task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SUB_TASK = eINSTANCE.getTask_Sub_task();

		/**
		 * The meta object literal for the '{@link inria.fuchsia.gag.gagmt.process.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inria.fuchsia.gag.gagmt.process.impl.ConfigurationImpl
		 * @see inria.fuchsia.gag.gagmt.process.impl.ProcessPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ROOT = eINSTANCE.getConfiguration_Root();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Consistent to</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONSISTENT_TO = eINSTANCE.getConfiguration_Consistent_to();

	}

} //ProcessPackage
