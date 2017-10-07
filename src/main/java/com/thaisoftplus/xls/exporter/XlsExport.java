/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.xls.exporter;

import com.thsisoftplus.domain.XlsRowGoverment;
import com.thsisoftplus.domain.XlsRowItqxbmp;
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
}
