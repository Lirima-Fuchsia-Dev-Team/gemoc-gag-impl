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
import org.eclipse.emf.common.util.EList
// end of our imports
import static extension fr.inria.gag.k3dsa.specification.aspects.GAGAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.ServiceAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.DecompositionRuleAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.GuardAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.SemanticRuleAspect.*
import static extension fr.inria.gag.k3dsa.specification.aspects.ParameterAspect.*
import fr.inria.gag.k3dsa.Console
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.gag.configuration.model.configuration.ConfigurationFactory
import fr.inria.gag.configuration.model.configuration.Configuration
import java.util.ArrayList
import fr.inria.gag.configuration.model.configuration.Task

@Aspect(className=GAG)
class GAGAspect {
	@Step
	@InitializeModel
	def void initializeModel(EList<String> args){
		val configuration = ConfigurationFactory.eINSTANCE.createConfiguration
		_self.configuration = configuration
	}
	
	
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
	val conf= _self.configuration as Configuration ;
	
	//get the axioms
	chooseTheAxiom(_self);
	
	// run the conf
	var openTask = getOpenTask(_self,conf.root);
	while (openTask.size!=0){
		var task= chooseTask(_self,openTask);
		var rule = chooseRule(_self,task);
		applyRule(_self,task,rule);
		openTask = getOpenTask(_self,conf.root);
	}
	}
	
	@Step
	def void chooseTheAxiom (){
		val services = _self.services;
		val axioms = new ArrayList() ;
			for (i : 0 ..< services.size) {
				val element = services.get(i)
				if (element.isIsAxiom){
					axioms.add(services.get(i));
				}
			}
		Console.debug("Veillez choisir le service axiome de démarrage parmi les services suivants : ");
		var txtAf="";
		for (i : 0 ..< axioms.size) {
		val element = axioms.get(i) as Service;
		txtAf+=" "+(i+1)+"- "+ element.name;
		}
		//Console.debug(txtAf);
        val choice = Console.readConsoleLine(txtAf);
        val id=Integer.parseInt(choice);
        val serviceChoice= axioms.get(id-1) as Service;
        val conf = _self.configuration as Configuration
        conf.root = ConfigurationFactory.eINSTANCE.createTask
        conf.root.service=serviceChoice;
        
        
	}
	
	@Step 
	def Task chooseTask(ArrayList<Task> openTasks){
		val conf = _self.configuration as Configuration;
		Console.debug("Veillez choisir la tâche à traiter parmi les tâches suivantes : ");
		var txtAf="";
		for (i : 0 ..< openTasks.size) {
		val element = openTasks.get(i) ;
		txtAf+=" "+(i+1)+"- "+ element.service.name;
		}
		val choice = Console.readConsoleLine(txtAf);
		val id= Integer.parseInt(choice);
		return openTasks.get(id-1);
		
	}
	@Step
	def DecompositionRule chooseRule(Task t){
		Console.debug("Veillez choisir la règle de décomposition à appliquer parmi les règles suivantes : ");
		var txtAf="";
		for (i : 0 ..< t.service.rules.size) {
		val element = t.service.rules.get(i) ;
		txtAf+=" "+(i+1)+"- "+ element.name;
		}
		val choice = Console.readConsoleLine(txtAf);
		val id=Integer.parseInt(choice);
		val rule = t.service.rules.get(id-1);
		return rule;
		
	}
	
	def ArrayList<Task> getOpenTask(Task root){
		val openTasks = new ArrayList<Task>();
		if(root.isOpen){
			openTasks.add(root);
		}else{
			for (i : 0 ..< root.subTasks.size) {
				val element = root.subTasks.get(i)
				val subOpenTasks = getOpenTask(_self,element);
				openTasks.addAll(subOpenTasks);	
			}
		}
		return openTasks;
	}
	@Step
	def void applyRule(Task t, DecompositionRule r){
		t.appliedRule=r.name;
		t.isOpen = false;
	//	t.subTasks = new EList<Task>();
		for (i : 0 ..< r.subServices.size) {
				val element = r.subServices.get(i)
				val st=	ConfigurationFactory.eINSTANCE.createTask;
				st.service = element;
				st.isOpen = true;
				t.subTasks.add(st);
			}
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
