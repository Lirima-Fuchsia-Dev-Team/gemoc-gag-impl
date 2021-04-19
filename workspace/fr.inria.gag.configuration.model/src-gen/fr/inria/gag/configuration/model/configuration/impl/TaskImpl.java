/**
 */
package fr.inria.gag.configuration.model.configuration.impl;

import fr.inria.gag.configuration.model.configuration.ConfigurationPackage;
import fr.inria.gag.configuration.model.configuration.Data;
import fr.inria.gag.configuration.model.configuration.Task;

import fr.inria.gag.specification.model.specification.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.impl.TaskImpl#getSubTasks <em>Sub Tasks</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.impl.TaskImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.impl.TaskImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.impl.TaskImpl#getAppliedRule <em>Applied Rule</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.impl.TaskImpl#isIsOpen <em>Is Open</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.impl.TaskImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The cached value of the '{@link #getSubTasks() <em>Sub Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> subTasks;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> outputs;

	/**
	 * The default value of the '{@link #getAppliedRule() <em>Applied Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedRule()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLIED_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppliedRule() <em>Applied Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedRule()
	 * @generated
	 * @ordered
	 */
	protected String appliedRule = APPLIED_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOpen() <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPEN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsOpen() <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean isOpen = IS_OPEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getSubTasks() {
		if (subTasks == null) {
			subTasks = new EObjectContainmentEList<Task>(Task.class, this, ConfigurationPackage.TASK__SUB_TASKS);
		}
		return subTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Data>(Data.class, this, ConfigurationPackage.TASK__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Data>(Data.class, this, ConfigurationPackage.TASK__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppliedRule() {
		return appliedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedRule(String newAppliedRule) {
		String oldAppliedRule = appliedRule;
		appliedRule = newAppliedRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASK__APPLIED_RULE,
					oldAppliedRule, appliedRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOpen() {
		return isOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOpen(boolean newIsOpen) {
		boolean oldIsOpen = isOpen;
		isOpen = newIsOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASK__IS_OPEN, oldIsOpen,
					isOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject) service;
			service = (Service) eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationPackage.TASK__SERVICE,
							oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TASK__SERVICE, oldService,
					service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConfigurationPackage.TASK__SUB_TASKS:
			return ((InternalEList<?>) getSubTasks()).basicRemove(otherEnd, msgs);
		case ConfigurationPackage.TASK__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case ConfigurationPackage.TASK__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
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
		case ConfigurationPackage.TASK__SUB_TASKS:
			return getSubTasks();
		case ConfigurationPackage.TASK__INPUTS:
			return getInputs();
		case ConfigurationPackage.TASK__OUTPUTS:
			return getOutputs();
		case ConfigurationPackage.TASK__APPLIED_RULE:
			return getAppliedRule();
		case ConfigurationPackage.TASK__IS_OPEN:
			return isIsOpen();
		case ConfigurationPackage.TASK__SERVICE:
			if (resolve)
				return getService();
			return basicGetService();
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
		case ConfigurationPackage.TASK__SUB_TASKS:
			getSubTasks().clear();
			getSubTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case ConfigurationPackage.TASK__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Data>) newValue);
			return;
		case ConfigurationPackage.TASK__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Data>) newValue);
			return;
		case ConfigurationPackage.TASK__APPLIED_RULE:
			setAppliedRule((String) newValue);
			return;
		case ConfigurationPackage.TASK__IS_OPEN:
			setIsOpen((Boolean) newValue);
			return;
		case ConfigurationPackage.TASK__SERVICE:
			setService((Service) newValue);
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
		case ConfigurationPackage.TASK__SUB_TASKS:
			getSubTasks().clear();
			return;
		case ConfigurationPackage.TASK__INPUTS:
			getInputs().clear();
			return;
		case ConfigurationPackage.TASK__OUTPUTS:
			getOutputs().clear();
			return;
		case ConfigurationPackage.TASK__APPLIED_RULE:
			setAppliedRule(APPLIED_RULE_EDEFAULT);
			return;
		case ConfigurationPackage.TASK__IS_OPEN:
			setIsOpen(IS_OPEN_EDEFAULT);
			return;
		case ConfigurationPackage.TASK__SERVICE:
			setService((Service) null);
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
		case ConfigurationPackage.TASK__SUB_TASKS:
			return subTasks != null && !subTasks.isEmpty();
		case ConfigurationPackage.TASK__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case ConfigurationPackage.TASK__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case ConfigurationPackage.TASK__APPLIED_RULE:
			return APPLIED_RULE_EDEFAULT == null ? appliedRule != null : !APPLIED_RULE_EDEFAULT.equals(appliedRule);
		case ConfigurationPackage.TASK__IS_OPEN:
			return isOpen != IS_OPEN_EDEFAULT;
		case ConfigurationPackage.TASK__SERVICE:
			return service != null;
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
		result.append(" (appliedRule: ");
		result.append(appliedRule);
		result.append(", isOpen: ");
		result.append(isOpen);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
