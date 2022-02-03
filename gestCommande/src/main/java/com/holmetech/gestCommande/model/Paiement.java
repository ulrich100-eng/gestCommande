package com.holmetech.gestCommande.model;




import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="paiement")


public class Paiement implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private  Commande commande;
    private Double Montant;
    @Column(nullable = false )
    private String statut;

}
