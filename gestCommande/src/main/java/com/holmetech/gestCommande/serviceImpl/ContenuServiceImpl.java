package com.holmetech.gestCommande.serviceImpl;

import com.holmetech.gestCommande.model.Article;
import com.holmetech.gestCommande.model.Commande;
import com.holmetech.gestCommande.model.Contenu;
import com.holmetech.gestCommande.repos.ContenuRepos;
import com.holmetech.gestCommande.service.ContenuService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ContenuServiceImpl implements ContenuService {
    ContenuRepos contenuRepos;

    public ContenuServiceImpl(ContenuRepos contenuRepos){
        this.contenuRepos=contenuRepos;}

    @Override
    public List<Contenu> allContenu(){
        return contenuRepos.findAll();}

    @Override
    public Contenu getContenu(Article article){ return contenuRepos.FindByArticle(article);}

    @Override
    @Transactional
    public Contenu saveContenu(Contenu contenu) {
        try { Contenu bean = contenuRepos.FindByArticle(contenu.getArticle());
            if (bean != null && bean.getId() > 0) {
                return new Contenu();
            }
            return contenuRepos.save(contenu);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return new Contenu();

        }
    }

    @Override
    @Transactional
    public Contenu updateContenu(Contenu contenu) {
        try { Contenu bean = contenuRepos.FindByArticle(contenu.getArticle());
            if(bean != null && bean.getId()!= contenu.getId()) {
                return new Contenu();
            }
            return contenuRepos.save(contenu);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return new Contenu();

        }
    }

    @Override
    public String deleteContenu(Long id) {
        Contenu bean = contenuRepos.findById(id).orElse(new Contenu());
        contenuRepos.findById(id);
        if(bean.getId()>0){
            contenuRepos.delete(bean);
            return "Supprimer";
        }
        return "Error";
    }
}
