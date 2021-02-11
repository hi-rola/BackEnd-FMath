/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.mx.fei.fmath.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jose-
 */
@Entity
@Table(name = "academico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Academico.findAll", query = "SELECT a FROM Academico a"),
    @NamedQuery(name = "Academico.findByNumeropersonal", query = "SELECT a FROM Academico a WHERE a.numeropersonal = :numeropersonal"),
    @NamedQuery(name = "Academico.findByUsuario", query = "SELECT a FROM Academico a WHERE a.usuario = :usuario"),
    @NamedQuery(name = "Academico.findByNombrecompleto", query = "SELECT a FROM Academico a WHERE a.nombrecompleto = :nombrecompleto"),
    @NamedQuery(name = "Academico.findByCorreoinstitucional", query = "SELECT a FROM Academico a WHERE a.correoinstitucional = :correoinstitucional"),
    @NamedQuery(name = "Academico.findByPeriodoescolar", query = "SELECT a FROM Academico a WHERE a.periodoescolar = :periodoescolar"),
    @NamedQuery(name = "Academico.findByContrasena", query = "SELECT a FROM Academico a WHERE a.contrasena = :contrasena"),
    @NamedQuery(name = "Academico.findByEstatus", query = "SELECT a FROM Academico a WHERE a.estatus = :estatus"),
    @NamedQuery(name = "Academico.findByRol", query = "SELECT a FROM Academico a WHERE a.rol = :rol"),
    @NamedQuery(name = "Academico.findByEstatus2", query = "SELECT a FROM Academico a WHERE a.estatus2 = :estatus2")})
public class Academico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numeropersonal")
    private Integer numeropersonal;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "nombrecompleto")
    private String nombrecompleto;
    @Basic(optional = false)
    @Column(name = "correoinstitucional")
    private String correoinstitucional;
    @Basic(optional = false)
    @Column(name = "periodoescolar")
    private String periodoescolar;
    @Basic(optional = false)
    @Column(name = "contrasena")
    private String contrasena;
    @Basic(optional = false)
    @Column(name = "estatus")
    private String estatus;
    @Basic(optional = false)
    @Column(name = "rol")
    private String rol;
    @Column(name = "estatus2")
    private Boolean estatus2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeropersonal")
    private Collection<Estudiante> estudianteCollection;

    public Academico() {
    }

    public Academico(Integer numeropersonal) {
        this.numeropersonal = numeropersonal;
    }

    public Academico(Integer numeropersonal, String usuario, String nombrecompleto, String correoinstitucional, String periodoescolar, String contrasena, String estatus, String rol) {
        this.numeropersonal = numeropersonal;
        this.usuario = usuario;
        this.nombrecompleto = nombrecompleto;
        this.correoinstitucional = correoinstitucional;
        this.periodoescolar = periodoescolar;
        this.contrasena = contrasena;
        this.estatus = estatus;
        this.rol = rol;
    }

    public Integer getNumeropersonal() {
        return numeropersonal;
    }

    public void setNumeropersonal(Integer numeropersonal) {
        this.numeropersonal = numeropersonal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getCorreoinstitucional() {
        return correoinstitucional;
    }

    public void setCorreoinstitucional(String correoinstitucional) {
        this.correoinstitucional = correoinstitucional;
    }

    public String getPeriodoescolar() {
        return periodoescolar;
    }

    public void setPeriodoescolar(String periodoescolar) {
        this.periodoescolar = periodoescolar;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean getEstatus2() {
        return estatus2;
    }

    public void setEstatus2(Boolean estatus2) {
        this.estatus2 = estatus2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeropersonal != null ? numeropersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Academico)) {
            return false;
        }
        Academico other = (Academico) object;
        if ((this.numeropersonal == null && other.numeropersonal != null) || (this.numeropersonal != null && !this.numeropersonal.equals(other.numeropersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uv.mx.fei.fmath.entidades.Academico[ numeropersonal=" + numeropersonal + " ]";
    }
    
}
