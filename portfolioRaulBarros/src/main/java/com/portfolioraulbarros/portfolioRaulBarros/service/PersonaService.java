/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioraulbarros.portfolioRaulBarros.service;

import com.portfolioraulbarros.portfolioRaulBarros.model.Usuario;
import com.portfolioraulbarros.portfolioRaulBarros.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Raul
 */
@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Usuario> verUsuarios() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Usuario per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Usuario buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
}
