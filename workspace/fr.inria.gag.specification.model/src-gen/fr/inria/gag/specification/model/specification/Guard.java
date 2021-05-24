/**
 */
package fr.inria.gag.specification.model.specification;

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
 *   <li>{@link fr.inria.gag.specification.model.specification.Guard#getClassPath <em>Class Path</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.Guard#getLibLocation <em>Lib Location</em>}</li>
 * </ul>
 *
 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getGuard()
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
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getGuard_ClassPath()
	 * @model required="true"
	 * @generated
	 */
	String getClassPath();

	/**
	 * Sets the value of the '{@link fr.inria.gag.specification.model.specification.Guard#getClassPath <em>Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Path</em>' attribute.
	 * @see #getClassPath()
	 * @generated
	 */
	void setClassPath(String value);

	/**
	 * Returns the value of the '<em><b>Lib Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lib Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lib Location</em>' attribute.
	 * @see #setLibLocation(String)
	 * @see fr.inria.gag.specification.model.specification.SpecificationPackage#getGuard_LibLocation()
	 * @model required="true"
	 * @generated
	 */
	String getLibLocation();

	/**
	 * Sets the value of the '{@link fr.inria.gag.specification.model.specification.Guard#getLibLocation <em>Lib Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lib Location</em>' attribute.
	 * @see #getLibLocation()
	 * @generated
	 */
	void setLibLocation(String value);

} // Guard
