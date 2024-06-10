package com.nsap.RegistroAtenciones.service;

import com.nsap.RegistroAtenciones.model.MedicoModel;
import com.nsap.RegistroAtenciones.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {
    @Autowired//inyeccion de dependencias de la clase MedicoRepository
    private MedicoRepository medicoRepository;

    //obtener todos los medicos
    public List<MedicoModel> obtenerMedicos() {
        return medicoRepository.findAll();
    }
    //obtener medico por id
    public Optional<MedicoModel> obtenerMedicoPorId(Long id) {
        return medicoRepository.findById(id);
    }

    //crear nuevo medico
    public MedicoModel crearMedico(MedicoModel medicoModel) {
        return medicoRepository.save(medicoModel);
    }

    //actualizar un medico existente
    public MedicoModel actualizarMedico(Long id, MedicoModel medicoModelDetails) {
        MedicoModel medicoModel =  medicoRepository.findById(id).orElseThrow();
        medicoModel.setNombreMedico(medicoModelDetails.getNombreMedico());
        medicoModel.setApellidoMedico(medicoModelDetails.getApellidoMedico());
        return medicoRepository.save(medicoModel);
    }

    public void eliminarMedico(Long id) {
        medicoRepository.deleteById(id);
    }
}
