/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.main;

import com.thsisoftplus.string.StringMatcher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author witta
 */
public class Export {
    
    private static List<String> original;
    private static List<String> compare;
    
    public static void crateMockData(){
        original = new ArrayList<String>();
        compare = new ArrayList<String>();
        
        original.add("g");
        original.add("o");
        original.add("v");
        original.add("e");
        original.add("r");
        original.add("n");
        original.add("m");
        original.add("e");
        original.add("n");
        original.add("t");
        
        compare.add("a");
        compare.add("g");
        compare.add("o");
        compare.add("v");
        compare.add("e");
        compare.add("r");
        compare.add(" ");
        compare.add("n");
        compare.add("m");
        compare.add(" ");
        compare.add("a");
        compare.add("n");
        compare.add("t");
    }
    
    public static void main(String[] args){
        crateMockData();
        List<String> Matching = StringMatcher.getMatchString(original, compare);
        
        System.out.println(Matching.toString());
    }
}
