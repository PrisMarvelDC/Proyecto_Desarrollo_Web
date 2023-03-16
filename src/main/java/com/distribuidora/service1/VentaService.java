
package com.distribuidora.service1;


import com.distribuidora.domain.Venta;
import java.util.List;


public interface VentaService {
    public List<Venta> getVenta();
    public Venta getVenta(Venta venta);
    public void deleteVenta(Venta venta);
    public void saveVenta(Venta venta);

}
