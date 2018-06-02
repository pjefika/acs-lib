/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.dto;

/**
 *
 * @author G0041775
 */
public class GetT38EnabledOut {

    private Boolean enabled;

    public GetT38EnabledOut() {
    }

    public GetT38EnabledOut(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}
