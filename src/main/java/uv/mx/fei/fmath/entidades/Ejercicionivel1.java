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
@Table(name = "ejercicionivel1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ejercicionivel1.findAll", query = "SELECT e FROM Ejercicionivel1 e"),
    @NamedQuery(name = "Ejercicionivel1.findByIdejercicionivel1", query = "SELECT e FROM Ejercicionivel1 e WHERE e.idejercicionivel1 = :idejercicionivel1"),
    @NamedQuery(name = "Ejercicionivel1.findByNumeropregunta", query = "SELECT e FROM Ejercicionivel1 e WHERE e.numeropregunta = :numeropregunta"),
    @NamedQuery(name = "Ejercicionivel1.findByPregunta", query = "SELECT e FROM Ejercicionivel1 e WHERE e.pregunta = :pregunta"),
    @NamedQuery(name = "Ejercicionivel1.findByConjuntoa", query = "SELECT e FROM Ejercicionivel1 e WHERE e.conjuntoa = :conjuntoa"),
    @NamedQuery(name = "Ejercicionivel1.findByConjuntob", query = "SELECT e FROM Ejercicionivel1 e WHERE e.conjuntob = :conjuntob"),
    @NamedQuery(name = "Ejercicionivel1.findByRespuestaa", query = "SELECT e FROM Ejercicionivel1 e WHERE e.respuestaa = :respuestaa"),
    @NamedQuery(name = "Ejercicionivel1.findByRespuestab", query = "SELECT e FROM Ejercicionivel1 e WHERE e.respuestab = :respuestab"),
    @NamedQuery(name = "Ejercicionivel1.findByRespuestac", query = "SELECT e FROM Ejercicionivel1 e WHERE e.respuestac = :respuestac"),
    @NamedQuery(name = "Ejercicionivel1.findByRespuestad", query = "SELECT e FROM Ejercicionivel1 e WHERE e.respuestad = :respuestad"),
    @NamedQuery(name = "Ejercicionivel1.findByRespuestacorrecta", query = "SELECT e FROM Ejercicionivel1 e WHERE e.respuestacorrecta = :respuestacorrecta"),
    @NamedQuery(name = "Ejercicionivel1.findBySolucionrespuestaa", query = "SELECT e FROM Ejercicionivel1 e WHERE e.solucionrespuestaa = :solucionrespuestaa"),
    @NamedQuery(name = "Ejercicionivel1.findBySolucionrespuestab", query = "SELECT e FROM Ejercicionivel1 e WHERE e.solucionrespuestab = :solucionrespuestab"),
    @NamedQuery(name = "Ejercicionivel1.findBySolucionrespuestac", query = "SELECT e FROM Ejercicionivel1 e WHERE e.solucionrespuestac = :solucionrespuestac"),
    @NamedQuery(name = "Ejercicionivel1.findBySolucionrespuestad", query = "SELECT e FROM Ejercicionivel1 e WHERE e.solucionrespuestad = :solucionrespuestad"),
    @NamedQuery(name = "Ejercicionivel1.findByTipo", query = "SELECT e FROM Ejercicionivel1 e WHERE e.tipo = :tipo")})
public class Ejercicionivel1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idejercicionivel1")
    private Integer idejercicionivel1;
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

    public Ejercicionivel1() {
    }

    public Ejercicionivel1(Integer idejercicionivel1) {
        this.idejercicionivel1 = idejercicionivel1;
    }

    public Ejercicionivel1(Integer idejercicionivel1, String numeropregunta, String pregunta, String conjuntoa, String conjuntob, String respuestaa, String respuestab, String respuestac, String respuestad, String respuestacorrecta) {
        this.idejercicionivel1 = idejercicionivel1;
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

    public Integer getIdejercicionivel1() {
        return idejercicionivel1;
    }

    public void setIdejercicionivel1(Integer idejercicionivel1) {
        this.idejercicionivel1 = idejercicionivel1;
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
        hash += (idejercicionivel1 != null ? idejercicionivel1.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ejercicionivel1)) {
            return false;
        }
        Ejercicionivel1 other = (Ejercicionivel1) object;
        if ((this.idejercicionivel1 == null && other.idejercicionivel1 != null) || (this.idejercicionivel1 != null && !this.idejercicionivel1.equals(other.idejercicionivel1))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uv.mx.fei.fmath.entidades.Ejercicionivel1[ idejercicionivel1=" + idejercicionivel1 + " ]";
    }
    
}
