/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.device;

/**
 *
 * @author G0042204
 */
public class DmzInfo {

    private Boolean Enable;

    private String IPAddress;

    public DmzInfo() {
    }

    public DmzInfo(Boolean Enable, String IPAddress) {
        this.Enable = Enable;
        this.IPAddress = IPAddress;
    }

    public Boolean getEnable() {
        return Enable;
    }

    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public void setEnable(String Enable) {
        this.Enable = Enable.equalsIgnoreCase("1");
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

}
