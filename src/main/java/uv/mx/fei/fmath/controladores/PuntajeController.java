package uv.mx.fei.fmath.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uv.mx.fei.fmath.clases.PuntajeEjercicio;
import uv.mx.fei.fmath.entidades.Estudiante;
import uv.mx.fei.fmath.entidades.Puntajeestudiante;
import uv.mx.fei.fmath.oad.OadEstudiante;
import uv.mx.fei.fmath.oad.OadPuntaje;

@RestController
@RequestMapping("FMath/puntaje")
public class PuntajeController {

    @Autowired
    OadPuntaje oadPuntaje;

    @Autowired
    OadEstudiante oadEstudiante;

    @GetMapping("/puntajes/{matricula}")
    public List<Puntajeestudiante> todosPuntajes(@PathVariable String matricula) {
        Estudiante estudiante = oadEstudiante.findByMatricula(matricula);
        return oadPuntaje.findByMatricula(estudiante);
    }

    @PostMapping("/puntajes")
    public Puntajeestudiante registrarPuntajeEstudiante(@RequestBody PuntajeEjercicio puntajeEjercicio) {
        String matricula = puntajeEjercicio.getMatricula();
        Estudiante estudiante = oadEstudiante.findByMatricula(matricula);
        String tipoEjercicio = puntajeEjercicio.getTipoejercicio();
        if (validarExisteTipoEjercicio(tipoEjercicio, estudiante) != true) {
            Puntajeestudiante puntaje = new Puntajeestudiante();
            puntaje.setIdpuntaje(Integer.MIN_VALUE);
            puntaje.setPuntaje(puntajeEjercicio.getPuntos());
            puntaje.setTipoejercicio(puntajeEjercicio.getTipoejercicio());
            puntaje.setMatricula(estudiante);
            return oadPuntaje.save(puntaje);
        }
        return null;
    }

    private boolean validarExisteTipoEjercicio(String tipoEjercicio, Estudiante estudiante) {
        List<Puntajeestudiante> listPuntajeEstudiante = oadPuntaje.findByTipoejercicio(tipoEjercicio);
        for (int i = 0; i < listPuntajeEstudiante.size(); i++) {
            if (listPuntajeEstudiante.get(i).getTipoejercicio().equals(tipoEjercicio)
                    && listPuntajeEstudiante.get(i).getMatricula().equals(estudiante)) {
                return true;
            }
        }
        return false;
    }
}
