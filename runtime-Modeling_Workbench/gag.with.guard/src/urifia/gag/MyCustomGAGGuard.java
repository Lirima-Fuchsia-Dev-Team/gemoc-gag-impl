/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urifia.gag;

import fr.inria.gag.guard.base.IGAGGuard;
import fr.inria.gag.guard.base.IGAGGuardInput;
import fr.inria.gag.guard.base.IGAGGuardOutput;
import javax.swing.JOptionPane;

/**
 *
 * @author Ndadji Maxime
 */
public class MyCustomGAGGuard implements IGAGGuard {

    @Override
    public boolean isRuleActivable() {
        JOptionPane.showMessageDialog(null, "External customized guard function called!", "Message", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }
    //to remove just for test
    public static boolean staticIsRuleActivable() {
        JOptionPane.showMessageDialog(null, "External customized guard function called!", "Message", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    @Override
    public IGAGGuardOutput isRuleActivable(IGAGGuardInput input) {
        if (input instanceof MyCustomGAGGuardInput) {
            MyCustomGAGGuardInput myInput = (MyCustomGAGGuardInput)input;
            if (myInput.getFirstLazyInput() != null && myInput.getSecondLazyInput() != null) {
                JOptionPane.showMessageDialog(null, "External customized guard function called! Rule activated!", "Message", JOptionPane.INFORMATION_MESSAGE);
                return new MyCustomGAGGuardOutput(myInput.getFirstLazyInput(), myInput.getSecondLazyInput());
            }
        }
        JOptionPane.showMessageDialog(null, "External customized guard function called! Rule activation failed!", "Message", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }
}
