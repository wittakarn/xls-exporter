/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author witta
 */
@Entity
@Table(name = "cw")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cw.findAll", query = "SELECT c FROM Cw c"),
    @NamedQuery(name = "Cw.findById", query = "SELECT c FROM Cw c WHERE c.cwPK.id = :id"),
    @NamedQuery(name = "Cw.findByWordIndex", query = "SELECT c FROM Cw c WHERE c.cwPK.wordIndex = :wordIndex"),
    @NamedQuery(name = "Cw.findByWording", query = "SELECT c FROM Cw c WHERE c.wording = :wording"),
    @NamedQuery(name = "Cw.findByCorrect", query = "SELECT c FROM Cw c WHERE c.correct = :correct"),
    @NamedQuery(name = "Cw.findByTimestamp", query = "SELECT c FROM Cw c WHERE c.timestamp = :timestamp")})
public class Cw implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CwPK cwPK;
    @Basic(optional = false)
    @Column(name = "wording")
    private String wording;
    @Column(name = "correct")
    private Integer correct;
    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public Cw() {
    }

    public Cw(CwPK cwPK) {
        this.cwPK = cwPK;
    }

    public Cw(CwPK cwPK, String wording) {
        this.cwPK = cwPK;
        this.wording = wording;
    }

    public Cw(String id, int wordIndex) {
        this.cwPK = new CwPK(id, wordIndex);
    }

    public CwPK getCwPK() {
        return cwPK;
    }

    public void setCwPK(CwPK cwPK) {
        this.cwPK = cwPK;
    }

    public String getWording() {
        return wording;
    }

    public void setWording(String wording) {
        this.wording = wording;
    }

    public Integer getCorrect() {
        return correct;
    }

    public void setCorrect(Integer correct) {
        this.correct = correct;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cwPK != null ? cwPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cw)) {
            return false;
        }
        Cw other = (Cw) object;
        if ((this.cwPK == null && other.cwPK != null) || (this.cwPK != null && !this.cwPK.equals(other.cwPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thsisoftplus.entity.Cw[ cwPK=" + cwPK + " ]";
    }
    
}
