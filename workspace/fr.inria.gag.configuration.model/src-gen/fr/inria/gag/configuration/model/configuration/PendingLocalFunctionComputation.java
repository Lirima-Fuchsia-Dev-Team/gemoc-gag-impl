/**
 */
package fr.inria.gag.configuration.model.configuration;

import fr.inria.gag.specification.model.specification.FunctionDeclaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pending Local Function Computation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation#getFunctiondeclaration <em>Functiondeclaration</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation#getDataToCompute <em>Data To Compute</em>}</li>
 * </ul>
 *
 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getPendingLocalFunctionComputation()
 * @model
 * @generated
 */
public interface PendingLocalFunctionComputation extends EObject {
	/**
	 * Returns the value of the '<em><b>Functiondeclaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functiondeclaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functiondeclaration</em>' reference.
	 * @see #setFunctiondeclaration(FunctionDeclaration)
	 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getPendingLocalFunctionComputation_Functiondeclaration()
	 * @model required="true"
	 * @generated
	 */
	FunctionDeclaration getFunctiondeclaration();

	/**
	 * Sets the value of the '{@link fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation#getFunctiondeclaration <em>Functiondeclaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functiondeclaration</em>' reference.
	 * @see #getFunctiondeclaration()
	 * @generated
	 */
	void setFunctiondeclaration(FunctionDeclaration value);

	/**
	 * Returns the value of the '<em><b>Actual Parameters</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.gag.configuration.model.configuration.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Parameters</em>' reference list.
	 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getPendingLocalFunctionComputation_ActualParameters()
	 * @model
	 * @generated
	 */
	EList<Data> getActualParameters();

	/**
	 * Returns the value of the '<em><b>Data To Compute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data To Compute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data To Compute</em>' reference.
	 * @see #setDataToCompute(Data)
	 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getPendingLocalFunctionComputation_DataToCompute()
	 * @model required="true"
	 * @generated
	 */
	Data getDataToCompute();

	/**
	 * Sets the value of the '{@link fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation#getDataToCompute <em>Data To Compute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data To Compute</em>' reference.
	 * @see #getDataToCompute()
	 * @generated
	 */
	void setDataToCompute(Data value);

} // PendingLocalFunctionComputation
