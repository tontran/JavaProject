/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "HOTELROOMTYPE", catalog = "", schema = "TRND0364")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotelroomtype.findAll", query = "SELECT h FROM Hotelroomtype h"),
    @NamedQuery(name = "Hotelroomtype.findById", query = "SELECT h FROM Hotelroomtype h WHERE h.id = :id"),
    @NamedQuery(name = "Hotelroomtype.findByDescription", query = "SELECT h FROM Hotelroomtype h WHERE h.description = :description"),
    @NamedQuery(name = "Hotelroomtype.findByNumpeople", query = "SELECT h FROM Hotelroomtype h WHERE h.numpeople = :numpeople"),
    @NamedQuery(name = "Hotelroomtype.findByExtrabed", query = "SELECT h FROM Hotelroomtype h WHERE h.extrabed = :extrabed"),
    @NamedQuery(name = "Hotelroomtype.findByPricerate", query = "SELECT h FROM Hotelroomtype h WHERE h.pricerate = :pricerate")})
public class Hotelroomtype implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID", nullable = false, length = 5)
    private String id;
    @Size(max = 100)
    @Column(name = "DESCRIPTION", length = 100)
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "NUMPEOPLE", nullable = false, length = 5)
    private String numpeople;
    @Size(max = 2)
    @Column(name = "EXTRABED", length = 2)
    private String extrabed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRICERATE", nullable = false)
    private BigInteger pricerate;

    public Hotelroomtype() {
    }

    public Hotelroomtype(String id) {
        this.id = id;
    }

    public Hotelroomtype(String id, String numpeople, BigInteger pricerate) {
        this.id = id;
        this.numpeople = numpeople;
        this.pricerate = pricerate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumpeople() {
        return numpeople;
    }

    public void setNumpeople(String numpeople) {
        this.numpeople = numpeople;
    }

    public String getExtrabed() {
        return extrabed;
    }

    public void setExtrabed(String extrabed) {
        this.extrabed = extrabed;
    }

    public BigInteger getPricerate() {
        return pricerate;
    }

    public void setPricerate(BigInteger pricerate) {
        this.pricerate = pricerate;
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
        if (!(object instanceof Hotelroomtype)) {
            return false;
        }
        Hotelroomtype other = (Hotelroomtype) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Hotelroomtype[ id=" + id + " ]";
    }
    
}
