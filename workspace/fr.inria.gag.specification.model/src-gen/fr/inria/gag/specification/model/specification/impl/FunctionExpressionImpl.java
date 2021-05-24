/**
 */
package fr.inria.gag.specification.model.specification.impl;

import fr.inria.gag.specification.model.specification.FunctionDeclaration;
import fr.inria.gag.specification.model.specification.FunctionExpression;
import fr.inria.gag.specification.model.specification.IdExpresssion;
import fr.inria.gag.specification.model.specification.SpecificationPackage;

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
 * An implementation of the model object '<em><b>Function Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.FunctionExpressionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.FunctionExpressionImpl#getIdExpresssions <em>Id Expresssions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionExpressionImpl extends ExpressionImpl implements FunctionExpression {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected FunctionDeclaration function;

	/**
	 * The cached value of the '{@link #getIdExpresssions() <em>Id Expresssions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdExpresssions()
	 * @generated
	 * @ordered
	 */
	protected EList<IdExpresssion> idExpresssions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.FUNCTION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject) function;
			function = (FunctionDeclaration) eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SpecificationPackage.FUNCTION_EXPRESSION__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(FunctionDeclaration newFunction) {
		FunctionDeclaration oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.FUNCTION_EXPRESSION__FUNCTION,
					oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdExpresssion> getIdExpresssions() {
		if (idExpresssions == null) {
			idExpresssions = new EObjectContainmentEList<IdExpresssion>(IdExpresssion.class, this,
					SpecificationPackage.FUNCTION_EXPRESSION__ID_EXPRESSSIONS);
		}
		return idExpresssions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpecificationPackage.FUNCTION_EXPRESSION__ID_EXPRESSSIONS:
			return ((InternalEList<?>) getIdExpresssions()).basicRemove(otherEnd, msgs);
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
		case SpecificationPackage.FUNCTION_EXPRESSION__FUNCTION:
			if (resolve)
				return getFunction();
			return basicGetFunction();
		case SpecificationPackage.FUNCTION_EXPRESSION__ID_EXPRESSSIONS:
			return getIdExpresssions();
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
		case SpecificationPackage.FUNCTION_EXPRESSION__FUNCTION:
			setFunction((FunctionDeclaration) newValue);
			return;
		case SpecificationPackage.FUNCTION_EXPRESSION__ID_EXPRESSSIONS:
			getIdExpresssions().clear();
			getIdExpresssions().addAll((Collection<? extends IdExpresssion>) newValue);
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
		case SpecificationPackage.FUNCTION_EXPRESSION__FUNCTION:
			setFunction((FunctionDeclaration) null);
			return;
		case SpecificationPackage.FUNCTION_EXPRESSION__ID_EXPRESSSIONS:
			getIdExpresssions().clear();
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
		case SpecificationPackage.FUNCTION_EXPRESSION__FUNCTION:
			return function != null;
		case SpecificationPackage.FUNCTION_EXPRESSION__ID_EXPRESSSIONS:
			return idExpresssions != null && !idExpresssions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionExpressionImpl
