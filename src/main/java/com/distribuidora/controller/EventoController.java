
package com.distribuidora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/evento")
public class EventoController {
    
     @GetMapping("/listado")
    public String inicio(Model model) {
        return "/evento/listado";

    }
}
