/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thsisoftplus.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "user_key")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserKey.findAll", query = "SELECT u FROM UserKey u"),
    @NamedQuery(name = "UserKey.findById", query = "SELECT u FROM UserKey u WHERE u.id = :id"),
    @NamedQuery(name = "UserKey.findByEmail", query = "SELECT u FROM UserKey u WHERE u.email = :email"),
    @NamedQuery(name = "UserKey.findByOpacity", query = "SELECT u FROM UserKey u WHERE u.opacity = :opacity"),
    @NamedQuery(name = "UserKey.findByTimestamp", query = "SELECT u FROM UserKey u WHERE u.timestamp = :timestamp")})
public class UserKey implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "opacity")
    private BigDecimal opacity;
    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public UserKey() {
    }

    public UserKey(String id) {
        this.id = id;
    }

    public UserKey(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getOpacity() {
        return opacity;
    }

    public void setOpacity(BigDecimal opacity) {
        this.opacity = opacity;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserKey)) {
            return false;
        }
        UserKey other = (UserKey) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thsisoftplus.entity.UserKey[ id=" + id + " ]";
    }
    
}
