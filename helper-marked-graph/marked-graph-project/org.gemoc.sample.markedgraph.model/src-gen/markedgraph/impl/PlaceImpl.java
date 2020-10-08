/**
 */
package markedgraph.impl;

import markedgraph.MarkedgraphPackage;
import markedgraph.Place;
import markedgraph.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link markedgraph.impl.PlaceImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link markedgraph.impl.PlaceImpl#getInput <em>Input</em>}</li>
 *   <li>{@link markedgraph.impl.PlaceImpl#getTokenCount <em>Token Count</em>}</li>
 *   <li>{@link markedgraph.impl.PlaceImpl#getRuntimeTokenCount <em>Runtime Token Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends NamedElementImpl implements Place {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Transition output;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected Transition input;

	/**
	 * The default value of the '{@link #getTokenCount() <em>Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenCount()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTokenCount() <em>Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenCount()
	 * @generated
	 * @ordered
	 */
	protected int tokenCount = TOKEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimeTokenCount() <em>Runtime Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeTokenCount()
	 * @generated
	 * @ordered
	 */
	protected static final int RUNTIME_TOKEN_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRuntimeTokenCount() <em>Runtime Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeTokenCount()
	 * @generated
	 * @ordered
	 */
	protected int runtimeTokenCount = RUNTIME_TOKEN_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkedgraphPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (Transition)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkedgraphPackage.PLACE__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Transition newOutput, NotificationChain msgs) {
		Transition oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkedgraphPackage.PLACE__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Transition newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, MarkedgraphPackage.TRANSITION__INPUTS, Transition.class, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, MarkedgraphPackage.TRANSITION__INPUTS, Transition.class, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkedgraphPackage.PLACE__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject)input;
			input = (Transition)eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkedgraphPackage.PLACE__INPUT, oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(Transition newInput, NotificationChain msgs) {
		Transition oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkedgraphPackage.PLACE__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(Transition newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, MarkedgraphPackage.TRANSITION__OUTPUTS, Transition.class, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, MarkedgraphPackage.TRANSITION__OUTPUTS, Transition.class, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkedgraphPackage.PLACE__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTokenCount() {
		return tokenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenCount(int newTokenCount) {
		int oldTokenCount = tokenCount;
		tokenCount = newTokenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkedgraphPackage.PLACE__TOKEN_COUNT, oldTokenCount, tokenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRuntimeTokenCount() {
		return runtimeTokenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeTokenCount(int newRuntimeTokenCount) {
		int oldRuntimeTokenCount = runtimeTokenCount;
		runtimeTokenCount = newRuntimeTokenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkedgraphPackage.PLACE__RUNTIME_TOKEN_COUNT, oldRuntimeTokenCount, runtimeTokenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkedgraphPackage.PLACE__OUTPUT:
				if (output != null)
					msgs = ((InternalEObject)output).eInverseRemove(this, MarkedgraphPackage.TRANSITION__INPUTS, Transition.class, msgs);
				return basicSetOutput((Transition)otherEnd, msgs);
			case MarkedgraphPackage.PLACE__INPUT:
				if (input != null)
					msgs = ((InternalEObject)input).eInverseRemove(this, MarkedgraphPackage.TRANSITION__OUTPUTS, Transition.class, msgs);
				return basicSetInput((Transition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkedgraphPackage.PLACE__OUTPUT:
				return basicSetOutput(null, msgs);
			case MarkedgraphPackage.PLACE__INPUT:
				return basicSetInput(null, msgs);
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
			case MarkedgraphPackage.PLACE__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case MarkedgraphPackage.PLACE__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
			case MarkedgraphPackage.PLACE__TOKEN_COUNT:
				return getTokenCount();
			case MarkedgraphPackage.PLACE__RUNTIME_TOKEN_COUNT:
				return getRuntimeTokenCount();
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
			case MarkedgraphPackage.PLACE__OUTPUT:
				setOutput((Transition)newValue);
				return;
			case MarkedgraphPackage.PLACE__INPUT:
				setInput((Transition)newValue);
				return;
			case MarkedgraphPackage.PLACE__TOKEN_COUNT:
				setTokenCount((Integer)newValue);
				return;
			case MarkedgraphPackage.PLACE__RUNTIME_TOKEN_COUNT:
				setRuntimeTokenCount((Integer)newValue);
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
			case MarkedgraphPackage.PLACE__OUTPUT:
				setOutput((Transition)null);
				return;
			case MarkedgraphPackage.PLACE__INPUT:
				setInput((Transition)null);
				return;
			case MarkedgraphPackage.PLACE__TOKEN_COUNT:
				setTokenCount(TOKEN_COUNT_EDEFAULT);
				return;
			case MarkedgraphPackage.PLACE__RUNTIME_TOKEN_COUNT:
				setRuntimeTokenCount(RUNTIME_TOKEN_COUNT_EDEFAULT);
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
			case MarkedgraphPackage.PLACE__OUTPUT:
				return output != null;
			case MarkedgraphPackage.PLACE__INPUT:
				return input != null;
			case MarkedgraphPackage.PLACE__TOKEN_COUNT:
				return tokenCount != TOKEN_COUNT_EDEFAULT;
			case MarkedgraphPackage.PLACE__RUNTIME_TOKEN_COUNT:
				return runtimeTokenCount != RUNTIME_TOKEN_COUNT_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tokenCount: ");
		result.append(tokenCount);
		result.append(", runtimeTokenCount: ");
		result.append(runtimeTokenCount);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
