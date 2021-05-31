package fr.inria.gag.k3dsa.configuration.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.gag.configuration.model.configuration.Data;
import fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation;
import fr.inria.gag.k3dsa.EncapsulatedValue;
import fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectProperties;
import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = PendingLocalFunctionComputation.class)
@SuppressWarnings("all")
public class PendingLocalFunctionComputationAspect {
  public static boolean isExecutable(final PendingLocalFunctionComputation _self) {
    final fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectProperties _self_ = fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isExecutable()
    if (_self instanceof fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation){
    	result = fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspect._privk3_isExecutable(_self_, (fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation)_self);
    };
    return (boolean)result;
  }
  
  public static Object execute(final PendingLocalFunctionComputation _self) {
    final fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectProperties _self_ = fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object execute()
    if (_self instanceof fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation){
    	result = fr.inria.gag.k3dsa.configuration.aspects.PendingLocalFunctionComputationAspect._privk3_execute(_self_, (fr.inria.gag.configuration.model.configuration.PendingLocalFunctionComputation)_self);
    };
    return (java.lang.Object)result;
  }
  
  protected static boolean _privk3_isExecutable(final PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectProperties _self_, final PendingLocalFunctionComputation _self) {
    boolean isexc = true;
    int _size = _self.getActualParameters().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        Data data = _self.getActualParameters().get((i).intValue());
        Object _value = data.getValue();
        EncapsulatedValue ecData = ((EncapsulatedValue) _value);
        boolean _isNull = ecData.isNull();
        if (_isNull) {
          isexc = false;
        }
      }
    }
    return isexc;
  }
  
  protected static Object _privk3_execute(final PendingLocalFunctionComputationAspectPendingLocalFunctionComputationAspectProperties _self_, final PendingLocalFunctionComputation _self) {
    Binding binding = new Binding();
    binding.setVariable("id", "5");
    ClassLoader lastClassLoader = null;
    ClassLoader currentClassLoader = null;
    Object res = ((Object) null);
    try {
      InputOutput.<String>println("run code");
      final List<IJavaProject> javaProjects = new ArrayList<IJavaProject>();
      final IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
      for (final IProject project : projects) {
        {
          project.open(((IProgressMonitor) null));
          final IJavaProject javaProject = JavaCore.create(project);
          javaProjects.add(javaProject);
        }
      }
      final List<URL> urlList = new ArrayList<URL>();
      for (final IJavaProject project_1 : javaProjects) {
        {
          final String[] classPathEntries = JavaRuntime.computeDefaultRuntimeClassPath(project_1);
          for (int i = 0; (i < classPathEntries.length); i++) {
            {
              final String entry = classPathEntries[i];
              final IPath path = new Path(entry);
              final URL url = path.toFile().toURI().toURL();
              urlList.add(url);
            }
          }
          lastClassLoader = project_1.getClass().getClassLoader();
          URL[] urls = new URL[((Object[])Conversions.unwrapArray(urlList, Object.class)).length];
          for (int i = 0; (i < ((Object[])Conversions.unwrapArray(urlList, Object.class)).length); i++) {
            urls[i] = urlList.get(i);
          }
          URLClassLoader _uRLClassLoader = new URLClassLoader(urls, lastClassLoader);
          currentClassLoader = _uRLClassLoader;
          lastClassLoader = currentClassLoader;
        }
      }
      final GroovyShell shell = new GroovyShell(binding);
      GroovyClassLoader cl = shell.getClassLoader();
      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(urlList, Object.class)).length); i++) {
        cl.addURL(urlList.get(i));
      }
      String params = "(";
      int _size = _self.getActualParameters().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          Data d = _self.getActualParameters().get((i).intValue());
          Object _value = d.getValue();
          EncapsulatedValue ecD = ((EncapsulatedValue) _value);
          binding.setVariable(("data" + i), ecD.getValue());
          if (((i).intValue() != 0)) {
            String _params = params;
            params = (_params + ",");
          }
          String _params_1 = params;
          params = (_params_1 + ("data" + i));
        }
      }
      String _params = params;
      params = (_params + ")");
      String _location = _self.getFunctiondeclaration().getLocation();
      String _plus = (_location + ".");
      String _method = _self.getFunctiondeclaration().getMethod();
      String _plus_1 = (_plus + _method);
      String stringToExecute = (_plus_1 + params);
      res = shell.evaluate(stringToExecute);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception cnfe = (Exception)_t;
        String _message = cnfe.getMessage();
        String _plus_2 = ("Failed to call Groovy script " + _message);
        InputOutput.<String>println(_plus_2);
        cnfe.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return res;
  }
}
