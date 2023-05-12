/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioraulbarros.portfolioRaulBarros.service;

import com.portfolioraulbarros.portfolioRaulBarros.model.Usuario;
import java.util.List;

/**
 *
 * @author Raul
 */
public interface IPersonaService {
    public List<Usuario> verUsuarios ();
    
    public void crearPersona(Usuario per);
    
    public void borrarPersona(Long id);
    
    public Usuario buscarPersona(Long id);
    
}
