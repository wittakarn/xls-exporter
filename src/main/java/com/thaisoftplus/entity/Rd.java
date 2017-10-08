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
@Table(name = "rd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rd.findAll", query = "SELECT r FROM Rd r"),
    @NamedQuery(name = "Rd.findById", query = "SELECT r FROM Rd r WHERE r.rdPK.id = :id"),
    @NamedQuery(name = "Rd.findByWordIndex", query = "SELECT r FROM Rd r WHERE r.rdPK.wordIndex = :wordIndex"),
    @NamedQuery(name = "Rd.findByWording", query = "SELECT r FROM Rd r WHERE r.wording = :wording"),
    @NamedQuery(name = "Rd.findByCorrect", query = "SELECT r FROM Rd r WHERE r.correct = :correct"),
    @NamedQuery(name = "Rd.findByTimestamp", query = "SELECT r FROM Rd r WHERE r.timestamp = :timestamp")})
public class Rd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RdPK rdPK;
    @Basic(optional = false)
    @Column(name = "wording")
    private String wording;
    @Column(name = "correct")
    private Integer correct;
    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public Rd() {
    }

    public Rd(RdPK rdPK) {
        this.rdPK = rdPK;
    }

    public Rd(RdPK rdPK, String wording) {
        this.rdPK = rdPK;
        this.wording = wording;
    }

    public Rd(String id, int wordIndex) {
        this.rdPK = new RdPK(id, wordIndex);
    }

    public RdPK getRdPK() {
        return rdPK;
    }

    public void setRdPK(RdPK rdPK) {
        this.rdPK = rdPK;
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
        hash += (rdPK != null ? rdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rd)) {
            return false;
        }
        Rd other = (Rd) object;
        if ((this.rdPK == null && other.rdPK != null) || (this.rdPK != null && !this.rdPK.equals(other.rdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thsisoftplus.entity.Rd[ rdPK=" + rdPK + " ]";
    }
    
}
