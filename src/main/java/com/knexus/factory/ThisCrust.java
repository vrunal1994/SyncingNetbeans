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
public class ThisCrust extends PizzaMain {

    @Override
    public void cost() {
        System.out.println("Standard + $1");
    }

    @Override
    public void sauces() {
        System.out.println("Tomato Garlic");
    }

    @Override
    public void toppings() {
        System.out.println("Chicken and ham");
    }
    
}
