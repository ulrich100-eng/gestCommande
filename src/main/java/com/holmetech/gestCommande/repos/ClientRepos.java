package com.holmetech.gestCommande.repos;

import com.holmetech.gestCommande.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientRepos extends JpaRepository <Client,Long> {


    Client findByNumero(int numero);

    Client findByEmail(String email);

    Client findByNumber(Long number);
}
