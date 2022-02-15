package com.holmetech.gestCommande.service;

import com.holmetech.gestCommande.model.Article;
import com.holmetech.gestCommande.model.Contenu;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public interface ContenuService {
    Contenu getContenu(Long commandeId);

    List<Contenu>allContenu();

        Contenu getContenu(Article  article);
        Contenu saveContenu(Contenu contenu ,Long commandeId, Long articleId);
        Contenu updateContenu(Contenu contenu, Long commandeId , Long articleId);
        String deleteContenu(Long id);

    @Transactional
    Contenu saveContenu(Contenu contenu);

    Contenu updateContenu(Contenu contenu);
}
