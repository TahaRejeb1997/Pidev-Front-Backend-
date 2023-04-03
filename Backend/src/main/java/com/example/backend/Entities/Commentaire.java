package com.example.backend.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Reference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "commentaire")
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_comment")
    int idComment;
    @Column(name = "text_Comment")
    String textComment;
    @Column(name = "date_comment")
    Date dateComment;

    @ManyToOne
    User user;

    @OneToMany(mappedBy = "commentaire" , cascade = CascadeType.ALL)
    List<Reaction>reactions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="idPostes")
    Post post;


}
