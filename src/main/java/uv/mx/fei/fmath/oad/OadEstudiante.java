package uv.mx.fei.fmath.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import uv.mx.fei.fmath.entidades.Academico;
import uv.mx.fei.fmath.entidades.Estudiante;

public interface OadEstudiante extends JpaRepository<Estudiante, String> {

    public List<Estudiante> findAllByOrderByNombrecompleto();

    public Estudiante findByMatricula(String matricula);

    public List<Estudiante> findByNumeropersonalOrderByNombrecompleto(Academico academico);

    public List<Estudiante> findByMatriculaOrderByMatricula(String matricula);
}
