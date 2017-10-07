/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thsisoftplus.string;

import com.thsisoftplus.entity.Alphabets17;
import com.thsisoftplus.entity.CwAlphabets;
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
    
    public static List<Alphabets17> alphabets17sContains(List<String> original, List<Alphabets17> compare){
        
        int compareIndex = 0;
        int originalIndex = 0;
        int critalFalseIndex = 0;
        int compareSize = compare.size();
        int originalSize = original.size();
        int totalSize = compareSize + originalSize;
        
        List<Alphabets17> matcher = new ArrayList<Alphabets17>();        
        
        while (compareIndex + originalIndex < totalSize && originalIndex < originalSize && compareIndex < compareSize) {
            
            Alphabets17 alphabets17 = compare.get(compareIndex);
            String match = alphabets17.getAlphabet().toString().toLowerCase();
            
            if(match.equals(original.get(originalIndex))){
                matcher.add(alphabets17);
                originalIndex++;
                compareIndex++;
                critalFalseIndex = compareIndex; // critalFalseIndex คือค่าที่ใช้เก็บตำแหน่งที่ match ไม่เจอ
            }else{
                compareIndex++;
            }
            
            if(compareIndex - critalFalseIndex > 3){
                matcher.clear();
                originalIndex = 0;
                critalFalseIndex = compareIndex;
            }
        }
        
        return matcher.size() == originalSize ? matcher : null;
    }
    
    public static List<CwAlphabets> cwAplhabetsContains(List<String> original, List<CwAlphabets> compare){
        
        int compareIndex = 0;
        int originalIndex = 0;
        int critalFalseIndex = 0;
        int compareSize = compare.size();
        int originalSize = original.size();
        int totalSize = compareSize + originalSize;
        
        List<CwAlphabets> matcher = new ArrayList<CwAlphabets>();        
        
        while (compareIndex + originalIndex < totalSize && originalIndex < originalSize && compareIndex < compareSize) {
            
            CwAlphabets cwAlphabets = compare.get(compareIndex);
            String match = cwAlphabets.getAlphabet().toString().toLowerCase();
            
            if(match.equals(original.get(originalIndex))){
                matcher.add(cwAlphabets);
                originalIndex++;
                compareIndex++;
                critalFalseIndex = compareIndex; // critalFalseIndex คือค่าที่ใช้เก็บตำแหน่งที่ match ไม่เจอ
            }else{
                compareIndex++;
            }
            
            if(compareIndex - critalFalseIndex > 3){
                matcher.clear();
                originalIndex = 0;
                critalFalseIndex = compareIndex;
            }
        }
        
        return matcher.size() == originalSize ? matcher : null;
    }
}
