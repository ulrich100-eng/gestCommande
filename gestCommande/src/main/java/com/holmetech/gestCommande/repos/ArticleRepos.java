package com.holmetech.gestCommande.repos;


import com.holmetech.gestCommande.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepos extends JpaRepository<Article,Long>{
    @Query(value = "SELECT * FROM article Where reference=:ref",nativeQuery = true)
    Article articleGetByReference(String ref);

    @Query(value = "SELECT u FROM Article WHERE u.reference = :ref")
    Article getByRef(String ref);

    Article findByReference(String reference);


    @Query(value = "SELECT * FROM article Where designation=:des",nativeQuery = true)
    Article articleGetByDesignation(String des);
    @Query(value = "SELECT * FROM Article u WHERE u.designation = :des")
    Article getByDes(String des);
    Article findByDesignation(String designation);

    @Query(value = "SELECT * FROM article Where prix=:prix",nativeQuery = true)
    Article articleGetByPrix(Double prix);
    @Query(value = "SELECT u FROM Article WHERE u.prix =: prix")
    Article getByPrix(Double prix);
    Article findByPRIX(Double prix);

}

