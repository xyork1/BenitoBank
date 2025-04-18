package com.remington.benitobank.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.remington.benitobank.model.Usuario;

@Repository
public interface UsuarioRespository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByCorreo(String correo);
}
