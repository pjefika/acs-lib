/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.exception;

import com.alcatel.hdm.service.nbi2.NBIException_Exception;

/**
 *
 * @author G0041775
 */
public class TratativaExcessao {

    public static Exception treatException(Exception e) throws Exception {
        if (e instanceof HdmException
                || e instanceof JsonUtilException
                || e instanceof SearchCriteriaException
                || e instanceof SearchNotFound
                || e instanceof UnsupportedException
                || e instanceof WifiInativoException) {
            throw e;
        }
        if (e instanceof NBIException_Exception) {
            throw new SearchNotFound();
        }
        if (e instanceof NBIException_Exception) {
            throw new SearchNotFound();
        }
        e.printStackTrace();
        throw new CommunicationFailureException();
    }
}
