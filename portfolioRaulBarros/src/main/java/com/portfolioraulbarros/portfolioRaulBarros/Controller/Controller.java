/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioraulbarros.portfolioRaulBarros.Controller;

import com.portfolioraulbarros.portfolioRaulBarros.model.Usuario;
import com.portfolioraulbarros.portfolioRaulBarros.service.IPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 *
 * @author Raul
 */
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    
    /*List<Usuario> listaUsuarios = new ArrayList();
    
     
    
    @GetMapping ("/{nombre}")
    public String decirHola(@PathVariable String nombre){
        return "Hola Mundo " + nombre;
    }
    
    @GetMapping ("/chau")
    public String decirChau(@RequestParam String nombre){
        return "Chau Mundo " + nombre;
    }*/
    
    @PostMapping ("/new/persona")
    public void agregarUsuario(@RequestBody Usuario user){
        persoServ.crearPersona(user);
        //listaUsuarios.add(user);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Usuario> verUsuarios(){
       return persoServ.verUsuarios();
        //return listaUsuarios;
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    /*@PutMapping();
    @DeleteMapping();*/
}
