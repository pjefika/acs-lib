/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.device.dhcp;

/**
 *
 * @author G0041775
 */
public class DhcpSet {

    private Boolean dhcpServerEnable;
    private String startAddress, endAddress;

    public DhcpSet(Dhcp d) {
        this.dhcpServerEnable = d.getDHCPServerEnable();
        this.startAddress = d.getMinAddress();
        this.endAddress = d.getMaxAddress();
    }

    public Boolean getDhcpServerEnable() {
        return dhcpServerEnable;
    }

    public void setDhcpServerEnable(Boolean dhcpServerEnable) {
        this.dhcpServerEnable = dhcpServerEnable;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

}
