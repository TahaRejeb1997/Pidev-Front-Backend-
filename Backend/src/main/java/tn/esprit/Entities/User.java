package tn.esprit.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "User")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUser")
    private Integer idUser;
    private String FirstName;
    private String LastName;
    private String Email;
    private String PhoneNumber;
    private String Adress;
    private String City;
    private String Password;
    private Boolean IsVerified;
    private String Token;
    @Enumerated(EnumType.STRING)
    private Role role;


    @OneToMany(mappedBy="userReservation")
    private Set<Reservation> ReservationsUser;

    @OneToMany(mappedBy="userDonation")
    private Set<Donation> DonationsUser;

    @OneToMany(mappedBy="userArticle")
    private Set<Article> ArticleUser;


    @OneToMany(mappedBy="userProduct")
    private Set<Product> ProductsUser;


}
