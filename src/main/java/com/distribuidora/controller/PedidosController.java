
package com.distribuidora.controller;

import com.distribuidora.domain.Pedidos;
import com.distribuidora.service1.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pedidos")

public class PedidosController {
    @Autowired
    private PedidosService pedidosService;
    
     @GetMapping("/listado")
    public String inicio(Model model){
   var pedido=pedidosService.getPedidos();
   model.addAttribute("pedido",pedido);
        return "/pedidos/listado";
       
    }
   
    @GetMapping("/eliminar/{idPedido}")
    public String eliminaPedidos(Pedidos pedidos){
        pedidosService.deletePedidos(pedidos);
        return "redirect:/pedidos/listado";
    }
    
    @GetMapping("/nuevo")
    public String nuevoPedidos(Pedidos pedidos){
        return"/pedidos/editar";
    }
    @PostMapping("/guardar")
    public String guardarPedidos(Pedidos pedidos){
        pedidosService.savePedidos(pedidos);
        return "redirect:/pedidos/listado";
    }
    
     @GetMapping("/editar/{idPedido}")
    public String modificaPedidos(Pedidos pedidos, Model model){
        pedidos= pedidosService.getPedidos(pedidos);
        model.addAttribute("pedido",pedidos);
        return"/pedido/editar";
    }
    
   
    
}
