/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.service.factory;

import br.net.gvt.efika.acs.model.service.equipamento.EquipamentoService;
import br.net.gvt.efika.acs.model.service.equipamento.EquipamentoServiceImpl;

/**
 *
 * @author G0041775
 */
public class FactoryAcsService {

    public static EquipamentoService equipamentoService() {
        return new EquipamentoServiceImpl();
    }

}
