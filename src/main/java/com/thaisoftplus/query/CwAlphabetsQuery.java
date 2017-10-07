/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.query;

import com.thsisoftplus.entity.CwAlphabets;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author witta
 */
public class CwAlphabetsQuery {
    public static List<CwAlphabets> getByKey(EntityManager em, String id) {
        StringBuffer sb = null;
        Query query = null;

        try {
            sb = new StringBuffer();
            sb.append("SELECT c FROM CwAlphabets c WHERE c.cwAlphabetsPK.id = :id");
            sb.append(" ORDER BY c.cwAlphabetsPK.charIndex");

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
