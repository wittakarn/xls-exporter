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
@Table(name = "user_information")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserInformation.findAll", query = "SELECT u FROM UserInformation u"),
    @NamedQuery(name = "UserInformation.findByEmail", query = "SELECT u FROM UserInformation u WHERE u.email = :email"),
    @NamedQuery(name = "UserInformation.findByName", query = "SELECT u FROM UserInformation u WHERE u.name = :name"),
    @NamedQuery(name = "UserInformation.findByPhone", query = "SELECT u FROM UserInformation u WHERE u.phone = :phone"),
    @NamedQuery(name = "UserInformation.findByGender", query = "SELECT u FROM UserInformation u WHERE u.gender = :gender"),
    @NamedQuery(name = "UserInformation.findByAge", query = "SELECT u FROM UserInformation u WHERE u.age = :age"),
    @NamedQuery(name = "UserInformation.findByEducation", query = "SELECT u FROM UserInformation u WHERE u.education = :education"),
    @NamedQuery(name = "UserInformation.findByFaculty", query = "SELECT u FROM UserInformation u WHERE u.faculty = :faculty"),
    @NamedQuery(name = "UserInformation.findByOccupation", query = "SELECT u FROM UserInformation u WHERE u.occupation = :occupation"),
    @NamedQuery(name = "UserInformation.findByFavoriteColor", query = "SELECT u FROM UserInformation u WHERE u.favoriteColor = :favoriteColor"),
    @NamedQuery(name = "UserInformation.findByTimestamp", query = "SELECT u FROM UserInformation u WHERE u.timestamp = :timestamp")})
public class UserInformation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "gender")
    private int gender;
    @Basic(optional = false)
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @Column(name = "education")
    private int education;
    @Basic(optional = false)
    @Column(name = "faculty")
    private int faculty;
    @Basic(optional = false)
    @Column(name = "occupation")
    private int occupation;
    @Basic(optional = false)
    @Column(name = "favorite_color")
    private String favoriteColor;
    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public UserInformation() {
    }

    public UserInformation(String email) {
        this.email = email;
    }

    public UserInformation(String email, String name, String phone, int gender, int age, int education, int faculty, int occupation, String favoriteColor) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.age = age;
        this.education = education;
        this.faculty = faculty;
        this.occupation = occupation;
        this.favoriteColor = favoriteColor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public int getOccupation() {
        return occupation;
    }

    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
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
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserInformation)) {
            return false;
        }
        UserInformation other = (UserInformation) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thsisoftplus.entity.UserInformation[ email=" + email + " ]";
    }
    
}
