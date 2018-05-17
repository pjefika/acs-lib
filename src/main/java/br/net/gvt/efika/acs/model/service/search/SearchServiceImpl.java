/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.service.search;

import br.net.gvt.efika.acs.model.search.SearchIn;
import br.net.gvt.efika.util.dao.http.Urls;
import br.net.gvt.efika.util.dao.http.factory.FactoryHttpDAOAbstract;
import com.alcatel.hdm.service.nbi2.NbiDeviceData;
import java.util.List;


public class SearchServiceImpl implements SearchService {

    @Override
    public List<NbiDeviceData> search(SearchIn in) throws Exception {
        FactoryHttpDAOAbstract<List> fac = new FactoryHttpDAOAbstract<>(List.class);
        return (List<NbiDeviceData>) fac.createWithoutProxy().post(Urls.ACSAPI_SEARCH.getUrl(), in);
    }
    
}
