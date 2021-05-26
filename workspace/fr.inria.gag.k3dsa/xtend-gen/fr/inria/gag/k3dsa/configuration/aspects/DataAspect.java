package fr.inria.gag.k3dsa.configuration.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.gag.configuration.model.configuration.Data;
import fr.inria.gag.k3dsa.EncapsulatedValue;
import fr.inria.gag.k3dsa.configuration.aspects.DataAspectDataAspectProperties;

@Aspect(className = Data.class)
@SuppressWarnings("all")
public class DataAspect {
  public static String print(final Data _self) {
    final fr.inria.gag.k3dsa.configuration.aspects.DataAspectDataAspectProperties _self_ = fr.inria.gag.k3dsa.configuration.aspects.DataAspectDataAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String print()
    if (_self instanceof fr.inria.gag.configuration.model.configuration.Data){
    	result = fr.inria.gag.k3dsa.configuration.aspects.DataAspect._privk3_print(_self_, (fr.inria.gag.configuration.model.configuration.Data)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_print(final DataAspectDataAspectProperties _self_, final Data _self) {
    String stToPrint = "?";
    Object _value = _self.getValue();
    EncapsulatedValue encVal = ((EncapsulatedValue) _value);
    boolean _isNull = encVal.isNull();
    boolean _not = (!_isNull);
    if (_not) {
      stToPrint = encVal.getValue().toString();
    }
    String _name = _self.getParameter().getName();
    String _plus = (_name + "=");
    return (_plus + stToPrint);
  }
}
