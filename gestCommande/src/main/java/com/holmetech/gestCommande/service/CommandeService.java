package com.holmetech.gestCommande.service;

import com.holmetech.gestCommande.model.Client;
import com.holmetech.gestCommande.model.Commande;

import java.util.Date;
import java.util.List;

public interface CommandeService {
    List<Commande> allCommande();


    Commande getCommande(Date date);

    Commande saveCommande (Commande commande);
    Commande updateCommande (Commande commande);
    String deleteCommande (Long id);


}
