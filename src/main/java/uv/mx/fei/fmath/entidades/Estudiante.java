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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "estudiante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiante.findAll", query = "SELECT e FROM Estudiante e"),
    @NamedQuery(name = "Estudiante.findByMatricula", query = "SELECT e FROM Estudiante e WHERE e.matricula = :matricula"),
    @NamedQuery(name = "Estudiante.findByNombrecompleto", query = "SELECT e FROM Estudiante e WHERE e.nombrecompleto = :nombrecompleto"),
    @NamedQuery(name = "Estudiante.findByCorreoinstitucional", query = "SELECT e FROM Estudiante e WHERE e.correoinstitucional = :correoinstitucional"),
    @NamedQuery(name = "Estudiante.findByContrasena", query = "SELECT e FROM Estudiante e WHERE e.contrasena = :contrasena"),
    @NamedQuery(name = "Estudiante.findByProgramaeducativo", query = "SELECT e FROM Estudiante e WHERE e.programaeducativo = :programaeducativo"),
    @NamedQuery(name = "Estudiante.findBySeccion", query = "SELECT e FROM Estudiante e WHERE e.seccion = :seccion"),
    @NamedQuery(name = "Estudiante.findByBloque", query = "SELECT e FROM Estudiante e WHERE e.bloque = :bloque"),
    @NamedQuery(name = "Estudiante.findByRol", query = "SELECT e FROM Estudiante e WHERE e.rol = :rol")})
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "matricula")
    private String matricula;
    @Basic(optional = false)
    @Column(name = "nombrecompleto")
    private String nombrecompleto;
    @Basic(optional = false)
    @Column(name = "correoinstitucional")
    private String correoinstitucional;
    @Basic(optional = false)
    @Column(name = "contrasena")
    private String contrasena;
    @Basic(optional = false)
    @Column(name = "programaeducativo")
    private String programaeducativo;
    @Basic(optional = false)
    @Column(name = "seccion")
    private String seccion;
    @Basic(optional = false)
    @Column(name = "bloque")
    private String bloque;
    @Basic(optional = false)
    @Column(name = "rol")
    private String rol;
    @JoinColumn(name = "numeropersonal", referencedColumnName = "numeropersonal")
    @ManyToOne(optional = false)
    private Academico numeropersonal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matricula")
    private Collection<Puntajeestudiante> puntajeestudianteCollection;

    public Estudiante() {
    }

    public Estudiante(String matricula) {
        this.matricula = matricula;
    }

    public Estudiante(String matricula, String nombrecompleto, String correoinstitucional, String contrasena, String programaeducativo, String seccion, String bloque, String rol) {
        this.matricula = matricula;
        this.nombrecompleto = nombrecompleto;
        this.correoinstitucional = correoinstitucional;
        this.contrasena = contrasena;
        this.programaeducativo = programaeducativo;
        this.seccion = seccion;
        this.bloque = bloque;
        this.rol = rol;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getProgramaeducativo() {
        return programaeducativo;
    }

    public void setProgramaeducativo(String programaeducativo) {
        this.programaeducativo = programaeducativo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Academico getNumeropersonal() {
        return numeropersonal;
    }

    public void setNumeropersonal(Academico numeropersonal) {
        this.numeropersonal = numeropersonal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricula != null ? matricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uv.mx.fei.fmath.entidades.Estudiante[ matricula=" + matricula + " ]";
    }
    
}
