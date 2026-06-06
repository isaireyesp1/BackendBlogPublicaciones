package com.Blog.BlogNormal.repository;



import com.Blog.BlogNormal.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository
        extends JpaRepository<Like, Long> {
}