
package com.distribuidora.controller;

import com.distribuidora.domain.Pedido;
import com.distribuidora.service1.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pedido")

public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
 
    @GetMapping("/listado")
    public String inicio(Model model) {
        var pedidos = pedidoService.getPedido();
        model.addAttribute("pedidos", pedidos);
        return "/pedido/listado";

    }

    @GetMapping("/eliminar/{idPedido}")
    public String eliminaPedido(Pedido pedido) {
        pedidoService.deletePedido(pedido);
        return "redirect:/pedido/listado";
    }

    @GetMapping("/nuevo")
    public String nuevoPedido(Pedido pedido) {
        return "/pedido/editar";
    }

    @PostMapping("/guardar")
    public String guardarPedido(Pedido pedido) {
        pedidoService.savePedido(pedido);
        return "redirect:/pedido/listado";
    }

    @GetMapping("/editar/{idPedido}")
    public String modificaPedido(Pedido pedido, Model model) {
        pedido = pedidoService.getPedido(pedido);
        model.addAttribute("pedido", pedido);
        return "/pedido/editar";
    }
    
}
