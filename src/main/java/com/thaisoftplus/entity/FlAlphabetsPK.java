/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thaisoftplus.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author witta
 */
@Embeddable
public class FlAlphabetsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "char_index")
    private int charIndex;

    public FlAlphabetsPK() {
    }

    public FlAlphabetsPK(String id, int charIndex) {
        this.id = id;
        this.charIndex = charIndex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCharIndex() {
        return charIndex;
    }

    public void setCharIndex(int charIndex) {
        this.charIndex = charIndex;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (int) charIndex;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlAlphabetsPK)) {
            return false;
        }
        FlAlphabetsPK other = (FlAlphabetsPK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if (this.charIndex != other.charIndex) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thsisoftplus.entity.FlAlphabetsPK[ id=" + id + ", charIndex=" + charIndex + " ]";
    }
    
}
