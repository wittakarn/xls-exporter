/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.main;

import com.thaisoftplus.business.WordCheckerBusiness;
import com.thaisoftplus.domain.XlsRowAlphabet17;
import com.thaisoftplus.xls.exporter.XlsExport;
import java.util.List;

/**
 *
 * @author witta
 */
public class ExportWord17InDetail {
    public static void main(String[] args) {
        WordCheckerBusiness business = new WordCheckerBusiness();

        try {
            List<XlsRowAlphabet17> xlsRowAlphabet17 = business.checkAllAlphabets17Word();
            XlsExport.createAlphabets17Detail("D:/temp/Export-Alphabets17InDetail.xlsx", "Alphabets17 in detail", xlsRowAlphabet17);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
