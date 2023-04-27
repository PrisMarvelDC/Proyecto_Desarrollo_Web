
package com.distribuidora.controller;

import com.distribuidora.domain.Catalogo;
import com.distribuidora.service1.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/catalogo")
public class CatalogoController {
    @Autowired
    private CatalogoService catalogoService;
 
    @GetMapping("/listado")
    public String inicio(Model model) {
        var catalogos = catalogoService.getCatalogo();
        model.addAttribute("catalogos", catalogos);
        return "/catalogo/listado";

    }

    @GetMapping("/eliminar/{idCatalogo}")
    public String eliminaCatalogo(Catalogo catalogo) {
        catalogoService.deleteCatalogo(catalogo);
        return "redirect:/catalogo/listado";
    }

    @GetMapping("/nuevo")
    public String nuevoCatalogo(Catalogo catalogo) {
        return "/catalogo/editar";
    }

    @PostMapping("/guardar")
    public String guardarCatalogo(Catalogo catalogo) {
        catalogoService.saveCatalogo(catalogo);
        return "redirect:/catalogo/listado";
    }

    @GetMapping("/editar/{idCatalogo}")
    public String modificaCatalogo(Catalogo catalogo, Model model) {
        catalogo = catalogoService.getCatalogo(catalogo);
        model.addAttribute("catalogo", catalogo);
        return "/catalogo/editar";
    }
    
}
