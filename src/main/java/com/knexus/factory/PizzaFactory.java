/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knexus.factory;

/**
 *
 * @author vmhatre
 */
public class PizzaFactory {
    public static final int DEEPDISH =0;
    public static final int CHEESEBURST =1;
    public static final int THINCRUST=2;
    
    public static PizzaMain createPizzas( int type){
        switch(type){
            case DEEPDISH:{
                return new DeepDis();
            }
            case CHEESEBURST:{
                return new CheeseBurst();
            }
            case THINCRUST:{
                return new ThisCrust();
            }
        }
        return null;
    }
    
}
