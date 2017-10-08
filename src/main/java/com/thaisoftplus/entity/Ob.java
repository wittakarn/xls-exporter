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
@Table(name = "ob")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ob.findAll", query = "SELECT o FROM Ob o"),
    @NamedQuery(name = "Ob.findById", query = "SELECT o FROM Ob o WHERE o.obPK.id = :id"),
    @NamedQuery(name = "Ob.findByWordIndex", query = "SELECT o FROM Ob o WHERE o.obPK.wordIndex = :wordIndex"),
    @NamedQuery(name = "Ob.findByWording", query = "SELECT o FROM Ob o WHERE o.wording = :wording"),
    @NamedQuery(name = "Ob.findByCorrect", query = "SELECT o FROM Ob o WHERE o.correct = :correct"),
    @NamedQuery(name = "Ob.findByTimestamp", query = "SELECT o FROM Ob o WHERE o.timestamp = :timestamp")})
public class Ob implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ObPK obPK;
    @Basic(optional = false)
    @Column(name = "wording")
    private String wording;
    @Column(name = "correct")
    private Integer correct;
    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public Ob() {
    }

    public Ob(ObPK obPK) {
        this.obPK = obPK;
    }

    public Ob(ObPK obPK, String wording) {
        this.obPK = obPK;
        this.wording = wording;
    }

    public Ob(String id, int wordIndex) {
        this.obPK = new ObPK(id, wordIndex);
    }

    public ObPK getObPK() {
        return obPK;
    }

    public void setObPK(ObPK obPK) {
        this.obPK = obPK;
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
        hash += (obPK != null ? obPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ob)) {
            return false;
        }
        Ob other = (Ob) object;
        if ((this.obPK == null && other.obPK != null) || (this.obPK != null && !this.obPK.equals(other.obPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thsisoftplus.entity.Ob[ obPK=" + obPK + " ]";
    }
    
}
