package uv.mx.fei.fmath.clases;

import uv.mx.fei.fmath.entidades.Estudiante;

public class EstudianteNumeropersonal {

    private Estudiante estudiante;
    private String numeropersonal;

    public EstudianteNumeropersonal(Estudiante estudiante, String numeropersonal) {
        this.estudiante = estudiante;
        this.numeropersonal = numeropersonal;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getNumeropersonal() {
        return numeropersonal;
    }

    public void setNumeropersonal(String numeropersonal) {
        this.numeropersonal = numeropersonal;
    }

}
