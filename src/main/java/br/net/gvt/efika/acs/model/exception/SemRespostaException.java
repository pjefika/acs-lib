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
public class SemRespostaException extends Exception {

    public SemRespostaException() {
        super("Não houve resposta ao comando.");
    }

    public SemRespostaException(String message) {
        super(message);
    }

}