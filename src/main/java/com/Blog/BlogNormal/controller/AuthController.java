package com.Blog.BlogNormal.controller;


import com.Blog.BlogNormal.entity.Usuario;
import com.Blog.BlogNormal.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    private final AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public Usuario register(
            @RequestBody Usuario usuario) {

        return service.registrar(usuario);
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String email,
            @RequestParam String password) {

        return service.login(email, password);
    }
}