package fr.inria.gag.k3dsa.specification.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.gag.specification.model.specification.GAG
import fr.inria.gag.specification.model.specification.Service
import fr.inria.gag.specification.model.specification.DecompositionRule
import fr.inria.gag.specification.model.specification.Guard
import fr.inria.gag.specification.model.specification.SemanticRule
import fr.inria.gag.specification.model.specification.Parameter

// start of our imports
import fr.inria.diverse.k3.al.annotationprocessor.Main

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager
// end of our imports
import static extension fr.inria.gag.k3dsa.specification.aspects.GAGAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.ServiceAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.GuardAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.SemanticRuleAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.ParameterAspect.*
import fr.inria.gag.k3dsa.Console

@Aspect(className=GAG)
class GAGAspect {
	@Main
	def void run() {
// println('hello world')
/* 
		val MessagingSystemManager msManager = new MessagingSystemManager
		val ms = msManager.createBestPlatformMessagingSystem("Gag", "Simple gag
interpreter")
		ms.debug("Hello world on " + _self.eResource.URI, "Gag")
	
	* 
	*/
	Console.debug("Hello world on " + _self.eResource.URI);
	}
}

@Aspect(className=Service)
class ServiceAspect {
}

@Aspect(className=DecompositionRule)
class DecompositionRuleAspect {
}

@Aspect(className=Guard)
class GuardAspect {
}

@Aspect(className=SemanticRule)
class SemanticRuleAspect {
}

@Aspect(className=Parameter)
class ParameterAspect {
}
