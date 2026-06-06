package com.Blog.BlogNormal.service;


import com.Blog.BlogNormal.entity.Publicacion;
import com.Blog.BlogNormal.repository.PublicacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionService {

    private final PublicacionRepository repository;

    public PublicacionService(PublicacionRepository repository) {
        this.repository = repository;
    }

    public List<Publicacion> listar() {
        return repository.findAll();
    }

    public Publicacion guardar(Publicacion publicacion) {
        return repository.save(publicacion);
    }

    public Publicacion buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}