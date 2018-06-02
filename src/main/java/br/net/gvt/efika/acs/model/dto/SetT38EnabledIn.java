/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.dto;

import br.net.gvt.efika.acs.model.log.AcaoAcsEnum;

/**
 *
 * @author G0042204
 */
public class SetT38EnabledIn extends GetDeviceDataIn {

    private int index;

    private Boolean enabled;

    public SetT38EnabledIn() {
        this.setAcao(AcaoAcsEnum.SET_T38ENABLED);
    }

    public int getIndex() {
        if (index == 0) {
            index = 1;
        }
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}
