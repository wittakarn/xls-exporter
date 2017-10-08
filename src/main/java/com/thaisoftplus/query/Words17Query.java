/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.query;

import com.thaisoftplus.entity.Words17;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author witta
 */
public class Words17Query {
    public static List<Words17> getByKey(EntityManager em, String id) {
        StringBuffer sb = null;
        Query query = null;

        try {
            sb = new StringBuffer();
            sb.append("SELECT w FROM Words17 w WHERE w.words17PK.id = :id");
            sb.append(" ORDER BY w.words17PK.wordIndex");

            query = em.createQuery(sb.toString());
            query.setParameter("id", id);

            return query.getResultList();
        } finally {
            sb = null;
            query = null;
        }
    }
}
