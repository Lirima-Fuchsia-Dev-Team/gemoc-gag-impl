/**
 */
package inria.fuchsia.gag.gag.specification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link inria.fuchsia.gag.gag.specification.Guard#getClassPath <em>Class Path</em>}</li>
 * </ul>
 *
 * @see inria.fuchsia.gag.gag.specification.SpecificationPackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Path</em>' attribute.
	 * @see #setClassPath(String)
	 * @see inria.fuchsia.gag.gag.specification.SpecificationPackage#getGuard_ClassPath()
	 * @model required="true"
	 * @generated
	 */
	String getClassPath();

	/**
	 * Sets the value of the '{@link inria.fuchsia.gag.gag.specification.Guard#getClassPath <em>Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Path</em>' attribute.
	 * @see #getClassPath()
	 * @generated
	 */
	void setClassPath(String value);

} // Guard
