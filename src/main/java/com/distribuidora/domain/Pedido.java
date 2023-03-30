
package com.distribuidora.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="pedido")
public class Pedido implements Serializable{
        private static final long serialVersionUID = 1L;
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="id_pedido")
   private Long idPedido;
   private String cliente;
   private String monto;
   private String estado_venta;
   private String fecha;
    
   public Pedido(){
       
   }
   public Pedido(String cliente, String monto, String estado_venta, String fecha){
       this.cliente=cliente;
       this.monto=monto;
       this.estado_venta=estado_venta;
       this.fecha=fecha;
       
   }
   
}
