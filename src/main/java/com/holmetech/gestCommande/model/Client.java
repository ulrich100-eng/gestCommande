package com.holmetech.gestCommande.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Firstname;
    private String Lastname;
    private String  Email ;
    private String  Login ;
    private String  Password ;
    private Long number;
    @Column(nullable = false)
    private  String Statute;

    public Long getId() {
        return id != null ? id : 0;
    }

}
