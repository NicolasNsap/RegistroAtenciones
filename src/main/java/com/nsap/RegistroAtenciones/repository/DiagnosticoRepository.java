package com.nsap.RegistroAtenciones.repository;

import com.nsap.RegistroAtenciones.model.DiagnosticoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosticoRepository extends JpaRepository<DiagnosticoModel, Long> {
}
