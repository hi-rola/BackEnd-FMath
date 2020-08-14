package uv.mx.fei.fmath.clases;

public class PuntajeEjercicio {

    private int puntos;
    private String tipoejercicio;
    private String matricula;

    public PuntajeEjercicio(int puntos, String tipoejercicio, String matricula) {
        this.puntos = puntos;
        this.tipoejercicio = tipoejercicio;
        this.matricula = matricula;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getTipoejercicio() {
        return tipoejercicio;
    }

    public void setTipoejercicio(String tipoejercicio) {
        this.tipoejercicio = tipoejercicio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
