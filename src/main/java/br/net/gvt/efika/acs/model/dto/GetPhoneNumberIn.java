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
public class GetPhoneNumberIn extends GetDeviceDataIn {

    private int index;

    public GetPhoneNumberIn() {
        this.setAcao(AcaoAcsEnum.GET_PHONE_NUMBER);
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

}
