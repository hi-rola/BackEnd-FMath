package uv.mx.fei.fmath.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uv.mx.fei.fmath.clases.EstudianteNumeropersonal;
import uv.mx.fei.fmath.entidades.Academico;
import uv.mx.fei.fmath.entidades.Estudiante;
import uv.mx.fei.fmath.oad.OadAcademico;
import uv.mx.fei.fmath.oad.OadEstudiante;

@RestController
@RequestMapping("FMath")
public class Principal {

    @Autowired
    OadEstudiante oadEstudiante;

    @Autowired
    OadAcademico oadAcademico;

    @GetMapping("/estudiantes")
    public List<Estudiante> todosEstudiantes() {
        return oadEstudiante.findAllByOrderByNombrecompleto();
    }

    @GetMapping("/estudiantes/{matricula}")
    public Estudiante EstudiantePorMatricula(@PathVariable String matricula) {
        return oadEstudiante.findByMatricula(matricula);
    }

    @GetMapping("/academicos/{numeropersonal}")
    public Academico AcademicosPorMatricula(@PathVariable String numeropersonal) {
        return oadAcademico.findByNumeropersonal(Integer.parseInt(numeropersonal));
    }

    @PostMapping("/estudiantes")
    public Estudiante registarNuevoEstudiante(@RequestBody EstudianteNumeropersonal estudent) {
        Estudiante estudiante = estudent.getEstudiante();
        String numeropersonal = estudent.getNumeropersonal();
        Academico ac = oadAcademico.findByNumeropersonal(Integer.parseInt(numeropersonal));
        String matricula = estudiante.getMatricula();
        estudiante.setNumeropersonal(ac);
        if (validarExisteEstudiante(matricula) != true) {
            return oadEstudiante.save(estudiante);
        }
        return null;
    }

    @PutMapping("/estudiantes/{matricula}")
    public Estudiante actualizarEstudiante(@RequestBody Estudiante actualizarEstudiante,
            @PathVariable String matricula) {
        Estudiante estudiante = oadEstudiante.findByMatricula(matricula);
        if (estudiante != null) {
            estudiante.setMatricula(actualizarEstudiante.getMatricula());
            estudiante.setNombrecompleto(actualizarEstudiante.getNombrecompleto());
            estudiante.setCorreoinstitucional(actualizarEstudiante.getCorreoinstitucional());
            estudiante.setContrasena(actualizarEstudiante.getContrasena());
            estudiante.setProgramaeducativo(actualizarEstudiante.getProgramaeducativo());
            estudiante.setSeccion(actualizarEstudiante.getSeccion());
            estudiante.setBloque(actualizarEstudiante.getBloque());
            return oadEstudiante.save(estudiante);
        }
        return null;
    }

    @DeleteMapping("/estudiantes/{matricula}")
    public boolean eliminarEstudiante(@PathVariable String matricula) {
        if (validarEstudiante(matricula)) {
            oadEstudiante.deleteById(matricula);
            return true;
        }
        return false;
    }

    private boolean validarExisteEstudiante(String matricula) {
        List<Estudiante> estudiantes = oadEstudiante.findByMatriculaOrderByMatricula(matricula);
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getMatricula().equals(matricula));
            return true;
        }
        return false;
    }

    private boolean validarEstudiante(String matricula) {
        Estudiante estudiante = oadEstudiante.findByMatricula(matricula);
        return estudiante.getMatricula().equals(matricula);
    }

}
