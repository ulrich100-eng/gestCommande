package com.holmetech.gestCommande.serviceImpl;

import com.holmetech.gestCommande.model.Article;
import com.holmetech.gestCommande.repos.ArticleRepos;
import com.holmetech.gestCommande.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    ArticleRepos articleRepos;

    public ArticleServiceImpl(ArticleRepos articleRepos) {
        this.articleRepos = articleRepos;
    }



    @Override
    public List<Article> allArticle() {
        return articleRepos.findAll();
    }

    @Override
    public Article getArticle(String reference) {
        return articleRepos.findByReference(reference);
    }

    @Override
    @Transactional
    public Article saveArticle(Article article) {
        try {
            Article bean = articleRepos.findByReference(article.getReference());
            if (bean != null && bean.getId() > 0) {
                return new Article();
            }
            return articleRepos.save(article);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new Article();
        }
    }

    @Override
    @Transactional
    public Article updateArticle(Article article) {
        try {
            Article bean = articleRepos.findByReference(article.getReference());
            if (bean != null && bean.getId() != article.getId()) {
                return new Article();
            }
            return articleRepos.save(article);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new Article();
        }
    }

    @Override
    public String deleteArticle(Long id) {
        Article bean = articleRepos.findById(id).orElse(new Article());
        articleRepos.findById(id);
        if (bean.getId() > 0) {
            articleRepos.delete(bean);
            return "Supprimer !";
        }
        return "Erreur";
    }
}
