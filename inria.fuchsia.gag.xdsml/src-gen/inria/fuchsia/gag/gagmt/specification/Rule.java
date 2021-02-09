/**
 */
package inria.fuchsia.gag.gagmt.specification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link inria.fuchsia.gag.gagmt.specification.Rule#getLeft_hand_side <em>Left hand side</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gagmt.specification.Rule#getName <em>Name</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gagmt.specification.Rule#getParameters <em>Parameters</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gagmt.specification.Rule#getRight_hand_side_service <em>Right hand side service</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gagmt.specification.Rule#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see inria.fuchsia.gag.gagmt.specification.SpecificationPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Left hand side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left hand side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left hand side</em>' containment reference.
	 * @see #setLeft_hand_side(Service)
	 * @see inria.fuchsia.gag.gagmt.specification.SpecificationPackage#getRule_Left_hand_side()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Service getLeft_hand_side();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gagmt.specification.Rule#getLeft_hand_side <em>Left hand side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left hand side</em>' containment reference.
	 * @see #getLeft_hand_side()
	 * @generated
	 */
	void setLeft_hand_side(Service value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see inria.fuchsia.gag.gagmt.specification.SpecificationPackage#getRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gagmt.specification.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(EList)
	 * @see inria.fuchsia.gag.gagmt.specification.SpecificationPackage#getRule_Parameters()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList getParameters();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gagmt.specification.Rule#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(EList value);

	/**
	 * Returns the value of the '<em><b>Right hand side service</b></em>' containment reference list.
	 * The list contents are of type {@link inria.fuchsia.gag.gagmt.specification.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right hand side service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right hand side service</em>' containment reference list.
	 * @see inria.fuchsia.gag.gagmt.specification.SpecificationPackage#getRule_Right_hand_side_service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getRight_hand_side_service();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Guard)
	 * @see inria.fuchsia.gag.gagmt.specification.SpecificationPackage#getRule_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Guard getGuard();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gagmt.specification.Rule#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Guard value);

} // Rule
