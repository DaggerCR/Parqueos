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
@Table(name = "valletpedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Valletpedidos.findAll", query = "SELECT v FROM Valletpedidos v")
    , @NamedQuery(name = "Valletpedidos.findById", query = "SELECT v FROM Valletpedidos v WHERE v.id = :id")
    , @NamedQuery(name = "Valletpedidos.findByIdCliente", query = "SELECT v FROM Valletpedidos v WHERE v.idCliente = :idCliente")
    , @NamedQuery(name = "Valletpedidos.findByIdVehiculo", query = "SELECT v FROM Valletpedidos v WHERE v.idVehiculo = :idVehiculo")
    , @NamedQuery(name = "Valletpedidos.findByLugarEntrega", query = "SELECT v FROM Valletpedidos v WHERE v.lugarEntrega = :lugarEntrega")
    , @NamedQuery(name = "Valletpedidos.findByTiempoEntrega", query = "SELECT v FROM Valletpedidos v WHERE v.tiempoEntrega = :tiempoEntrega")})
public class Valletpedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "idCliente")
    private Integer idCliente;
    @Column(name = "idVehiculo")
    private Integer idVehiculo;
    @Column(name = "lugarEntrega")
    private Short lugarEntrega;
    @Column(name = "tiempoEntrega")
    private Short tiempoEntrega;

    public Valletpedidos() {
    }
    
    public Valletpedidos(int id, int idCliente, int idVehiculo, short lugarEntrega, short tiempoEntrega)
    {
        //this.id = id;
        this.idCliente = idCliente;
        this.idVehiculo = idVehiculo;
        this.lugarEntrega = lugarEntrega;
        this.tiempoEntrega = tiempoEntrega;
    }

    public Valletpedidos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Short getLugarEntrega() {
        return lugarEntrega;
    }

    public void setLugarEntrega(Short lugarEntrega) {
        this.lugarEntrega = lugarEntrega;
    }

    public Short getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(Short tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
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
        if (!(object instanceof Valletpedidos)) {
            return false;
        }
        Valletpedidos other = (Valletpedidos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Valletpedidos[ id=" + id + " ]";
    }
    
}
