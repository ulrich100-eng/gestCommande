package com.holmetech.gestCommande.repos;

import com.holmetech.gestCommande.model.Article;
import com.holmetech.gestCommande.model.Commande;
import com.holmetech.gestCommande.model.Contenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContenuRepos extends JpaRepository<Contenu,Long> {

    //@Query(value = "SELECT * FROM contenu Where quantity:=qty",nativeQuery = true)
    //Contenu contenuGetByQuantity(Long qte);
    //@Query(value = "SELECT u FROM CONTENU WHERE u.quantity:qty")
    //Contenu GetByQuantity(Long qte);

    //Contenu FindByQuantity(Long qte);



    //@Query(value = "SELECT * FROM contenu Where article:=article",nativeQuery = true)
    //Contenu contenuGetByArticle(Article article );
    //@Query(value = "SELECT u FROM CONTENU WHERE u.article:=article")
    //Contenu GetByArticle(Article article);

   // Contenu FindByArticle(Article article);


    //@Query(value = "SELECT * FROM contenu WHERE command:=command",nativeQuery = true)
    //Contenu contenuGetByCommand(Commande commande);
    //@Query(value = "SELECT U FROM CONTENU WHERE u.command=command")
    //Contenu GetByCommand(Commande commande);

    Contenu FindByCommand(Commande commande);

    Contenu FindByArticle(Article article);


    //@Query(value = "SELECT * FROM contenu WHERE prixtotal:=prixtotal",nativeQuery = true)
    //Contenu contenuGetByPrixtotal(Double prixtotal);
   // @Query(value = "SELECT u FROM CONTENU WHERE u.prixtotal:=prixtotal")
    //Contenu GetByPrixtotal(Double prixtotal);

    //Contenu FindByPrixtotal(Double prixtotal);




}
