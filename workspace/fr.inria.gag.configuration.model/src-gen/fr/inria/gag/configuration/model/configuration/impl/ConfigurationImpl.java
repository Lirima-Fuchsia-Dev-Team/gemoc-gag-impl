/**
 */
package fr.inria.gag.configuration.model.configuration.impl;

import fr.inria.gag.configuration.model.configuration.Configuration;
import fr.inria.gag.configuration.model.configuration.ConfigurationPackage;
import fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation;
import fr.inria.gag.configuration.model.configuration.Task;

import fr.inria.gag.specification.model.specification.impl.RuntimeDataImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.impl.ConfigurationImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.impl.ConfigurationImpl#getPendingLocalComputation <em>Pending Local Computation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends RuntimeDataImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Task root;

	/**
	 * The cached value of the '{@link #getPendingLocalComputation() <em>Pending Local Computation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingLocalComputation()
	 * @generated
	 * @ordered
	 */
	protected EList<PendingLocalFunctionComputation> pendingLocalComputation;

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
		return ConfigurationPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(Task newRoot, NotificationChain msgs) {
		Task oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.CONFIGURATION__ROOT, oldRoot, newRoot);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Task newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject) root).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONFIGURATION__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject) newRoot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONFIGURATION__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONFIGURATION__ROOT, newRoot,
					newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PendingLocalFunctionComputation> getPendingLocalComputation() {
		if (pendingLocalComputation == null) {
			pendingLocalComputation = new EObjectContainmentEList<PendingLocalFunctionComputation>(
					PendingLocalFunctionComputation.class, this,
					ConfigurationPackage.CONFIGURATION__PENDING_LOCAL_COMPUTATION);
		}
		return pendingLocalComputation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConfigurationPackage.CONFIGURATION__ROOT:
			return basicSetRoot(null, msgs);
		case ConfigurationPackage.CONFIGURATION__PENDING_LOCAL_COMPUTATION:
			return ((InternalEList<?>) getPendingLocalComputation()).basicRemove(otherEnd, msgs);
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
		case ConfigurationPackage.CONFIGURATION__ROOT:
			return getRoot();
		case ConfigurationPackage.CONFIGURATION__PENDING_LOCAL_COMPUTATION:
			return getPendingLocalComputation();
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
		case ConfigurationPackage.CONFIGURATION__ROOT:
			setRoot((Task) newValue);
			return;
		case ConfigurationPackage.CONFIGURATION__PENDING_LOCAL_COMPUTATION:
			getPendingLocalComputation().clear();
			getPendingLocalComputation().addAll((Collection<? extends PendingLocalFunctionComputation>) newValue);
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
		case ConfigurationPackage.CONFIGURATION__ROOT:
			setRoot((Task) null);
			return;
		case ConfigurationPackage.CONFIGURATION__PENDING_LOCAL_COMPUTATION:
			getPendingLocalComputation().clear();
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
		case ConfigurationPackage.CONFIGURATION__ROOT:
			return root != null;
		case ConfigurationPackage.CONFIGURATION__PENDING_LOCAL_COMPUTATION:
			return pendingLocalComputation != null && !pendingLocalComputation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
