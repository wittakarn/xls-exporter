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
@Table(name = "ob_alphabets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ObAlphabets.findAll", query = "SELECT o FROM ObAlphabets o"),
    @NamedQuery(name = "ObAlphabets.findById", query = "SELECT o FROM ObAlphabets o WHERE o.obAlphabetsPK.id = :id"),
    @NamedQuery(name = "ObAlphabets.findByCharIndex", query = "SELECT o FROM ObAlphabets o WHERE o.obAlphabetsPK.charIndex = :charIndex"),
    @NamedQuery(name = "ObAlphabets.findByAlphabet", query = "SELECT o FROM ObAlphabets o WHERE o.alphabet = :alphabet"),
    @NamedQuery(name = "ObAlphabets.findByKeyCode", query = "SELECT o FROM ObAlphabets o WHERE o.keyCode = :keyCode"),
    @NamedQuery(name = "ObAlphabets.findByKeyPress", query = "SELECT o FROM ObAlphabets o WHERE o.keyPress = :keyPress"),
    @NamedQuery(name = "ObAlphabets.findByKeyDown", query = "SELECT o FROM ObAlphabets o WHERE o.keyDown = :keyDown"),
    @NamedQuery(name = "ObAlphabets.findByKeyUp", query = "SELECT o FROM ObAlphabets o WHERE o.keyUp = :keyUp"),
    @NamedQuery(name = "ObAlphabets.findByCorrect", query = "SELECT o FROM ObAlphabets o WHERE o.correct = :correct"),
    @NamedQuery(name = "ObAlphabets.findByTimestamp", query = "SELECT o FROM ObAlphabets o WHERE o.timestamp = :timestamp")})
public class ObAlphabets implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ObAlphabetsPK obAlphabetsPK;
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

    public ObAlphabets() {
    }

    public ObAlphabets(ObAlphabetsPK obAlphabetsPK) {
        this.obAlphabetsPK = obAlphabetsPK;
    }

    public ObAlphabets(ObAlphabetsPK obAlphabetsPK, Character alphabet, int keyCode) {
        this.obAlphabetsPK = obAlphabetsPK;
        this.alphabet = alphabet;
        this.keyCode = keyCode;
    }

    public ObAlphabets(String id, int charIndex) {
        this.obAlphabetsPK = new ObAlphabetsPK(id, charIndex);
    }

    public ObAlphabetsPK getObAlphabetsPK() {
        return obAlphabetsPK;
    }

    public void setObAlphabetsPK(ObAlphabetsPK obAlphabetsPK) {
        this.obAlphabetsPK = obAlphabetsPK;
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
        hash += (obAlphabetsPK != null ? obAlphabetsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObAlphabets)) {
            return false;
        }
        ObAlphabets other = (ObAlphabets) object;
        if ((this.obAlphabetsPK == null && other.obAlphabetsPK != null) || (this.obAlphabetsPK != null && !this.obAlphabetsPK.equals(other.obAlphabetsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thsisoftplus.entity.ObAlphabets[ obAlphabetsPK=" + obAlphabetsPK + " ]";
    }
    
}
