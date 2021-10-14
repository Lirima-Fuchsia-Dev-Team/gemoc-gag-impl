package fr.inria.gag.specification.xtext.validation

import fr.inria.gag.configuration.model.configuration.Task
import fr.inria.gag.specification.model.specification.Service
import fr.inria.gag.configuration.model.configuration.ConfigurationFactory
import fr.inria.gag.specification.model.specification.SpecificationPackage
import java.util.ArrayList
import fr.inria.gag.configuration.model.configuration.Data
import java.util.Hashtable
import fr.inria.gag.specification.model.specification.IdExpression
import fr.inria.gag.specification.model.specification.LocalData
import fr.inria.gag.specification.model.specification.LeftPartExpression
import fr.inria.gag.specification.model.specification.FunctionExpression
import fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation
import java.util.Map

class ValidatorToolBase {
	
	def static void initTask(Task t, Service s) {
		t.service = s;
		t.isOpen = true;
		for (i : 0 ..< s.inputParameters.size) {
			var data = ConfigurationFactory.eINSTANCE.createData;
			data.parameter = s.inputParameters.get(i);
			data.value = new EncapsulatedValue;
			t.inputs.add(data);
		}
		for (i : 0 ..< s.outputParameters.size) {
			var data = ConfigurationFactory.eINSTANCE.createData;
			data.parameter = s.outputParameters.get(i);
			data.value = new EncapsulatedValue;
			t.outputs.add(data);
		}

	}
	
	def static fr.inria.gag.configuration.model.configuration.Data findReference(String[] ref, ArrayList<Task> tasks) {
		var objectRef = null as fr.inria.gag.configuration.model.configuration.Data;
		var serviceName = ref.get(0).toString.trim;
		var serviceParameter = ref.get(1).toString.trim;
		// Console.debug(serviceName+"."+serviceParameter);
		for (i : 0 ..< tasks.size) {
			var element = tasks.get(i);
			if (element.service.name.equals(serviceName)) {
				// we look in inputs and outputs to find the parameter
				for (j : 0 ..< element.inputs.size) {
					if (element.inputs.get(j).parameter.name.equals(serviceParameter)) {
						objectRef = element.inputs.get(j);
					// Console.debug('i found');
					}
				}
				for (j : 0 ..< element.outputs.size) {
					if (element.outputs.get(j).parameter.name.equals(serviceParameter)) {
						objectRef = element.outputs.get(j);
					// Console.debug('i found');
					}
				}
			}
		}
		return objectRef;
	}
	
	def static Hashtable<Data,String> reverseStringDataHashtable(Hashtable<String,Data> map){
		
		var hash = new Hashtable<Data,String>();
		var setOfKeys = map.keySet();
		 for (String key : setOfKeys) {
            hash.put(map.get(key),key);
        }
		return hash;
	}
}