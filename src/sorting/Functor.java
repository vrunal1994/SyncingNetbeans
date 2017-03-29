/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import java.util.*;

/**
 *
 * @author vmhatre
 */
public class Functor {
    public static void main(String[] args) {
        String []  words = {"Fred" , "Vrunal","Mhatre", "Farhan"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        
        String []  words2 = {"Fred" , "Vrunal","Mhatre", "Farhan"};
        Arrays.sort(words2, new Comp1());
        System.out.println(Arrays.toString(words2));
        String [] words3 = {"fred@clemson.edu", "vmhatre@clemson.edu", "hsdesai@clemson.edu"};
        Arrays.sort(words3, new Comp2());
        System.out.println(Arrays.toString(words3));
    }
}

class Comp1 implements Comparator<String>{
    public int compare(String string1, String string2) {
       return string1.compareToIgnoreCase(string2);
    }
}

class Comp2 implements Comparator<String>{
    public int compare(String string1, String string2){
        String sub1 = string1.substring(string1.indexOf("@"));
        String sub2 = string2.substring(string2.indexOf("@"));
        return sub1.compareToIgnoreCase(sub2);
    }
}
