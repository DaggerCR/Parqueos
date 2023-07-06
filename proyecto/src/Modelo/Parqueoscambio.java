/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author danie
 */
@Entity
@Table(name = "parqueoscambio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parqueoscambio.findAll", query = "SELECT p FROM Parqueoscambio p")
    , @NamedQuery(name = "Parqueoscambio.findById", query = "SELECT p FROM Parqueoscambio p WHERE p.id = :id")
    , @NamedQuery(name = "Parqueoscambio.findByIdDue\u00f1o", query = "SELECT p FROM Parqueoscambio p WHERE p.idDue\u00f1o = :idDue\u00f1o")
    , @NamedQuery(name = "Parqueoscambio.findByIdParqueo", query = "SELECT p FROM Parqueoscambio p WHERE p.idParqueo = :idParqueo")
    , @NamedQuery(name = "Parqueoscambio.findByEstado", query = "SELECT p FROM Parqueoscambio p WHERE p.estado = :estado")})
public class Parqueoscambio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "idDue\u00f1o")
    private Integer idDueño;
    @Column(name = "idParqueo")
    private Integer idParqueo;
    @Column(name = "estado")
    private Boolean estado;

    public Parqueoscambio() {
    }

    public Parqueoscambio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdDueño() {
        return idDueño;
    }

    public void setIdDueño(Integer idDueño) {
        this.idDueño = idDueño;
    }

    public Integer getIdParqueo() {
        return idParqueo;
    }

    public void setIdParqueo(Integer idParqueo) {
        this.idParqueo = idParqueo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
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
        if (!(object instanceof Parqueoscambio)) {
            return false;
        }
        Parqueoscambio other = (Parqueoscambio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Parqueoscambio[ id=" + id + " ]";
    }
    
}
