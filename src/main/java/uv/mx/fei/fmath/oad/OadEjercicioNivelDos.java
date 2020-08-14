package uv.mx.fei.fmath.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import uv.mx.fei.fmath.entidades.Ejercicionivel2;

public interface OadEjercicioNivelDos extends JpaRepository<Ejercicionivel2, String> {

    public List<Ejercicionivel2> findByTipoOrderByIdejercicionivel2(String tipo);
}
