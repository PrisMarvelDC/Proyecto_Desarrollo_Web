package com.distribuidora.service1;


import com.distribuidora.domain.Carrito;
import java.util.List;


public interface CarritoService {
    
    public List<Carrito> getCarrito();
    
    public Carrito getCarrito(Carrito carrito);
    
    public void eliminarCarrito(Carrito carrito);
    
    public void guardarCarrito(Carrito carrito);
}
