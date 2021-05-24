/**
 */
package fr.inria.gag.specification.model.specification.impl;

import fr.inria.gag.specification.model.specification.Equation;
import fr.inria.gag.specification.model.specification.FunctionDeclaration;
import fr.inria.gag.specification.model.specification.SemanticRule;
import fr.inria.gag.specification.model.specification.SpecificationPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.SemanticRuleImpl#getFunctionDeclaration <em>Function Declaration</em>}</li>
 *   <li>{@link fr.inria.gag.specification.model.specification.impl.SemanticRuleImpl#getEquations <em>Equations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticRuleImpl extends MinimalEObjectImpl.Container implements SemanticRule {
	/**
	 * The cached value of the '{@link #getFunctionDeclaration() <em>Function Declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionDeclaration> functionDeclaration;
	/**
	 * The cached value of the '{@link #getEquations() <em>Equations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquations()
	 * @generated
	 * @ordered
	 */
	protected EList<Equation> equations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.SEMANTIC_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionDeclaration> getFunctionDeclaration() {
		if (functionDeclaration == null) {
			functionDeclaration = new EObjectContainmentEList<FunctionDeclaration>(FunctionDeclaration.class, this,
					SpecificationPackage.SEMANTIC_RULE__FUNCTION_DECLARATION);
		}
		return functionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Equation> getEquations() {
		if (equations == null) {
			equations = new EObjectContainmentEList<Equation>(Equation.class, this,
					SpecificationPackage.SEMANTIC_RULE__EQUATIONS);
		}
		return equations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpecificationPackage.SEMANTIC_RULE__FUNCTION_DECLARATION:
			return ((InternalEList<?>) getFunctionDeclaration()).basicRemove(otherEnd, msgs);
		case SpecificationPackage.SEMANTIC_RULE__EQUATIONS:
			return ((InternalEList<?>) getEquations()).basicRemove(otherEnd, msgs);
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
		case SpecificationPackage.SEMANTIC_RULE__FUNCTION_DECLARATION:
			return getFunctionDeclaration();
		case SpecificationPackage.SEMANTIC_RULE__EQUATIONS:
			return getEquations();
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
		case SpecificationPackage.SEMANTIC_RULE__FUNCTION_DECLARATION:
			getFunctionDeclaration().clear();
			getFunctionDeclaration().addAll((Collection<? extends FunctionDeclaration>) newValue);
			return;
		case SpecificationPackage.SEMANTIC_RULE__EQUATIONS:
			getEquations().clear();
			getEquations().addAll((Collection<? extends Equation>) newValue);
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
		case SpecificationPackage.SEMANTIC_RULE__FUNCTION_DECLARATION:
			getFunctionDeclaration().clear();
			return;
		case SpecificationPackage.SEMANTIC_RULE__EQUATIONS:
			getEquations().clear();
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
		case SpecificationPackage.SEMANTIC_RULE__FUNCTION_DECLARATION:
			return functionDeclaration != null && !functionDeclaration.isEmpty();
		case SpecificationPackage.SEMANTIC_RULE__EQUATIONS:
			return equations != null && !equations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemanticRuleImpl
