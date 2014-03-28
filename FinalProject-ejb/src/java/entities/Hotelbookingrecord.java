/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "HOTELBOOKINGRECORD", catalog = "", schema = "TRND0364")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotelbookingrecord.findAll", query = "SELECT h FROM Hotelbookingrecord h"),
    @NamedQuery(name = "Hotelbookingrecord.findById", query = "SELECT h FROM Hotelbookingrecord h WHERE h.id = :id"),
    @NamedQuery(name = "Hotelbookingrecord.findByBookingid", query = "SELECT h FROM Hotelbookingrecord h WHERE h.bookingid = :bookingid"),
    @NamedQuery(name = "Hotelbookingrecord.findByRoomtype", query = "SELECT h FROM Hotelbookingrecord h WHERE h.roomtype = :roomtype"),
    @NamedQuery(name = "Hotelbookingrecord.findByExtrabed", query = "SELECT h FROM Hotelbookingrecord h WHERE h.extrabed = :extrabed"),
    @NamedQuery(name = "Hotelbookingrecord.findByRoom", query = "SELECT h FROM Hotelbookingrecord h WHERE h.room = :room"),
    @NamedQuery(name = "Hotelbookingrecord.findByRoomnumber", query = "SELECT h FROM Hotelbookingrecord h WHERE h.roomnumber = :roomnumber"),
    @NamedQuery(name = "Hotelbookingrecord.findByStartdate", query = "SELECT h FROM Hotelbookingrecord h WHERE h.startdate = :startdate"),
    @NamedQuery(name = "Hotelbookingrecord.findByEnddate", query = "SELECT h FROM Hotelbookingrecord h WHERE h.enddate = :enddate"),
    @NamedQuery(name = "Hotelbookingrecord.findByPrice", query = "SELECT h FROM Hotelbookingrecord h WHERE h.price = :price")})
public class Hotelbookingrecord implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID", nullable = false, length = 5)
    private String id;
    @Size(max = 10)
    @Column(name = "BOOKINGID", length = 10)
    private String bookingid;
    @Size(max = 100)
    @Column(name = "ROOMTYPE", length = 100)
    private String roomtype;
    @Size(max = 2)
    @Column(name = "EXTRABED", length = 2)
    private String extrabed;
    @Size(max = 10)
    @Column(name = "ROOM", length = 10)
    private String room;
    @Size(max = 10)
    @Column(name = "ROOMNUMBER", length = 10)
    private String roomnumber;
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
    @Column(name = "PRICE", nullable = false)
    private BigInteger price;

    public Hotelbookingrecord() {
    }

    public Hotelbookingrecord(String id) {
        this.id = id;
    }

    public Hotelbookingrecord(String id, Date startdate, Date enddate, BigInteger price) {
        this.id = id;
        this.startdate = startdate;
        this.enddate = enddate;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookingid() {
        return bookingid;
    }

    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getExtrabed() {
        return extrabed;
    }

    public void setExtrabed(String extrabed) {
        this.extrabed = extrabed;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
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

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
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
        if (!(object instanceof Hotelbookingrecord)) {
            return false;
        }
        Hotelbookingrecord other = (Hotelbookingrecord) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Hotelbookingrecord[ id=" + id + " ]";
    }
    
}
