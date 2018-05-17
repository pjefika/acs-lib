/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.service.factory;

import br.net.gvt.efika.acs.model.service.device.EquipamentoService;
import br.net.gvt.efika.acs.model.service.device.EquipamentoServiceImpl;
import br.net.gvt.efika.acs.model.service.search.SearchService;
import br.net.gvt.efika.acs.model.service.search.SearchServiceImpl;

/**
 *
 * @author G0041775
 */
public class FactoryAcsService {

    public static EquipamentoService equipamentoService() {
        return new EquipamentoServiceImpl();
    }

    public static SearchService searchService() {
        return new SearchServiceImpl();
    }

}
