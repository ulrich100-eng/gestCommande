package com.holmetech.gestCommande.repos;

import com.holmetech.gestCommande.model.Client;
import com.holmetech.gestCommande.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CommandeRepos extends JpaRepository<Commande, Long> {

    Commande findByNumero(int numero);
    List<Commande> findByClient(Client client);

    Commande findByDateCommand(Date date);
}
