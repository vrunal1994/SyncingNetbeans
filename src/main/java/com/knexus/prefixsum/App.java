/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knexus.prefixsum;

import java.util.Scanner;

/**
 *
 * @author vmhatre
 */
public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int [] num= new int[size];
        int i=0;
        while(size-- >0){
            num[i++]=sc.nextInt();
        }
        int[] prefix_arr= computePrefixSum(num);
        int range_l= sc.nextInt();
        int range_r= sc.nextInt();
        int result= sumRange(prefix_arr, range_l, range_r);
        System.out.println("Prefix sum for array is" + result);
    }
    public static int[] computePrefixSum(int[] arr){
        int[] prefix= new int[arr.length+2];
        prefix[0]= 0;
        for(int i=0;i<arr.length; i++){
            prefix[i+1] = prefix[i]+arr[i];
        }
        return prefix;
    }
    public static int sumRange(int [] prefix_arr, int range_l, int range_r){
        return prefix_arr[range_r]-prefix_arr[range_l];
    }
    
}
