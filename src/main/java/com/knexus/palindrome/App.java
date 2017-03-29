/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knexus.palindrome;

import java.util.Scanner;

/**
 *
 * @author vmhatre
 */
public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.next();
        System.out.println(isPalindrome(input));
        
    }
    
    public static boolean isPalindrome(String input){
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        if(input.compareTo(sb.reverse().toString())==0){
        return true;    
        }
        else 
            return false;
        
    }
    
}
