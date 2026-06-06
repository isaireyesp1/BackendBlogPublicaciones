package com.Blog.BlogNormal.service;



import com.Blog.BlogNormal.entity.Usuario;
import com.Blog.BlogNormal.repository.UsuarioRepository;
import com.Blog.BlogNormal.security.JwtUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UsuarioRepository repository;
    private final PasswordEncoder encoder;
    private final JwtUtil jwtUtil;

    public AuthService(
            UsuarioRepository repository,
            PasswordEncoder encoder,
            JwtUtil jwtUtil) {

        this.repository = repository;
        this.encoder = encoder;
        this.jwtUtil = jwtUtil;
    }

    public Usuario registrar(Usuario usuario) {

        usuario.setPassword(
                encoder.encode(
                        usuario.getPassword()));

        return repository.save(usuario);
    }

    public String login(
            String email,
            String password) {

        Usuario usuario =
                repository.findByEmail(email)
                        .orElseThrow();

        if (!encoder.matches(
                password,
                usuario.getPassword())) {

            throw new RuntimeException(
                    "Contraseña incorrecta");
        }

        return jwtUtil.generarToken(email);
    }
}