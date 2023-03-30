package com.distribuidora.dao;

import com.distribuidora.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PedidoDao extends JpaRepository<Pedido,Long>{
    
}
