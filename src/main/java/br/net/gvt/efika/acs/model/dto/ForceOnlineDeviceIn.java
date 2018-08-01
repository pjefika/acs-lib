/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.dto;

import br.net.gvt.efika.util.json.JacksonMapper;
import com.alcatel.hdm.service.nbi2.NbiDeviceData;
import br.net.gvt.efika.acs.model.log.AcaoAcsEnum;
import br.net.gvt.efika.acs.model.log.LogInAcs;

/**
 *
 * @author G0042204
 */
public class ForceOnlineDeviceIn extends LogInAcs {

    private NbiDeviceData device;

    private Long guid;

    private AcaoAcsEnum acao;

    @Override
    public String input() {
        try {
            return new JacksonMapper(NbiDeviceData.class).serialize(device);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public AcaoAcsEnum acao() {
        return acao;
    }

    public NbiDeviceData getDevice() {
        return device;
    }

    public void setDevice(NbiDeviceData device) {
        this.device = device;
    }

    public void setAcao(AcaoAcsEnum acao) {
        this.acao = acao;
    }

    public Long getGuid() {
        return guid;
    }

    public void setGuid(Long guid) {
        this.guid = guid;
    }

}
