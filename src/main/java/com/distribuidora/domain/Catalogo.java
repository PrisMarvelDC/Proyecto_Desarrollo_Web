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
@Table(name = "catalogo")
public class Catalogo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Catalogo")
    private long idCatalogo;

    private String Articulo;

    public Catalogo() {
    }

    public Catalogo(String Articulo) {
        this.Articulo = Articulo;
    }
    
    
    

}
