/**
 */
package inria.fuchsia.gag.xdsml.gag.specification.impl;

import inria.fuchsia.gag.xdsml.gag.specification.SpecificationPackage;
import inria.fuchsia.gag.xdsml.gag.specification.Value;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.specification.impl.ValueImpl#getSub_value <em>Sub value</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.specification.impl.ValueImpl#isDefined <em>Defined</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.specification.impl.ValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.specification.impl.ValueImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueImpl extends EObjectImpl implements Value {
	/**
	 * The cached value of the '{@link #getSub_value() <em>Sub value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub_value()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> sub_value;

	/**
	 * The default value of the '{@link #isDefined() <em>Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefined() <em>Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefined()
	 * @generated
	 * @ordered
	 */
	protected boolean defined = DEFINED_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getSub_value() {
		if (sub_value == null) {
			sub_value = new EObjectContainmentEList<Value>(Value.class, this, SpecificationPackage.VALUE__SUB_VALUE);
		}
		return sub_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefined() {
		return defined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefined(boolean newDefined) {
		boolean oldDefined = defined;
		defined = newDefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.VALUE__DEFINED, oldDefined, defined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.VALUE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.VALUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecificationPackage.VALUE__SUB_VALUE:
				return ((InternalEList<?>)getSub_value()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecificationPackage.VALUE__SUB_VALUE:
				return getSub_value();
			case SpecificationPackage.VALUE__DEFINED:
				return isDefined();
			case SpecificationPackage.VALUE__VALUE:
				return getValue();
			case SpecificationPackage.VALUE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpecificationPackage.VALUE__SUB_VALUE:
				getSub_value().clear();
				getSub_value().addAll((Collection<? extends Value>)newValue);
				return;
			case SpecificationPackage.VALUE__DEFINED:
				setDefined((Boolean)newValue);
				return;
			case SpecificationPackage.VALUE__VALUE:
				setValue(newValue);
				return;
			case SpecificationPackage.VALUE__NAME:
				setName((String)newValue);
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
			case SpecificationPackage.VALUE__SUB_VALUE:
				getSub_value().clear();
				return;
			case SpecificationPackage.VALUE__DEFINED:
				setDefined(DEFINED_EDEFAULT);
				return;
			case SpecificationPackage.VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SpecificationPackage.VALUE__NAME:
				setName(NAME_EDEFAULT);
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
			case SpecificationPackage.VALUE__SUB_VALUE:
				return sub_value != null && !sub_value.isEmpty();
			case SpecificationPackage.VALUE__DEFINED:
				return defined != DEFINED_EDEFAULT;
			case SpecificationPackage.VALUE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SpecificationPackage.VALUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (defined: ");
		result.append(defined);
		result.append(", value: ");
		result.append(value);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ValueImpl
