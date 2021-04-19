/**
 */
package fr.inria.gag.specification.model.specification.impl;

import fr.inria.gag.specification.model.specification.DecompositionRule;
import fr.inria.gag.specification.model.specification.Parameter;
import fr.inria.gag.specification.model.specification.Service;
import fr.inria.gag.specification.model.specification.SpecificationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.ServiceImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.ServiceImpl#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.ServiceImpl#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.ServiceImpl#isIsAxiom <em>Is Axiom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<DecompositionRule> rules;

	/**
	 * The cached value of the '{@link #getInputParameters() <em>Input Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> inputParameters;

	/**
	 * The cached value of the '{@link #getOutputParameters() <em>Output Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> outputParameters;

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
	 * The default value of the '{@link #isIsAxiom() <em>Is Axiom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAxiom()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AXIOM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAxiom() <em>Is Axiom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAxiom()
	 * @generated
	 * @ordered
	 */
	protected boolean isAxiom = IS_AXIOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecompositionRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<DecompositionRule>(DecompositionRule.class, this,
					SpecificationPackage.SERVICE__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getInputParameters() {
		if (inputParameters == null) {
			inputParameters = new EObjectResolvingEList<Parameter>(Parameter.class, this,
					SpecificationPackage.SERVICE__INPUT_PARAMETERS);
		}
		return inputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOutputParameters() {
		if (outputParameters == null) {
			outputParameters = new EObjectResolvingEList<Parameter>(Parameter.class, this,
					SpecificationPackage.SERVICE__OUTPUT_PARAMETERS);
		}
		return outputParameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAxiom() {
		return isAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAxiom(boolean newIsAxiom) {
		boolean oldIsAxiom = isAxiom;
		isAxiom = newIsAxiom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.SERVICE__IS_AXIOM, oldIsAxiom,
					isAxiom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpecificationPackage.SERVICE__RULES:
			return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
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
		case SpecificationPackage.SERVICE__RULES:
			return getRules();
		case SpecificationPackage.SERVICE__INPUT_PARAMETERS:
			return getInputParameters();
		case SpecificationPackage.SERVICE__OUTPUT_PARAMETERS:
			return getOutputParameters();
		case SpecificationPackage.SERVICE__NAME:
			return getName();
		case SpecificationPackage.SERVICE__IS_AXIOM:
			return isIsAxiom();
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
		case SpecificationPackage.SERVICE__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends DecompositionRule>) newValue);
			return;
		case SpecificationPackage.SERVICE__INPUT_PARAMETERS:
			getInputParameters().clear();
			getInputParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case SpecificationPackage.SERVICE__OUTPUT_PARAMETERS:
			getOutputParameters().clear();
			getOutputParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case SpecificationPackage.SERVICE__NAME:
			setName((String) newValue);
			return;
		case SpecificationPackage.SERVICE__IS_AXIOM:
			setIsAxiom((Boolean) newValue);
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
		case SpecificationPackage.SERVICE__RULES:
			getRules().clear();
			return;
		case SpecificationPackage.SERVICE__INPUT_PARAMETERS:
			getInputParameters().clear();
			return;
		case SpecificationPackage.SERVICE__OUTPUT_PARAMETERS:
			getOutputParameters().clear();
			return;
		case SpecificationPackage.SERVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SpecificationPackage.SERVICE__IS_AXIOM:
			setIsAxiom(IS_AXIOM_EDEFAULT);
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
		case SpecificationPackage.SERVICE__RULES:
			return rules != null && !rules.isEmpty();
		case SpecificationPackage.SERVICE__INPUT_PARAMETERS:
			return inputParameters != null && !inputParameters.isEmpty();
		case SpecificationPackage.SERVICE__OUTPUT_PARAMETERS:
			return outputParameters != null && !outputParameters.isEmpty();
		case SpecificationPackage.SERVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SpecificationPackage.SERVICE__IS_AXIOM:
			return isAxiom != IS_AXIOM_EDEFAULT;
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
		result.append(", isAxiom: ");
		result.append(isAxiom);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
