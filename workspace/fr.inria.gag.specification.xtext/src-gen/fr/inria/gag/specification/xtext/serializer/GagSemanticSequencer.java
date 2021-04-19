/*
 * generated by Xtext 2.14.0
 */
package fr.inria.gag.specification.xtext.serializer;

import com.google.inject.Inject;
import fr.inria.gag.specification.model.specification.DecompositionRule;
import fr.inria.gag.specification.model.specification.GAG;
import fr.inria.gag.specification.model.specification.Guard;
import fr.inria.gag.specification.model.specification.SemanticRule;
import fr.inria.gag.specification.model.specification.Service;
import fr.inria.gag.specification.model.specification.SpecificationPackage;
import fr.inria.gag.specification.xtext.services.GagGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GagSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GagGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SpecificationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SpecificationPackage.DECOMPOSITION_RULE:
				sequence_DecompositionRule(context, (DecompositionRule) semanticObject); 
				return; 
			case SpecificationPackage.GAG:
				sequence_GAG(context, (GAG) semanticObject); 
				return; 
			case SpecificationPackage.GUARD:
				sequence_Guard(context, (Guard) semanticObject); 
				return; 
			case SpecificationPackage.PARAMETER:
				sequence_Parameter(context, (fr.inria.gag.specification.model.specification.Parameter) semanticObject); 
				return; 
			case SpecificationPackage.SEMANTIC_RULE:
				sequence_SemanticRule(context, (SemanticRule) semanticObject); 
				return; 
			case SpecificationPackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DecompositionRule returns DecompositionRule
	 *
	 * Constraint:
	 *     (name=EString guard=[Guard|EString]? semantic=[SemanticRule|EString]? (subServices+=[Service|EString] subServices+=[Service|EString]*)?)
	 */
	protected void sequence_DecompositionRule(ISerializationContext context, DecompositionRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GAG returns GAG
	 *
	 * Constraint:
	 *     (name=EString (services+=Service services+=Service*)?)
	 */
	protected void sequence_GAG(ISerializationContext context, GAG semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Guard returns Guard
	 *
	 * Constraint:
	 *     classPath=EString?
	 */
	protected void sequence_Guard(ISerializationContext context, Guard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Parameter(ISerializationContext context, fr.inria.gag.specification.model.specification.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpecificationPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecificationPackage.Literals.PARAMETER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SemanticRule returns SemanticRule
	 *
	 * Constraint:
	 *     {SemanticRule}
	 */
	protected void sequence_SemanticRule(ISerializationContext context, SemanticRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Service returns Service
	 *
	 * Constraint:
	 *     (
	 *         isAxiom?='isAxiom' 
	 *         name=EString 
	 *         (inputParameters+=[Parameter|EString] inputParameters+=[Parameter|EString]*)? 
	 *         (outputParameters+=[Parameter|EString] outputParameters+=[Parameter|EString]*)? 
	 *         rules+=DecompositionRule 
	 *         rules+=DecompositionRule*
	 *     )
	 */
	protected void sequence_Service(ISerializationContext context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}