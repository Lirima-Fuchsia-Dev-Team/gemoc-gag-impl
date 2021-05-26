/**
 */
package fr.inria.gag.configuration.model.configuration.impl;

import fr.inria.gag.configuration.model.configuration.ConfigurationPackage;
import fr.inria.gag.configuration.model.configuration.Data;
import fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation;

import fr.inria.gag.specification.model.specification.FunctionDeclaration;

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
 * An implementation of the model object '<em><b>Pending Local Function Computation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.impl.PendingLocalFunctionComputationImpl#getFunctiondeclaration <em>Functiondeclaration</em>}</li>
 *   <li>{@link fr.inria.gag.configuration.model.configuration.impl.PendingLocalFunctionComputationImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PendingLocalFunctionComputationImpl extends MinimalEObjectImpl.Container
		implements PendingLocalFunctionComputation {
	/**
	 * The cached value of the '{@link #getFunctiondeclaration() <em>Functiondeclaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctiondeclaration()
	 * @generated
	 * @ordered
	 */
	protected FunctionDeclaration functiondeclaration;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PendingLocalFunctionComputationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.PENDING_LOCAL_FUNCTION_COMPUTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration getFunctiondeclaration() {
		if (functiondeclaration != null && functiondeclaration.eIsProxy()) {
			InternalEObject oldFunctiondeclaration = (InternalEObject) functiondeclaration;
			functiondeclaration = (FunctionDeclaration) eResolveProxy(oldFunctiondeclaration);
			if (functiondeclaration != oldFunctiondeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConfigurationPackage.PENDING_LOCAL_FUNCTION_COMPUTATION__FUNCTIONDECLARATION,
							oldFunctiondeclaration, functiondeclaration));
			}
		}
		return functiondeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration basicGetFunctiondeclaration() {
		return functiondeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctiondeclaration(FunctionDeclaration newFunctiondeclaration) {
		FunctionDeclaration oldFunctiondeclaration = functiondeclaration;
		functiondeclaration = newFunctiondeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.PENDING_LOCAL_FUNCTION_COMPUTATION__FUNCTIONDECLARATION,
					oldFunctiondeclaration, functiondeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<Data>(Data.class, this,
					ConfigurationPackage.PENDING_LOCAL_FUNCTION_COMPUTATION__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConfigurationPackage.PENDING_LOCAL_FUNCTION_COMPUTATION__FUNCTIONDECLARATION:
			if (resolve)
				return getFunctiondeclaration();
			return basicGetFunctiondeclaration();
		case ConfigurationPackage.PENDING_LOCAL_FUNCTION_COMPUTATION__DATA:
			return getData();
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
		case ConfigurationPackage.PENDING_LOCAL_FUNCTION_COMPUTATION__FUNCTIONDECLARATION:
			setFunctiondeclaration((FunctionDeclaration) newValue);
			return;
		case ConfigurationPackage.PENDING_LOCAL_FUNCTION_COMPUTATION__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
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
		case ConfigurationPackage.PENDING_LOCAL_FUNCTION_COMPUTATION__FUNCTIONDECLARATION:
			setFunctiondeclaration((FunctionDeclaration) null);
			return;
		case ConfigurationPackage.PENDING_LOCAL_FUNCTION_COMPUTATION__DATA:
			getData().clear();
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
		case ConfigurationPackage.PENDING_LOCAL_FUNCTION_COMPUTATION__FUNCTIONDECLARATION:
			return functiondeclaration != null;
		case ConfigurationPackage.PENDING_LOCAL_FUNCTION_COMPUTATION__DATA:
			return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PendingLocalFunctionComputationImpl
