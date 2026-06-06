package com.Blog.BlogNormal.repository;


import com.Blog.BlogNormal.entity.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicacionRepository
        extends JpaRepository<Publicacion, Long> {
}