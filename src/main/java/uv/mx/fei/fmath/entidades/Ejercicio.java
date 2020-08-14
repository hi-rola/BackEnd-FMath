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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jose-
 */
@Entity
@Table(name = "ejercicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ejercicio.findAll", query = "SELECT e FROM Ejercicio e"),
    @NamedQuery(name = "Ejercicio.findByIdejercicio", query = "SELECT e FROM Ejercicio e WHERE e.idejercicio = :idejercicio"),
    @NamedQuery(name = "Ejercicio.findByNumeropregunta", query = "SELECT e FROM Ejercicio e WHERE e.numeropregunta = :numeropregunta"),
    @NamedQuery(name = "Ejercicio.findByPregunta", query = "SELECT e FROM Ejercicio e WHERE e.pregunta = :pregunta"),
    @NamedQuery(name = "Ejercicio.findByConjuntoa", query = "SELECT e FROM Ejercicio e WHERE e.conjuntoa = :conjuntoa"),
    @NamedQuery(name = "Ejercicio.findByConjuntob", query = "SELECT e FROM Ejercicio e WHERE e.conjuntob = :conjuntob"),
    @NamedQuery(name = "Ejercicio.findByRespuestaa", query = "SELECT e FROM Ejercicio e WHERE e.respuestaa = :respuestaa"),
    @NamedQuery(name = "Ejercicio.findByRespuestab", query = "SELECT e FROM Ejercicio e WHERE e.respuestab = :respuestab"),
    @NamedQuery(name = "Ejercicio.findByRespuestac", query = "SELECT e FROM Ejercicio e WHERE e.respuestac = :respuestac"),
    @NamedQuery(name = "Ejercicio.findByRespuestad", query = "SELECT e FROM Ejercicio e WHERE e.respuestad = :respuestad"),
    @NamedQuery(name = "Ejercicio.findByRespuestacorrecta", query = "SELECT e FROM Ejercicio e WHERE e.respuestacorrecta = :respuestacorrecta"),
    @NamedQuery(name = "Ejercicio.findBySolucionrespuestaa", query = "SELECT e FROM Ejercicio e WHERE e.solucionrespuestaa = :solucionrespuestaa"),
    @NamedQuery(name = "Ejercicio.findBySolucionrespuestab", query = "SELECT e FROM Ejercicio e WHERE e.solucionrespuestab = :solucionrespuestab"),
    @NamedQuery(name = "Ejercicio.findBySolucionrespuestac", query = "SELECT e FROM Ejercicio e WHERE e.solucionrespuestac = :solucionrespuestac"),
    @NamedQuery(name = "Ejercicio.findBySolucionrespuestad", query = "SELECT e FROM Ejercicio e WHERE e.solucionrespuestad = :solucionrespuestad"),
    @NamedQuery(name = "Ejercicio.findByTipo", query = "SELECT e FROM Ejercicio e WHERE e.tipo = :tipo")})
public class Ejercicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idejercicio")
    private Integer idejercicio;
    @Basic(optional = false)
    @Column(name = "numeropregunta")
    private String numeropregunta;
    @Basic(optional = false)
    @Column(name = "pregunta")
    private String pregunta;
    @Basic(optional = false)
    @Column(name = "conjuntoa")
    private String conjuntoa;
    @Basic(optional = false)
    @Column(name = "conjuntob")
    private String conjuntob;
    @Basic(optional = false)
    @Column(name = "respuestaa")
    private String respuestaa;
    @Basic(optional = false)
    @Column(name = "respuestab")
    private String respuestab;
    @Basic(optional = false)
    @Column(name = "respuestac")
    private String respuestac;
    @Basic(optional = false)
    @Column(name = "respuestad")
    private String respuestad;
    @Basic(optional = false)
    @Column(name = "respuestacorrecta")
    private String respuestacorrecta;
    @Column(name = "solucionrespuestaa")
    private String solucionrespuestaa;
    @Column(name = "solucionrespuestab")
    private String solucionrespuestab;
    @Column(name = "solucionrespuestac")
    private String solucionrespuestac;
    @Column(name = "solucionrespuestad")
    private String solucionrespuestad;
    @Column(name = "tipo")
    private String tipo;

    public Ejercicio() {
    }

    public Ejercicio(Integer idejercicio) {
        this.idejercicio = idejercicio;
    }

    public Ejercicio(Integer idejercicio, String numeropregunta, String pregunta, String conjuntoa, String conjuntob, String respuestaa, String respuestab, String respuestac, String respuestad, String respuestacorrecta) {
        this.idejercicio = idejercicio;
        this.numeropregunta = numeropregunta;
        this.pregunta = pregunta;
        this.conjuntoa = conjuntoa;
        this.conjuntob = conjuntob;
        this.respuestaa = respuestaa;
        this.respuestab = respuestab;
        this.respuestac = respuestac;
        this.respuestad = respuestad;
        this.respuestacorrecta = respuestacorrecta;
    }

    public Integer getIdejercicio() {
        return idejercicio;
    }

    public void setIdejercicio(Integer idejercicio) {
        this.idejercicio = idejercicio;
    }

    public String getNumeropregunta() {
        return numeropregunta;
    }

    public void setNumeropregunta(String numeropregunta) {
        this.numeropregunta = numeropregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getConjuntoa() {
        return conjuntoa;
    }

    public void setConjuntoa(String conjuntoa) {
        this.conjuntoa = conjuntoa;
    }

    public String getConjuntob() {
        return conjuntob;
    }

    public void setConjuntob(String conjuntob) {
        this.conjuntob = conjuntob;
    }

    public String getRespuestaa() {
        return respuestaa;
    }

    public void setRespuestaa(String respuestaa) {
        this.respuestaa = respuestaa;
    }

    public String getRespuestab() {
        return respuestab;
    }

    public void setRespuestab(String respuestab) {
        this.respuestab = respuestab;
    }

    public String getRespuestac() {
        return respuestac;
    }

    public void setRespuestac(String respuestac) {
        this.respuestac = respuestac;
    }

    public String getRespuestad() {
        return respuestad;
    }

    public void setRespuestad(String respuestad) {
        this.respuestad = respuestad;
    }

    public String getRespuestacorrecta() {
        return respuestacorrecta;
    }

    public void setRespuestacorrecta(String respuestacorrecta) {
        this.respuestacorrecta = respuestacorrecta;
    }

    public String getSolucionrespuestaa() {
        return solucionrespuestaa;
    }

    public void setSolucionrespuestaa(String solucionrespuestaa) {
        this.solucionrespuestaa = solucionrespuestaa;
    }

    public String getSolucionrespuestab() {
        return solucionrespuestab;
    }

    public void setSolucionrespuestab(String solucionrespuestab) {
        this.solucionrespuestab = solucionrespuestab;
    }

    public String getSolucionrespuestac() {
        return solucionrespuestac;
    }

    public void setSolucionrespuestac(String solucionrespuestac) {
        this.solucionrespuestac = solucionrespuestac;
    }

    public String getSolucionrespuestad() {
        return solucionrespuestad;
    }

    public void setSolucionrespuestad(String solucionrespuestad) {
        this.solucionrespuestad = solucionrespuestad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idejercicio != null ? idejercicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ejercicio)) {
            return false;
        }
        Ejercicio other = (Ejercicio) object;
        if ((this.idejercicio == null && other.idejercicio != null) || (this.idejercicio != null && !this.idejercicio.equals(other.idejercicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uv.mx.fei.fmath.entidades.Ejercicio[ idejercicio=" + idejercicio + " ]";
    }
    
}
