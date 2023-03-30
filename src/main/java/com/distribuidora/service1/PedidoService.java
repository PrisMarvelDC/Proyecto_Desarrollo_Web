
package com.distribuidora.service1;

import com.distribuidora.domain.Pedido;
import java.util.List;

public interface PedidoService {
    
    public List<Pedido> getPedido();
    public Pedido getPedido(Pedido pedido);
    public void deletePedido(Pedido pedido);
    public void savePedido(Pedido pedido);

    
}
