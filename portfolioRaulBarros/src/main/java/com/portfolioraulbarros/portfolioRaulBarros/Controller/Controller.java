/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioraulbarros.portfolioRaulBarros.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 *
 * @author Raul
 */
public class Controller {
    @GetMapping ("/{nombre}")
    public String decirHola(@PathVariable String nombre){
        return "Hola Mundo " + nombre;
    }
    
    @GetMapping ("/chau")
    public String decirChau(@RequestParam String nombre){
        return "Chau Mundo " + nombre;
    }
    
}
