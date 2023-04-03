package com.example.backend.Controllers;

import com.example.backend.Entities.Post;
import com.example.backend.Entities.TypePost;
import com.example.backend.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Post")
public class PostController {

    @Autowired
    PostService postService;
    @PostMapping
    void addPost(@RequestBody  Post p ){
        postService.add(p);
    }
    @GetMapping
    List<Post> AfficherPost(){
        return postService.getAll();
    }
    @DeleteMapping("/{id}")
    void removepost(@PathVariable int id ){
        postService.remove(id);
    }
    @GetMapping("/{id}")
    Post viewposte(@PathVariable int id)
    {
       Post p1 = postService.getById(id);
       postService.addviwes(id);
        return p1;
    }
    @PutMapping
    Post updatePost(@RequestBody Post p ){
        Post p1 = postService.getById(p.getIdPostes());
        p1.setDatepostes(p.getDatepostes());
        p1.setTitleP(p.getTitleP());
        p1.setDescriptionP(p.getDescriptionP());
        p1.setTypePost(p.getTypePost());


        return postService.update(p1);
    }



}
