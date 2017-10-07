/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.business;

import com.thaisoftplus.query.Alphabets17Query;
import com.thaisoftplus.query.CwAlphabetsQuery;
import com.thaisoftplus.query.UserKkeyQuery;
import com.thaisoftplus.query.UserQuery;
import com.thaisoftplus.query.Words17Query;
import com.thaisoftplus.word.OriginalWord;
import com.thsisoftplus.domain.XlsRow;
import com.thsisoftplus.domain.XlsRowGoverment;
import com.thsisoftplus.domain.XlsRowItqxbmp;
import com.thsisoftplus.entity.Alphabets17;
import com.thsisoftplus.entity.CwAlphabets;
import com.thsisoftplus.entity.User;
import com.thsisoftplus.entity.UserKey;
import com.thsisoftplus.entity.Words17;
import com.thsisoftplus.string.StringMatcher;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author witta
 */
public class WordCheckerBusiness {
    
    private final String PERSISTENCE_UNIT_NAME = "CAPTCHA_THESIS_PU";
    private EntityManagerFactory factory;
    private EntityManager em;
    
    public WordCheckerBusiness(){
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();
    }
    
    public List<XlsRowGoverment> listAllAlphabets17DataForGoverment(){
        int round;
        
        List<String> goverList = new ArrayList<String>();
        goverList.add("g");
        goverList.add("o");
        goverList.add("v");
        goverList.add("e");
        goverList.add("r");
        
        List<String> mentList = new ArrayList<String>();
        mentList.add("m");
        mentList.add("e");
        mentList.add("n");
        mentList.add("t");
        
        List<String> itqxbmpList = new ArrayList<String>();
        itqxbmpList.add("i");
        itqxbmpList.add("t");
        itqxbmpList.add("q");
        itqxbmpList.add("x");
        itqxbmpList.add("b");
        itqxbmpList.add("m");
        itqxbmpList.add("p");
        
        
        List<XlsRowGoverment> xlsRowGoverment = new ArrayList<XlsRowGoverment>();

        // get all user
        List<User> users = UserQuery.getAll(em);
        
        for (User user : users) {
            round = 1;
            // keys of each user
            List<UserKey> userKeys = UserKkeyQuery.getKeyByEmail(em, user.getEmail());
            
            for (UserKey userKey : userKeys) {
                List<Alphabets17> alphabets17s = Alphabets17Query.getByKey(em, userKey.getId());
                
                List<Alphabets17> govers = StringMatcher.alphabets17sContains(goverList, alphabets17s);
                XlsRowGoverment row = new XlsRowGoverment();
                row.setEmail(userKey.getEmail());
                row.setId(userKey.getId());
                row.setRound(round++);
                if(govers != null && govers.size() > 0)
                row.setGoverTime(getElapsedTime(govers.get(0).getKeyPress(), 
                        govers.get(govers.size() - 1).getKeyPress()));
                
                List<Alphabets17> ments = StringMatcher.alphabets17sContains(mentList, alphabets17s);
                if(ments != null && ments.size() > 0)
                row.setMentTime(getElapsedTime(ments.get(0).getKeyPress(), 
                        ments.get(ments.size() - 1).getKeyPress()));
                
                List<Alphabets17> itqxbmps = StringMatcher.alphabets17sContains(itqxbmpList, alphabets17s);
                if(itqxbmps != null && itqxbmps.size() > 0)
                row.setItqxbmpTime(getElapsedTime(itqxbmps.get(0).getKeyPress(), 
                        itqxbmps.get(itqxbmps.size() - 1).getKeyPress()));
                
                xlsRowGoverment.add(row);
            }
        }
        
        return xlsRowGoverment;
    }
    
    public List<XlsRowItqxbmp> listAllAlphabets17DataForItqxbmp(){
        int round;
        
        List<String> itqxbmpList = new ArrayList<String>();
        itqxbmpList.add("i");
        itqxbmpList.add("t");
        itqxbmpList.add("q");
        itqxbmpList.add("x");
        itqxbmpList.add("b");
        itqxbmpList.add("m");
        itqxbmpList.add("p");
        
        List<XlsRowItqxbmp> xlsRowItqxbmp = new ArrayList<XlsRowItqxbmp>();

        // get all user
        List<User> users = UserQuery.getAll(em);
        
        for (User user : users) {
            round = 1;
            // keys of each user
            List<UserKey> userKeys = UserKkeyQuery.getKeyByEmail(em, user.getEmail());
            
            for (UserKey userKey : userKeys) {
                List<Alphabets17> alphabets17s = Alphabets17Query.getByKey(em, userKey.getId());
                
                XlsRowItqxbmp row = new XlsRowItqxbmp();
                row.setEmail(userKey.getEmail());
                row.setId(userKey.getId());
                row.setRound(round++);
                
                List<Alphabets17> itqxbmps = StringMatcher.alphabets17sContains(itqxbmpList, alphabets17s);
                if(itqxbmps != null && itqxbmps.size() > 0){
                    row.setiTime(getElapsedTime(itqxbmps.get(0).getKeyPress(), itqxbmps.get(0).getKeyUp()));
                    row.settTime(getElapsedTime(itqxbmps.get(1).getKeyPress(), itqxbmps.get(1).getKeyUp()));
                    row.setqTime(getElapsedTime(itqxbmps.get(2).getKeyPress(), itqxbmps.get(2).getKeyUp()));
                    row.setxTime(getElapsedTime(itqxbmps.get(3).getKeyPress(), itqxbmps.get(3).getKeyUp()));
                    row.setbTime(getElapsedTime(itqxbmps.get(4).getKeyPress(), itqxbmps.get(4).getKeyUp()));
                    row.setmTime(getElapsedTime(itqxbmps.get(5).getKeyPress(), itqxbmps.get(5).getKeyUp()));
                    row.setpTime(getElapsedTime(itqxbmps.get(6).getKeyPress(), itqxbmps.get(6).getKeyUp()));
                    
                    row.setItTime(getIntervalTime(itqxbmps.get(0).getKeyUp(), itqxbmps.get(1).getKeyPress()));
                    row.setTqTime(getIntervalTime(itqxbmps.get(1).getKeyUp(), itqxbmps.get(2).getKeyPress()));
                    row.setQxTime(getIntervalTime(itqxbmps.get(2).getKeyUp(), itqxbmps.get(3).getKeyPress()));
                    row.setXbTime(getIntervalTime(itqxbmps.get(3).getKeyUp(), itqxbmps.get(4).getKeyPress()));
                    row.setBmTime(getIntervalTime(itqxbmps.get(4).getKeyUp(), itqxbmps.get(5).getKeyPress()));
                    row.setMpTime(getIntervalTime(itqxbmps.get(5).getKeyUp(), itqxbmps.get(6).getKeyPress()));
                }
                
                xlsRowItqxbmp.add(row);
            }
        }
        
        return xlsRowItqxbmp;
    }
    
