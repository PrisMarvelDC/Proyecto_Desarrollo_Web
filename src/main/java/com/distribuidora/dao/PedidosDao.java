package com.distribuidora.dao;

import com.distribuidora.domain.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PedidosDao extends JpaRepository<Pedidos,Long>{
    
}
