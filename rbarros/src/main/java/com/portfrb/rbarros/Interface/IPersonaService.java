package com.portfrb.rbarros.Interface;

import com.portfrb.rbarros.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona(Persona per);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
}
