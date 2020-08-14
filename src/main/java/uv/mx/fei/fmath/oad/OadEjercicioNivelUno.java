package uv.mx.fei.fmath.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import uv.mx.fei.fmath.entidades.Ejercicionivel1;

public interface OadEjercicioNivelUno extends JpaRepository<Ejercicionivel1, String> {

    public List<Ejercicionivel1> findByTipoOrderByIdejercicionivel1(String tipo);
}
