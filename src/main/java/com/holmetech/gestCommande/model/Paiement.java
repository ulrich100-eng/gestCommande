package com.holmetech.gestCommande.model;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="paiement")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Paiement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private  Commande command;
    private Double Montant;
    @Column(nullable = false )
    private String statute;

}
