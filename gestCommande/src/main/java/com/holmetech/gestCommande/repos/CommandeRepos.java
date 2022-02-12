package com.holmetech.gestCommande.repos;

import com.holmetech.gestCommande.model.Client;
import com.holmetech.gestCommande.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CommandeRepos extends JpaRepository<Commande, Long> {

    @Query(value = "SELECT * FROM commande Where number=:number",nativeQuery = true )
    Commande commandeGetByNumber(String number);
    @Query(value = "SELECT u FROM COMMANDE u WHERE u.number=:number")
    Commande getByNumber(String number);

    Commande findByNumber(String number);

    @Query(value = "SELECT * FROM commande Where client=:client",nativeQuery = true )
    Commande commandeGetByClient(String client);
    @Query(value = "SELECT u FROM COMMANDE u WHERE u.client=:client")
    Commande getByClient(String client);

    Commande findByClient(String client);


    @Query(value = "SELECT * FROM commande Where dateCommand=:date",nativeQuery = true )
    Commande commandeGetByDateCommand(Date date);
    @Query(value = "SELECT u FROM COMMANDE u WHERE u.dateCommand=:date")
    Commande getByDatecommand(Date date);

    Commande findByDateCommand(Date date);

    @Query(value = "SELECT * FROM commande Where statute=:statute",nativeQuery = true )
    Commande commandeGetByStatute(String statute);
    @Query(value = "SELECT u FROM COMMANDE u WHERE u.statute=:statute")
    Commande getByStatute(String statute);

    Commande findByStatute(String statute);
}
