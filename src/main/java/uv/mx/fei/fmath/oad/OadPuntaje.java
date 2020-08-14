package uv.mx.fei.fmath.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import uv.mx.fei.fmath.entidades.Estudiante;
import uv.mx.fei.fmath.entidades.Puntajeestudiante;

public interface OadPuntaje extends JpaRepository<Puntajeestudiante, String> {

    public List<Puntajeestudiante> findByMatricula(Estudiante matricula);

    public List<Puntajeestudiante> findByTipoejercicio(String tipoejercicio);

    public Puntajeestudiante findByMatriculaOrderByMatricula(Estudiante matricula);
}
