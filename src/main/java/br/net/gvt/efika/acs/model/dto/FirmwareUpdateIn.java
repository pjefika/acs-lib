/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.dto;

import br.net.gvt.efika.acs.model.log.AcaoAcsEnum;
import br.net.gvt.efika.acs.model.log.LogInAcs;

/**
 *
 * @author G0042204
 */
public class FirmwareUpdateIn extends LogInAcs {

    private Long guid;

    public FirmwareUpdateIn() {
    }

    public Long getGuid() {
        return guid;
    }

    public void setGuid(Long guid) {
        this.guid = guid;
    }

    @Override
    public String input() {
        return guid.toString();
    }

    @Override
    public AcaoAcsEnum acao() {
        return AcaoAcsEnum.FIRMWARE_UPDATE;
    }

}
