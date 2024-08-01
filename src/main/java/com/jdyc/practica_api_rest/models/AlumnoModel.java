package com.jdyc.practica_api_rest.models;

import jakarta.persistence.*;

@Entity //modelo real
@Table (name = "alumno")
public class AlumnoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long cod_univer;


    private String nombre;
    private String apellidos;
    private String sexo;
    private Integer ciclo;
    private Integer num_celular;


    public void setCod_univer(Long cod_univer) {
        this.cod_univer = cod_univer;
    }

    public Long getCod_univer() {
        return cod_univer;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setNum_celular(Integer num_celular) {
        this.num_celular = num_celular;
    }

    public Integer getNum_celular() {
        return num_celular;
    }
}
