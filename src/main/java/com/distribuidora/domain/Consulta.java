
package com.distribuidora.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="consulta")
public class Consulta implements Serializable{
        private static final long serialVersionUID = 1L;
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="id_consulta")
   private Long idConsulta;
   private String texto;

    
   public Consulta(){
       
   }
   public Consulta(String texto){
       this.texto=texto;
    
       
   }
   
}
