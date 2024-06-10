package com.nsap.RegistroAtenciones.service;

import com.nsap.RegistroAtenciones.model.IngresoModel;
import com.nsap.RegistroAtenciones.repository.IngresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngresoService {
    @Autowired
    private IngresoRepository ingresoRepository;

    //obtener todos los ingresos
    public List<IngresoModel> obtenerIngresos() {
        return ingresoRepository.findAll();
    }
    //obtener un ingreso por el id
    public Optional<IngresoModel> obtenerIngresoPorId(Long id) {
        return ingresoRepository.findById(id);
    }

    //crear un nuevo ingreso
    public IngresoModel agregarIngreso(IngresoModel ingresoModel) {
        return ingresoRepository.save(ingresoModel);
    }

    //modificar un ingreso
    public IngresoModel actualizarIngreso(Long id, IngresoModel ingresoDetalles) {
        IngresoModel ingresoModel = ingresoRepository.findById(id).orElseThrow();
        ingresoModel.setPaciente(ingresoDetalles.getPaciente());
        ingresoModel.setMedicoModel(ingresoDetalles.getMedicoModel());
        ingresoModel.setEspeMedica(ingresoDetalles.getEspeMedica());
        ingresoModel.setDiagnosticoModels(ingresoDetalles.getDiagnosticoModels());
        ingresoModel.setFechaIngreso(ingresoDetalles.getFechaIngreso());
        ingresoModel.setFechaAlta(ingresoDetalles.getFechaAlta());
        return ingresoRepository.save(ingresoModel);
    }
    //eliminar un ingreso
    public void eliminarIngreso(Long id) {
        ingresoRepository.deleteById(id);
    }
}
