/*interfaz que obtiene los metodos CRUD en este caso nos ayudamos y extendemos de java persistence api
(Jparepository) que genera automaticamente los metodos crud*/
package com.nsap.RegistroAtenciones.repository;

import com.nsap.RegistroAtenciones.model.MedicoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<MedicoModel, Long> {
}
