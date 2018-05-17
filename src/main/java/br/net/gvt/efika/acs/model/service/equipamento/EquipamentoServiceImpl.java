/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.service.equipamento;

import br.net.gvt.efika.acs.model.device.ddns.DdnsInfo;
import br.net.gvt.efika.acs.model.device.dhcp.Dhcp;
import br.net.gvt.efika.acs.model.device.interfacestatistics.InterfaceStatistics;
import br.net.gvt.efika.acs.model.device.lanhost.LanDevice;
import br.net.gvt.efika.acs.model.device.pppoe.PPPoECredentialsInfo;
import br.net.gvt.efika.acs.model.device.sipdiagnostics.SipDiagnostics;
import br.net.gvt.efika.acs.model.device.xdsldiagnostics.XdslDiagnostics;
import br.net.gvt.efika.acs.model.dto.DetailIn;
import br.net.gvt.efika.acs.model.dto.DetailOut;
import br.net.gvt.efika.acs.model.dto.DhcpIn;
import br.net.gvt.efika.acs.model.dto.GetDeviceDataIn;
import br.net.gvt.efika.acs.model.dto.PPPoECredentialsIn;
import br.net.gvt.efika.acs.model.dto.PingDiagnosticIn;
import br.net.gvt.efika.acs.model.dto.ServiceClassIn;
import br.net.gvt.efika.acs.model.dto.SetWifiIn;
import br.net.gvt.efika.acs.model.dto.SipActivationIn;
import br.net.gvt.efika.acs.model.dto.SipDiagnosticsIn;
import br.net.gvt.efika.util.dao.http.Urls;
import br.net.gvt.efika.util.dao.http.factory.FactoryHttpDAOAbstract;
import java.util.List;
import model.device.ping.PingResponse;
import model.device.portmapping.PortMappingInfo;
import model.device.serviceclass.ServiceClass;
import model.device.wan.WanInfo;
import model.device.wifi.WifiNets;


public class EquipamentoServiceImpl implements EquipamentoService {

    @Override
    public DetailOut getDetail(DetailIn in) throws Exception {
         FactoryHttpDAOAbstract<DetailOut> fac = new FactoryHttpDAOAbstract<>(DetailOut.class);
        return (DetailOut) fac.createWithoutProxy().post(Urls.ACSAPI_GET_DETAIL.getUrl(), in);
    }

    @Override
    public WifiNets getWifiInfo(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public WifiNets setWifiInfo(SetWifiIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LanDevice> getLanHosts(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public WanInfo getWanInfo(GetDeviceDataIn in) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
