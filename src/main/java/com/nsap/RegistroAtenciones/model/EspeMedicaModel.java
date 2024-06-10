package com.nsap.RegistroAtenciones.model;

import jakarta.persistence.*;

@Entity
@Table(name = "especialidad_medica")
public class EspeMedicaModel {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idEspeMedica;
    @Column(name = "nombre")
    private String nombre;

    //contructor vacio
    public EspeMedicaModel() {}
    //constructor con parametros
    public EspeMedicaModel(String nombre) {
        this.nombre = nombre;
    }

    //metodos getters y setters

    public Long getIdEspeMedica() {
        return idEspeMedica;
    }

    public void setIdEspeMedica(Long idEspeMedica) {
        this.idEspeMedica = idEspeMedica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

