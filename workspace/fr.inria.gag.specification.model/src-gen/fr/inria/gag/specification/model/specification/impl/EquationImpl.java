/**
 */
package fr.inria.gag.specification.model.specification.impl;

import fr.inria.gag.specification.model.specification.Equation;
import fr.inria.gag.specification.model.specification.Expression;
import fr.inria.gag.specification.model.specification.RightPartExpression;
import fr.inria.gag.specification.model.specification.SpecificationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
	 * The cached value of the '{@link #getLeftpart() <em>Leftpart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftpart()
	 * @generated
	 * @ordered
	 */
	protected RightPartExpression leftpart;

	/**
	 * The cached value of the '{@link #getRightpart() <em>Rightpart</em>}' containment reference.
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
	public RightPartExpression getLeftpart() {
		return leftpart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftpart(RightPartExpression newLeftpart, NotificationChain msgs) {
		RightPartExpression oldLeftpart = leftpart;
		leftpart = newLeftpart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SpecificationPackage.EQUATION__LEFTPART, oldLeftpart, newLeftpart);
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
	public void setLeftpart(RightPartExpression newLeftpart) {
		if (newLeftpart != leftpart) {
			NotificationChain msgs = null;
			if (leftpart != null)
				msgs = ((InternalEObject) leftpart).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SpecificationPackage.EQUATION__LEFTPART, null, msgs);
			if (newLeftpart != null)
				msgs = ((InternalEObject) newLeftpart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SpecificationPackage.EQUATION__LEFTPART, null, msgs);
			msgs = basicSetLeftpart(newLeftpart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.EQUATION__LEFTPART, newLeftpart,
					newLeftpart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightpart() {
		return rightpart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightpart(Expression newRightpart, NotificationChain msgs) {
		Expression oldRightpart = rightpart;
		rightpart = newRightpart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SpecificationPackage.EQUATION__RIGHTPART, oldRightpart, newRightpart);
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
	public void setRightpart(Expression newRightpart) {
		if (newRightpart != rightpart) {
			NotificationChain msgs = null;
			if (rightpart != null)
				msgs = ((InternalEObject) rightpart).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SpecificationPackage.EQUATION__RIGHTPART, null, msgs);
			if (newRightpart != null)
				msgs = ((InternalEObject) newRightpart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SpecificationPackage.EQUATION__RIGHTPART, null, msgs);
			msgs = basicSetRightpart(newRightpart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.EQUATION__RIGHTPART,
					newRightpart, newRightpart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpecificationPackage.EQUATION__LEFTPART:
			return basicSetLeftpart(null, msgs);
		case SpecificationPackage.EQUATION__RIGHTPART:
			return basicSetRightpart(null, msgs);
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
		case SpecificationPackage.EQUATION__LEFTPART:
			return getLeftpart();
		case SpecificationPackage.EQUATION__RIGHTPART:
			return getRightpart();
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
			setLeftpart((RightPartExpression) newValue);
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
			setLeftpart((RightPartExpression) null);
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
