package uv.mx.fei.fmath.seguridad;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uv.mx.fei.fmath.clases.TokenAcademico;
import uv.mx.fei.fmath.clases.TokenEstudiante;
import uv.mx.fei.fmath.entidades.Academico;
import uv.mx.fei.fmath.entidades.Estudiante;
import uv.mx.fei.fmath.oad.OadAcademico;
import uv.mx.fei.fmath.oad.OadEstudiante;

@RestController
@RequestMapping("FMath")
public class Controlador {

    @Autowired
    OadEstudiante oadEstudiante;

    @Autowired
    OadAcademico oadAcademico;

    @PostMapping("/loginEstudiante")
    public TokenEstudiante todoUsuariosEstudiantes(@RequestBody String[] datos) {
        String usuario = datos[0];
        String contrasena = datos[1];
        if (validarEstudiante(usuario, contrasena)) {
            String tokenEstudiante = getJWTToken(usuario);
            Estudiante estudiante = oadEstudiante.findByMatricula(usuario);
            return new TokenEstudiante(tokenEstudiante, estudiante.getRol(), estudiante.getMatricula());
        }
        return new TokenEstudiante("Sin Token", "Sin Rol", "Sin matricula");
    }

    @PostMapping("/loginAcademico")
    public TokenAcademico todoUsuariosAcadmicos(@RequestBody String[] datosac) {
        String usuario = datosac[0];
        String contrasena = datosac[1];
        if (validarAcademico(usuario, contrasena)) {
            String tokenAcademico = getJWTToken(usuario);
            Academico academico = oadAcademico.findByUsuario(usuario);
            return new TokenAcademico(tokenAcademico, academico.getRol(), academico.getNumeropersonal());
        }
        return new TokenAcademico("Sin Token", "Sin Rol", 0);
    }

    private boolean validarEstudiante(String usuario, String contrasena) {
        Estudiante estudiante = oadEstudiante.findByMatricula(usuario);
        if (estudiante != null) {
            if (estudiante.getMatricula().equals(usuario) && estudiante.getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }

    private boolean validarAcademico(String usuario, String contrasena) {
        Academico academico = oadAcademico.findByUsuario(usuario);
        if (academico != null) {
            if (academico.getEstatus().equals("Activo")) {
                if (academico.getUsuario().equals(usuario) && academico.getContrasena().equals(contrasena)) {
                    return true;
                }
            }
        }
        return false;
    }

    private String getJWTToken(String username) { //Para generar el token.
        String secretKey = "asd123dafasfñkjpoijaslkdjfpaosijfañskldjfoiejafsñlksjeiñsajkdljfasodifjasoi213215132151321541asdfawseraef";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
        String token = Jwts
                .builder()
                .setId("FMathJWT")
                .setSubject(username)
                .claim("authorities", grantedAuthorities.stream()
                        .map(GrantedAuthority::getAuthority)
                        .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 960000000))
                .signWith(SignatureAlgorithm.HS512, secretKey.getBytes()).compact();
        return token;
    }

}
