/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.exception;

/**
 *
 * @author G0041775
 */
public class HdmException extends Exception {

    public HdmException() {
        super("Falha na comunicação com a plataforma Motive.");
    }

    public HdmException(String message) {
        super(message);
    }

}
