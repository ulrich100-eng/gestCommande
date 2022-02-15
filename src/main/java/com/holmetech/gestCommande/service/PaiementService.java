package com.holmetech.gestCommande.service;

import com.holmetech.gestCommande.model.Commande;
import com.holmetech.gestCommande.model.Paiement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaiementService {
    List<Paiement>allPaiement();

    Paiement getPaiement(Commande commande);
    Paiement savePaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    String deletePaiement(Long id);
}
