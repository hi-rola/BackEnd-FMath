package uv.mx.fei.fmath.clases;

public class TokenEstudiante {

    private String token;
    private String rol;
    private String matricula;

    public TokenEstudiante(String token, String rol, String matricula) {
        this.token = token;
        this.rol = rol;
        this.matricula = matricula;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}