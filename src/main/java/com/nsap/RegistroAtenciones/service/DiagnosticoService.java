package com.nsap.RegistroAtenciones.service;

import com.nsap.RegistroAtenciones.model.DiagnosticoModel;
import com.nsap.RegistroAtenciones.repository.DiagnosticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiagnosticoService {
    @Autowired//inyeccion de dependencia de la interfaz JpaRepository
    private DiagnosticoRepository diagnosticoRepository;

    //obtener todos los diagnosticos
    public List<DiagnosticoModel> obtenerDiagnosticos() {
        return diagnosticoRepository.findAll();
    }

    //obtener diagnostico por id
    public Optional<DiagnosticoModel> obtenerDiagnosticoPorId(Long id) {
        return diagnosticoRepository.findById(id);
    }

    //crear nuevo diagnostico medico
    public DiagnosticoModel guardarDiagnostico(DiagnosticoModel diagnostico) {
        return diagnosticoRepository.save(diagnostico);
    }

    //actualizar un diagnostico existente
    public DiagnosticoModel actualizarDiagnostico(Long id, DiagnosticoModel diagnosticoDetalles) {
        DiagnosticoModel diagnostico = diagnosticoRepository.findById(id).orElseThrow();
        diagnostico.setDescripcion(diagnosticoDetalles.getDescripcion());
        return diagnosticoRepository.save(diagnostico);
    }

    //eliminar diagnostico medico
    public void eliminarDiagnostico(Long id) {
        diagnosticoRepository.deleteById(id);
    }
}
