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
public class SetLanIPv6AutoIn extends GetDeviceDataIn {

    private int index;

    private LANIPv6Auto lanIPv6Auto;

    public SetLanIPv6AutoIn() {
        this.setAcao(AcaoAcsEnum.SET_LANIPv6AUTO);
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

    public LANIPv6Auto getLanIPv6Auto() {
        return lanIPv6Auto;
    }

    public void setLanIPv6Auto(LANIPv6Auto lanIPv6Auto) {
        this.lanIPv6Auto = lanIPv6Auto;
    }

}
