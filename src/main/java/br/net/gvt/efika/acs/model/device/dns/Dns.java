/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.device.dns;

/**
 *
 * @author G0041775
 */
public class Dns {

    private String DnsServers;

    public Dns() {
    }

    public Dns(String DnsServers) {
        this.DnsServers = DnsServers;
    }

    public String getDnsServers() {
        return DnsServers;
    }

    public void setDnsServers(String DnsServers) {
        this.DnsServers = DnsServers;
    }

}
