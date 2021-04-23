/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urifia.gag;

import fr.inria.gag.guard.base.IGAGGuardOutput;
import java.util.Objects;

/**
 * Le type de retour de l'évaluation de notre garde personnalisée
 * @author Ndadji Maxime
 */
public class MyCustomGAGGuardOutput implements IGAGGuardOutput {
    private String firstOutput;
    private String secondOutput;

    public MyCustomGAGGuardOutput() {
    }

    public MyCustomGAGGuardOutput(String firstOutput, String secondOutput) {
        this.firstOutput = firstOutput;
        this.secondOutput = secondOutput;
    }

    public String getFirstOutput() {
        return firstOutput;
    }

    public void setFirstOutput(String firstOutput) {
        this.firstOutput = firstOutput;
    }

    public String getSecondOutput() {
        return secondOutput;
    }

    public void setSecondOutput(String secondOutput) {
        this.secondOutput = secondOutput;
    }

    @Override
    public String toString() {
        return "MyCustomGAGGuardOutput{" + "firstLazyOutput=" + firstOutput + ", secondLazyOutput=" + secondOutput + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.firstOutput);
        hash = 97 * hash + Objects.hashCode(this.secondOutput);
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
        final MyCustomGAGGuardOutput other = (MyCustomGAGGuardOutput) obj;
        if (!Objects.equals(this.firstOutput, other.firstOutput)) {
            return false;
        }
        return Objects.equals(this.secondOutput, other.secondOutput);
    }
}
