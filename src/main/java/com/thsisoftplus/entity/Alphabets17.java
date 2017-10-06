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
@Table(name = "alphabets17")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alphabets17.findAll", query = "SELECT a FROM Alphabets17 a"),
    @NamedQuery(name = "Alphabets17.findById", query = "SELECT a FROM Alphabets17 a WHERE a.alphabets17PK.id = :id"),
    @NamedQuery(name = "Alphabets17.findByCharIndex", query = "SELECT a FROM Alphabets17 a WHERE a.alphabets17PK.charIndex = :charIndex"),
    @NamedQuery(name = "Alphabets17.findByAlphabet", query = "SELECT a FROM Alphabets17 a WHERE a.alphabet = :alphabet"),
    @NamedQuery(name = "Alphabets17.findByKeyCode", query = "SELECT a FROM Alphabets17 a WHERE a.keyCode = :keyCode"),
    @NamedQuery(name = "Alphabets17.findByKeyPress", query = "SELECT a FROM Alphabets17 a WHERE a.keyPress = :keyPress"),
    @NamedQuery(name = "Alphabets17.findByKeyDown", query = "SELECT a FROM Alphabets17 a WHERE a.keyDown = :keyDown"),
    @NamedQuery(name = "Alphabets17.findByKeyUp", query = "SELECT a FROM Alphabets17 a WHERE a.keyUp = :keyUp"),
    @NamedQuery(name = "Alphabets17.findByCorrect", query = "SELECT a FROM Alphabets17 a WHERE a.correct = :correct"),
    @NamedQuery(name = "Alphabets17.findByTimestamp", query = "SELECT a FROM Alphabets17 a WHERE a.timestamp = :timestamp")})
public class Alphabets17 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Alphabets17PK alphabets17PK;
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

    public Alphabets17() {
    }

    public Alphabets17(Alphabets17PK alphabets17PK) {
        this.alphabets17PK = alphabets17PK;
    }

    public Alphabets17(Alphabets17PK alphabets17PK, Character alphabet, int keyCode) {
        this.alphabets17PK = alphabets17PK;
        this.alphabet = alphabet;
        this.keyCode = keyCode;
    }

    public Alphabets17(String id, int charIndex) {
        this.alphabets17PK = new Alphabets17PK(id, charIndex);
    }

    public Alphabets17PK getAlphabets17PK() {
        return alphabets17PK;
    }

    public void setAlphabets17PK(Alphabets17PK alphabets17PK) {
        this.alphabets17PK = alphabets17PK;
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
        hash += (alphabets17PK != null ? alphabets17PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alphabets17)) {
            return false;
        }
        Alphabets17 other = (Alphabets17) object;
        if ((this.alphabets17PK == null && other.alphabets17PK != null) || (this.alphabets17PK != null && !this.alphabets17PK.equals(other.alphabets17PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thsisoftplus.entity.Alphabets17[ alphabets17PK=" + alphabets17PK + " ]";
    }
    
}
