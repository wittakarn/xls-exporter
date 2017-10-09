/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.entity;

import com.thaisoftplus.word.OriginalAlphabet;
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
@Table(name = "cw_alphabets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CwAlphabets.findAll", query = "SELECT c FROM CwAlphabets c"),
    @NamedQuery(name = "CwAlphabets.findById", query = "SELECT c FROM CwAlphabets c WHERE c.cwAlphabetsPK.id = :id"),
    @NamedQuery(name = "CwAlphabets.findByCharIndex", query = "SELECT c FROM CwAlphabets c WHERE c.cwAlphabetsPK.charIndex = :charIndex"),
    @NamedQuery(name = "CwAlphabets.findByAlphabet", query = "SELECT c FROM CwAlphabets c WHERE c.alphabet = :alphabet"),
    @NamedQuery(name = "CwAlphabets.findByKeyCode", query = "SELECT c FROM CwAlphabets c WHERE c.keyCode = :keyCode"),
    @NamedQuery(name = "CwAlphabets.findByKeyPress", query = "SELECT c FROM CwAlphabets c WHERE c.keyPress = :keyPress"),
    @NamedQuery(name = "CwAlphabets.findByKeyDown", query = "SELECT c FROM CwAlphabets c WHERE c.keyDown = :keyDown"),
    @NamedQuery(name = "CwAlphabets.findByKeyUp", query = "SELECT c FROM CwAlphabets c WHERE c.keyUp = :keyUp"),
    @NamedQuery(name = "CwAlphabets.findByCorrect", query = "SELECT c FROM CwAlphabets c WHERE c.correct = :correct"),
    @NamedQuery(name = "CwAlphabets.findByTimestamp", query = "SELECT c FROM CwAlphabets c WHERE c.timestamp = :timestamp")})
public class CwAlphabets implements OriginalAlphabet, Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CwAlphabetsPK cwAlphabetsPK;
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

    public CwAlphabets() {
    }

    public CwAlphabets(CwAlphabetsPK cwAlphabetsPK) {
        this.cwAlphabetsPK = cwAlphabetsPK;
    }

    public CwAlphabets(CwAlphabetsPK cwAlphabetsPK, Character alphabet, int keyCode) {
        this.cwAlphabetsPK = cwAlphabetsPK;
        this.alphabet = alphabet;
        this.keyCode = keyCode;
    }

    public CwAlphabets(String id, int charIndex) {
        this.cwAlphabetsPK = new CwAlphabetsPK(id, charIndex);
    }

    public CwAlphabetsPK getCwAlphabetsPK() {
        return cwAlphabetsPK;
    }

    public void setCwAlphabetsPK(CwAlphabetsPK cwAlphabetsPK) {
        this.cwAlphabetsPK = cwAlphabetsPK;
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
        hash += (cwAlphabetsPK != null ? cwAlphabetsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CwAlphabets)) {
            return false;
        }
        CwAlphabets other = (CwAlphabets) object;
        if ((this.cwAlphabetsPK == null && other.cwAlphabetsPK != null) || (this.cwAlphabetsPK != null && !this.cwAlphabetsPK.equals(other.cwAlphabetsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thsisoftplus.entity.CwAlphabets[ cwAlphabetsPK=" + cwAlphabetsPK + " ]";
    }
    
}
