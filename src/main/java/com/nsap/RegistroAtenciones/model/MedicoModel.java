package com.nsap.RegistroAtenciones.model;

import jakarta.persistence.*;

@Entity
@Table(name = "medico")
public class MedicoModel {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idMedico;
    @Column(name = "nombre")
    private String nombreMedico;
    @Column(name = "apellido")
    private String apellidoMedico;

    //constructor vacio
    public MedicoModel() {}
    //constructor con parametros
    public MedicoModel(String nombreMedico, String apellidoMedico) {
        this.nombreMedico = nombreMedico;
        this.apellidoMedico = apellidoMedico;
    }

    //metodos getters and setters
    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidoMedico() {
        return apellidoMedico;
    }

    public void setApellidoMedico(String apellidoMedico) {
        this.apellidoMedico = apellidoMedico;
    }
}
