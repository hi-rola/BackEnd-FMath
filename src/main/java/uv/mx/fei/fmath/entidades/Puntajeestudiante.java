/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.mx.fei.fmath.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jose-
 */
@Entity
@Table(name = "puntajeestudiante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puntajeestudiante.findAll", query = "SELECT p FROM Puntajeestudiante p"),
    @NamedQuery(name = "Puntajeestudiante.findByIdpuntaje", query = "SELECT p FROM Puntajeestudiante p WHERE p.idpuntaje = :idpuntaje"),
    @NamedQuery(name = "Puntajeestudiante.findByPuntaje", query = "SELECT p FROM Puntajeestudiante p WHERE p.puntaje = :puntaje"),
    @NamedQuery(name = "Puntajeestudiante.findByTipoejercicio", query = "SELECT p FROM Puntajeestudiante p WHERE p.tipoejercicio = :tipoejercicio")})
public class Puntajeestudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpuntaje")
    private Integer idpuntaje;
    @Column(name = "puntaje")
    private Integer puntaje;
    @Column(name = "tipoejercicio")
    private String tipoejercicio;
    @JoinColumn(name = "matricula", referencedColumnName = "matricula")
    @ManyToOne(optional = false)
    private Estudiante matricula;

    public Puntajeestudiante() {
    }

    public Puntajeestudiante(Integer idpuntaje) {
        this.idpuntaje = idpuntaje;
    }

    public Integer getIdpuntaje() {
        return idpuntaje;
    }

    public void setIdpuntaje(Integer idpuntaje) {
        this.idpuntaje = idpuntaje;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public String getTipoejercicio() {
        return tipoejercicio;
    }

    public void setTipoejercicio(String tipoejercicio) {
        this.tipoejercicio = tipoejercicio;
    }

    public Estudiante getMatricula() {
        return matricula;
    }

    public void setMatricula(Estudiante matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpuntaje != null ? idpuntaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puntajeestudiante)) {
            return false;
        }
        Puntajeestudiante other = (Puntajeestudiante) object;
        if ((this.idpuntaje == null && other.idpuntaje != null) || (this.idpuntaje != null && !this.idpuntaje.equals(other.idpuntaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uv.mx.fei.fmath.entidades.Puntajeestudiante[ idpuntaje=" + idpuntaje + " ]";
    }
    
}
