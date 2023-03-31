package com.distribuidora.service.impl;

import com.distribuidora.dao.SeguridadDAO;
import com.distribuidora.domain.Seguridad;
import com.distribuidora.service1.SeguridadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeguridadServiceIMP implements SeguridadService{
    
    @Autowired
    private SeguridadDAO EDAO;

    @Override
    public List<Seguridad> getSeguridad() {
        return (List<Seguridad>) EDAO.findAll();
    }

    @Override
    public Seguridad getSeguridad(Seguridad seguridad) {
        return EDAO.findById(seguridad.getIdSeguridad()).orElse(null);
    }

    @Override
    public void eliminarSeguridad(Seguridad seguridad) {
        EDAO.delete(seguridad);
    }

    @Override
    public void guardarSeguridad(Seguridad seguridad) {
        EDAO.save(seguridad);
    }  
    
    
}
