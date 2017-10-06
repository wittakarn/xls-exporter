/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thsisoftplus.entity;

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
@Table(name = "words17")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Words17.findAll", query = "SELECT w FROM Words17 w"),
    @NamedQuery(name = "Words17.findById", query = "SELECT w FROM Words17 w WHERE w.words17PK.id = :id"),
    @NamedQuery(name = "Words17.findByWordIndex", query = "SELECT w FROM Words17 w WHERE w.words17PK.wordIndex = :wordIndex"),
    @NamedQuery(name = "Words17.findByWording", query = "SELECT w FROM Words17 w WHERE w.wording = :wording"),
    @NamedQuery(name = "Words17.findByCorrect", query = "SELECT w FROM Words17 w WHERE w.correct = :correct"),
    @NamedQuery(name = "Words17.findByTimestamp", query = "SELECT w FROM Words17 w WHERE w.timestamp = :timestamp")})
public class Words17 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Words17PK words17PK;
    @Basic(optional = false)
    @Column(name = "wording")
    private String wording;
    @Column(name = "correct")
    private Integer correct;
    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public Words17() {
    }

    public Words17(Words17PK words17PK) {
        this.words17PK = words17PK;
    }

    public Words17(Words17PK words17PK, String wording) {
        this.words17PK = words17PK;
        this.wording = wording;
    }

    public Words17(String id, int wordIndex) {
        this.words17PK = new Words17PK(id, wordIndex);
    }

    public Words17PK getWords17PK() {
        return words17PK;
    }

    public void setWords17PK(Words17PK words17PK) {
        this.words17PK = words17PK;
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
        hash += (words17PK != null ? words17PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Words17)) {
            return false;
        }
        Words17 other = (Words17) object;
        if ((this.words17PK == null && other.words17PK != null) || (this.words17PK != null && !this.words17PK.equals(other.words17PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thsisoftplus.entity.Words17[ words17PK=" + words17PK + " ]";
    }
    
}
