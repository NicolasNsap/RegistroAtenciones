package com.nsap.RegistroAtenciones.service;

import com.nsap.RegistroAtenciones.model.EspeMedicaModel;
import com.nsap.RegistroAtenciones.repository.EspeMedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspMedicaService {
    @Autowired
    private EspeMedicaRepository espeMedicaRepository;

    //obtener toddas las especialidades medicas
    public List<EspeMedicaModel> obtenerEspeMedicas(){
        return espeMedicaRepository.findAll();
    }

    //obtener especialidades medicas por id
    public Optional<EspeMedicaModel> obtenerEspeMedicaPorId(Long id){
        return espeMedicaRepository.findById(id);
    }

    //crear un anueva especialidad medica
    public EspeMedicaModel crerarEspMedica(EspeMedicaModel espeMedicaModel){
        return espeMedicaRepository.save(espeMedicaModel);
    }

    //actualizar una especialidad medica
    public EspeMedicaModel actualizarEspMedica(Long id, EspeMedicaModel espeMedicaDetails){
        EspeMedicaModel especialidad =espeMedicaRepository.findById(id).orElseThrow();
        especialidad.setNombre(espeMedicaDetails.getNombre());
        return espeMedicaRepository.save(especialidad);
    }

    //eliminar una especialidad medica
    public void eliminarEspMedica(Long id){
        espeMedicaRepository.deleteById(id);
    }

}
