package com.portfrb.rbarros.Service;

import com.portfrb.rbarros.Entity.Persona;
import com.portfrb.rbarros.Interface.IPersonaService;
import com.portfrb.rbarros.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository iperRepo;
    @Override
    public List<Persona> getPersona() {
        return iperRepo.findAll();
    }

    @Override
    public void savePersona(Persona per) {
        iperRepo.save(per);
    }

    @Override
    public void deletePersona(Long id) {
        iperRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        return iperRepo.findById(id).orElse(null);
    }
}
