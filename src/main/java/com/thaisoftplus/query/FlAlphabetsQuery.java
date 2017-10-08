/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.query;

import com.thaisoftplus.entity.FlAlphabets;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author witta
 */
public class FlAlphabetsQuery {
    public static List<FlAlphabets> getByKey(EntityManager em, String id) {
        StringBuffer sb = null;
        Query query = null;

        try {
            sb = new StringBuffer();
            sb.append("SELECT f FROM FlAlphabets f WHERE f.flAlphabetsPK.id = :id");
            sb.append(" ORDER BY f.flAlphabetsPK.charIndex");

            query = em.createQuery(sb.toString());
            query.setParameter("id", id);

            return query.getResultList();
        } finally {
            sb = null;
            query = null;
        }
    }
}
