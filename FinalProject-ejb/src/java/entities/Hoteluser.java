/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ton Tran
 */
@Entity
@Table(name = "HOTELUSER", catalog = "", schema = "TRND0364")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hoteluser.findAll", query = "SELECT h FROM Hoteluser h"),
    @NamedQuery(name = "Hoteluser.findById", query = "SELECT h FROM Hoteluser h WHERE h.id = :id"),
    @NamedQuery(name = "Hoteluser.findByUsername", query = "SELECT h FROM Hoteluser h WHERE h.username = :username"),
    @NamedQuery(name = "Hoteluser.findByPassword", query = "SELECT h FROM Hoteluser h WHERE h.password = :password"),
    @NamedQuery(name = "Hoteluser.findByAddress", query = "SELECT h FROM Hoteluser h WHERE h.address = :address"),
    @NamedQuery(name = "Hoteluser.findByPhonenum", query = "SELECT h FROM Hoteluser h WHERE h.phonenum = :phonenum"),
    @NamedQuery(name = "Hoteluser.findByEmail", query = "SELECT h FROM Hoteluser h WHERE h.email = :email"),
    @NamedQuery(name = "Hoteluser.findByStatus", query = "SELECT h FROM Hoteluser h WHERE h.status = :status")})
public class Hoteluser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID", nullable = false, length = 5)
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "USERNAME", nullable = false, length = 100)
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PASSWORD", nullable = false, length = 50)
    private String password;
    @Size(max = 100)
    @Column(name = "ADDRESS", length = 100)
    private String address;
    @Size(max = 100)
    @Column(name = "PHONENUM", length = 100)
    private String phonenum;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;
    @Column(name = "STATUS")
    private Character status;

    public Hoteluser() {
    }

    public Hoteluser(String id) {
        this.id = id;
    }

    public Hoteluser(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
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
        if (!(object instanceof Hoteluser)) {
            return false;
        }
        Hoteluser other = (Hoteluser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Hoteluser[ id=" + id + " ]";
    }
    
}
