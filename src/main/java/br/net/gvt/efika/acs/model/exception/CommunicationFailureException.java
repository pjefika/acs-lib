/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.exception;

/**
 *
 * @author G0042204
 */
public class CommunicationFailureException extends Exception {

    public CommunicationFailureException() {
        super("Falha na comunicação com a plataforma.");
    }

    public CommunicationFailureException(String message) {
        super(message);
    }

}
