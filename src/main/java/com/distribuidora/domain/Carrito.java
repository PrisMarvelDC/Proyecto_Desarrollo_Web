package com.distribuidora.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name = "carrito")
public class Carrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Carrito")
    private long idCarrito;

    private String nombre;
    private String apellidos;    
    private String producto;
    private double precio;

    public Carrito() {
    }

    public Carrito(String nombre, String apellidos, String producto, double precio) {
        this.nombre = nombre;
        this.apellidos = apellidos;        
        this.producto = producto;
        this.precio = precio;
    }
    
    
    

}
