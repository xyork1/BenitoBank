package com.remington.benitobank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RolController {

    @GetMapping("/admin")
    public String PaginaAdmin(){
        return "admin";
    }

    @GetMapping("/cliente")
    public String PaginaCliente(){
        return "cliente";
    }

    @GetMapping("/empleado")
    public String PaginaEmpleado(){
        return "empleado";
    }
}
