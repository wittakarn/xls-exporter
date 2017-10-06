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
@Table(name = "fl_alphabets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FlAlphabets.findAll", query = "SELECT f FROM FlAlphabets f"),
    @NamedQuery(name = "FlAlphabets.findById", query = "SELECT f FROM FlAlphabets f WHERE f.flAlphabetsPK.id = :id"),
    @NamedQuery(name = "FlAlphabets.findByCharIndex", query = "SELECT f FROM FlAlphabets f WHERE f.flAlphabetsPK.charIndex = :charIndex"),
    @NamedQuery(name = "FlAlphabets.findByAlphabet", query = "SELECT f FROM FlAlphabets f WHERE f.alphabet = :alphabet"),
    @NamedQuery(name = "FlAlphabets.findByKeyCode", query = "SELECT f FROM FlAlphabets f WHERE f.keyCode = :keyCode"),
    @NamedQuery(name = "FlAlphabets.findByKeyPress", query = "SELECT f FROM FlAlphabets f WHERE f.keyPress = :keyPress"),
    @NamedQuery(name = "FlAlphabets.findByKeyDown", query = "SELECT f FROM FlAlphabets f WHERE f.keyDown = :keyDown"),
    @NamedQuery(name = "FlAlphabets.findByKeyUp", query = "SELECT f FROM FlAlphabets f WHERE f.keyUp = :keyUp"),
    @NamedQuery(name = "FlAlphabets.findByCorrect", query = "SELECT f FROM FlAlphabets f WHERE f.correct = :correct"),
    @NamedQuery(name = "FlAlphabets.findByTimestamp", query = "SELECT f FROM FlAlphabets f WHERE f.timestamp = :timestamp")})
public class FlAlphabets implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FlAlphabetsPK flAlphabetsPK;
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

    public FlAlphabets() {
    }

    public FlAlphabets(FlAlphabetsPK flAlphabetsPK) {
        this.flAlphabetsPK = flAlphabetsPK;
    }

    public FlAlphabets(FlAlphabetsPK flAlphabetsPK, Character alphabet, int keyCode) {
        this.flAlphabetsPK = flAlphabetsPK;
        this.alphabet = alphabet;
        this.keyCode = keyCode;
    }

    public FlAlphabets(String id, int charIndex) {
        this.flAlphabetsPK = new FlAlphabetsPK(id, charIndex);
    }

    public FlAlphabetsPK getFlAlphabetsPK() {
        return flAlphabetsPK;
    }

    public void setFlAlphabetsPK(FlAlphabetsPK flAlphabetsPK) {
        this.flAlphabetsPK = flAlphabetsPK;
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
        hash += (flAlphabetsPK != null ? flAlphabetsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlAlphabets)) {
            return false;
        }
        FlAlphabets other = (FlAlphabets) object;
        if ((this.flAlphabetsPK == null && other.flAlphabetsPK != null) || (this.flAlphabetsPK != null && !this.flAlphabetsPK.equals(other.flAlphabetsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thsisoftplus.entity.FlAlphabets[ flAlphabetsPK=" + flAlphabetsPK + " ]";
    }
    
}
