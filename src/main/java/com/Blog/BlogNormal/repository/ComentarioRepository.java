package com.Blog.BlogNormal.repository;



import com.Blog.BlogNormal.entity.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository
        extends JpaRepository<Comentario, Long> {
}