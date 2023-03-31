package com.distribuidora.controller;

import com.distribuidora.domain.Venta;
import com.distribuidora.service1.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var ventas = ventaService.getVenta();
        model.addAttribute("ventas", ventas);
        return "/venta/listado";
    }

    @GetMapping("/eliminar/{idVenta}")
    public String eliminaVenta(Venta venta) {
        ventaService.deleteVenta(venta);
        return "redirect:/venta/listado";
    }

    @GetMapping("/nuevo")
    public String nuevoVenta(Venta venta) {
        return "/venta/editar";
    }

    @PostMapping("/guardar")
    public String guardarVenta(Venta venta) {
        ventaService.saveVenta(venta);
        return "redirect:/venta/listado";
    }

    @GetMapping("/editar/{idVenta}")
    public String modificaVenta(Venta venta, Model model) {
        venta = ventaService.getVenta(venta);
        model.addAttribute("venta", venta);
        return "/venta/editar";
    }

}
