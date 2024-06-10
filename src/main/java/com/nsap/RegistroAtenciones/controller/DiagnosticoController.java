package com.nsap.RegistroAtenciones.controller;

import com.nsap.RegistroAtenciones.model.DiagnosticoModel;
import com.nsap.RegistroAtenciones.service.DiagnosticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/diagnosticos")
public class DiagnosticoController {
    @Autowired
    private DiagnosticoService diagnosticoService;
    //obtener todos los diagnosticos
    @GetMapping
    public List<DiagnosticoModel> obtenerTodosLosDiagnosticos() {
        return diagnosticoService.obtenerDiagnosticos();
    }

    //obtener diagnostico por id
    @GetMapping("/{id}")
    public Optional<DiagnosticoModel> obtenerDiagnosticoPorId(@PathVariable Long id) {
        return diagnosticoService.obtenerDiagnosticoPorId(id);
    }

    //crear diagnostico
    @PostMapping
    public DiagnosticoModel guardarDiagnostico(@RequestBody DiagnosticoModel diagnosticoModels) {
        return diagnosticoService.guardarDiagnostico(diagnosticoModels);
    }
    //actualizar un diagnostico
    @PutMapping("/{id}")
    public DiagnosticoModel actualizarDiagnostico(@PathVariable Long id, @RequestBody DiagnosticoModel diagnosticoDetalles) {
        return diagnosticoService.actualizarDiagnostico(id, diagnosticoDetalles);
    }

    //eliminar un diagnostico
    @DeleteMapping("/{id}")
    public void eliminarDiagnostico(@PathVariable Long id) {
        diagnosticoService.eliminarDiagnostico(id);
    }




}
