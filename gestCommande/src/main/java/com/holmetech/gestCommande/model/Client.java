package com.holmetech.gestCommande.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="client")

public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nom;
    private String Prenom;
    private String  Email ;
    private String  Login ;
    private String  Password ;
    private Long  Numero ;
    @Column(nullable = false)
    private  String Statut;

}
