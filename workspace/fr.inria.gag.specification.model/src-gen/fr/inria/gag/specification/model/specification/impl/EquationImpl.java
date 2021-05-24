/**
 */
package fr.inria.gag.specification.model.specification.impl;

import fr.inria.gag.specification.model.specification.Equation;
import fr.inria.gag.specification.model.specification.Expression;
import fr.inria.gag.specification.model.specification.IdExpresssion;
import fr.inria.gag.specification.model.specification.SpecificationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.EquationImpl#getLeftpart <em>Leftpart</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.EquationImpl#getRightpart <em>Rightpart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquationImpl extends MinimalEObjectImpl.Container implements Equation {
	/**
	 * The cached value of the '{@link #getLeftpart() <em>Leftpart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftpart()
	 * @generated
	 * @ordered
	 */
	protected IdExpresssion leftpart;

	/**
	 * The cached value of the '{@link #getRightpart() <em>Rightpart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightpart()
	 * @generated
	 * @ordered
	 */
	protected Expression rightpart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.EQUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdExpresssion getLeftpart() {
		if (leftpart != null && leftpart.eIsProxy()) {
			InternalEObject oldLeftpart = (InternalEObject) leftpart;
			leftpart = (IdExpresssion) eResolveProxy(oldLeftpart);
			if (leftpart != oldLeftpart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecificationPackage.EQUATION__LEFTPART,
							oldLeftpart, leftpart));
			}
		}
		return leftpart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdExpresssion basicGetLeftpart() {
		return leftpart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftpart(IdExpresssion newLeftpart) {
		IdExpresssion oldLeftpart = leftpart;
		leftpart = newLeftpart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.EQUATION__LEFTPART, oldLeftpart,
					leftpart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightpart() {
		if (rightpart != null && rightpart.eIsProxy()) {
			InternalEObject oldRightpart = (InternalEObject) rightpart;
			rightpart = (Expression) eResolveProxy(oldRightpart);
			if (rightpart != oldRightpart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecificationPackage.EQUATION__RIGHTPART,
							oldRightpart, rightpart));
			}
		}
		return rightpart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetRightpart() {
		return rightpart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightpart(Expression newRightpart) {
		Expression oldRightpart = rightpart;
		rightpart = newRightpart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.EQUATION__RIGHTPART,
					oldRightpart, rightpart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpecificationPackage.EQUATION__LEFTPART:
			if (resolve)
				return getLeftpart();
			return basicGetLeftpart();
		case SpecificationPackage.EQUATION__RIGHTPART:
			if (resolve)
				return getRightpart();
			return basicGetRightpart();
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
		case SpecificationPackage.EQUATION__LEFTPART:
			setLeftpart((IdExpresssion) newValue);
			return;
		case SpecificationPackage.EQUATION__RIGHTPART:
			setRightpart((Expression) newValue);
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
		case SpecificationPackage.EQUATION__LEFTPART:
			setLeftpart((IdExpresssion) null);
			return;
		case SpecificationPackage.EQUATION__RIGHTPART:
			setRightpart((Expression) null);
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
		case SpecificationPackage.EQUATION__LEFTPART:
			return leftpart != null;
		case SpecificationPackage.EQUATION__RIGHTPART:
			return rightpart != null;
		}
		return super.eIsSet(featureID);
	}

} //EquationImpl
