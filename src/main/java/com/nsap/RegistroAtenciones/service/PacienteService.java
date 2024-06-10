package com.nsap.RegistroAtenciones.service;

import com.nsap.RegistroAtenciones.model.PacienteModel;
import com.nsap.RegistroAtenciones.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired //inyeccion de dependencias
    private PacienteRepository pacienteRepository;

    //obtener todos los pacientes
    public List<PacienteModel> obtenerPacientes() {
        return pacienteRepository.findAll();
    }

    //obtener paciente por rut
    public Optional<PacienteModel> obtenerPacientePorRut(String rut) {
        return pacienteRepository.findById(rut);
    }

    //crear paciente
    public PacienteModel guardarPaciente(PacienteModel pacienteModel) {
        return pacienteRepository.save(pacienteModel);
    }

    //actualizar un paciente existente
    public PacienteModel actualizarPaciente(String rut, PacienteModel pacienteModelDetails) {
        PacienteModel pacienteModel = pacienteRepository.findById(rut).orElseThrow();
        pacienteModel.setNombrePaciente(pacienteModelDetails.getNombrePaciente());
        pacienteModel.setApellidoPaciente(pacienteModelDetails.getApellidoPaciente());
        return pacienteRepository.save(pacienteModel);
    }

    //eliminar un paciente
    public void eliminarPaciente(String rut) {
        pacienteRepository.deleteById(rut);
    }
}
