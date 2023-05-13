package com.portfrb.rbarros.Controller;

import com.portfrb.rbarros.Entity.Persona;
import com.portfrb.rbarros.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
     @Autowired IPersonaService iperServ;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return iperServ.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public void createPersona(@RequestBody Persona per){
        iperServ.savePersona(per);
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public void deletePersona(@PathVariable Long id){
        iperServ.deletePersona(id);
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido){
        Persona per = iperServ.findPersona(id);
        per.setNombre(nuevoNombre);
        per.setApellido(nuevoApellido);
        iperServ.savePersona(per);
        return per;
    }
}
