/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.model.dto;

/**
 *
 * @author G0041775
 */
public class DirectoryNumber {

    private String phoneNumber;

    private int index;

    public DirectoryNumber() {
    }

    public DirectoryNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIndex() {
        if (index == 0) {
            index = 1;
        }
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
