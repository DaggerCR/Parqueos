/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author danie
 */
@Entity
@Table(name = "mecanicopedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mecanicopedidos.findAll", query = "SELECT m FROM Mecanicopedidos m")
    , @NamedQuery(name = "Mecanicopedidos.findById", query = "SELECT m FROM Mecanicopedidos m WHERE m.id = :id")
    , @NamedQuery(name = "Mecanicopedidos.findByIdCliente", query = "SELECT m FROM Mecanicopedidos m WHERE m.idCliente = :idCliente")
    , @NamedQuery(name = "Mecanicopedidos.findByIdVehiculo", query = "SELECT m FROM Mecanicopedidos m WHERE m.idVehiculo = :idVehiculo")
    , @NamedQuery(name = "Mecanicopedidos.findByDescripcion", query = "SELECT m FROM Mecanicopedidos m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "Mecanicopedidos.findByFecha", query = "SELECT m FROM Mecanicopedidos m WHERE m.fecha = :fecha")})
public class Mecanicopedidos implements Serializable {

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
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Mecanicopedidos() {
    }

    public Mecanicopedidos(int id, int idCliente, int idVehiculo, Date fecha, String descripcion)
    {
        //this.id = id;
        this.idCliente = idCliente;
        this.idVehiculo = idVehiculo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        
    }
    
    public Mecanicopedidos(Integer id) {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        if (!(object instanceof Mecanicopedidos)) {
            return false;
        }
        Mecanicopedidos other = (Mecanicopedidos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Mecanicopedidos[ id=" + id + " ]";
    }
    
}
