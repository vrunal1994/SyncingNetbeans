/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knexus.designpatterns;

/**
 *
 * @author vmhatre
 */
public class SubjectConcrete extends SubjectBase{

    public String getState() {
        return state;
    }
    private String state;

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
