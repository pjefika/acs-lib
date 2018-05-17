/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.service.search;

import br.net.gvt.efika.acs.model.search.SearchIn;
import com.alcatel.hdm.service.nbi2.NbiDeviceData;
import java.util.List;

/**
 *
 * @author G0041775
 */
public interface SearchService {
    
    public List<NbiDeviceData> search(SearchIn in) throws Exception;
   
    
}
