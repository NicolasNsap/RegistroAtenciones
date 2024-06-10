package com.nsap.RegistroAtenciones.repository;

import com.nsap.RegistroAtenciones.model.PacienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<PacienteModel, String> {
}
