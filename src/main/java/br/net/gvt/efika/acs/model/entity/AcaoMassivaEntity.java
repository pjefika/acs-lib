/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.entity;

import br.net.gvt.efika.mongo.model.entity.AbstractMongoEntity;
import java.util.Calendar;
import br.net.gvt.efika.acs.model.log.AcaoAcsEnum;
import com.alcatel.hdm.service.nbi2.NbiDeviceData;

/**
 *
 * @author G0034481
 */
public class AcaoMassivaEntity extends AbstractMongoEntity {

    private String lote, parametro;

    private NbiDeviceData equipamento;

    private Boolean resultado;

    private AcaoAcsEnum acao;

    private Calendar dataInicio;

    private Calendar dataFim;

    public AcaoMassivaEntity() {
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public NbiDeviceData getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(NbiDeviceData equipamento) {
        this.equipamento = equipamento;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    public AcaoAcsEnum getAcao() {
        return acao;
    }

    public void setAcao(AcaoAcsEnum acao) {
        this.acao = acao;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

}
