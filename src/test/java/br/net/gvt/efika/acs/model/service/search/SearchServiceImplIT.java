/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.service.search;

import br.net.gvt.efika.acs.model.search.SearchCriteria;
import br.net.gvt.efika.acs.model.search.SearchIn;
import br.net.gvt.efika.util.json.JacksonMapper;
import com.alcatel.hdm.service.nbi2.NbiDeviceData;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0041775
 */
public class SearchServiceImplIT {

    public SearchServiceImplIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of search method, of class SearchServiceImpl.
     */
    @Test
    public void testSearch() throws Exception {
        System.out.println("search");
        SearchIn in = new SearchIn(SearchCriteria.SERIAL, "190000016647927");
        SearchServiceImpl instance = new SearchServiceImpl();
//        List<NbiDeviceData> expResult = null;
        List<NbiDeviceData> result = instance.search(in);
        System.out.println(new JacksonMapper<>(new TypeReference<List<NbiDeviceData>>() {
        }).serialize(result));
    }

}
