package com.example.backend.Controllers;

import com.example.backend.Entities.Reaction;
import com.example.backend.Services.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Reaction")
public class ReactionController {
    @Autowired
    ReactionService reactionService;
    @PostMapping
    void addReaction(@RequestBody Reaction r){
        reactionService.add(r);
    }
    @GetMapping
    List<Reaction> afficheTousLesreactions(){
        return  reactionService.getAll();
    }
    @DeleteMapping("/{id}")
    void removeReaction(@PathVariable int id){
        reactionService.remove(id);
    }
    @GetMapping("/{id}")
    Reaction afficherreactbyid(@PathVariable int id ){
        return reactionService.getById(id);
    }
    @PutMapping()
    Reaction updateReact(@RequestBody Reaction r ){
        return  reactionService.update(r);
    }
}
