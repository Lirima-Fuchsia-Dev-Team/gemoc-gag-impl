/**
 */
package fr.inria.gag.specification.model.specification.impl;

import fr.inria.gag.specification.model.specification.FunctionDeclaration;
import fr.inria.gag.specification.model.specification.SpecificationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.FunctionDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.FunctionDeclarationImpl#getClassPath <em>Class Path</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.FunctionDeclarationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.FunctionDeclarationImpl#getLibLocation <em>Lib Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDeclarationImpl extends MinimalEObjectImpl.Container implements FunctionDeclaration {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassPath() <em>Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassPath() <em>Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPath()
	 * @generated
	 * @ordered
	 */
	protected String classPath = CLASS_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibLocation() <em>Lib Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LIB_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibLocation() <em>Lib Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibLocation()
	 * @generated
	 * @ordered
	 */
	protected String libLocation = LIB_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.FUNCTION_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.FUNCTION_DECLARATION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassPath() {
		return classPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassPath(String newClassPath) {
		String oldClassPath = classPath;
		classPath = newClassPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.FUNCTION_DECLARATION__CLASS_PATH,
					oldClassPath, classPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.FUNCTION_DECLARATION__METHOD,
					oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibLocation() {
		return libLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibLocation(String newLibLocation) {
		String oldLibLocation = libLocation;
		libLocation = newLibLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SpecificationPackage.FUNCTION_DECLARATION__LIB_LOCATION, oldLibLocation, libLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpecificationPackage.FUNCTION_DECLARATION__NAME:
			return getName();
		case SpecificationPackage.FUNCTION_DECLARATION__CLASS_PATH:
			return getClassPath();
		case SpecificationPackage.FUNCTION_DECLARATION__METHOD:
			return getMethod();
		case SpecificationPackage.FUNCTION_DECLARATION__LIB_LOCATION:
			return getLibLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpecificationPackage.FUNCTION_DECLARATION__NAME:
			setName((String) newValue);
			return;
		case SpecificationPackage.FUNCTION_DECLARATION__CLASS_PATH:
			setClassPath((String) newValue);
			return;
		case SpecificationPackage.FUNCTION_DECLARATION__METHOD:
			setMethod((String) newValue);
			return;
		case SpecificationPackage.FUNCTION_DECLARATION__LIB_LOCATION:
			setLibLocation((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SpecificationPackage.FUNCTION_DECLARATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SpecificationPackage.FUNCTION_DECLARATION__CLASS_PATH:
			setClassPath(CLASS_PATH_EDEFAULT);
			return;
		case SpecificationPackage.FUNCTION_DECLARATION__METHOD:
			setMethod(METHOD_EDEFAULT);
			return;
		case SpecificationPackage.FUNCTION_DECLARATION__LIB_LOCATION:
			setLibLocation(LIB_LOCATION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SpecificationPackage.FUNCTION_DECLARATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SpecificationPackage.FUNCTION_DECLARATION__CLASS_PATH:
			return CLASS_PATH_EDEFAULT == null ? classPath != null : !CLASS_PATH_EDEFAULT.equals(classPath);
		case SpecificationPackage.FUNCTION_DECLARATION__METHOD:
			return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
		case SpecificationPackage.FUNCTION_DECLARATION__LIB_LOCATION:
			return LIB_LOCATION_EDEFAULT == null ? libLocation != null : !LIB_LOCATION_EDEFAULT.equals(libLocation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", classPath: ");
		result.append(classPath);
		result.append(", method: ");
		result.append(method);
		result.append(", libLocation: ");
		result.append(libLocation);
		result.append(')');
		return result.toString();
	}

} //FunctionDeclarationImpl
