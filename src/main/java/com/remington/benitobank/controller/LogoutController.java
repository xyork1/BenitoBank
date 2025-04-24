package com.remington.benitobank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class LogoutController {
    @GetMapping("/confirm-logout")
    public String confirmLogout() {
        return "logout"; // Nombre de esta plantilla HTML
    }
    
    @PostMapping("/logout")
    public String performLogout() {
        // Lógica adicional (ej: auditoría) podría ir aquí
        return "redirect:/login?logout";
    }
}