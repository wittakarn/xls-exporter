/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.query;

import com.thaisoftplus.entity.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author witta
 */
public class UserQuery {
    
    public static List<User> getAll(EntityManager em) {
        StringBuffer sb = null;
        Query query = null;

        try {
            sb = new StringBuffer();
            sb.append("SELECT u FROM User u");

            query = em.createQuery(sb.toString());

            return query.getResultList();
        } finally {
            sb = null;
            query = null;
        }
    }
    
}
