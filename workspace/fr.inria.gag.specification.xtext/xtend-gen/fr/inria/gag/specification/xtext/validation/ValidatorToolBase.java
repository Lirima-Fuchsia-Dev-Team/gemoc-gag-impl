package fr.inria.gag.specification.xtext.validation;

import fr.inria.gag.configuration.model.configuration.ConfigurationFactory;
import fr.inria.gag.configuration.model.configuration.Data;
import fr.inria.gag.configuration.model.configuration.Task;
import fr.inria.gag.specification.model.specification.Service;
import fr.inria.gag.specification.xtext.validation.EncapsulatedValue;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class ValidatorToolBase {
  public static void initTask(final Task t, final Service s) {
    t.setService(s);
    t.setIsOpen(true);
    int _size = s.getInputParameters().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        Data data = ConfigurationFactory.eINSTANCE.createData();
        data.setParameter(s.getInputParameters().get((i).intValue()));
        EncapsulatedValue _encapsulatedValue = new EncapsulatedValue();
        data.setValue(_encapsulatedValue);
        t.getInputs().add(data);
      }
    }
    int _size_1 = s.getOutputParameters().size();
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
    for (final Integer i_1 : _doubleDotLessThan_1) {
      {
        Data data = ConfigurationFactory.eINSTANCE.createData();
        data.setParameter(s.getOutputParameters().get((i_1).intValue()));
        EncapsulatedValue _encapsulatedValue = new EncapsulatedValue();
        data.setValue(_encapsulatedValue);
        t.getOutputs().add(data);
      }
    }
  }
  
  public static Data findReference(final String[] ref, final ArrayList<Task> tasks) {
    Data objectRef = ((Data) null);
    String serviceName = ref[0].toString().trim();
    String serviceParameter = ref[1].toString().trim();
    int _size = tasks.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        Task element = tasks.get((i).intValue());
        boolean _equals = element.getService().getName().equals(serviceName);
        if (_equals) {
          int _size_1 = element.getInputs().size();
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
          for (final Integer j : _doubleDotLessThan_1) {
            boolean _equals_1 = element.getInputs().get((j).intValue()).getParameter().getName().equals(serviceParameter);
            if (_equals_1) {
              objectRef = element.getInputs().get((j).intValue());
            }
          }
          int _size_2 = element.getOutputs().size();
          ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _size_2, true);
          for (final Integer j_1 : _doubleDotLessThan_2) {
            boolean _equals_2 = element.getOutputs().get((j_1).intValue()).getParameter().getName().equals(serviceParameter);
            if (_equals_2) {
              objectRef = element.getOutputs().get((j_1).intValue());
            }
          }
        }
      }
    }
    return objectRef;
  }
  
  public static Hashtable<Data, String> reverseStringDataHashtable(final Hashtable<String, Data> map) {
    Hashtable<Data, String> hash = new Hashtable<Data, String>();
    Set<String> setOfKeys = map.keySet();
    for (final String key : setOfKeys) {
      hash.put(map.get(key), key);
    }
    return hash;
  }
}
