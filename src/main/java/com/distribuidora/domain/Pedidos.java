
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
@Table(name="pedidos")
public class Pedidos implements Serializable{
        private static final long serialVersionUID = 1L;
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idPedido;
   private String cliente;
   private String monto;
   private String estado_venta;
   private String fecha;
    
   public Pedidos(){
       
   }
   public Pedidos(String cliente, String monto, String estado_venta, String fecha){
       this.cliente=cliente;
       this.monto=monto;
       this.estado_venta=estado_venta;
       this.fecha=fecha;
       
   }
   
}
