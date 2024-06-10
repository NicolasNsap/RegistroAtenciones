package com.nsap.RegistroAtenciones.repository;

import com.nsap.RegistroAtenciones.model.EspeMedicaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspeMedicaRepository extends JpaRepository<EspeMedicaModel, Long> {
}
