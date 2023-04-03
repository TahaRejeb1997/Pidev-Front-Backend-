package com.example.backend.Controllers;

import com.example.backend.Entities.Commentaire;
import com.example.backend.Entities.Post;
import com.example.backend.Services.CommentaireSer;
import com.example.backend.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commentaire")
public class CommentaireController {
    @Autowired
    PostService postService;
    @Autowired
    CommentaireSer commentaireSer;
    @PostMapping
    void addCommentaire(@RequestBody Commentaire c){
        commentaireSer.add(c);
    }
    @GetMapping
    List<Commentaire> affichertouslescommentaire(){
        return commentaireSer.getAll();
    }
    @GetMapping("/{id}")
    Commentaire aficherCommentaireById (@PathVariable int id ){
        return commentaireSer.getById(id);
    }
    @PutMapping
    Commentaire updatecomment(@RequestBody Commentaire c){
        Commentaire c1 = commentaireSer.getById(c.getIdComment());
        c1.setDateComment(c.getDateComment());
        c1.setTextComment(c.getTextComment());


        return  commentaireSer.update(c1);
    }
    @DeleteMapping("/{id}")
    void deletecomment( @PathVariable  int id){
        commentaireSer.remove(id);
    }


}
