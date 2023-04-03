package com.example.backend.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class UserOrgType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int refUser;
    @Enumerated
    Role role;
    @ManyToMany
    List<Organisation>organisations;
    @ManyToMany
    List<User>users;
    @OneToMany(mappedBy = "userOrgType",cascade = CascadeType.ALL)
    List<Post>posts;
    @OneToMany(mappedBy = "user")
    List<PostTopics> topics;

}