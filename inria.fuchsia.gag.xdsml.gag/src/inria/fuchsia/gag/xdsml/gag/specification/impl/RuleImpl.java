/**
 */
package inria.fuchsia.gag.xdsml.gag.specification.impl;

import inria.fuchsia.gag.xdsml.gag.specification.Guard;
import inria.fuchsia.gag.xdsml.gag.specification.Rule;
import inria.fuchsia.gag.xdsml.gag.specification.Service;
import inria.fuchsia.gag.xdsml.gag.specification.SpecificationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.specification.impl.RuleImpl#getLeft_hand_side <em>Left hand side</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.specification.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.specification.impl.RuleImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.specification.impl.RuleImpl#getRight_hand_side_service <em>Right hand side service</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.specification.impl.RuleImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The cached value of the '{@link #getLeft_hand_side() <em>Left hand side</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft_hand_side()
	 * @generated
	 * @ordered
	 */
	protected Service left_hand_side;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameters;

	/**
	 * The cached value of the '{@link #getRight_hand_side_service() <em>Right hand side service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight_hand_side_service()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> right_hand_side_service;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Guard guard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getLeft_hand_side() {
		if (left_hand_side != null && left_hand_side.eIsProxy()) {
			InternalEObject oldLeft_hand_side = (InternalEObject)left_hand_side;
			left_hand_side = (Service)eResolveProxy(oldLeft_hand_side);
			if (left_hand_side != oldLeft_hand_side) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecificationPackage.RULE__LEFT_HAND_SIDE, oldLeft_hand_side, left_hand_side));
			}
		}
		return left_hand_side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetLeft_hand_side() {
		return left_hand_side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft_hand_side(Service newLeft_hand_side) {
		Service oldLeft_hand_side = left_hand_side;
		left_hand_side = newLeft_hand_side;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.RULE__LEFT_HAND_SIDE, oldLeft_hand_side, left_hand_side));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(EList newParameters) {
		EList oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.RULE__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getRight_hand_side_service() {
		if (right_hand_side_service == null) {
			right_hand_side_service = new EObjectResolvingEList<Service>(Service.class, this, SpecificationPackage.RULE__RIGHT_HAND_SIDE_SERVICE);
		}
		return right_hand_side_service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard getGuard() {
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject)guard;
			guard = (Guard)eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecificationPackage.RULE__GUARD, oldGuard, guard));
			}
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard basicGetGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Guard newGuard) {
		Guard oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.RULE__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecificationPackage.RULE__LEFT_HAND_SIDE:
				if (resolve) return getLeft_hand_side();
				return basicGetLeft_hand_side();
			case SpecificationPackage.RULE__NAME:
				return getName();
			case SpecificationPackage.RULE__PARAMETERS:
				return getParameters();
			case SpecificationPackage.RULE__RIGHT_HAND_SIDE_SERVICE:
				return getRight_hand_side_service();
			case SpecificationPackage.RULE__GUARD:
				if (resolve) return getGuard();
				return basicGetGuard();
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
			case SpecificationPackage.RULE__LEFT_HAND_SIDE:
				setLeft_hand_side((Service)newValue);
				return;
			case SpecificationPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case SpecificationPackage.RULE__PARAMETERS:
				setParameters((EList)newValue);
				return;
			case SpecificationPackage.RULE__RIGHT_HAND_SIDE_SERVICE:
				getRight_hand_side_service().clear();
				getRight_hand_side_service().addAll((Collection<? extends Service>)newValue);
				return;
			case SpecificationPackage.RULE__GUARD:
				setGuard((Guard)newValue);
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
			case SpecificationPackage.RULE__LEFT_HAND_SIDE:
				setLeft_hand_side((Service)null);
				return;
			case SpecificationPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpecificationPackage.RULE__PARAMETERS:
				setParameters((EList)null);
				return;
			case SpecificationPackage.RULE__RIGHT_HAND_SIDE_SERVICE:
				getRight_hand_side_service().clear();
				return;
			case SpecificationPackage.RULE__GUARD:
				setGuard((Guard)null);
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
			case SpecificationPackage.RULE__LEFT_HAND_SIDE:
				return left_hand_side != null;
			case SpecificationPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpecificationPackage.RULE__PARAMETERS:
				return parameters != null;
			case SpecificationPackage.RULE__RIGHT_HAND_SIDE_SERVICE:
				return right_hand_side_service != null && !right_hand_side_service.isEmpty();
			case SpecificationPackage.RULE__GUARD:
				return guard != null;
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
		result.append(", parameters: ");
		result.append(parameters);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
