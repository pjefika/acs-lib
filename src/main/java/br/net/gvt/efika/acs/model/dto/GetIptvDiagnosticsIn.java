/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.dto;

import br.net.gvt.efika.acs.model.log.AcaoAcsEnum;

/**
 *
 * @author G0042204
 */
public class GetIptvDiagnosticsIn extends GetDeviceDataIn {

    private IptvDiagnostics iptvDiagnostics;

    public GetIptvDiagnosticsIn() {
        this.setAcao(AcaoAcsEnum.GET_IPTV_DIAGNOSTICS);
    }

    public IptvDiagnostics getIptvDiagnostics() {
        if (iptvDiagnostics == null) {
            iptvDiagnostics = new IptvDiagnostics();
        }
        return iptvDiagnostics;
    }

    public void setIptvDiagnostics(IptvDiagnostics iptvDiagnostics) {
        this.iptvDiagnostics = iptvDiagnostics;
    }

}
