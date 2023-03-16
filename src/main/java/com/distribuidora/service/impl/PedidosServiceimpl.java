
package com.distribuidora.service.impl;

import com.distribuidora.service1.*;
import com.distribuidora.dao.PedidosDao;
import com.distribuidora.domain.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PedidosServiceimpl implements PedidosService{
    @Autowired
    private PedidosDao pedidosDao;
    
    @Override
    public List<Pedidos> getPedidos() {
       return (List<Pedidos>) pedidosDao.findAll();
    }

    @Override
    public Pedidos getPedidos(Pedidos pedidos) {
    return pedidosDao.findById(pedidos.getIdPedido()).orElse(null);
    
    }

    @Override
    public void deletePedidos(Pedidos pedidos) {
    pedidosDao.delete(pedidos);
    }

    @Override
    public void savePedidos(Pedidos pedidos) {
    
    pedidosDao.save(pedidos);
    }
    
}
