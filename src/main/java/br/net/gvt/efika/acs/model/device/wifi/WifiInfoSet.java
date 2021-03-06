/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.device.wifi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 * @author G0042204
 */
@JsonInclude(Include.NON_NULL)
public class WifiInfoSet {

    private String ssid,
            index,
            //            frequency,
            //            authentication,
            //            autochannel,
            encryptation,
            standard,
            //            beaconType,
            password,
            channel;
    private Boolean radioOperStatus, operStatus, broadcastEnable, autochannel;

    public WifiInfoSet() {
    }

    public WifiInfoSet(WifiInfoFull getInfo) {
//       this.authentication = getInfo.getAuthMode();
//        this.broadcastEnable = getInfo.getBcEnabled();
        this.channel = getInfo.getChannel() == null || getInfo.getChannel().isEmpty() ? null : getInfo.getChannel();
//        this.encryptation = getInfo.getEncType();
//        this.radioOperStatus = true;
        this.operStatus = getInfo.getOperStatus()==null ? true : getInfo.getOperStatus().equalsIgnoreCase("Up");
        this.ssid = getInfo.getSsid();
        this.index = getInfo.getIndex().length() > 2 ? getInfo.getIndex().substring(0,  getInfo.getIndex().length()-2) : getInfo.getIndex();

        this.password = getInfo.getKey().isEmpty() || getInfo.getKey().length() < 8 ? null : getInfo.getKey();

        this.autochannel = getInfo.getAutoChannel() == null || getInfo.getAutoChannel().isEmpty() ? null : getInfo.getAutoChannel().equalsIgnoreCase("1");
        this.standard = getInfo.getStandard();
    }

//    public WifiInfoSet(WifiInfoFull getInfo) {
////       this.authentication = getInfo.getAuthMode();
//        this.broadcastEnable = getInfo.getBcEnabled();
//        this.channel = getInfo.getChannel();
//        this.encryptation = getInfo.getEncType();
//        this.radioOperStatus = true;
//        this.operStatus = true;
//        this.ssid = getInfo.getSsid();
//        this.index = index;
//
//        this.password = getInfo.getKey() != null && getInfo.getKey().isEmpty() ? null : getInfo.getKey();
//
//        this.autochannel = getInfo.getAutoChannel() == null || getInfo.getAutoChannel().isEmpty() ? null : getInfo.getAutoChannel().equalsIgnoreCase("1");
//        this.standard = getInfo.getStandard();
//    }
    public Boolean getRadioOperStatus() {
        return radioOperStatus;
    }

    public void setRadioOperStatus(Boolean radioOperStatus) {
        this.radioOperStatus = radioOperStatus;
    }

    public Boolean getAutochannel() {
        return autochannel;
    }

    public void setAutochannel(Boolean autochannel) {
        this.autochannel = autochannel;
    }

    public String getPassword() {
        password = password == null ? "" : password;
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Boolean getOperStatus() {
        return operStatus;
    }

    public void setOperStatus(Boolean operStatus) {
        this.operStatus = operStatus;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Boolean getBroadcastEnable() {
        return broadcastEnable;
    }

    public void setBroadcastEnable(Boolean broadcastEnable) {
        this.broadcastEnable = broadcastEnable;
    }

    public String getEncryptation() {
        return encryptation;
    }

    public void setEncryptation(String encryptation) {
        this.encryptation = encryptation;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

}
