package com.nsap.RegistroAtenciones.controller;

import com.nsap.RegistroAtenciones.model.IngresoModel;
import com.nsap.RegistroAtenciones.service.IngresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ingresos")
public class IngresoController {
    @Autowired
    private IngresoService ingresoService;

    @GetMapping
    public List<IngresoModel> obtenerTodosLosIngresos() {
        return ingresoService.obtenerIngresos();
    }

    @GetMapping("/{id}")
    public Optional<IngresoModel> obtenerIngresoPorId(@PathVariable Long id) {
        return ingresoService.obtenerIngresoPorId(id);
    }

    @PostMapping
    public IngresoModel createIngreso(@RequestBody IngresoModel ingresoModel) {
        return ingresoService.agregarIngreso(ingresoModel);
    }

    @PutMapping("/{id}")
    public IngresoModel updateIngreso(@PathVariable Long id, @RequestBody IngresoModel ingresoDetalles) {
        return ingresoService.actualizarIngreso(id, ingresoDetalles);
    }

    @DeleteMapping("/{id}")
    public void deleteIngreso(@PathVariable Long id) {
        ingresoService.eliminarIngreso(id);
    }
}
