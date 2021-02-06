/**
 */
package inria.fuchsia.gag.gagmt.specification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link inria.fuchsia.gag.gagmt.specification.Service#getInput <em>Input</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gagmt.specification.Service#getOutput <em>Output</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gagmt.specification.Service#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see inria.fuchsia.gag.gagmt.specification.SpecificationPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link inria.fuchsia.gag.gagmt.specification.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see inria.fuchsia.gag.gagmt.specification.SpecificationPackage#getService_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link inria.fuchsia.gag.gagmt.specification.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see inria.fuchsia.gag.gagmt.specification.SpecificationPackage#getService_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getOutput();

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
	 * @see inria.fuchsia.gag.gagmt.specification.SpecificationPackage#getService_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gagmt.specification.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Service
