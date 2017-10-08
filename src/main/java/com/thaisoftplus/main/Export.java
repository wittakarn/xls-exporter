/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.main;

import com.thaisoftplus.business.WordCheckerBusiness;
import com.thaisoftplus.xls.exporter.XlsExport;
import com.thaisoftplus.domain.XlsRowWord;
import com.thaisoftplus.domain.XlsRowGoverment;
import com.thaisoftplus.domain.XlsRowItqxbmp;
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
//        crateMockData();
//        List<String> Matching = StringMatcher.getMatchString(original, compare);
        WordCheckerBusiness business = new WordCheckerBusiness();
        List<XlsRowGoverment> xlsRowGovermentAlphabets17 = business.listAllAlphabets17DataForGoverment();
        XlsExport.createGoverment("D:/temp/Export-Alphabets17GovermentItqxbmp.xlsx", "Elapsed time gover, ment and ipqxbmp", xlsRowGovermentAlphabets17);
        
        List<XlsRowGoverment> xlsRowGovermentCwAlphabets = business.listAllCwAlphabetsDataForGoverment();
        XlsExport.createGoverment("D:/temp/Export-CwAlphabetsGovermentItqxbmp.xlsx", "Elapsed time gover, ment and ipqxbmp", xlsRowGovermentCwAlphabets);
        
        List<XlsRowItqxbmp> xlsRowItqxbmpAlphabets17 = business.listAllAlphabets17DataForItqxbmp();
        XlsExport.createItqxbmp("D:/temp/Export-Alphabets17Itqxbmp.xlsx", "Interval time ipqxbmp", xlsRowItqxbmpAlphabets17);
        
        try{
            List<XlsRowWord> xlsRowAlphabets17 = business.listAllAlphabets17Word();
            XlsExport.createAlphabets17("D:/temp/Export-Alphabets17Word.xlsx", "Elapsed time of alphabets17", xlsRowAlphabets17);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        try{
            List<XlsRowWord> xlsRowFlAlphabets = business.listAllFlAlphabetsWord();
            XlsExport.createFlAlphabets("D:/temp/Export-FlAlphabetsWord.xlsx", "Elapsed time of fl_alphabets", xlsRowFlAlphabets);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
