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
public class App {
    public static void main(String[] args) {
        PizzaMain pizza = PizzaFactory.createPizzas(PizzaFactory.DEEPDISH);
        pizza.cost();
        pizza.sauces();
        pizza.toppings();
    }
    
}
