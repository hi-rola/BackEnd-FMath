package uv.mx.fei.fmath.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uv.mx.fei.fmath.entidades.Academico;
import uv.mx.fei.fmath.entidades.Estudiante;
import uv.mx.fei.fmath.oad.OadAcademico;
import uv.mx.fei.fmath.oad.OadEstudiante;

@RestController
@RequestMapping("FMath/academico")
public class AcademicoController {

    @Autowired
    OadAcademico oadAcademico;

    @Autowired
    OadEstudiante oadEstudiante;

    @GetMapping("/estudiantes/{numeropersonal}")
    public List<Estudiante> EstudiantesPorAcademico(@PathVariable String numeropersonal) {
        Academico academico = oadAcademico.findByNumeropersonal(Integer.parseInt(numeropersonal));
        return oadEstudiante.findByNumeropersonalOrderByNombrecompleto(academico);
    }

    @GetMapping("/academicos")
    public List<Academico> todosAcademicos() {
        return oadAcademico.findAllByOrderByNombrecompleto();
    }

    @GetMapping("/academicos/{numeropersonal}")
    public Academico AcademicosPorMatricula(@PathVariable String numeropersonal) {
        return oadAcademico.findByNumeropersonal(Integer.parseInt(numeropersonal));
    }

    @PostMapping("/academicos")
    public Academico registarNuevoAcademico(@RequestBody Academico academico) {
        int numeropersonal = academico.getNumeropersonal();
        String usuario = academico.getUsuario();
        if (validarExisteAcademico(numeropersonal) != true) {
            if (validarUsuarioRepetido(usuario) != true) {
                return oadAcademico.save(academico);
            }
        }
        return null;
    }

    @PutMapping("/academicos/{numeroPersonal}")
    public Academico actualizarAcademico(@RequestBody Academico actualizarAcademico,
            @PathVariable String numeroPersonal) {
        Academico academico = oadAcademico.findByNumeropersonal(Integer.parseInt(numeroPersonal));
        if (academico != null) {
            academico.setNumeropersonal(actualizarAcademico.getNumeropersonal());
            academico.setUsuario(actualizarAcademico.getUsuario());
            academico.setNombrecompleto(actualizarAcademico.getNombrecompleto());
            academico.setCorreoinstitucional(actualizarAcademico.getCorreoinstitucional());
            academico.setPeriodoescolar(actualizarAcademico.getPeriodoescolar());
            academico.setContrasena(actualizarAcademico.getContrasena());
            academico.setEstatus(actualizarAcademico.getEstatus());
            academico.setRol(actualizarAcademico.getRol());
            academico.setEstatus2(actualizarAcademico.getEstatus2());
            return oadAcademico.save(academico);
        }
        return null;

    }

    private boolean validarExisteAcademico(int numeropersonal) {
        List<Academico> listAcademico = oadAcademico.findByNumeropersonalOrderByNumeropersonal(numeropersonal);
        for (int i = 0; i < listAcademico.size(); i++) {
            if (listAcademico.get(i).getNumeropersonal().equals(numeropersonal));
            return true;
        }
        return false;
    }

    private boolean validarUsuarioRepetido(String usuario) {
        List<Academico> listAcademico = oadAcademico.findByUsuarioOrderByNumeropersonal(usuario);
        for (int i = 0; i < listAcademico.size(); i++) {
            if (listAcademico.get(i).getUsuario().equals(usuario)) {
                return true;
            }
        }
        return false;
    }
}
