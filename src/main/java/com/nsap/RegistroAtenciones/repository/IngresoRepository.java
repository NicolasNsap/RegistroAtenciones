package com.nsap.RegistroAtenciones.repository;

import com.nsap.RegistroAtenciones.model.IngresoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngresoRepository extends JpaRepository<IngresoModel, Long> {
}
