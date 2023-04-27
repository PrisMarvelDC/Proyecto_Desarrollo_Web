package com.distribuidora.dao;

import com.distribuidora.domain.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CatalogoDao extends JpaRepository <Catalogo, Long>{
    
}
