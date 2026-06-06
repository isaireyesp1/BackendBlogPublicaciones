package com.Blog.BlogNormal.controller;



import com.Blog.BlogNormal.entity.Publicacion;
import com.Blog.BlogNormal.repository.PublicacionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/publicaciones")
@CrossOrigin("*")
public class PublicacionController {

    private final PublicacionRepository repository;

    public PublicacionController(PublicacionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Publicacion> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Publicacion crear(@RequestBody Publicacion publicacion) {
        return repository.save(publicacion);
    }

    @GetMapping("/{id}")
    public Publicacion buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Publicacion actualizar(
            @PathVariable Long id,
            @RequestBody Publicacion nueva) {

        Publicacion p = repository.findById(id).orElseThrow();

        p.setTitulo(nueva.getTitulo());
        p.setContenido(nueva.getContenido());
        p.setImagen(nueva.getImagen());
        p.setCategoria(nueva.getCategoria());

        return repository.save(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}