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
public class PizzaMain implements Pizza_interface {

    @Override
    public void toppings() {
        System.out.println("Standard Toppings");
    }

    @Override
    public void sauces() {
        System.out.println("Standard Sauces");
    }

    @Override
    public void cost() {
        System.out.println("Regular Price");
    }
    
}
