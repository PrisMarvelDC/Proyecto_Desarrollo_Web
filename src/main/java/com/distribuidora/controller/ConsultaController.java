
package com.distribuidora.controller;

import com.distribuidora.domain.Consulta;
import com.distribuidora.service1.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/consulta")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;
 
    @GetMapping("/listado")
    public String inicio(Model model) {
        var consultas = consultaService.getConsulta();
        model.addAttribute("consultas", consultas);
        return "/consulta/listado";

    }

    @GetMapping("/eliminar/{idConsulta}")
    public String eliminaConsulta(Consulta consulta) {
        consultaService.deleteConsulta(consulta);
        return "redirect:/consulta/listado";
    }

    @GetMapping("/nuevo")
    public String nuevoConsulta(Consulta consulta) {
        return "/consulta/editar";
    }

    @PostMapping("/guardar")
    public String guardarConsulta(Consulta consulta) {
        consultaService.saveConsulta(consulta);
        return "redirect:/consulta/listado";
    }

    @GetMapping("/editar/{idConsulta}")
    public String modificaConsulta(Consulta consulta, Model model) {
        consulta = consultaService.getConsulta(consulta);
        model.addAttribute("consulta", consulta);
        return "/consulta/editar";
    }
    
}
