package com.nsap.RegistroAtenciones.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ingreso")
public class IngresoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idIngreso;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private PacienteModel paciente;
    @ManyToOne
    @JoinColumn(name = "medico_id")
    private MedicoModel medicoModel;
    @ManyToOne
    @JoinColumn(name = "especialidad_id")
    private EspeMedicaModel espeMedica;
    @ManyToOne
    @JoinColumn(name = "diagnostico_id")
    private DiagnosticoModel diagnosticoModels;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_alta")
    private Date fechaAlta;

    //constructor vacio
    public IngresoModel() {}
    //contructor con parametros


    public IngresoModel(Long idIngreso, PacienteModel paciente, MedicoModel medicoModel, EspeMedicaModel espeMedica, DiagnosticoModel diagnosticoModels, Date fechaIngreso, Date fechaAlta) {
        this.idIngreso = idIngreso;
        this.paciente = paciente;
        this.medicoModel = medicoModel;
        this.espeMedica = espeMedica;
        this.diagnosticoModels = diagnosticoModels;
        this.fechaIngreso = fechaIngreso;
        this.fechaAlta = fechaAlta;
    }

    //metodos getters and setters

    public Long getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(Long idIngreso) {
        this.idIngreso = idIngreso;
    }

    public PacienteModel getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteModel paciente) {
        this.paciente = paciente;
    }

    public MedicoModel getMedicoModel() {
        return medicoModel;
    }

    public void setMedicoModel(MedicoModel medicoModel) {
        this.medicoModel = medicoModel;
    }

    public EspeMedicaModel getEspeMedica() {
        return espeMedica;
    }

    public void setEspeMedica(EspeMedicaModel espeMedica) {
        this.espeMedica = espeMedica;
    }

    public DiagnosticoModel getDiagnosticoModels() {
        return diagnosticoModels;
    }

    public void setDiagnosticoModels(DiagnosticoModel diagnosticoModels) {
        this.diagnosticoModels = diagnosticoModels;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
