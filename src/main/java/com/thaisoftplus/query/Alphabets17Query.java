/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.query;

import com.thsisoftplus.entity.Alphabets17;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author witta
 */
public class Alphabets17Query {
    public static List<Alphabets17> getByKey(EntityManager em, String id) {
        StringBuffer sb = null;
        Query query = null;

        try {
            sb = new StringBuffer();
            sb.append("SELECT a FROM Alphabets17 a WHERE a.alphabets17PK.id = :id");
            sb.append(" ORDER BY a.alphabets17PK.charIndex");

            query = em.createQuery(sb.toString());
            query.setParameter("id", id);
            
            System.out.println("Query = " + sb.toString());

            return query.getResultList();
        } finally {
            sb = null;
            query = null;
        }
    }
}
