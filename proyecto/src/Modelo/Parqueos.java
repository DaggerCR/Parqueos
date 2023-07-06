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
@Table(name = "parqueos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parqueos.findAll", query = "SELECT p FROM Parqueos p")
    , @NamedQuery(name = "Parqueos.findById", query = "SELECT p FROM Parqueos p WHERE p.id = :id")
    , @NamedQuery(name = "Parqueos.findByIdDuenno", query = "SELECT p FROM Parqueos p WHERE p.idDuenno = :idDuenno")
    , @NamedQuery(name = "Parqueos.findByZona", query = "SELECT p FROM Parqueos p WHERE p.zona = :zona")
    , @NamedQuery(name = "Parqueos.findByNumero", query = "SELECT p FROM Parqueos p WHERE p.numero = :numero")
    , @NamedQuery(name = "Parqueos.findByTipo", query = "SELECT p FROM Parqueos p WHERE p.tipo = :tipo")
    , @NamedQuery(name = "Parqueos.findByPrecio", query = "SELECT p FROM Parqueos p WHERE p.precio = :precio")
    , @NamedQuery(name = "Parqueos.findByDisponible", query = "SELECT p FROM Parqueos p WHERE p.disponible = :disponible")})
public class Parqueos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "idDuenno")
    private Integer idDuenno;
    @Column(name = "Zona")
    private String zona;
    @Column(name = "Numero")
    private Short numero;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "Precio")
    private Integer precio;
    @Column(name = "disponible")
    private Boolean disponible;

    public Parqueos() {
    }

    public Parqueos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdDuenno() {
        return idDuenno;
    }

    public void setIdDuenno(Integer idDuenno) {
        this.idDuenno = idDuenno;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Short getNumero() {
        return numero;
    }

    public void setNumero(Short numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
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
        if (!(object instanceof Parqueos)) {
            return false;
        }
        Parqueos other = (Parqueos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Parqueos[ id=" + id + " ]";
    }
    
}
