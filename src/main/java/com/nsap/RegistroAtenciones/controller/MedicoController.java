package com.nsap.RegistroAtenciones.controller;

import com.nsap.RegistroAtenciones.model.MedicoModel;
import com.nsap.RegistroAtenciones.model.PacienteModel;
import com.nsap.RegistroAtenciones.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoService medicoService;
    
    //obtener todos los medicos
    @GetMapping
    public List<MedicoModel> obtenerTodosLosMedicos(){
        return medicoService.obtenerMedicos();
    }

    //metodo para obtener un medico por su id
    @GetMapping("/{id}")
    public Optional<MedicoModel> obtenerMedicoPorId(@PathVariable Long id) {
        //llama al servicio para obtener el medico por su id
        return medicoService.obtenerMedicoPorId(id);
    }

    //metodo para crear un nuevo medico
    @PostMapping
    public MedicoModel crearMedico(@RequestBody MedicoModel medicoModel) {
        //llamar al servicio para crear un nuevo paciente
        return medicoService.crearMedico(medicoModel);
    }


    //metodo para actualizar un medico existente
    @PutMapping("/{rut}")
    public MedicoModel actualizarMedico(@PathVariable Long id, @RequestBody MedicoModel detallesMedico) {
        //se llama al servicio para actualiar un paciente con rut especifico
        return medicoService.actualizarMedico(id, detallesMedico);
    }

    //metodo para eliminar un medico
    @DeleteMapping("/{id}")
    public void eliminarMedico(@PathVariable Long id) {
        //se llama al servicio para eliminar un paciente por su rut
        medicoService.eliminarMedico(id);
    }


}
