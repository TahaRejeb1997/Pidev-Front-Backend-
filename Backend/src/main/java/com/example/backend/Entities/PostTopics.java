package com.example.backend.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString

@NoArgsConstructor

@Entity
@Table(name = "post_topics")
public class PostTopics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idTopic;
    @Column(name = "name_topics")
    String nameTopic;
    @Column(name = "wanted")
    int wanted;
    @ManyToOne
    Post post;
    @ManyToOne
    UserOrgType user;
}
