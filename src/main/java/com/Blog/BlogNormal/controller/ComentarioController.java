package com.Blog.BlogNormal.controller;



import com.Blog.BlogNormal.entity.Comentario;
import com.Blog.BlogNormal.repository.ComentarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comentarios")
@CrossOrigin("*")
public class ComentarioController {

    private final ComentarioRepository repository;

    public ComentarioController(ComentarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Comentario> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Comentario guardar(@RequestBody Comentario comentario) {
        return repository.save(comentario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}