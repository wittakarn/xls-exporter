/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.business;

import com.thaisoftplus.query.UserQuery;
import com.thsisoftplus.domain.XlsRow;
import com.thsisoftplus.entity.User;
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
    
    public List<XlsRow> listAllData(){
        List<XlsRow> xlsRows = null;
        
//        em.getTransaction().begin();
//        em.persist(todo);
//        em.getTransaction().commit();
//
//        em.close();

        List<User> users = UserQuery.getAll(em);
        
        for (User user : users) {
            System.out.println(user.getEmail());
        }
        
        return xlsRows;
    }
}
