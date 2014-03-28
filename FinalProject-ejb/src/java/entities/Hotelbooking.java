/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ton Tran
 */
@Entity
@Table(name = "HOTELBOOKING", catalog = "", schema = "TRND0364")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotelbooking.findAll", query = "SELECT h FROM Hotelbooking h"),
    @NamedQuery(name = "Hotelbooking.updateBooking", query = "UPDATE Hotelbooking h SET h.clientid = ?1, h.startdate = ?2, h.enddate = ?3, h.pin = ?4 WHERE h.id = ?5"),
    @NamedQuery(name = "Hotelbooking.addBooking", query = "INSERT INTO Hotelbooking h VALUES(?1,?2,?3,?4,?5)"),
    @NamedQuery(name = "Hotelbooking.deleteBooking", query = "DELETE FROM Hotelbooking h WHERE h.id = ?1"),
    @NamedQuery(name = "Hotelbooking.findById", query = "SELECT h FROM Hotelbooking h WHERE h.id = :id"),
    @NamedQuery(name = "Hotelbooking.findByClientid", query = "SELECT h FROM Hotelbooking h WHERE h.clientid = :clientid"),
    @NamedQuery(name = "Hotelbooking.findByStartdate", query = "SELECT h FROM Hotelbooking h WHERE h.startdate = :startdate"),
    @NamedQuery(name = "Hotelbooking.findByEnddate", query = "SELECT h FROM Hotelbooking h WHERE h.enddate = :enddate"),
    @NamedQuery(name = "Hotelbooking.findByPin", query = "SELECT h FROM Hotelbooking h WHERE h.pin = :pin")})
public class Hotelbooking implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID", nullable = false, length = 10)
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CLIENTID", nullable = false, length = 10)
    private String clientid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STARTDATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ENDDATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PIN", nullable = false, length = 10)
    private String pin;

    public Hotelbooking() {
    }

    public Hotelbooking(String id) {
        this.id = id;
    }

    public Hotelbooking(String id, String clientid, Date startdate, Date enddate, String pin) {
        this.id = id;
        this.clientid = clientid;
        this.startdate = startdate;
        this.enddate = enddate;
        this.pin = pin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
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
        if (!(object instanceof Hotelbooking)) {
            return false;
        }
        Hotelbooking other = (Hotelbooking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Hotelbooking[ id=" + id + " ]";
    }
    
}
