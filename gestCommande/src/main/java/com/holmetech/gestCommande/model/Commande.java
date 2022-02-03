package com.holmetech.gestCommande.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "commande")
public class Commande implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;
    private Date dateCommande;
    @Column(nullable = false)
    private String statut;


}
