/**
 */
package fr.inria.gag.configuration.model.configuration;

import fr.inria.gag.specification.model.specification.RuntimeData;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.Configuration#getRoot <em>Root</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.Configuration#getPendingLocalComputations <em>Pending Local Computations</em>}</li>
 * </ul>
 *
 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends RuntimeData {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Task)
	 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getConfiguration_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Task getRoot();

	/**
	 * Sets the value of the '{@link fr.inria.gag.configuration.model.configuration.Configuration#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Task value);

	/**
	 * Returns the value of the '<em><b>Pending Local Computations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending Local Computations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending Local Computations</em>' containment reference list.
	 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getConfiguration_PendingLocalComputations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PendingLocalFunctionComputation> getPendingLocalComputations();

} // Configuration
