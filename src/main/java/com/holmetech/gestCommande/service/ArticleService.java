package com.holmetech.gestCommande.service;

import com.holmetech.gestCommande.model.Article;

import java.util.List;

public interface ArticleService {
    List<Article> allArticle();

    Article getArticle(String reference);

    Article saveArticle(Article article);

    Article updateArticle(Article article);

    String deleteArticle(Long id);



}
