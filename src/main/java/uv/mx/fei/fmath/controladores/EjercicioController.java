package uv.mx.fei.fmath.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uv.mx.fei.fmath.entidades.Ejercicionivel1;
import uv.mx.fei.fmath.entidades.Ejercicionivel2;
import uv.mx.fei.fmath.oad.OadEjercicioNivelDos;
import uv.mx.fei.fmath.oad.OadEjercicioNivelUno;

@RestController
@RequestMapping("FMath/ejercicio")
public class EjercicioController {

    @Autowired
    OadEjercicioNivelUno oadEjercicioNivel1;

    @Autowired
    OadEjercicioNivelDos oadEjercicioNivel2;

    @GetMapping("ejerciciosNivel1/{tipo}")
    public List<Ejercicionivel1> ejerciciosNivel1PorTipo(@PathVariable String tipo) {
        return oadEjercicioNivel1.findByTipoOrderByIdejercicionivel1(tipo);
    }

    @GetMapping("ejerciciosNivel2/{tipo}")
    public List<Ejercicionivel2> ejerciciosNivel2PorTipo(@PathVariable String tipo) {
        return oadEjercicioNivel2.findByTipoOrderByIdejercicionivel2(tipo);
    }
}