    public List<XlsRowGoverment> listAllCwAlphabetsDataForGoverment(){
        int round;
        
        List<String> goverList = new ArrayList<String>();
        goverList.add("g");
        goverList.add("o");
        goverList.add("v");
        goverList.add("e");
        goverList.add("r");
        
        List<String> mentList = new ArrayList<String>();
        mentList.add("m");
        mentList.add("e");
        mentList.add("n");
        mentList.add("t");
        
        List<String> itqxbmpList = new ArrayList<String>();
        itqxbmpList.add("i");
        itqxbmpList.add("t");
        itqxbmpList.add("q");
        itqxbmpList.add("x");
        itqxbmpList.add("b");
        itqxbmpList.add("m");
        itqxbmpList.add("p");
        
        
        List<XlsRowGoverment> xlsRowGoverment = new ArrayList<XlsRowGoverment>();

        // get all user
        List<User> users = UserQuery.getAll(em);
        
        for (User user : users) {
            round = 1;
            // keys of each user
            List<UserKey> userKeys = UserKkeyQuery.getKeyByEmail(em, user.getEmail());
            
            for (UserKey userKey : userKeys) {
                List<CwAlphabets> cwAlphabets = CwAlphabetsQuery.getByKey(em, userKey.getId());
                
                List<CwAlphabets> govers = StringMatcher.cwAplhabetsContains(goverList, cwAlphabets);
                XlsRowGoverment row = new XlsRowGoverment();
                row.setEmail(userKey.getEmail());
                row.setId(userKey.getId());
                row.setRound(round++);
                if(govers != null && govers.size() > 0)
                row.setGoverTime(getElapsedTime(govers.get(0).getKeyPress(), 
                        govers.get(govers.size() - 1).getKeyPress()));
                
                List<CwAlphabets> ments = StringMatcher.cwAplhabetsContains(mentList, cwAlphabets);
                if(ments != null && ments.size() > 0)
                row.setMentTime(getElapsedTime(ments.get(0).getKeyPress(), 
                        ments.get(ments.size() - 1).getKeyPress()));
                
                List<CwAlphabets> itqxbmps = StringMatcher.cwAplhabetsContains(itqxbmpList, cwAlphabets);
                if(itqxbmps != null && itqxbmps.size() > 0)
                row.setItqxbmpTime(getElapsedTime(itqxbmps.get(0).getKeyPress(), 
                        itqxbmps.get(itqxbmps.size() - 1).getKeyPress()));
                
                xlsRowGoverment.add(row);
            }
        }
        
        return xlsRowGoverment;
    }
    
    private List<String> splidWordToArrayList(List<OriginalWord> originalWords){
        List<String> words = new ArrayList<String>();
        for (OriginalWord originalWord : originalWords) {

            for (int i = 0; i < originalWord.getWording().length(); i++) {
                String[] character = originalWord.getWording().split("");
                for (String string : character) {
                    words.add(string);
                }
                words.add(" ");
            }
        }
        
        return words;
    }
    
    private boolean isEmptyString(Character alphabet){
        return alphabet == null || alphabet.toString().trim().equals("");
    }
    
    private long getIntervalTime(final String keyup, final String keypress){
        Long keyDownLong = null;
        long intervalTime = 0;
        
        if(keypress != null){
            keyDownLong = Long.parseLong(keypress);
        }
        
        if(keyDownLong != null && keyup != null){
            intervalTime = keyDownLong - Long.parseLong(keyup);
        }
        
        return intervalTime;
    }
    
    private long getElapsedTime(final String keypress, final String keyup){
        Long keyDownLong = null;
        long elapsedTime = 0;
        
        if(keypress != null){
            keyDownLong = Long.parseLong(keypress);
        }
        
        if(keyDownLong != null && keyup != null){
            elapsedTime = Long.parseLong(keyup) - keyDownLong;
        }
        
        return elapsedTime;
    }
}
