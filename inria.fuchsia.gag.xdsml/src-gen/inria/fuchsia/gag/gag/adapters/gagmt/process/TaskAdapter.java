package inria.fuchsia.gag.gag.adapters.gagmt.process;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory;
import inria.fuchsia.gag.gag.process.Task;
import inria.fuchsia.gag.gagmt.specification.Rule;
import inria.fuchsia.gag.gagmt.specification.Service;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TaskAdapter extends EObjectAdapter<Task> implements inria.fuchsia.gag.gagmt.process.Task {
  private GagMTAdaptersFactory adaptersFactory;
  
  public TaskAdapter() {
    super(inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance());
    adaptersFactory = inria.fuchsia.gag.gag.adapters.gagmt.GagMTAdaptersFactory.getInstance();
  }
  
  @Override
  public long getId() {
    return adaptee.getId();
  }
  
  @Override
  public void setId(final long o) {
    adaptee.setId(o);
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public boolean isIs_open() {
    return adaptee.isIs_open();
  }
  
  @Override
  public void setIs_open(final boolean o) {
    adaptee.setIs_open(o);
  }
  
  @Override
  public String getAppliedRule() {
    return adaptee.getAppliedRule();
  }
  
  @Override
  public void setAppliedRule(final String o) {
    adaptee.setAppliedRule(o);
  }
  
  @Override
  public Service getAssociated_to() {
    return (Service) adaptersFactory.createAdapter(adaptee.getAssociated_to(), eResource);
  }
  
  @Override
  public void setAssociated_to(final Service o) {
    if (o != null)
    	adaptee.setAssociated_to(((inria.fuchsia.gag.gag.adapters.gagmt.specification.ServiceAdapter) o).getAdaptee());
    else adaptee.setAssociated_to(null);
  }
  
  private EList<inria.fuchsia.gag.gagmt.process.Task> sub_task_;
  
  @Override
  public EList<inria.fuchsia.gag.gagmt.process.Task> getSub_task() {
    if (sub_task_ == null)
    	sub_task_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSub_task(), adaptersFactory, eResource);
    return sub_task_;
  }
  
  @Override
  public void applyRule(final Rule rule) {
    adaptee.applyRule(((inria.fuchsia.gag.gag.adapters.gagmt.specification.RuleAdapter) rule).getAdaptee()
    );
  }
  
  protected final static long ID_EDEFAULT = 0L;
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean IS_OPEN_EDEFAULT = false;
  
  protected final static String APPLIED_RULE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return inria.fuchsia.gag.gagmt.process.ProcessPackage.eINSTANCE.getTask();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__ID:
    		return new java.lang.Long(getId());
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__NAME:
    		return getName();
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__IS_OPEN:
    		return isIs_open() ? Boolean.TRUE : Boolean.FALSE;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__APPLIED_RULE:
    		return getAppliedRule();
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__ASSOCIATED_TO:
    		return getAssociated_to();
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__SUB_TASK:
    		return getSub_task();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__ID:
    		return getId() != ID_EDEFAULT;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__NAME:
    		return getName() != NAME_EDEFAULT;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__IS_OPEN:
    		return isIs_open() != IS_OPEN_EDEFAULT;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__APPLIED_RULE:
    		return getAppliedRule() != APPLIED_RULE_EDEFAULT;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__ASSOCIATED_TO:
    		return getAssociated_to() != null;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__SUB_TASK:
    		return getSub_task() != null && !getSub_task().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__ID:
    		setId(((java.lang.Long) newValue).longValue());
    		return;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__IS_OPEN:
    		setIs_open(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__APPLIED_RULE:
    		setAppliedRule(
    		(java.lang.String)
    		 newValue);
    		return;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__ASSOCIATED_TO:
    		setAssociated_to(
    		(inria.fuchsia.gag.gagmt.specification.Service)
    		 newValue);
    		return;
    	case inria.fuchsia.gag.gagmt.process.ProcessPackage.TASK__SUB_TASK:
    		getSub_task().clear();
    		getSub_task().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
