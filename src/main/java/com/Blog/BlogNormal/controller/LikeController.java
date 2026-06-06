package com.Blog.BlogNormal.controller;



import com.Blog.BlogNormal.entity.Like;
import com.Blog.BlogNormal.repository.LikeRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/likes")
@CrossOrigin("*")
public class LikeController {

    private final LikeRepository repository;

    public LikeController(LikeRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Like darLike(@RequestBody Like like) {
        return repository.save(like);
    }
}