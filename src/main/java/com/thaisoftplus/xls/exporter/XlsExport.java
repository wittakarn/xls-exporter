/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.xls.exporter;

import com.thaisoftplus.domain.XlsRowAlphabet17;
import com.thaisoftplus.domain.XlsRowWord;
import com.thaisoftplus.domain.XlsRowGoverment;
import com.thaisoftplus.domain.XlsRowItqxbmp;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author witta
 */
public class XlsExport {
    private static final String FILE_NAME = "D:/temp/MyFirstExcel.xlsx";
    
    public static void runTest(){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
        Object[][] datatypes = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"}
        };

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
    
    public static void createGoverment(String fileName, String sheetName, List<XlsRowGoverment> datas){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        
        int rowNum = 0;
        System.out.println("Creating excel");

        for (XlsRowGoverment data : datas) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            
            Cell cell = row.createCell(colNum++);
            cell.setCellValue(data.getEmail());
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getId());
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getRound());
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getGoverTime());
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getMentTime());
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getItqxbmpTime());
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
    
    public static void createItqxbmp(String fileName, String sheetName, List<XlsRowItqxbmp> datas){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        
        int rowNum = 0;
        System.out.println("Creating excel");

        for (XlsRowItqxbmp data : datas) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            
            Cell cell = row.createCell(colNum++);
            cell.setCellValue(data.getEmail());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getId());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getRound());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getiTime());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.gettTime());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getqTime());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getxTime());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getbTime());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getmTime());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getpTime());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getItTime());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getTqTime());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getQxTime());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getXbTime());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getBmTime());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getMpTime());
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
    
    public static void createAlphabets17(String fileName, String sheetName, List<XlsRowWord> datas){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        
        int rowNum = 0;
        System.out.println("Creating excel");

        for (XlsRowWord data : datas) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            
            Cell cell = row.createCell(colNum++);
            cell.setCellValue(data.getEmail());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getId());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getRound());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord1Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord2Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord3Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord4Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord5Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord6Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord7Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord8Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord9Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord10Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord11Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord12Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord13Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord14Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord15Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord16Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord17Time());
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
    
    public static void createFlAlphabets(String fileName, String sheetName, List<XlsRowWord> datas){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        
        int rowNum = 0;
        System.out.println("Creating excel");

        for (XlsRowWord data : datas) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            
            Cell cell = row.createCell(colNum++);
            cell.setCellValue(data.getEmail());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getId());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getRound());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord1Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord2Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord3Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord4Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord5Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord6Time());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord7Time());
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
    
    public static void createAlphabets17Detail(String fileName, String sheetName, List<XlsRowAlphabet17> datas){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        
        int rowNum = 0;
        System.out.println("Creating excel");

        for (XlsRowAlphabet17 data : datas) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            
            Cell cell = row.createCell(colNum++);
            cell.setCellValue(data.getRound());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getEmail());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getId());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getCharIndex());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getInputAlphabet());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getShowAlphabet());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getKeyCode());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getKeyPress());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getKeyDown());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getKeyUp());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getWord());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getCorrectWord());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getCorrectAlphabet());
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getOpacity() != null ? data.getOpacity().toString() : null);
            
            cell = row.createCell(colNum++);
            cell.setCellValue(data.getTimestamp().toString());
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}
