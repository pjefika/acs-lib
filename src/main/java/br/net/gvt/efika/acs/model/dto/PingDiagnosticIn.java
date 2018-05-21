/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.dto;

import br.net.gvt.efika.acs.model.device.ping.PingRequest;
import br.net.gvt.efika.acs.model.log.AcaoAcsEnum;

/**
 *
 * @author G0042204
 */
public class PingDiagnosticIn extends GetDeviceDataIn {

    private PingRequest request;

    public PingDiagnosticIn() {
        this.setAcao(AcaoAcsEnum.PING_DIAGNOSTIC);
    }

    public PingRequest getRequest() {
        return request;
    }

    public void setRequest(PingRequest request) {
        this.request = request;
    }

}
