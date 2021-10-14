package fr.inria.gag.specification.xtext.validation;


// A class for better variable reference management
public class EncapsulatedValue {

	private Object value ;
	private EncapsulatedValue next;
	
	public EncapsulatedValue() {
		value=null;
		next = null;
	}
	public EncapsulatedValue(Object val) {
		value=val;
		next = null;
	}
	
	public void addReference(EncapsulatedValue EV) {
		next=EV;
	}

	public Object getValue() {
		Object val = value;
		EncapsulatedValue myNext = next;
		while(myNext!=null) {
			val=myNext.value;
			myNext=myNext.next;
		}
		
		return val;
	}

	public void setValue(Object value) {
		this.value = value;
		this.next = null ;
	}
	
	public boolean isNull() {
		
		return (getValue()==null);
	}
	
	public EncapsulatedValue getReference() {
		return next;
	}
	
	
	
}
