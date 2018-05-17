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
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class ForceOnlineDevicesIn extends LogInAcs {

    private List<NbiDeviceData> devices;

    private AcaoAcsEnum acao;

    @Override
    public String input() {
        try {
            return new JacksonMapper(new TypeReference<List<NbiDeviceData>>() {
            }).serialize(devices);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public AcaoAcsEnum acao() {
        return acao;
    }

    public List<NbiDeviceData> getDevices() {
        return devices;
    }

    public void setDevices(List<NbiDeviceData> devices) {
        this.devices = devices;
    }

    public void setAcao(AcaoAcsEnum acao) {
        this.acao = acao;
    }

}
