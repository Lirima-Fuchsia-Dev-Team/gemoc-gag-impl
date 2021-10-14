package fr.inria.gag.specification.xtext.validation;

import java.util.ArrayList;

public class Dependency {

	private String outParameter;
	private ArrayList<String> inParameters;
	
	public Dependency() {
		inParameters = new ArrayList<String>();
	}
	public String getOutParameter() {
		return outParameter;
	}
	public void setOutParameter(String outParameter) {
		this.outParameter = outParameter;
	}
	public ArrayList<String> getInParameters() {
		return inParameters;
	}
	public void setInParameters(ArrayList<String> inParameters) {
		this.inParameters = inParameters;
	}
	
	private void addInParameter(String st) {
		inParameters.add(st);
	}
	
	private void removeInParameter(String st) {
		inParameters.remove(st);
	}
	
	public String toString() {
		String result=""+outParameter+"<- (";
		for(int i=0;i<inParameters.size();i++) {
			if(i!=0) {
				result+=",";
			}
			result+=inParameters.get(i).toString();
		}
		result+=")";
		return result;
	}
	
	
}
