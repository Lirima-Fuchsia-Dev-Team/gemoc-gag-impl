/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urifia.gag;

import fr.inria.gag.guard.base.IGAGGuardInput;
import java.util.Objects;

/**
 *
 * @author Ndadji Maxime
 */
public class MyCustomGAGGuardInput implements IGAGGuardInput {
    private String firstLazyInput;
    private String secondLazyInput;

    public MyCustomGAGGuardInput() {
    }

    public MyCustomGAGGuardInput(String firstLazyInput, String secondLazyInput) {
        this.firstLazyInput = firstLazyInput;
        this.secondLazyInput = secondLazyInput;
    }

    public String getFirstLazyInput() {
        return firstLazyInput;
    }

    public void setFirstLazyInput(String firstLazyInput) {
        this.firstLazyInput = firstLazyInput;
    }

    public String getSecondLazyInput() {
        return secondLazyInput;
    }

    public void setSecondLazyInput(String secondLazyInput) {
        this.secondLazyInput = secondLazyInput;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.firstLazyInput);
        hash = 59 * hash + Objects.hashCode(this.secondLazyInput);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyCustomGAGGuardInput other = (MyCustomGAGGuardInput) obj;
        if (!Objects.equals(this.firstLazyInput, other.firstLazyInput)) {
            return false;
        }
        return Objects.equals(this.secondLazyInput, other.secondLazyInput);
    }
}
