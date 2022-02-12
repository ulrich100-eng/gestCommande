package com.holmetech.gestCommande.service;

import com.holmetech.gestCommande.model.Article;
import com.holmetech.gestCommande.model.Contenu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContenuService {
    List<Contenu>allContenu();

        Contenu getContenu(Article  article);
        Contenu saveContenu(Contenu contenu);
        Contenu updateContenu(Contenu contenu);
        String deleteContenu(Long id);
}
