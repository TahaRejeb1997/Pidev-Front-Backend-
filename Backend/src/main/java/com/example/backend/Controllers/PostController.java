package com.example.backend.Controllers;

import com.example.backend.Entities.Post;
import com.example.backend.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Post")
public class PostController {
    @Autowired
    PostService postService;
    @PostMapping
    void addPost(@RequestBody  Post p ){
        postService.add(p);
    }


}
