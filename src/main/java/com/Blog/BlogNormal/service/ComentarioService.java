package com.Blog.BlogNormal.service;



import com.Blog.BlogNormal.entity.Comentario;
import com.Blog.BlogNormal.repository.ComentarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioService {

    private final ComentarioRepository repository;

    public ComentarioService(ComentarioRepository repository) {
        this.repository = repository;
    }

    public List<Comentario> listar() {
        return repository.findAll();
    }

    public Comentario guardar(Comentario comentario) {
        return repository.save(comentario);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}