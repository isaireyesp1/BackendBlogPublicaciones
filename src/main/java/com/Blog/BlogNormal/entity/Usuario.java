package com.Blog.BlogNormal.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(unique = true)
    private String email;

    private String password;

    private String fotoPerfil;

    @Column(length = 500)
    private String biografia;

    private LocalDateTime fechaRegistro = LocalDateTime.now();
}