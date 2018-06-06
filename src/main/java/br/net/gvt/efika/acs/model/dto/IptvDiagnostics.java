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
public class IptvDiagnostics {

    private String ipVod, ipMulticast;

    public IptvDiagnostics() {
    }

    public String getIpVod() {
        return ipVod;
    }

    public void setIpVod(String ipVod) {
        this.ipVod = ipVod;
    }

    public String getIpMulticast() {
        return ipMulticast;
    }

    public void setIpMulticast(String ipMulticast) {
        this.ipMulticast = ipMulticast;
    }

}
