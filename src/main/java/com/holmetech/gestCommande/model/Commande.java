package com.holmetech.gestCommande.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "commande")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Commande implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;
    private Date dateCommand;
    @Column(nullable = false)
    private String statute;
    public Long getId() {
        return id != null ? id : 0;
    }

    public void setNumero(int newRandNumb) {
    }

    public int getNumero() {
        return 0;
    }
}
