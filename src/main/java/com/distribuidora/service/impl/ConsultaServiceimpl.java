
package com.distribuidora.service.impl;

import com.distribuidora.service1.*;

import com.distribuidora.domain.*;
import com.distribuidora.dao.ConsultaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConsultaServiceimpl implements ConsultaService{
    @Autowired
  private ConsultaDao consultaDao;
    
    @Override
    public List<Consulta> getConsulta() {
       return (List<Consulta>) consultaDao.findAll();
    }

    @Override
    public Consulta getConsulta(Consulta consulta) {
    return consultaDao.findById(consulta.getIdConsulta()).orElse(null);
    
    }

    @Override
    public void deleteConsulta(Consulta consulta) {
    consultaDao.delete(consulta);
    }

    @Override
    public void saveConsulta(Consulta consulta) {
    
    consultaDao.save(consulta);
    }

   
    
}
