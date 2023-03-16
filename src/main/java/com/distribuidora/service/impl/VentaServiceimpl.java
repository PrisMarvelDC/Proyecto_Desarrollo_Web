
package com.distribuidora.service.impl;


import com.distribuidora.dao.VentaDao;
import com.distribuidora.domain.Venta;
import com.distribuidora.service1.VentaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VentaServiceimpl implements VentaService{
    @Autowired
    private VentaDao ventaDao;
    @Override
    
    
    public List<Venta> getVenta() {
      return (List<Venta >) ventaDao.findAll();
    
    }

    @Override
    public Venta getVenta(Venta venta) {
     return ventaDao.findById(venta.getIdVenta()).orElse(null);
    }

    @Override
    public void deleteVenta(Venta venta) {
     ventaDao.delete(venta);
    
    }

    @Override
    public void saveVenta(Venta venta) {
      ventaDao.save(venta);
    }
    
}
