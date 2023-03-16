
package com.distribuidora.service1;

import com.distribuidora.domain.Pedidos;
import java.util.List;

public interface PedidosService {
    
    public List<Pedidos> getPedidos();
    public Pedidos getPedidos(Pedidos pedidos);
    public void deletePedidos(Pedidos pedidos);
    public void savePedidos(Pedidos pedidos);

    
}
