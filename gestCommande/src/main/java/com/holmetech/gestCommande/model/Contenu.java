package com.holmetech.gestCommande.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="contenu")


public class Contenu implements Serializable {

      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Long quantite;
    @ManyToOne(fetch = FetchType.EAGER)
    private Commande commande  ;
    @ManyToOne(fetch = FetchType.EAGER)
    private Article article ;
    private Double prixtotal = 0.0 ;





}
