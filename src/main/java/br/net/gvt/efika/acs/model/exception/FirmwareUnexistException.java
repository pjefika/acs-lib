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
public class FirmwareUnexistException extends Exception {

    public FirmwareUnexistException() {
        super("Firmware Inexistente.");
    }

    public FirmwareUnexistException(String message) {
        super(message);
    }

}
