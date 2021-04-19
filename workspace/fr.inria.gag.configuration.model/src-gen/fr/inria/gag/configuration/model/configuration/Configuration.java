/**
 */
package fr.inria.gag.configuration.model.configuration;

import org.eclipse.emf.ecore.EObject;

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
 * </ul>
 *
 * @see fr.inria.gag.configuration.model.configuration.ConfigurationPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
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

} // Configuration
