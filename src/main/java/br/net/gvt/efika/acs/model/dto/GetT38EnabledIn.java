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
public class GetT38EnabledIn extends GetDeviceDataIn {

    private T38Enabled t38;

    public GetT38EnabledIn() {
        this.setAcao(AcaoAcsEnum.GET_T38ENABLED);
    }

    public T38Enabled getT38() {
        if (t38 == null) {
            t38 = new T38Enabled();
        }
        return t38;
    }

    public void setT38(T38Enabled t38) {
        this.t38 = t38;
    }

}
