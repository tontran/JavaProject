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
@Table(name = "HOTELROOM", catalog = "", schema = "TRND0364")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotelroom.findAll", query = "SELECT h FROM Hotelroom h"),
    @NamedQuery(name = "Hotelroom.findById", query = "SELECT h FROM Hotelroom h WHERE h.id = :id"),
    @NamedQuery(name = "Hotelroom.findByRoomnum", query = "SELECT h FROM Hotelroom h WHERE h.roomnum = :roomnum"),
    @NamedQuery(name = "Hotelroom.findByType", query = "SELECT h FROM Hotelroom h WHERE h.type = :type"),
    @NamedQuery(name = "Hotelroom.findByStatus", query = "SELECT h FROM Hotelroom h WHERE h.status = :status")})
public class Hotelroom implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID", nullable = false, length = 10)
    private String id;
    @Size(max = 10)
    @Column(name = "ROOMNUM", length = 10)
    private String roomnum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TYPE", nullable = false, length = 10)
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STATUS", nullable = false)
    private char status;

    public Hotelroom() {
    }

    public Hotelroom(String id) {
        this.id = id;
    }

    public Hotelroom(String id, String type, char status) {
        this.id = id;
        this.type = type;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
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
        if (!(object instanceof Hotelroom)) {
            return false;
        }
        Hotelroom other = (Hotelroom) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Hotelroom[ id=" + id + " ]";
    }
    
}
