/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knexus.designpatterns;

import java.util.ArrayList;

/**
 *
 * @author vmhatre
 */
public abstract class SubjectBase {
    private ArrayList<ObserverBase> observers= new ArrayList() ;
    
    public void attach(ObserverBase observer){
    observers.add(observer);
    }
    public void detatch(ObserverBase observer){
        observers.remove(observer);
    }
    
    public void notifyObservers(){
        for( ObserverBase o: observers){
            o.updateObserver();
        }
    }
    
}
