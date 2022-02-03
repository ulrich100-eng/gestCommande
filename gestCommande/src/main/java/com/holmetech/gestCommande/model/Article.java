package com.holmetech.gestCommande.model;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "article")

public class Article implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String reference ;
    @Column(nullable = false)
    private String designation ;
    private Double prix = 0.0 ;
}
