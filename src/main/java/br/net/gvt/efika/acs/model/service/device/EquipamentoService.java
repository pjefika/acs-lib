/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.service.device;

import br.net.gvt.efika.acs.model.device.ddns.DdnsInfo;
import br.net.gvt.efika.acs.model.device.dhcp.Dhcp;
import br.net.gvt.efika.acs.model.device.dns.Dns;
import br.net.gvt.efika.acs.model.device.interfacestatistics.InterfaceStatistics;
import br.net.gvt.efika.acs.model.device.lanhost.LanDevice;
import br.net.gvt.efika.acs.model.device.ping.PingResponse;
import br.net.gvt.efika.acs.model.device.portmapping.PortMappingInfo;
import br.net.gvt.efika.acs.model.device.pppoe.PPPoECredentialsInfo;
import br.net.gvt.efika.acs.model.device.serviceclass.ServiceClass;
import br.net.gvt.efika.acs.model.device.sipdiagnostics.SipDiagnostics;
import br.net.gvt.efika.acs.model.device.wan.WanInfo;
import br.net.gvt.efika.acs.model.device.wifi.WifiNets;
import br.net.gvt.efika.acs.model.device.xdsldiagnostics.XdslDiagnostics;
import br.net.gvt.efika.acs.model.dto.DetailIn;
import br.net.gvt.efika.acs.model.dto.DetailOut;
import br.net.gvt.efika.acs.model.dto.DhcpIn;
import br.net.gvt.efika.acs.model.dto.FirmwareUpdateIn;
import br.net.gvt.efika.acs.model.dto.ForceOnlineDeviceIn;
import br.net.gvt.efika.acs.model.dto.ForceOnlineDevicesIn;
import br.net.gvt.efika.acs.model.dto.GetDeviceDataIn;
import br.net.gvt.efika.acs.model.dto.PPPoECredentialsIn;
import br.net.gvt.efika.acs.model.dto.PingDiagnosticIn;
import br.net.gvt.efika.acs.model.dto.ServiceClassIn;
import br.net.gvt.efika.acs.model.dto.SetDnsIn;
import br.net.gvt.efika.acs.model.dto.SetWifiIn;
import br.net.gvt.efika.acs.model.dto.SipActivationIn;
import br.net.gvt.efika.acs.model.dto.SipDiagnosticsIn;
import java.util.List;

/**
 *
 * @author G0041775
 */
public interface EquipamentoService {

    public DetailOut getDetail(DetailIn in) throws Exception;

    public WifiNets getWifiInfo(GetDeviceDataIn in) throws Exception;

    public WifiNets setWifiInfo(SetWifiIn in) throws Exception;

    public List<LanDevice> getLanHosts(GetDeviceDataIn in) throws Exception;

    public WanInfo getWanInfo(GetDeviceDataIn in) throws Exception;

    public List<InterfaceStatistics> getInterfaceStatistics(GetDeviceDataIn in) throws Exception;

    public XdslDiagnostics getXdslDiagnostic(GetDeviceDataIn in) throws Exception;

    public PPPoECredentialsInfo getPPPoECredentials(GetDeviceDataIn in) throws Exception;

    public Boolean setPPPoECredentials(PPPoECredentialsIn in) throws Exception;

    public List<PortMappingInfo> getPortMapping(GetDeviceDataIn in) throws Exception;

    public Boolean reboot(GetDeviceDataIn in) throws Exception;

    public Boolean factoryReset(GetDeviceDataIn in) throws Exception;

    public PingResponse pingDiagnostic(PingDiagnosticIn in) throws Exception;

    public Dhcp getDhcp(GetDeviceDataIn in) throws Exception;

    public Dhcp setDhcp(DhcpIn in) throws Exception;

    public DdnsInfo getDdns(GetDeviceDataIn in) throws Exception;

    public ServiceClass getServiceClass(GetDeviceDataIn in) throws Exception;

    public Boolean setServiceClass(ServiceClassIn in) throws Exception;

    public SipDiagnostics getSipDiagnostics(SipDiagnosticsIn in) throws Exception;

    public SipDiagnostics setSipActivation(SipActivationIn in) throws Exception;

    public Boolean forceOnline(ForceOnlineDeviceIn in) throws Exception;

    public Boolean forceAnyOnline(ForceOnlineDevicesIn in) throws Exception;

    public Dns getDns(GetDeviceDataIn in) throws Exception;

    public Boolean setDns(SetDnsIn in) throws Exception;

    public WifiNets activateWifi(GetDeviceDataIn in) throws Exception;

    public Boolean firmwareUpdate(FirmwareUpdateIn in) throws Exception;

}
