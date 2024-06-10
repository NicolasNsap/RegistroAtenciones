package com.nsap.RegistroAtenciones.controller;

import com.nsap.RegistroAtenciones.model.EspeMedicaModel;
import com.nsap.RegistroAtenciones.service.EspMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/especialidades")
public class EspMedicaController {
    @Autowired
    private EspMedicaService espMedicaService;

    @GetMapping
    public List<EspeMedicaModel> obtenerTodasLasEspecialidades(){
        return espMedicaService.obtenerEspeMedicas();
    }

    //metodo para obtener un medico por su id
    @GetMapping("/{id}")
    public Optional<EspeMedicaModel> obtenerEspecialidadPorId(@PathVariable Long id) {
        //llama al servicio para obtener el medico por su id
        return espMedicaService.obtenerEspeMedicaPorId(id);
    }

    //metodo para crear un nuevo medico
    @PostMapping
    public EspeMedicaModel crearEspecialidadMedica(@RequestBody EspeMedicaModel espMedicaModel) {
        //llamar al servicio para crear un nuevo paciente
        return espMedicaService.crerarEspMedica(espMedicaModel);
    }


    //metodo para actualizar un medico existente
    @PutMapping("/{id}")
    public EspeMedicaModel actualizarEspMedica(@PathVariable Long id, @RequestBody EspeMedicaModel detalleEspMedica) {
        //se llama al servicio para actualiar un paciente con rut especifico
        return espMedicaService.actualizarEspMedica(id, detalleEspMedica);
    }

    //metodo para eliminar un medico
    @DeleteMapping("/{id}")
    public void eliminarEspMedica(@PathVariable Long id) {
        //se llama al servicio para eliminar un paciente por su rut
        espMedicaService.eliminarEspMedica(id);
    }

}
