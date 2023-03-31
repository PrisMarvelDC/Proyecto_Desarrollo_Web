
package com.distribuidora.service1;

import com.distribuidora.domain.Consulta;
import java.util.List;

public interface ConsultaService {
    
    public List<Consulta> getConsulta();
    public Consulta getConsulta(Consulta consulta);
    public void deleteConsulta(Consulta consulta);
    public void saveConsulta(Consulta consulta);

    
}
