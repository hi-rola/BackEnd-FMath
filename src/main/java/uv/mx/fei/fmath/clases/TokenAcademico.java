package uv.mx.fei.fmath.clases;

public class TokenAcademico {

    private String token;
    private String rol;
    private int numeropersonal;

    public TokenAcademico(String token, String rol, int numeropersonal) {
        this.token = token;
        this.rol = rol;
        this.numeropersonal = numeropersonal;
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

    public int getNumeropersonal() {
        return numeropersonal;
    }

    public void setNumeropersonal(int numeropersonal) {
        this.numeropersonal = numeropersonal;
    }

}
