/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.entity;

import br.net.gvt.efika.mongo.model.entity.AbstractMongoEntity;
import java.util.Calendar;
import br.net.gvt.efika.acs.model.log.AcaoAcsEnum;
import java.util.List;

/**
 *
 * @author G0034481
 */
public class Lote extends AbstractMongoEntity {

    private List<String> entrada;

    private String executor;

    private List<AcaoAcsEnum> acoes;

    private Calendar dataInicio;

    private Calendar dataFim;

    public Lote() {
    }

    public List<String> getEntrada() {
        return entrada;
    }

    public void setEntrada(List<String> entrada) {
        this.entrada = entrada;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public List<AcaoAcsEnum> getAcoes() {
        return acoes;
    }

    public void setAcao(List<AcaoAcsEnum> acoes) {
        this.acoes = acoes;
    }

    public void setAcoes(List<AcaoAcsEnum> acoes) {
        this.acoes = acoes;
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
