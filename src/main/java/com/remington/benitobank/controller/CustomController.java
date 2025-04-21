package com.remington.benitobank.controller;

import java.net.Authenticator;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.remington.benitobank.model.Usuario;
import com.remington.benitobank.repository.*;

@Controller
public class CustomController {
    @Autowired
    private UsuarioRespository usuarioRepository;

    @GetMapping("/login")
    public String login(@RequestParam (required=false) String error, ModelMap model) {
        if (error != null) {
            model.put("error, clave o usuario incorrecto", model);
        }
        return "login";
    }
    @GetMapping("/dashboard")
    public String inicio() {

        return "dashboard";
    }
    
    @GetMapping({"", "/"})
    public String home() {
        return "index";
    }
    
}
