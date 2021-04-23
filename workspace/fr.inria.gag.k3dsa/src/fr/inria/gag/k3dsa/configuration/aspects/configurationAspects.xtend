package fr.inria.gag.k3dsa.configuration.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.gag.specification.model.specification.GAG

import fr.inria.gag.specification.model.specification.Service
import fr.inria.gag.specification.model.specification.DecompositionRule
import fr.inria.gag.specification.model.specification.Guard
import fr.inria.gag.specification.model.specification.SemanticRule
import fr.inria.gag.specification.model.specification.Parameter

// start of our imports
import fr.inria.gag.configuration.model.configuration.Configuration
import fr.inria.gag.configuration.model.configuration.Task

import fr.inria.diverse.k3.al.annotationprocessor.Main

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager
// end of our imports
import static extension fr.inria.gag.k3dsa.specification.aspects.GAGAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.ServiceAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.GuardAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.SemanticRuleAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.ParameterAspect.*
import static extension fr.inria.gag.k3dsa.configuration.aspects.ConfigurationAspect.*
import static extension fr.inria.gag.k3dsa.configuration.aspects.TaskAspect.*

@Aspect(className=Configuration)
class ConfigurationAspect {
	def String print() {
		return _self.root.print();
	}
}

@Aspect(className=Task)
class TaskAspect {
	def String print() {
		var String conf = "";
		conf += _self.service.name + "(isOpen=" + _self.isIsOpen;
		if (!_self.isIsOpen)
			conf += ", appliedRule=" + _self.appliedRule;
		conf += ")[";
		var i = 1;
		for (Task t : _self.subTasks) {
			conf += t.print();
			if (i < _self.subTasks.size)
				conf += ", ";
		}
		conf += "]";
		return conf;
	}
}
