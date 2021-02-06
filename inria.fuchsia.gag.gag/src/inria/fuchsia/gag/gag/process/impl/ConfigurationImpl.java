/**
 */
package inria.fuchsia.gag.gag.process.impl;

import inria.fuchsia.gag.gag.process.Configuration;
import inria.fuchsia.gag.gag.process.ProcessPackage;
import inria.fuchsia.gag.gag.process.Task;

import inria.fuchsia.gag.gag.specification.GAG;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link inria.fuchsia.gag.gag.process.impl.ConfigurationImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gag.process.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link inria.fuchsia.gag.gag.process.impl.ConfigurationImpl#getConsistent_to <em>Consistent to</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends EObjectImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Task root;

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
	 * The cached value of the '{@link #getConsistent_to() <em>Consistent to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistent_to()
	 * @generated
	 * @ordered
	 */
	protected GAG consistent_to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (Task)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.CONFIGURATION__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Task newRoot) {
		Task oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.CONFIGURATION__ROOT, oldRoot, root));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GAG getConsistent_to() {
		if (consistent_to != null && consistent_to.eIsProxy()) {
			InternalEObject oldConsistent_to = (InternalEObject)consistent_to;
			consistent_to = (GAG)eResolveProxy(oldConsistent_to);
			if (consistent_to != oldConsistent_to) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.CONFIGURATION__CONSISTENT_TO, oldConsistent_to, consistent_to));
			}
		}
		return consistent_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GAG basicGetConsistent_to() {
		return consistent_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsistent_to(GAG newConsistent_to) {
		GAG oldConsistent_to = consistent_to;
		consistent_to = newConsistent_to;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.CONFIGURATION__CONSISTENT_TO, oldConsistent_to, consistent_to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.CONFIGURATION__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case ProcessPackage.CONFIGURATION__NAME:
				return getName();
			case ProcessPackage.CONFIGURATION__CONSISTENT_TO:
				if (resolve) return getConsistent_to();
				return basicGetConsistent_to();
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
			case ProcessPackage.CONFIGURATION__ROOT:
				setRoot((Task)newValue);
				return;
			case ProcessPackage.CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.CONFIGURATION__CONSISTENT_TO:
				setConsistent_to((GAG)newValue);
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
			case ProcessPackage.CONFIGURATION__ROOT:
				setRoot((Task)null);
				return;
			case ProcessPackage.CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.CONFIGURATION__CONSISTENT_TO:
				setConsistent_to((GAG)null);
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
			case ProcessPackage.CONFIGURATION__ROOT:
				return root != null;
			case ProcessPackage.CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.CONFIGURATION__CONSISTENT_TO:
				return consistent_to != null;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
