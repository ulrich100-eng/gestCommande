package com.holmetech.gestCommande.repos;

import com.holmetech.gestCommande.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;



@Repository
public interface ClientRepos extends JpaRepository<Client,Long> {


    @Query(value = "SELECT * FROM client Where firstname=:name",nativeQuery = true )
    Client clientGetByNom(String firstname);
    @Query(value = "SELECT u FROM CLIENT u WHERE u.firstname=:name")
    Client getByNom(String nom);

    Client findByNom(String nom);

    @Query(value = "SELECT * FROM client Where lastname=:lastname", nativeQuery = true )
    Client clientGetByLastname(String lastname);
    @Query(value= "SELECT u FROM CLIENT u WHERE u.lastname=:lastname")
    Client getByLastname(String lastname);

    Client findByLastname(String lastname);

    @Query(value = "SELECT * FROM client Where email=:email", nativeQuery = true )
    Client clientGetByEmail(String email);
    @Query(value= "SELECT u FROM CLIENT u WHERE u.email=:email")
    Client getByEmail(String email);

    Client findByEmail(String email);

    @Query(value = "SELECT * FROM client Where login=:login", nativeQuery = true )
    Client clientGetByLogin(String login);
    @Query(value= "SELECT u FROM CLIENT u WHERE u.login=:login")
    Client getByLogin(String login);

    Client findByLogin(String login);

    @Query(value = "SELECT * FROM client Where password=:password", nativeQuery = true )
    Client clientGetByPassword(String password);
    @Query(value= "SELECT u FROM CLIENT u WHERE u.password=:password")
    Client getByPassword(String password);

    Client findByPassword(String password);

    @Query(value = "SELECT * FROM client Where number=:number", nativeQuery = true )
    Client clientGetByNumber(Long number);
    @Query(value= "SELECT u FROM CLIENT u WHERE u.number=:number")
    Client getByNumber(Long number);

    Client findByNumber(Long number);


    @Query(value = "SELECT * FROM client Where statute=:statute", nativeQuery = true )
    Client clientGetByStatute(String statute);
    @Query(value= "SELECT u FROM CLIENT u WHERE u.statute=:statute")
    Client getByStatute(String statute);

    Client findByStatute(String statute);





}
