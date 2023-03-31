package com.distribuidora.controller;

import com.distribuidora.domain.Carrito;
import com.distribuidora.service1.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping("/listado")
    public String Comienzo(Model traslado) {
        var carritos = carritoService.getCarrito();
        traslado.addAttribute("carritos", carritos);
        return "/carrito/listado";
    }

    @GetMapping("/eliminar/{idCarrito}")
    public String eliminarCarrito(Carrito carrito) {
        carritoService.eliminarCarrito(carrito);
        return "redirect:/carrito/listado";
    }

    @GetMapping("/nuevo/")
    public String nuevoCarrito(Carrito carrito) {
        return "/carrito/editar";
    }

    @PostMapping("/guardar")
    public String guardarCarrito(Carrito carrito) {
        carritoService.guardarCarrito(carrito);
        return "redirect:/carrito/listado";
    }

    @GetMapping("/editar/{idCarrito}")
    public String modificarCarrito(Carrito carrito, Model traslado) {
        carrito = carritoService.getCarrito(carrito);
        traslado.addAttribute("carrito", carrito);
        return "/carrito/editar";
    }


}
