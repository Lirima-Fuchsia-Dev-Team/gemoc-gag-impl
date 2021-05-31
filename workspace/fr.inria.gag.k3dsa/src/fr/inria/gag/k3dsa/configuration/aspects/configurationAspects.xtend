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
import fr.inria.gag.configuration.model.configuration.Data
import fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation

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
import static extension fr.inria.gag.k3dsa.configuration.aspects.DataAspect.*
import static extension fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspect.*
import fr.inria.gag.k3dsa.EncapsulatedValue
import fr.inria.gag.k3dsa.Console

//for groovy shell

// import for groovy
import groovy.lang.Binding;
import groovy.lang.GroovyShell;

// eclipse need for groovy
import org.eclipse.gemoc.commons.eclipse.emf.EMFResource
import org.eclipse.gemoc.commons.eclipse.core.resources.IFileUtils
import java.util.ArrayList
import java.util.Map
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import java.net.URL
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.jdt.launching.JavaRuntime
import java.net.URLClassLoader
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import java.util.List

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
		conf += _self.service.name +"(" ;//+ "(isOpen=" + _self.isIsOpen;
		if (!_self.isIsOpen)
		{
			conf += " appliedRule=" + _self.appliedRule;
			conf += ")[";
			var i = 1;
			for (Task t : _self.subTasks) {
				conf += t.print();
				if (i < _self.subTasks.size)
					conf += ", ";
			}
			conf += "]";
		
		}else {
			for (i:0 ..< _self.inputs.size ) {
				val el= _self.inputs.get(i);
				conf += el.print();
				if (i < _self.inputs.size -1 )
					conf += ", ";
			}
			conf += ")[";
			for (i:0 ..< _self.outputs.size ) {
				val el= _self.outputs.get(i);
				conf += el.print();
				if (i < _self.outputs.size - 1)
					conf += ", ";
			}
			conf += "]";
		}
		return conf;
	}
}

@Aspect(className=Data)
class DataAspect {
	def String print() {
		var stToPrint = "?"
		var encVal = _self.value as EncapsulatedValue;
		//Console.debug(encVal.toString);
		if(!encVal.^null){stToPrint=encVal.value.toString}
		return _self.parameter.name+"="+stToPrint;
	}
}

@Aspect(className=PendingLocalFunctionComputation)
class PendingLocalFunctionComputationAspect {
	def boolean isExecutable() {
		var isexc =  true
		for(i:0 ..<_self.actualParameters.size){
			var data =_self.actualParameters.get(i);
			var ecData = data.value as EncapsulatedValue;
			if(ecData.isNull){
			   isexc=false;	
			}
		}
		return isexc;
	}
	
	def Object execute(){
		var binding = new Binding ;
		binding.setVariable("id", "5")

		// binding.setVariable("projectPath", EMFResource.getIFile(_self).project.location.toOSString)
		var ClassLoader lastClassLoader = null; // SystemFunction.classLoader;
		var ClassLoader currentClassLoader = null;
		var res = null as Object;
		try {
			println("run code")
			val List<IJavaProject> javaProjects = new ArrayList<IJavaProject>();
			val IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for (IProject project : projects) {
				// project.open(null /* IProgressMonitor */);
				project.open(null as IProgressMonitor);
				val IJavaProject javaProject = JavaCore.create(project);
				javaProjects.add(javaProject);
			}

			val List<URL> urlList = new ArrayList<URL>();
			for (IJavaProject project : javaProjects) {
				val String[] classPathEntries = JavaRuntime.computeDefaultRuntimeClassPath(project);
				for (var int i = 0; i < classPathEntries.length; i++) {
					val String entry = classPathEntries.get(i);
					val IPath path = new Path(entry);
					val URL url = path.toFile().toURI().toURL();
					urlList.add(url);
				}
				lastClassLoader = project.getClass().getClassLoader();
				var URL[] urls = newArrayOfSize(urlList.length);
				for (var int i = 0; i < urlList.length; i++) {
					urls.set(i, urlList.get(i))
				}
				currentClassLoader = new URLClassLoader(urls, lastClassLoader);
				lastClassLoader = currentClassLoader
			}

			val shell = new GroovyShell( /*currentClassLoader,*/ binding)
			var cl = shell.classLoader
			for (var int i = 0; i < urlList.length; i++) {
				cl.addURL(urlList.get(i))
				//Console.debug(urlList.get(i).toString);
			}
			var params="("
			for(i:0 ..<_self.actualParameters.size){
				var d = _self.actualParameters.get(i);
				var ecD = d.value as EncapsulatedValue;
				binding.setVariable('data'+i,ecD.value);
				if (i!=0) { params+=',' } 
				params+= 'data'+i;
				
				 
			}
			params+=')'
			// var htmlCleanedDescr = "MyCustomGAGGuard.staticIsRuleActivable()"
			var stringToExecute = _self.functiondeclaration.location+"."+_self.functiondeclaration.method+params;
			//Console.debug(stringToExecute);
			res = shell.evaluate(stringToExecute)  // as Map<String, Object>
//			for (OutputPin port: _self.outputs) {
//				//_self.system.sharedMemory.put(portName, res.get(portName))
//			}
		} catch (Exception cnfe) {
			println("Failed to call Groovy script " + cnfe.message)
			cnfe.printStackTrace()
		}
		return res
	
	}
}