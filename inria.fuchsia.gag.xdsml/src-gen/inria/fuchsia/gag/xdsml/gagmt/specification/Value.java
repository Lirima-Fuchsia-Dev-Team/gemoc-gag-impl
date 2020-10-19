/**
 */
package inria.fuchsia.gag.xdsml.gagmt.specification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link inria.fuchsia.gag.xdsml.gagmt.specification.Value#getSub_value <em>Sub value</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gagmt.specification.Value#isDefined <em>Defined</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gagmt.specification.Value#getValue <em>Value</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gagmt.specification.Value#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub value</b></em>' containment reference list.
	 * The list contents are of type {@link inria.fuchsia.gag.xdsml.gagmt.specification.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub value</em>' containment reference list.
	 * @see inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage#getValue_Sub_value()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getSub_value();

	/**
	 * Returns the value of the '<em><b>Defined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined</em>' attribute.
	 * @see #setDefined(boolean)
	 * @see inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage#getValue_Defined()
	 * @model required="true"
	 * @generated
	 */
	boolean isDefined();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.xdsml.gagmt.specification.Value#isDefined <em>Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined</em>' attribute.
	 * @see #isDefined()
	 * @generated
	 */
	void setDefined(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage#getValue_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.xdsml.gagmt.specification.Value#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

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
	 * @see inria.fuchsia.gag.xdsml.gagmt.specification.SpecificationPackage#getValue_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.xdsml.gagmt.specification.Value#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Value
