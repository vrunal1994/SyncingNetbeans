/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knexus.stringreversal;

import java.util.LinkedList;
import java.util.ListIterator;
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
        String result = reversal(list);

    }
    
    static String reversal(LinkedList<String> list){
        String result= "";
        ListIterator itr = list.listIterator(list.size());
        while(itr.hasPrevious())
            result += itr.previous().toString();
        return result;
    }
    
}
