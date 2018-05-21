/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.service.device;

import br.net.gvt.efika.acs.model.device.ddns.DdnsInfo;
import br.net.gvt.efika.acs.model.device.dhcp.Dhcp;
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
import br.net.gvt.efika.acs.model.dto.PPPoECredentialsIn;
import br.net.gvt.efika.acs.model.dto.PingDiagnosticIn;
import br.net.gvt.efika.acs.model.dto.ServiceClassIn;
import br.net.gvt.efika.acs.model.dto.SetWifiIn;
import br.net.gvt.efika.acs.model.dto.SipActivationIn;
import br.net.gvt.efika.acs.model.dto.SipDiagnosticsIn;
import br.net.gvt.efika.util.json.JacksonMapper;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0041775
 */
public class EquipamentoServiceImplIT {

    public EquipamentoServiceImplIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDetail method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testGetDetail() throws Exception {
        System.out.println("getDetail");
        DetailIn detailIn = new DetailIn();
        detailIn.setExecutor("efikaServiceAPI");
        detailIn.setGuid(21736421l);
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
      
        DetailOut result = instance.getDetail(detailIn);
        System.out.println(new JacksonMapper<>(DetailOut.class).serialize(result));
    }

    /**
     * Test of getWifiInfo method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testGetWifiInfo() throws Exception {
        System.out.println("getWifiInfo");
        GetDeviceDataIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        WifiNets expResult = null;
        WifiNets result = instance.getWifiInfo(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWifiInfo method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testSetWifiInfo() throws Exception {
        System.out.println("setWifiInfo");
        SetWifiIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        WifiNets expResult = null;
        WifiNets result = instance.setWifiInfo(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLanHosts method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testGetLanHosts() throws Exception {
        System.out.println("getLanHosts");
        GetDeviceDataIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        List<LanDevice> expResult = null;
        List<LanDevice> result = instance.getLanHosts(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWanInfo method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testGetWanInfo() throws Exception {
        System.out.println("getWanInfo");
        GetDeviceDataIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        WanInfo expResult = null;
        WanInfo result = instance.getWanInfo(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterfaceStatistics method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testGetInterfaceStatistics() throws Exception {
        System.out.println("getInterfaceStatistics");
        GetDeviceDataIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        List<InterfaceStatistics> expResult = null;
        List<InterfaceStatistics> result = instance.getInterfaceStatistics(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getXdslDiagnostic method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testGetXdslDiagnostic() throws Exception {
        System.out.println("getXdslDiagnostic");
        GetDeviceDataIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        XdslDiagnostics expResult = null;
        XdslDiagnostics result = instance.getXdslDiagnostic(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPPPoECredentials method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testGetPPPoECredentials() throws Exception {
        System.out.println("getPPPoECredentials");
        GetDeviceDataIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        PPPoECredentialsInfo expResult = null;
        PPPoECredentialsInfo result = instance.getPPPoECredentials(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPPPoECredentials method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testSetPPPoECredentials() throws Exception {
        System.out.println("setPPPoECredentials");
        PPPoECredentialsIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        Boolean expResult = null;
        Boolean result = instance.setPPPoECredentials(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPortMapping method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testGetPortMapping() throws Exception {
        System.out.println("getPortMapping");
        GetDeviceDataIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        List<PortMappingInfo> expResult = null;
        List<PortMappingInfo> result = instance.getPortMapping(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reboot method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testReboot() throws Exception {
        System.out.println("reboot");
        GetDeviceDataIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        Boolean expResult = null;
        Boolean result = instance.reboot(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of factoryReset method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testFactoryReset() throws Exception {
        System.out.println("factoryReset");
        GetDeviceDataIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        Boolean expResult = null;
        Boolean result = instance.factoryReset(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pingDiagnostic method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testPingDiagnostic() throws Exception {
        System.out.println("pingDiagnostic");
        PingDiagnosticIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        PingResponse expResult = null;
        PingResponse result = instance.pingDiagnostic(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDhcp method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testGetDhcp() throws Exception {
        System.out.println("getDhcp");
        GetDeviceDataIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        Dhcp expResult = null;
        Dhcp result = instance.getDhcp(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDhcp method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testSetDhcp() throws Exception {
        System.out.println("setDhcp");
        DhcpIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        Dhcp expResult = null;
        Dhcp result = instance.setDhcp(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDdns method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testGetDdns() throws Exception {
        System.out.println("getDdns");
        GetDeviceDataIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        DdnsInfo expResult = null;
        DdnsInfo result = instance.getDdns(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServiceClass method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testGetServiceClass() throws Exception {
        System.out.println("getServiceClass");
        GetDeviceDataIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        ServiceClass expResult = null;
        ServiceClass result = instance.getServiceClass(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServiceClass method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testSetServiceClass() throws Exception {
        System.out.println("setServiceClass");
        ServiceClassIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        Boolean expResult = null;
        Boolean result = instance.setServiceClass(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSipDiagnostics method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testGetSipDiagnostics() throws Exception {
        System.out.println("getSipDiagnostics");
        SipDiagnosticsIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        SipDiagnostics expResult = null;
        SipDiagnostics result = instance.getSipDiagnostics(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSipActivation method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testSetSipActivation() throws Exception {
        System.out.println("setSipActivation");
        SipActivationIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        SipDiagnostics expResult = null;
        SipDiagnostics result = instance.setSipActivation(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of forceOnline method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testForceOnline() throws Exception {
        System.out.println("forceOnline");
        ForceOnlineDeviceIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        Boolean expResult = null;
        Boolean result = instance.forceOnline(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of forceAnyOnline method, of class EquipamentoServiceImpl.
     */
    @Test
    public void testForceAnyOnline() throws Exception {
        System.out.println("forceAnyOnline");
        ForceOnlineDevicesIn in = null;
        EquipamentoServiceImpl instance = new EquipamentoServiceImpl();
        Boolean expResult = null;
        Boolean result = instance.forceAnyOnline(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
