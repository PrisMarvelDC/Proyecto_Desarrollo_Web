package com.distribuidora.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;



@Data
@Entity
@Table(name = "seguridadycarrito")
public class Carrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private String apellidos;
    private String software;
    private String producto;
    private double precio;

    public Carrito() {
    }

    public Carrito(long id, String nombre, String apellidos, String software, String producto, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.software = software;
        this.producto = producto;
        this.precio = precio;
    }
    
    
    

}
