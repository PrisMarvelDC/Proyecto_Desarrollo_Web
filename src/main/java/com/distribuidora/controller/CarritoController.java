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
@RequestMapping("/seguridadycarrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping("/listado")
    public String Comienzo(Model traslado) {
        var servicios = carritoService.getCarrito();
        traslado.addAttribute("servicios", servicios);
        return "/seguridadycarrito/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCarrito(Carrito carrito) {
        carritoService.eliminarCarrito(carrito);
        return "redirect:/seguridadycarrito/listado";
    }

    @GetMapping("/nuevo/")
    public String nuevoCarrito(Carrito carrito) {
        return "/seguridadycarrito/modifica";
    }

    @PostMapping("/guardar")
    public String guardarCarrito(Carrito carrito) {
        carritoService.guardarCarrito(carrito);
        return "redirect:/seguridadycarrito/listado";
    }

    @GetMapping("/modificar/{id}")
    public String modificarCarrito(Carrito carrito, Model traslado) {
        carrito = carritoService.getCarrito(carrito);
        traslado.addAttribute("carrito", carrito);
        return "/seguridadycarrito/modifica";
    }


}
