package com.nsap.RegistroAtenciones.controller;

import com.nsap.RegistroAtenciones.model.PacienteModel;
import com.nsap.RegistroAtenciones.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired//inyeccion de dependencia de la clase paciente service
    private PacienteService pacienteService;

    //metodo para obtener todo los pacientes
    @GetMapping
    public List<PacienteModel> obtenerTodosLosPacientes() {
        //llama al servicio para obterner la lista de todos los pacientes
        return pacienteService.obtenerPacientes();
    }
     //metodo para obtener un paciente por su rut
    @GetMapping("/{rut}")
    public Optional<PacienteModel> obtenerPacientePorId(@PathVariable String rut) {
        //llama al servicio para obtener el paciente por su rut
        return pacienteService.obtenerPacientePorRut(rut);
    }

    //metodo para crear un nuevo paciente
    @PostMapping
    public PacienteModel crearPaciente(@RequestBody PacienteModel paciente) {
        //llamar al servicio para crear un nuevo paciente
        return pacienteService.guardarPaciente(paciente);
    }

    //metodo para actualixar un paciente existente
    @PutMapping("/{rut}")
    public PacienteModel actualizarPaciente(@PathVariable String rut, @RequestBody PacienteModel detallesPaciente) {
        //se llama al servicio para actualiar un paciente con rut especifico
        return pacienteService.actualizarPaciente(rut, detallesPaciente);
    }

    //metodo para eliminar un paciente
    @DeleteMapping("/{rut}")
    public void eliminarPaciente(@PathVariable String rut) {//@PathVariable indica el valor del parametro en la variable
        //se llama al servicio para eliminar un paciente por su rut
        pacienteService.eliminarPaciente(rut);
    }

}