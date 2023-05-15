
package com.portfrb.rbarros.Service;

import com.portfrb.rbarros.Entity.Experiencia;
import com.portfrb.rbarros.Repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SExperiencia {
    @Autowired IExperienciaRepository iexperienciaRepository;
    
    public List<Experiencia> list() {
        return iexperienciaRepository.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return iexperienciaRepository.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return iexperienciaRepository.findByNombreE(nombreE);
    }
    
    public void save(Experiencia exp){
        iexperienciaRepository.save(exp);
    }
    
    public void delete(int id){
        iexperienciaRepository.deleteById(id);
    }
    
}
