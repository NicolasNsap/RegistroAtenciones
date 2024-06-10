package com.nsap.RegistroAtenciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class PacienteModel {
    @Id
    @Column(name = "rut")//asignacion de nombre personalizado en la base de datos
    private String rutPaciente;
    @Column(name = "nombre")
    private String nombrePaciente;
    @Column(name = "apellido")
    private String apellidoPaciente;

    //constructor sin parametros
    public PacienteModel() {}

    //constructor sin parametros
    public PacienteModel(String nombrePaciente, String apellidoPaciente) {
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
    }

    //metodos getters y setters

    public String getRutPaciente() {
        return rutPaciente;
    }

    public void setRutPaciente(String rutPaciente) {
        this.rutPaciente = rutPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }
}
