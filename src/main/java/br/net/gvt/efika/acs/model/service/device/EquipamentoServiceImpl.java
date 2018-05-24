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
import br.net.gvt.efika.acs.model.dto.ForceOnlineDeviceIn;
import br.net.gvt.efika.acs.model.dto.ForceOnlineDevicesIn;
import br.net.gvt.efika.acs.model.dto.GetDeviceDataIn;
import br.net.gvt.efika.acs.model.dto.GetDnsIn;
import br.net.gvt.efika.acs.model.dto.PPPoECredentialsIn;
import br.net.gvt.efika.acs.model.dto.PingDiagnosticIn;
import br.net.gvt.efika.acs.model.dto.ServiceClassIn;
import br.net.gvt.efika.acs.model.dto.SetDnsIn;
import br.net.gvt.efika.acs.model.dto.SetWifiIn;
import br.net.gvt.efika.acs.model.dto.SipActivationIn;
import br.net.gvt.efika.acs.model.dto.SipDiagnosticsIn;
import br.net.gvt.efika.util.dao.http.Urls;
import br.net.gvt.efika.util.dao.http.factory.FactoryHttpDAOAbstract;
import java.util.List;

public class EquipamentoServiceImpl implements EquipamentoService {

    @Override
    public DetailOut getDetail(DetailIn in) throws Exception {
        FactoryHttpDAOAbstract<DetailOut> fac = new FactoryHttpDAOAbstract<>(DetailOut.class);
        return (DetailOut) fac.createWithoutProxy().post(Urls.ACSAPI_GET_DETAIL.getUrl(), in);
    }

    @Override
    public WifiNets getWifiInfo(GetDeviceDataIn in) throws Exception {
        FactoryHttpDAOAbstract<WifiNets> fac = new FactoryHttpDAOAbstract<>(WifiNets.class);
        return (WifiNets) fac.createWithoutProxy().post(Urls.ACSAPI_GET_WIFI.getUrl(), in);
    }

    @Override
    public WifiNets setWifiInfo(SetWifiIn in) throws Exception {
        FactoryHttpDAOAbstract<WifiNets> fac = new FactoryHttpDAOAbstract<>(WifiNets.class);
        return (WifiNets) fac.createWithoutProxy().post(Urls.ACSAPI_SET_WIFI.getUrl(), in);
    }

    @Override
    public List<LanDevice> getLanHosts(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public WanInfo getWanInfo(GetDeviceDataIn in) throws Exception {
        FactoryHttpDAOAbstract<WanInfo> fac = new FactoryHttpDAOAbstract<>(WanInfo.class);
        return (WanInfo) fac.createWithoutProxy().post(Urls.ACSAPI_GET_WAN.getUrl(), in);
    }

    @Override
    public List<InterfaceStatistics> getInterfaceStatistics(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public XdslDiagnostics getXdslDiagnostic(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PPPoECredentialsInfo getPPPoECredentials(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean setPPPoECredentials(PPPoECredentialsIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PortMappingInfo> getPortMapping(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean reboot(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean factoryReset(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PingResponse pingDiagnostic(PingDiagnosticIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dhcp getDhcp(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dhcp setDhcp(DhcpIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DdnsInfo getDdns(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServiceClass getServiceClass(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean setServiceClass(ServiceClassIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SipDiagnostics getSipDiagnostics(SipDiagnosticsIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SipDiagnostics setSipActivation(SipActivationIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean forceOnline(ForceOnlineDeviceIn in) throws Exception {
        FactoryHttpDAOAbstract<Boolean> fac = new FactoryHttpDAOAbstract<>(Boolean.class);
        return fac.createWithoutProxy().post(Urls.ACSAPI_ONLINE.getUrl(), in);
    }

    @Override
    public Boolean forceAnyOnline(ForceOnlineDevicesIn in) throws Exception {
        FactoryHttpDAOAbstract<Boolean> fac = new FactoryHttpDAOAbstract<>(Boolean.class);
        return fac.createWithoutProxy().post(Urls.ACSAPI_ANY_ONLINE.getUrl(), in);
    }

    @Override
    public Dns getDns(GetDnsIn in) throws Exception {
        FactoryHttpDAOAbstract<Dns> fac = new FactoryHttpDAOAbstract<>(Dns.class);
        return (Dns) fac.createWithoutProxy().post(Urls.ACSAPI_GET_DNS.getUrl(), in);
    }

    @Override
    public Boolean setDns(SetDnsIn in) throws Exception {
        FactoryHttpDAOAbstract<Boolean> fac = new FactoryHttpDAOAbstract<>(Boolean.class);
        return fac.createWithoutProxy().post(Urls.ACSAPI_SET_DNS.getUrl(), in);
    }

}
