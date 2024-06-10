package com.nsap.RegistroAtenciones.model;

import jakarta.persistence.*;

@Entity
@Table(name = "diagnostico")
public class DiagnosticoModel {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idDiagnostico;
    @Column(name = "descripcion")
    private String descripcion;

    //contructor vacio
    public DiagnosticoModel() {}
    //constructor con parametros
    public DiagnosticoModel(String descripcion) {
        this.descripcion = descripcion;
    }
    //metodos getters and setters

    public Long getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Long idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
