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
public class ObserverConcrete extends ObserverBase{
    private SubjectConcrete subject;
    private String subectName;

    public ObserverConcrete(SubjectConcrete subject, String subectName) {
        this.subject = subject;
        this.subectName = subectName;
    }
    
    @Override
    public void updateObserver() {
    subectName =  subject.getState();
        System.out.println(subectName);
    }
    
    
}
