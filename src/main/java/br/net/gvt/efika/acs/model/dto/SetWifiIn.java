/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.dto;

import br.net.gvt.efika.acs.model.device.wifi.WifiNets;
import br.net.gvt.efika.acs.model.log.AcaoAcsEnum;
import br.net.gvt.efika.util.json.JacksonMapper;

/**
 *
 * @author G0042204
 */
public class SetWifiIn extends GetDeviceDataIn {

    private WifiNets wifi;

    public SetWifiIn() {
        this.setAcao(AcaoAcsEnum.SET_WIFI_INFO);
    }

    @Override
    public String input() {
        try {
            return "[" + super.input() + "," + new JacksonMapper(WifiNets.class).serialize(wifi) + "]"; //To change body of generated methods, choose Tools | Templates.    
        } catch (Exception e) {
            return null;
        }

    }

    public WifiNets getWifi() {
        return wifi;
    }

    public void setWifi(WifiNets wifi) {
        this.wifi = wifi;
    }

}
