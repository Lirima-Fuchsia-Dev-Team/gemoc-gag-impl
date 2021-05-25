/**
 */
package fr.inria.gag.specification.model.specification.impl;

import fr.inria.gag.specification.model.specification.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecificationFactoryImpl extends EFactoryImpl implements SpecificationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecificationFactory init() {
		try {
			SpecificationFactory theSpecificationFactory = (SpecificationFactory) EPackage.Registry.INSTANCE
					.getEFactory(SpecificationPackage.eNS_URI);
			if (theSpecificationFactory != null) {
				return theSpecificationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpecificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SpecificationPackage.GAG:
			return createGAG();
		case SpecificationPackage.SERVICE:
			return createService();
		case SpecificationPackage.DECOMPOSITION_RULE:
			return createDecompositionRule();
		case SpecificationPackage.GUARD:
			return createGuard();
		case SpecificationPackage.SEMANTIC_RULE:
			return createSemanticRule();
		case SpecificationPackage.PARAMETER:
			return createParameter();
		case SpecificationPackage.FUNCTION_DECLARATION:
			return createFunctionDeclaration();
		case SpecificationPackage.EQUATION:
			return createEquation();
		case SpecificationPackage.ID_EXPRESSION:
			return createIdExpression();
		case SpecificationPackage.FUNCTION_EXPRESSION:
			return createFunctionExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GAG createGAG() {
		GAGImpl gag = new GAGImpl();
		return gag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionRule createDecompositionRule() {
		DecompositionRuleImpl decompositionRule = new DecompositionRuleImpl();
		return decompositionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard createGuard() {
		GuardImpl guard = new GuardImpl();
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticRule createSemanticRule() {
		SemanticRuleImpl semanticRule = new SemanticRuleImpl();
		return semanticRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration createFunctionDeclaration() {
		FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
		return functionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equation createEquation() {
		EquationImpl equation = new EquationImpl();
		return equation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdExpression createIdExpression() {
		IdExpressionImpl idExpression = new IdExpressionImpl();
		return idExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionExpression createFunctionExpression() {
		FunctionExpressionImpl functionExpression = new FunctionExpressionImpl();
		return functionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationPackage getSpecificationPackage() {
		return (SpecificationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpecificationPackage getPackage() {
		return SpecificationPackage.eINSTANCE;
	}

} //SpecificationFactoryImpl
