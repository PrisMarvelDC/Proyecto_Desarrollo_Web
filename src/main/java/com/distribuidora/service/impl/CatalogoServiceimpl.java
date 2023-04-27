
package com.distribuidora.service.impl;

import com.distribuidora.service1.*;
import com.distribuidora.dao.CatalogoDao;
import com.distribuidora.domain.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CatalogoServiceimpl implements CatalogoService{
    @Autowired
    private CatalogoDao catalogoDao;
    
    @Override
    public List<Catalogo> getCatalogo() {
       return (List<Catalogo>) catalogoDao.findAll();
    }

    @Override
    public Catalogo getCatalogo(Catalogo catalogo) {
    return catalogoDao.findById(catalogo.getIdCatalogo()).orElse(null);
    
    }

    @Override
    public void deleteCatalogo(Catalogo catalogo) {
    catalogoDao.delete(catalogo);
    }

    @Override
    public void saveCatalogo(Catalogo catalogo) {
    
    catalogoDao.save(catalogo);
    }

   
    
}
