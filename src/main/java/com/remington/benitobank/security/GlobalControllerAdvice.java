package com.remington.benitobank.security;


import com.remington.benitobank.model.Usuario;
import com.remington.benitobank.repository.UsuarioRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

@ControllerAdvice
public class GlobalControllerAdvice {

    @Autowired
    private UsuarioRespository usuarioRepository;

    @ModelAttribute
    public void agregarDatosUsuario(Model model, Authentication auth) {
        if (auth != null && auth.isAuthenticated()) {
            String correo = auth.getName(); // Este es el username (correo) del usuario autenticado
            Usuario usuario = usuarioRepository.findByCorreo(correo).orElse(null);

            if (usuario != null) {
                model.addAttribute("usuario", usuario); // ahora puedes acceder a ${usuario} en cualquier vista
                model.addAttribute("rol", usuario.getRol().getNombre());
                model.addAttribute("nombre", usuario.getNombre());
                //model.addAttribute("cuenta", usuario.getCuentaBancaria()); // si existe la relación
            }
        }
    }
}
