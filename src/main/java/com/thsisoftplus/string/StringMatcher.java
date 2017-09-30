/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thsisoftplus.string;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author witta
 */
public class StringMatcher {
    public static List<String> getMatchString(List<String> original, List<String> compare){
        
        // original = ["g","o","v","e","r","n","m","e","n","t"]
        // compare = ["a","g","o","v","e","r"," ","n","m"," ","a","n","t"]
        
        int compareIndex = 0;
        int originalIndex = 0;
        int critalFalseIndex = 0;
        int compareSize = compare.size();
        int originalSize = original.size();
        int totalSize = compareSize + originalSize;
        
        List<String> matcher = new ArrayList<String>();        
        
        while (compareIndex + originalIndex < totalSize) {
            
            String match = compare.get(compareIndex);
            
            if(match.equals(original.get(originalIndex))){
                matcher.add(match);
                originalIndex++;
                compareIndex++;
                critalFalseIndex = compareIndex; // critalFalseIndex คือค่าที่ใช้เก็บตำแหน่งที่ match ไม่เจอ
            }else{
                compareIndex++;
            }
            
            if(compareIndex >= compareSize){
                originalIndex++;
                compareIndex = critalFalseIndex;
            }
        }
        return matcher; // [g, o, v, e, r, n, m, n, t]
    }
}
