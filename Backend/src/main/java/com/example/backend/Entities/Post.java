package com.example.backend.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString

@NoArgsConstructor

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int idPostes;
@Column(name = "titlep")
    String titleP;
@Column(name = "descriptionp")
    String descriptionP;
@Column(name = "datepostes")
    Date datepostes;
    @ManyToOne
    UserOrgType userOrgType;
    @Enumerated
    TypePost typePost;
    @OneToMany(mappedBy = "post")
    List<Reaction>reactions;
    @OneToMany(mappedBy = "post" , cascade = CascadeType.ALL)
    List<Commentaire> commentaires;
    @Column(name = "number_views")
    int numberViews;
    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL )
    List<PostTopics> topics;


}