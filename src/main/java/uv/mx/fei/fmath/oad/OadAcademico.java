package uv.mx.fei.fmath.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import uv.mx.fei.fmath.entidades.Academico;

public interface OadAcademico extends JpaRepository<Academico, String> {

    public List<Academico> findAllByOrderByNombrecompleto();

    public Academico findByUsuario(String usuario);

    public List<Academico> findByUsuarioOrderByNumeropersonal(String usuario);

    public Academico findByNumeropersonal(int numeropersonal);

    public List<Academico> findByNumeropersonalOrderByNumeropersonal(int numeropersonal);
}
