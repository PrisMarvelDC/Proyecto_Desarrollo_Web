package com.distribuidora.controller;

import com.distribuidora.domain.Seguridad;
import com.distribuidora.service1.SeguridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seguridad")
public class SeguridadController {

    @Autowired
    private SeguridadService Servicio;
   

    @GetMapping("/listado")
    public String Comienzo(Model traslado) {
        var seguridades = Servicio.getSeguridad();
        traslado.addAttribute("seguridades", seguridades);
        return "/seguridad/listado";
    }

   @GetMapping("/eliminar/{idSeguridad}")
    public String eliminarSeguridad(Seguridad seguridad) {
        Servicio.eliminarSeguridad(seguridad);
        return "redirect:/seguridad/listado";
    }
    
    @GetMapping("/nuevo/")
    public String nuevoSeguridad(Seguridad seguridad) {
        return "/seguridad/editar";
    }
    
    @PostMapping("/guardar")
    public String guardarSeguridad(Seguridad seguridad) {
        Servicio.guardarSeguridad(seguridad);
        return "redirect:/seguridad/listado";
    }
    

    @GetMapping("/editar/{idSeguridad}")
    public String modificarSeguridad(Seguridad seguridad, Model traslado) {
        seguridad = Servicio.getSeguridad(seguridad);
        traslado.addAttribute("seguridad", seguridad);
        return "/seguridad/editar";
    }
}
