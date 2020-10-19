/**
 */
package inria.fuchsia.gag.xdsml.gag.process.impl;

import inria.fuchsia.gag.xdsml.gag.process.ProcessPackage;
import inria.fuchsia.gag.xdsml.gag.process.Task;

import inria.fuchsia.gag.xdsml.gag.specification.Rule;
import inria.fuchsia.gag.xdsml.gag.specification.Service;

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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.process.impl.TaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.process.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.process.impl.TaskImpl#isIs_open <em>Is open</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.process.impl.TaskImpl#getAppliedRule <em>Applied Rule</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.process.impl.TaskImpl#getInstance_of <em>Instance of</em>}</li>
 *   <li>{@link inria.fuchsia.gag.xdsml.gag.process.impl.TaskImpl#getSub_task <em>Sub task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

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
	 * The default value of the '{@link #isIs_open() <em>Is open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_open()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_open() <em>Is open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_open()
	 * @generated
	 * @ordered
	 */
	protected boolean is_open = IS_OPEN_EDEFAULT;

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
	 * The cached value of the '{@link #getInstance_of() <em>Instance of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_of()
	 * @generated
	 * @ordered
	 */
	protected Service instance_of;

	/**
	 * The cached value of the '{@link #getSub_task() <em>Sub task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub_task()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> sub_task;

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
		return ProcessPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TASK__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs_open() {
		return is_open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_open(boolean newIs_open) {
		boolean oldIs_open = is_open;
		is_open = newIs_open;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TASK__IS_OPEN, oldIs_open, is_open));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TASK__APPLIED_RULE, oldAppliedRule, appliedRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getInstance_of() {
		if (instance_of != null && instance_of.eIsProxy()) {
			InternalEObject oldInstance_of = (InternalEObject)instance_of;
			instance_of = (Service)eResolveProxy(oldInstance_of);
			if (instance_of != oldInstance_of) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.TASK__INSTANCE_OF, oldInstance_of, instance_of));
			}
		}
		return instance_of;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetInstance_of() {
		return instance_of;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance_of(Service newInstance_of) {
		Service oldInstance_of = instance_of;
		instance_of = newInstance_of;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.TASK__INSTANCE_OF, oldInstance_of, instance_of));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getSub_task() {
		if (sub_task == null) {
			sub_task = new EObjectContainmentEList<Task>(Task.class, this, ProcessPackage.TASK__SUB_TASK);
		}
		return sub_task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyRule(Rule rule) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.TASK__SUB_TASK:
				return ((InternalEList<?>)getSub_task()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.TASK__ID:
				return getId();
			case ProcessPackage.TASK__NAME:
				return getName();
			case ProcessPackage.TASK__IS_OPEN:
				return isIs_open();
			case ProcessPackage.TASK__APPLIED_RULE:
				return getAppliedRule();
			case ProcessPackage.TASK__INSTANCE_OF:
				if (resolve) return getInstance_of();
				return basicGetInstance_of();
			case ProcessPackage.TASK__SUB_TASK:
				return getSub_task();
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
			case ProcessPackage.TASK__ID:
				setId((Long)newValue);
				return;
			case ProcessPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.TASK__IS_OPEN:
				setIs_open((Boolean)newValue);
				return;
			case ProcessPackage.TASK__APPLIED_RULE:
				setAppliedRule((String)newValue);
				return;
			case ProcessPackage.TASK__INSTANCE_OF:
				setInstance_of((Service)newValue);
				return;
			case ProcessPackage.TASK__SUB_TASK:
				getSub_task().clear();
				getSub_task().addAll((Collection<? extends Task>)newValue);
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
			case ProcessPackage.TASK__ID:
				setId(ID_EDEFAULT);
				return;
			case ProcessPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.TASK__IS_OPEN:
				setIs_open(IS_OPEN_EDEFAULT);
				return;
			case ProcessPackage.TASK__APPLIED_RULE:
				setAppliedRule(APPLIED_RULE_EDEFAULT);
				return;
			case ProcessPackage.TASK__INSTANCE_OF:
				setInstance_of((Service)null);
				return;
			case ProcessPackage.TASK__SUB_TASK:
				getSub_task().clear();
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
			case ProcessPackage.TASK__ID:
				return id != ID_EDEFAULT;
			case ProcessPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.TASK__IS_OPEN:
				return is_open != IS_OPEN_EDEFAULT;
			case ProcessPackage.TASK__APPLIED_RULE:
				return APPLIED_RULE_EDEFAULT == null ? appliedRule != null : !APPLIED_RULE_EDEFAULT.equals(appliedRule);
			case ProcessPackage.TASK__INSTANCE_OF:
				return instance_of != null;
			case ProcessPackage.TASK__SUB_TASK:
				return sub_task != null && !sub_task.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", is_open: ");
		result.append(is_open);
		result.append(", appliedRule: ");
		result.append(appliedRule);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
