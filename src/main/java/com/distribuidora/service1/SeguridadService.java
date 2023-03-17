package com.distribuidora.service1;

import com.distribuidora.domain.Seguridad;
import java.util.List;



public interface SeguridadService {
    
    public List<Seguridad> getSeguridad();
    
    public Seguridad getSeguridad(Seguridad seguridad);
    
    public void eliminarSeguridad(Seguridad seguridad);
    
    public void guardarSeguridad(Seguridad seguridad);
}
