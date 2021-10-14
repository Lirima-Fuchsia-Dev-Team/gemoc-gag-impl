package fr.inria.gag.specification.xtext.validation;

import java.util.ArrayList;

public class ServiceInterface {
	private ArrayList<Dependency> dependencies;
	
	public ServiceInterface() {
		dependencies = new ArrayList<Dependency>();
	}

	public ArrayList<Dependency> getDependencies() {
		return dependencies;
	}
	
	public Dependency getDependencies(String outParameter) {
		Dependency dependency = null;
		for(int i=0;i<dependencies.size();i++) {
			Dependency dep = dependencies.get(i);
			if(outParameter.equals(dep.getOutParameter())) {
				dependency=dep;
				break;
			}
		}
		return dependency;
	}

	public void setDependencies(ArrayList<Dependency> dependencies) {
		this.dependencies = dependencies;
	}
	
	public void addDependency (Dependency d) {
		dependencies.add(d);
	}
	
	public void removeDependency (Dependency d) {
		dependencies.remove(d);
	}
	
	public String toString() {
		String result="[";
		for(int i=0;i<dependencies.size();i++) {
			if(i!=0) {
				result+=",\n";
			}
			result+=dependencies.get(i).toString();
		}
		result+="]";
		return result;
	}

	
}
