/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.dto;

import model.device.wifi.WifiNets;
import br.net.gvt.efika.acs.model.log.AcaoAcsEnum;

/**
 *
 * @author G0042204
 */
public class SetWifiIn extends GetDeviceDataIn {

    private WifiNets wifi;

    public SetWifiIn() {
        this.setAcao(AcaoAcsEnum.SET_WIFI_INFO);
    }

    public WifiNets getWifi() {
        return wifi;
    }

    public void setWifi(WifiNets wifi) {
        this.wifi = wifi;
    }

}
