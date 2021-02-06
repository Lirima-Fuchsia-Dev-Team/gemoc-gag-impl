package inria.fuchsia.gag.gag.adapters.gagmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import inria.fuchsia.gag.gag.process.Configuration;
import inria.fuchsia.gag.gag.process.Task;
import inria.fuchsia.gag.gag.specification.Attribute;
import inria.fuchsia.gag.gag.specification.GAG;
import inria.fuchsia.gag.gag.specification.Guard;
import inria.fuchsia.gag.gag.specification.Rule;
import inria.fuchsia.gag.gag.specification.Service;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class GagMTAdaptersFactory implements AdaptersFactory {
  private static GagMTAdaptersFactory instance;
  
  public static GagMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public GagMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof inria.fuchsia.gag.gag.process.Task){
    	return createTaskAdapter((inria.fuchsia.gag.gag.process.Task) o, res);
    }
    if (o instanceof inria.fuchsia.gag.gag.process.Configuration){
    	return createConfigurationAdapter((inria.fuchsia.gag.gag.process.Configuration) o, res);
    }
    if (o instanceof inria.fuchsia.gag.gag.specification.GAG){
    	return createGAGAdapter((inria.fuchsia.gag.gag.specification.GAG) o, res);
    }
    if (o instanceof inria.fuchsia.gag.gag.specification.Attribute){
    	return createAttributeAdapter((inria.fuchsia.gag.gag.specification.Attribute) o, res);
    }
    if (o instanceof inria.fuchsia.gag.gag.specification.Service){
    	return createServiceAdapter((inria.fuchsia.gag.gag.specification.Service) o, res);
    }
    if (o instanceof inria.fuchsia.gag.gag.specification.Guard){
    	return createGuardAdapter((inria.fuchsia.gag.gag.specification.Guard) o, res);
    }
    if (o instanceof inria.fuchsia.gag.gag.specification.Rule){
    	return createRuleAdapter((inria.fuchsia.gag.gag.specification.Rule) o, res);
    }
    
    return null;
  }
  
  public inria.fuchsia.gag.gag.adapters.gagmt.process.TaskAdapter createTaskAdapter(final Task adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (inria.fuchsia.gag.gag.adapters.gagmt.process.TaskAdapter) adapter;
    else {
    	adapter = new inria.fuchsia.gag.gag.adapters.gagmt.process.TaskAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (inria.fuchsia.gag.gag.adapters.gagmt.process.TaskAdapter) adapter;
    }
  }
  
  public inria.fuchsia.gag.gag.adapters.gagmt.process.ConfigurationAdapter createConfigurationAdapter(final Configuration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (inria.fuchsia.gag.gag.adapters.gagmt.process.ConfigurationAdapter) adapter;
    else {
    	adapter = new inria.fuchsia.gag.gag.adapters.gagmt.process.ConfigurationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (inria.fuchsia.gag.gag.adapters.gagmt.process.ConfigurationAdapter) adapter;
    }
  }
  
  public inria.fuchsia.gag.gag.adapters.gagmt.specification.GAGAdapter createGAGAdapter(final GAG adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (inria.fuchsia.gag.gag.adapters.gagmt.specification.GAGAdapter) adapter;
    else {
    	adapter = new inria.fuchsia.gag.gag.adapters.gagmt.specification.GAGAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (inria.fuchsia.gag.gag.adapters.gagmt.specification.GAGAdapter) adapter;
    }
  }
  
  public inria.fuchsia.gag.gag.adapters.gagmt.specification.AttributeAdapter createAttributeAdapter(final Attribute adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (inria.fuchsia.gag.gag.adapters.gagmt.specification.AttributeAdapter) adapter;
    else {
    	adapter = new inria.fuchsia.gag.gag.adapters.gagmt.specification.AttributeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (inria.fuchsia.gag.gag.adapters.gagmt.specification.AttributeAdapter) adapter;
    }
  }
  
  public inria.fuchsia.gag.gag.adapters.gagmt.specification.ServiceAdapter createServiceAdapter(final Service adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (inria.fuchsia.gag.gag.adapters.gagmt.specification.ServiceAdapter) adapter;
    else {
    	adapter = new inria.fuchsia.gag.gag.adapters.gagmt.specification.ServiceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (inria.fuchsia.gag.gag.adapters.gagmt.specification.ServiceAdapter) adapter;
    }
  }
  
  public inria.fuchsia.gag.gag.adapters.gagmt.specification.GuardAdapter createGuardAdapter(final Guard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (inria.fuchsia.gag.gag.adapters.gagmt.specification.GuardAdapter) adapter;
    else {
    	adapter = new inria.fuchsia.gag.gag.adapters.gagmt.specification.GuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (inria.fuchsia.gag.gag.adapters.gagmt.specification.GuardAdapter) adapter;
    }
  }
  
  public inria.fuchsia.gag.gag.adapters.gagmt.specification.RuleAdapter createRuleAdapter(final Rule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (inria.fuchsia.gag.gag.adapters.gagmt.specification.RuleAdapter) adapter;
    else {
    	adapter = new inria.fuchsia.gag.gag.adapters.gagmt.specification.RuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (inria.fuchsia.gag.gag.adapters.gagmt.specification.RuleAdapter) adapter;
    }
  }
}
