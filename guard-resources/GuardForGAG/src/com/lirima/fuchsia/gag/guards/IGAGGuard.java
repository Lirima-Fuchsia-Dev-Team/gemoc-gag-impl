/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lirima.fuchsia.gag.guards;

/**
 *
 * @author Ndadji Maxime
 */
public interface IGAGGuard {
    public IGAGGuardOutput isRuleActivable(IGAGGuardInput input);
    public boolean isRuleActivable();
}
