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
@Table(name = "rd_alphabets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RdAlphabets.findAll", query = "SELECT r FROM RdAlphabets r"),
    @NamedQuery(name = "RdAlphabets.findById", query = "SELECT r FROM RdAlphabets r WHERE r.rdAlphabetsPK.id = :id"),
    @NamedQuery(name = "RdAlphabets.findByCharIndex", query = "SELECT r FROM RdAlphabets r WHERE r.rdAlphabetsPK.charIndex = :charIndex"),
    @NamedQuery(name = "RdAlphabets.findByAlphabet", query = "SELECT r FROM RdAlphabets r WHERE r.alphabet = :alphabet"),
    @NamedQuery(name = "RdAlphabets.findByKeyCode", query = "SELECT r FROM RdAlphabets r WHERE r.keyCode = :keyCode"),
    @NamedQuery(name = "RdAlphabets.findByKeyPress", query = "SELECT r FROM RdAlphabets r WHERE r.keyPress = :keyPress"),
    @NamedQuery(name = "RdAlphabets.findByKeyDown", query = "SELECT r FROM RdAlphabets r WHERE r.keyDown = :keyDown"),
    @NamedQuery(name = "RdAlphabets.findByKeyUp", query = "SELECT r FROM RdAlphabets r WHERE r.keyUp = :keyUp"),
    @NamedQuery(name = "RdAlphabets.findByCorrect", query = "SELECT r FROM RdAlphabets r WHERE r.correct = :correct"),
    @NamedQuery(name = "RdAlphabets.findByTimestamp", query = "SELECT r FROM RdAlphabets r WHERE r.timestamp = :timestamp")})
public class RdAlphabets implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RdAlphabetsPK rdAlphabetsPK;
    @Basic(optional = false)
    @Column(name = "alphabet")
    private Character alphabet;
    @Basic(optional = false)
    @Column(name = "key_code")
    private int keyCode;
    @Column(name = "key_press")
    private String keyPress;
    @Column(name = "key_down")
    private String keyDown;
    @Column(name = "key_up")
    private String keyUp;
    @Column(name = "correct")
    private Integer correct;
    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public RdAlphabets() {
    }

    public RdAlphabets(RdAlphabetsPK rdAlphabetsPK) {
        this.rdAlphabetsPK = rdAlphabetsPK;
    }

    public RdAlphabets(RdAlphabetsPK rdAlphabetsPK, Character alphabet, int keyCode) {
        this.rdAlphabetsPK = rdAlphabetsPK;
        this.alphabet = alphabet;
        this.keyCode = keyCode;
    }

    public RdAlphabets(String id, int charIndex) {
        this.rdAlphabetsPK = new RdAlphabetsPK(id, charIndex);
    }

    public RdAlphabetsPK getRdAlphabetsPK() {
        return rdAlphabetsPK;
    }

    public void setRdAlphabetsPK(RdAlphabetsPK rdAlphabetsPK) {
        this.rdAlphabetsPK = rdAlphabetsPK;
    }

    public Character getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(Character alphabet) {
        this.alphabet = alphabet;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    public String getKeyPress() {
        return keyPress;
    }

    public void setKeyPress(String keyPress) {
        this.keyPress = keyPress;
    }

    public String getKeyDown() {
        return keyDown;
    }

    public void setKeyDown(String keyDown) {
        this.keyDown = keyDown;
    }

    public String getKeyUp() {
        return keyUp;
    }

    public void setKeyUp(String keyUp) {
        this.keyUp = keyUp;
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
        hash += (rdAlphabetsPK != null ? rdAlphabetsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RdAlphabets)) {
            return false;
        }
        RdAlphabets other = (RdAlphabets) object;
        if ((this.rdAlphabetsPK == null && other.rdAlphabetsPK != null) || (this.rdAlphabetsPK != null && !this.rdAlphabetsPK.equals(other.rdAlphabetsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thsisoftplus.entity.RdAlphabets[ rdAlphabetsPK=" + rdAlphabetsPK + " ]";
    }
    
}
