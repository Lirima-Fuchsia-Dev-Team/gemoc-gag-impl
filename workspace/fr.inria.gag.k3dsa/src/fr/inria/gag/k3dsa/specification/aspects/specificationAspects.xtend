package fr.inria.gag.k3dsa.specification.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.gag.specification.model.specification.GAG
import fr.inria.gag.specification.model.specification.Service
import fr.inria.gag.specification.model.specification.DecompositionRule
import fr.inria.gag.specification.model.specification.Guard
import fr.inria.gag.specification.model.specification.SemanticRule
import fr.inria.gag.specification.model.specification.Parameter

import static extension fr.inria.gag.k3dsa.specification.aspects.GAGAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.ServiceAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.GuardAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.SemanticRuleAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.ParameterAspect.*

@Aspect(className=GAG)
class GAGAspect {

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



