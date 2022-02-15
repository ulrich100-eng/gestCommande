package com.holmetech.gestCommande.service;

import com.holmetech.gestCommande.model.Commande;

import java.util.Date;
import java.util.List;

public interface CommandeService {
    List<Commande> allCommande();

    List<Commande> getCommandesClient(Long clientId);
    Commande getCommande();

    Commande getCommande(Date date);

    int generateNumero(Long id);

    Commande saveCommande (Commande commande);
    Commande updateCommande (Commande commande);
    String deleteCommande (Long id);


}
