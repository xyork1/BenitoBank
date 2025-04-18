package com.remington.benitobank.model;

import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    private String nombre;

    @OneToMany(mappedBy = "rol")
    private Set<Usuario> usuario;

    public String getNombre() {
        return nombre;
    }
}
