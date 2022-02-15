package com.holmetech.gestCommande.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contenu")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Contenu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long quantity;
    @ManyToOne(fetch = FetchType.EAGER)
    private Commande command;
    @ManyToOne(fetch = FetchType.EAGER)
    private Article article;
    private Double prixtotal = 0.0;


}
