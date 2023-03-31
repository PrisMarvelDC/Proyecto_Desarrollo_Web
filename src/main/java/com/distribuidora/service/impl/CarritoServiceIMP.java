package com.distribuidora.service.impl;

import com.distribuidora.dao.CarritoDAO;
import com.distribuidora.domain.Carrito;
import com.distribuidora.service1.CarritoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoServiceIMP implements CarritoService{

    @Autowired
    private CarritoDAO EDAO;
    
    @Override
    public List<Carrito> getCarrito() {
        return (List<Carrito>) EDAO.findAll();
    }

    @Override
    public Carrito getCarrito(Carrito carrito) {
        return EDAO.findById(carrito.getIdCarrito()).orElse(null);
    }

    @Override
    public void eliminarCarrito(Carrito carrito) {
        EDAO.delete(carrito);
    }

    @Override
    public void guardarCarrito(Carrito carrito) {
        EDAO.save(carrito);
    }  

}
