package com.holmetech.gestCommande.repos;

import com.holmetech.gestCommande.model.Commande;
import com.holmetech.gestCommande.model.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaiementRepos extends JpaRepository<Paiement ,Long> {



    @Query(value = "SELECT * FROM paiement Where command:=command",nativeQuery = true)
    Paiement paiementGetByCommand(Commande command);
    @Query(value= "SELECT u FROM PAIEMENT WHERE u.command:=command")
    Paiement GetByCommand(Commande command);

      Paiement FindByCommand(Commande command) ;


    @Query(value= "SELECT * FROM  paiement Where montant:=montant",nativeQuery = true)
    Paiement paiementGetByMontant(Double montant);
    @Query(value="SELECT u FROM PAIEMENT WHERE u.montant:=montant")
    Paiement GetByMontant(Double montant);

    Paiement FindByMontant(Double montant);


    @Query(value ="SELECT * FROM paiement Where statute:=statute ",nativeQuery = true)
    Paiement paiementGetByStatute(String statute);
    @Query(value = "SELECT u FROM PAIEMENT WHERE u.statute:=statute")
    Paiement GetByStatute(String statute);

    Paiement FindByStatute(String statute);
}
