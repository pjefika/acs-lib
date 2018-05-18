/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.device.gatewayparameters;

import br.net.gvt.efika.acs.parser.device.GatewayParametersDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 *
 * @author G0041775
 */
@JsonDeserialize(using = GatewayParametersDeserializer.class)
public class GatewayParameters {

    private String UpTime, ExternalIPAddress, DHCPMinAddress, DHCPMaxAddress, DHCPLeaseTime, DHCPRelay, DHCPServerEnable, DomainName,
            DNSServers, NTPServer1, NTPServer2, LocalTimeZoneName, NTPStatus, UpnPStatus;

    public GatewayParameters() {
    }

    public String getUpTime() {
        return UpTime;
    }

    public void setUpTime(String UpTime) {
        this.UpTime = UpTime;
    }

    public String getExternalIPAddress() {
        return ExternalIPAddress;
    }

    public void setExternalIPAddress(String ExternalIPAddress) {
        this.ExternalIPAddress = ExternalIPAddress;
    }

    public String getDHCPMinAddress() {
        return DHCPMinAddress;
    }

    public void setDHCPMinAddress(String DHCPMinAddress) {
        this.DHCPMinAddress = DHCPMinAddress;
    }

    public String getDHCPMaxAddress() {
        return DHCPMaxAddress;
    }

    public void setDHCPMaxAddress(String DHCPMaxAddress) {
        this.DHCPMaxAddress = DHCPMaxAddress;
    }

    public String getDHCPLeaseTime() {
        return DHCPLeaseTime;
    }

    public void setDHCPLeaseTime(String DHCPLeaseTime) {
        this.DHCPLeaseTime = DHCPLeaseTime;
    }

    public String getDHCPRelay() {
        return DHCPRelay;
    }

    public void setDHCPRelay(String DHCPRelay) {
        this.DHCPRelay = DHCPRelay;
    }

    public String getDHCPServerEnable() {
        return DHCPServerEnable;
    }

    public void setDHCPServerEnable(String DHCPServerEnable) {
        this.DHCPServerEnable = DHCPServerEnable;
    }

    public String getDomainName() {
        return DomainName;
    }

    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    public String getDNSServers() {
        return DNSServers;
    }

    public void setDNSServers(String DNSServers) {
        this.DNSServers = DNSServers;
    }

    public String getNTPServer1() {
        return NTPServer1;
    }

    public void setNTPServer1(String NTPServer1) {
        this.NTPServer1 = NTPServer1;
    }

    public String getNTPServer2() {
        return NTPServer2;
    }

    public void setNTPServer2(String NTPServer2) {
        this.NTPServer2 = NTPServer2;
    }

    public String getLocalTimeZoneName() {
        return LocalTimeZoneName;
    }

    public void setLocalTimeZoneName(String LocalTimeZoneName) {
        this.LocalTimeZoneName = LocalTimeZoneName;
    }

    public String getNTPStatus() {
        return NTPStatus;
    }

    public void setNTPStatus(String NTPStatus) {
        this.NTPStatus = NTPStatus;
    }

    public String getUpnPStatus() {
        return UpnPStatus;
    }

    public void setUpnPStatus(String UpnPStatus) {
        this.UpnPStatus = UpnPStatus;
    }

}
