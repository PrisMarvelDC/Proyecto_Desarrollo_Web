package com.distribuidora.dao;

import com.distribuidora.domain.Seguridad;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SeguridadDAO extends JpaRepository <Seguridad, Long> {
    
}
