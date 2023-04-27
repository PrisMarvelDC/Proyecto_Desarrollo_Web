
package com.distribuidora.service1;

import com.distribuidora.domain.Catalogo;
import java.util.List;

public interface CatalogoService {
    
    public List<Catalogo> getCatalogo();
    public Catalogo getCatalogo(Catalogo catalogo);
    public void deleteCatalogo(Catalogo catalogo);
    public void saveCatalogo(Catalogo catalogo);

    
}
