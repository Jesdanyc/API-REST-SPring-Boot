package com.jdyc.practica_api_rest.models;

import jakarta.persistence.*;

@Entity
@Table (name = "cartapresentacion")
public class CartaPresentacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long cod_cartap;

    //aqui estamos relacionando de muchos a uno cartapresentacion con alumno
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_univer")
    private AlumnoModel dtalumno;


    private Integer ruc;
    private String insti_nombre;
    private String representante;
    private String grado_academico;
    private String cargo;

    //Set and Get the all

    public void setCod_cartap(Long cod_cartap) {
        this.cod_cartap = cod_cartap;
    }

    public Long getCod_cartap() {
        return cod_cartap;
    }

    public void setDtalumno(AlumnoModel dtalumno) {
        this.dtalumno = dtalumno;
    }

    public AlumnoModel getDtalumno() {
        return dtalumno;
    }

    public void setRuc(Integer ruc) {
        this.ruc = ruc;
    }

    public Integer getRuc() {
        return ruc;
    }

    public void setInsti_nombre(String insti_nombre) {
        this.insti_nombre = insti_nombre;
    }

    public String getInsti_nombre() {
        return insti_nombre;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setGrado_academico(String grado_academico) {
        this.grado_academico = grado_academico;
    }

    public String getGrado_academico() {
        return grado_academico;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
