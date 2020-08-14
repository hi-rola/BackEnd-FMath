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
@Table(name = "ejerciciointerseccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ejerciciointerseccion.findAll", query = "SELECT e FROM Ejerciciointerseccion e"),
    @NamedQuery(name = "Ejerciciointerseccion.findByIdejerciciointerseccion", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.idejerciciointerseccion = :idejerciciointerseccion"),
    @NamedQuery(name = "Ejerciciointerseccion.findByNumeropregunta", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.numeropregunta = :numeropregunta"),
    @NamedQuery(name = "Ejerciciointerseccion.findByPregunta", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.pregunta = :pregunta"),
    @NamedQuery(name = "Ejerciciointerseccion.findByConjuntoa", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.conjuntoa = :conjuntoa"),
    @NamedQuery(name = "Ejerciciointerseccion.findByConjuntob", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.conjuntob = :conjuntob"),
    @NamedQuery(name = "Ejerciciointerseccion.findByRespuestaa", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.respuestaa = :respuestaa"),
    @NamedQuery(name = "Ejerciciointerseccion.findByRespuestab", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.respuestab = :respuestab"),
    @NamedQuery(name = "Ejerciciointerseccion.findByRespuestac", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.respuestac = :respuestac"),
    @NamedQuery(name = "Ejerciciointerseccion.findByRespuestad", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.respuestad = :respuestad"),
    @NamedQuery(name = "Ejerciciointerseccion.findByRespuestacorrecta", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.respuestacorrecta = :respuestacorrecta"),
    @NamedQuery(name = "Ejerciciointerseccion.findBySolucionrespuestaa", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.solucionrespuestaa = :solucionrespuestaa"),
    @NamedQuery(name = "Ejerciciointerseccion.findBySolucionrespuestab", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.solucionrespuestab = :solucionrespuestab"),
    @NamedQuery(name = "Ejerciciointerseccion.findBySolucionrespuestac", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.solucionrespuestac = :solucionrespuestac"),
    @NamedQuery(name = "Ejerciciointerseccion.findBySolucionrespuestad", query = "SELECT e FROM Ejerciciointerseccion e WHERE e.solucionrespuestad = :solucionrespuestad")})
public class Ejerciciointerseccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idejerciciointerseccion")
    private Integer idejerciciointerseccion;
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

    public Ejerciciointerseccion() {
    }

    public Ejerciciointerseccion(Integer idejerciciointerseccion) {
        this.idejerciciointerseccion = idejerciciointerseccion;
    }

    public Ejerciciointerseccion(Integer idejerciciointerseccion, String numeropregunta, String pregunta, String conjuntoa, String conjuntob, String respuestaa, String respuestab, String respuestac, String respuestad, String respuestacorrecta) {
        this.idejerciciointerseccion = idejerciciointerseccion;
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

    public Integer getIdejerciciointerseccion() {
        return idejerciciointerseccion;
    }

    public void setIdejerciciointerseccion(Integer idejerciciointerseccion) {
        this.idejerciciointerseccion = idejerciciointerseccion;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idejerciciointerseccion != null ? idejerciciointerseccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ejerciciointerseccion)) {
            return false;
        }
        Ejerciciointerseccion other = (Ejerciciointerseccion) object;
        if ((this.idejerciciointerseccion == null && other.idejerciciointerseccion != null) || (this.idejerciciointerseccion != null && !this.idejerciciointerseccion.equals(other.idejerciciointerseccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uv.mx.fei.fmath.entidades.Ejerciciointerseccion[ idejerciciointerseccion=" + idejerciciointerseccion + " ]";
    }
    
}
