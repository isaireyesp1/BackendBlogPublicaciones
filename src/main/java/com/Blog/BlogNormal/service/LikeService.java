package com.Blog.BlogNormal.service;



import com.Blog.BlogNormal.entity.Like;
import com.Blog.BlogNormal.repository.LikeRepository;
import org.springframework.stereotype.Service;

@Service
public class LikeService {

    private final LikeRepository repository;

    public LikeService(LikeRepository repository) {
        this.repository = repository;
    }

    public Like guardar(Like like) {
        return repository.save(like);
    }
}