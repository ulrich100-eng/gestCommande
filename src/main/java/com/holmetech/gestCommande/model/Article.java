package com.holmetech.gestCommande.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "article")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Article implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String reference ;
    @Column(nullable = false)
    private String designation ;
    private Double prix = 0.0 ;

    public Long getId() {
        return id != null ? id : 0;
    }
}
