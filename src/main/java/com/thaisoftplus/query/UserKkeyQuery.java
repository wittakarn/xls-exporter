/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.query;

import com.thsisoftplus.entity.UserKey;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author witta
 */
public class UserKkeyQuery {
    public static List<UserKey> getKeyByEmail(EntityManager em, String email) {
//        return em.createNamedQuery("UserKey.findByEmail")
//                            .setParameter("email", email)
//                            .getResultList();
        StringBuffer sb = null;
        Query query = null;

        try {
            sb = new StringBuffer();
            sb.append("SELECT u FROM UserKey u WHERE u.email = :email");
            sb.append(" ORDER BY u.timestamp");

            query = em.createQuery(sb.toString());
            query.setParameter("email", email);
            
            System.out.println("Query = " + sb.toString());

            return query.getResultList();
        } finally {
            sb = null;
            query = null;
        }
    }
}
