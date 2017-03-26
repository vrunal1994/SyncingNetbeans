/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knexus.stringreversal;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author vmhatre
 */
public class StringReversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        list.add(sc.next());
        list.add(sc.next());
        list.add(sc.next());
        list.add(sc.next());
        
        System.out.println(list.toString());

    }
    
}
