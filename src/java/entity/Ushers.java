/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author angelis
 */
@Entity
@Table(name = "ushers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ushers.findAll", query = "SELECT u FROM Ushers u")
    , @NamedQuery(name = "Ushers.findByEmail", query = "SELECT u FROM Ushers u WHERE u.email = :email")
    , @NamedQuery(name = "Ushers.findByPassword", query = "SELECT u FROM Ushers u WHERE u.password = :password")
    , @NamedQuery(name = "Ushers.findByLastName", query = "SELECT u FROM Ushers u WHERE u.lastName = :lastName")
    , @NamedQuery(name = "Ushers.findByFirstName", query = "SELECT u FROM Ushers u WHERE u.firstName = :firstName")
    , @NamedQuery(name = "Ushers.findByPhoneNo", query = "SELECT u FROM Ushers u WHERE u.phoneNo = :phoneNo")
    , @NamedQuery(name = "Ushers.findBySex", query = "SELECT u FROM Ushers u WHERE u.sex = :sex")
    , @NamedQuery(name = "Ushers.findByState", query = "SELECT u FROM Ushers u WHERE u.state = :state")
    , @NamedQuery(name = "Ushers.findByDateTime", query = "SELECT u FROM Ushers u WHERE u.dateTime = :dateTime")})
public class Ushers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "lastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "firstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "phoneNo")
    private String phoneNo;
    @Lob
    @Column(name = "photo")
    private byte[] photo;
    @Basic(optional = false)
    @Column(name = "sex")
    private String sex;
    @Basic(optional = false)
    @Lob
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @Column(name = "dateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;

    public Ushers() {
    }

    public Ushers(String email) {
        this.email = email;
    }

    public Ushers(String email, String password, String lastName, String firstName, String phoneNo, String sex, String address, String state, Date dateTime) {
        this.email = email;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNo = phoneNo;
        this.sex = sex;
        this.address = address;
        this.state = state;
        this.dateTime = dateTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
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
        if (!(object instanceof Ushers)) {
            return false;
        }
        Ushers other = (Ushers) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "package1.Ushers[ email=" + email + " ]";
    }
    
}
