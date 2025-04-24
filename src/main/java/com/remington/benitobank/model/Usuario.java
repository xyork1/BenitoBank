package com.remington.benitobank.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "usuario")
    private CuentaBancaria cuentaBancaria;

    private String nombre;

    @Column(unique = true)
    private String correo;

    @Column(name = "contrasena")
    private String contrasena;

    private String telefono;

    @Column(name = "direccion")
    private String dirección;
    
    @ManyToOne
    @JoinColumn(name = "rol_nombre")
    private Rol rol;

    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public Rol getRol() {
        return rol;
    }
    public String getContrasena() {
        return contrasena;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return dirección;
    }
}

