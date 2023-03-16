
package com.distribuidora.controller;

import com.distribuidora.domain.Venta;
import com.distribuidora.service1.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/venta")
public class VentaController {
     @Autowired
    private VentaService ventaService;
    
    @GetMapping("/listado_V")
    public String inicio(Model model){
   var ventas=ventaService.getVenta();
   model.addAttribute("ventas",ventas);
        return "/venta/listado_V";
      }
    @GetMapping("/eliminar/{idVenta}")
    public String eliminaVenta(Venta venta){
        ventaService.deleteVenta(venta);
        return "redirect:/venta/listado_V";
    }
    
    
    
}
