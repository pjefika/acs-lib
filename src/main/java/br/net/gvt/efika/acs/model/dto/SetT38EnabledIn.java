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

    private T38Enabled t38;

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

    public T38Enabled getT38() {
        return t38;
    }

    public void setT38(T38Enabled t38) {
        this.t38 = t38;
    }

}
