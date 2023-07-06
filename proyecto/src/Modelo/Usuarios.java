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
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findById", query = "SELECT u FROM Usuarios u WHERE u.id = :id")
    , @NamedQuery(name = "Usuarios.findByUsuario", query = "SELECT u FROM Usuarios u WHERE u.usuario = :usuario")
    , @NamedQuery(name = "Usuarios.findByCorreo", query = "SELECT u FROM Usuarios u WHERE u.correo = :correo")
    , @NamedQuery(name = "Usuarios.findByPass", query = "SELECT u FROM Usuarios u WHERE u.pass = :pass")
    , @NamedQuery(name = "Usuarios.findByNumApartamento", query = "SELECT u FROM Usuarios u WHERE u.numApartamento = :numApartamento")
    , @NamedQuery(name = "Usuarios.findByZonaApartamento", query = "SELECT u FROM Usuarios u WHERE u.zonaApartamento = :zonaApartamento")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "correo")
    private String correo;
    @Column(name = "pass")
    private String pass;
    @Column(name = "numApartamento")
    private Short numApartamento;
    @Column(name = "zonaApartamento")
    private String zonaApartamento;

    public Usuarios() {
    }
    
    public Usuarios(int id, String usuario, String correo, String pass, short numApartamento, String zonaApartamento)
    {
        //Constructor principal
        
        //this.id = id;
        this.usuario = usuario;
        this.correo = correo;
        this.pass = pass;
        this.numApartamento = numApartamento;
        this.zonaApartamento = zonaApartamento;
    }

    public Usuarios(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Short getNumApartamento() {
        return numApartamento;
    }

    public void setNumApartamento(Short numApartamento) {
        this.numApartamento = numApartamento;
    }

    public String getZonaApartamento() {
        return zonaApartamento;
    }

    public void setZonaApartamento(String zonaApartamento) {
        this.zonaApartamento = zonaApartamento;
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
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Usuarios[ I=" + id + " ]";
    }
    
}
