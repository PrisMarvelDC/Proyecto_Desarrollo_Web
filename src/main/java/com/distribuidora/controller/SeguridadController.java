package com.distribuidora.controller;

import com.distribuidora.domain.Seguridad;
import com.distribuidora.service1.SeguridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SeguridadController {

    @Autowired
    private SeguridadService Servicio;
   

    @GetMapping("/")
    public String Comienzo(Model traslado) {
        var servicios = Servicio.getSeguridad();
        traslado.addAttribute("servicios", servicios);
        return "/seguridadycarrito/listado";
    }

   @GetMapping("/eliminar/{id}")
    public String eliminarSeguridad(Seguridad seguridad) {
        Servicio.eliminarSeguridad(seguridad);
        return "redirect:/seguridadycarrito/listado";
    }
    
    @GetMapping("/nuevo/")
    public String nuevoSeguridad(Seguridad seguridad) {
        return "/seguridadycarrito/modifica";
    }
    
    @PostMapping("/guardar")
    public String guardarSeguridad(Seguridad seguridad) {
        Servicio.guardarSeguridad(seguridad);
        return "redirect:/seguridadycarrito/listado";
    }
    

    @GetMapping("/modificar/{id}")
    public String modificarSeguridad(Seguridad seguridad, Model traslado) {
        seguridad = Servicio.getSeguridad(seguridad);
        traslado.addAttribute("seguridad", seguridad);
        return "/seguridadycarrito/modifica";
    }
}
