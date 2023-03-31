package com.distribuidora.domain;

import jakarta.persistence.*;
import java.io.Serializable;

import lombok.Data;

@Data
@Entity
@Table(name = "seguridad")
public class Seguridad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seguridad")
    private long idSeguridad;

    private String nombre;
    private String apellidos;
    private String software;
    private String producto;
    private double precio;

    public Seguridad() {
    }

    public Seguridad(String nombre, String apellidos, String software, String producto, double precio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.software = software;
        this.producto = producto;
        this.precio = precio;
    }
}

