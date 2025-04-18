package com.remington.benitobank.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import com.remington.benitobank.model.Usuario;
import com.remington.benitobank.repository.UsuarioRespository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRespository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByCorreo(correo)
            .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        return new User(
            usuario.getCorreo(),
            usuario.getContrasena(),
            List.of(new SimpleGrantedAuthority("ROLE_" + usuario.getRol().getNombre().toUpperCase()))
        );
    }
}

