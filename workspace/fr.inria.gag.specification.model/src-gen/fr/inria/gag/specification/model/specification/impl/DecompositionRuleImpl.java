/**
 */
package fr.inria.gag.specification.model.specification.impl;

import fr.inria.gag.specification.model.specification.DecompositionRule;
import fr.inria.gag.specification.model.specification.Guard;
import fr.inria.gag.specification.model.specification.SemanticRule;
import fr.inria.gag.specification.model.specification.Service;
import fr.inria.gag.specification.model.specification.SpecificationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decomposition Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.DecompositionRuleImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.DecompositionRuleImpl#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.DecompositionRuleImpl#getSubServices <em>Sub Services</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.DecompositionRuleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecompositionRuleImpl extends MinimalEObjectImpl.Container implements DecompositionRule {
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
	 * The cached value of the '{@link #getSemantic() <em>Semantic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantic()
	 * @generated
	 * @ordered
	 */
	protected SemanticRule semantic;

	/**
	 * The cached value of the '{@link #getSubServices() <em>Sub Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> subServices;

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
	protected DecompositionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.DECOMPOSITION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard getGuard() {
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject) guard;
			guard = (Guard) eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SpecificationPackage.DECOMPOSITION_RULE__GUARD, oldGuard, guard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.DECOMPOSITION_RULE__GUARD,
					oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticRule getSemantic() {
		if (semantic != null && semantic.eIsProxy()) {
			InternalEObject oldSemantic = (InternalEObject) semantic;
			semantic = (SemanticRule) eResolveProxy(oldSemantic);
			if (semantic != oldSemantic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SpecificationPackage.DECOMPOSITION_RULE__SEMANTIC, oldSemantic, semantic));
			}
		}
		return semantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticRule basicGetSemantic() {
		return semantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemantic(SemanticRule newSemantic) {
		SemanticRule oldSemantic = semantic;
		semantic = newSemantic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.DECOMPOSITION_RULE__SEMANTIC,
					oldSemantic, semantic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getSubServices() {
		if (subServices == null) {
			subServices = new EObjectResolvingEList<Service>(Service.class, this,
					SpecificationPackage.DECOMPOSITION_RULE__SUB_SERVICES);
		}
		return subServices;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.DECOMPOSITION_RULE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpecificationPackage.DECOMPOSITION_RULE__GUARD:
			if (resolve)
				return getGuard();
			return basicGetGuard();
		case SpecificationPackage.DECOMPOSITION_RULE__SEMANTIC:
			if (resolve)
				return getSemantic();
			return basicGetSemantic();
		case SpecificationPackage.DECOMPOSITION_RULE__SUB_SERVICES:
			return getSubServices();
		case SpecificationPackage.DECOMPOSITION_RULE__NAME:
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
		case SpecificationPackage.DECOMPOSITION_RULE__GUARD:
			setGuard((Guard) newValue);
			return;
		case SpecificationPackage.DECOMPOSITION_RULE__SEMANTIC:
			setSemantic((SemanticRule) newValue);
			return;
		case SpecificationPackage.DECOMPOSITION_RULE__SUB_SERVICES:
			getSubServices().clear();
			getSubServices().addAll((Collection<? extends Service>) newValue);
			return;
		case SpecificationPackage.DECOMPOSITION_RULE__NAME:
			setName((String) newValue);
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
		case SpecificationPackage.DECOMPOSITION_RULE__GUARD:
			setGuard((Guard) null);
			return;
		case SpecificationPackage.DECOMPOSITION_RULE__SEMANTIC:
			setSemantic((SemanticRule) null);
			return;
		case SpecificationPackage.DECOMPOSITION_RULE__SUB_SERVICES:
			getSubServices().clear();
			return;
		case SpecificationPackage.DECOMPOSITION_RULE__NAME:
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
		case SpecificationPackage.DECOMPOSITION_RULE__GUARD:
			return guard != null;
		case SpecificationPackage.DECOMPOSITION_RULE__SEMANTIC:
			return semantic != null;
		case SpecificationPackage.DECOMPOSITION_RULE__SUB_SERVICES:
			return subServices != null && !subServices.isEmpty();
		case SpecificationPackage.DECOMPOSITION_RULE__NAME:
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DecompositionRuleImpl
