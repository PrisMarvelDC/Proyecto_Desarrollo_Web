
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
@Table(name="venta")
public class Venta implements Serializable{
      private static final long serialVersionUID = 1L;
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idVenta;
   private String cliente;
   private String monto;
   private String fecha;
   
     public Venta(){
       
   }
     public Venta(String cliente, String monto, String fecha){
       this.cliente=cliente;
       this.monto=monto;
       this.fecha=fecha;
       
   }

}
