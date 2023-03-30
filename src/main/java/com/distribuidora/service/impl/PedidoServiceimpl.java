
package com.distribuidora.service.impl;

import com.distribuidora.service1.*;
import com.distribuidora.dao.PedidoDao;
import com.distribuidora.domain.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PedidoServiceimpl implements PedidoService{
    @Autowired
    private PedidoDao pedidoDao;
    
    @Override
    public List<Pedido> getPedido() {
       return (List<Pedido>) pedidoDao.findAll();
    }

    @Override
    public Pedido getPedido(Pedido pedido) {
    return pedidoDao.findById(pedido.getIdPedido()).orElse(null);
    
    }

    @Override
    public void deletePedido(Pedido pedido) {
    pedidoDao.delete(pedido);
    }

    @Override
    public void savePedido(Pedido pedido) {
    
    pedidoDao.save(pedido);
    }

   
    
}
