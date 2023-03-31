package com.distribuidora.dao;

import com.distribuidora.domain.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarritoDAO extends JpaRepository <Carrito, Long>{
    
}
