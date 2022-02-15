package com.holmetech.gestCommande.controller;

import com.holmetech.gestCommande.model.Article;
import com.holmetech.gestCommande.model.Commande;
import com.holmetech.gestCommande.model.Contenu;
import com.holmetech.gestCommande.service.CommandeService;
import com.holmetech.gestCommande.service.ContenuService;
import com.holmetech.gestCommande.utils.Constantes;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.MidiChannel;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(Constantes.PATH+ "contenu")

public class ContenuController {
    public ContenuService service;

    public ContenuController(ContenuService service){
        this.service=service;

    }
    @GetMapping("/")
    public List<Contenu> alls(){
        return service.allContenu();
    }

    @GetMapping("/contenu/{value}")
    public Contenu getByContenu(@PathVariable Article article) {
        return this.service.getContenu(article);
    }

    @PostMapping("/")
    public  Contenu create(@RequestBody Contenu contenu){
        return this.service.saveContenu(contenu);
    }
    @PutMapping("/")
    public Contenu update(@RequestBody Contenu contenu){
        return this.service.updateContenu(contenu);
    }
    @DeleteMapping("/delete/{idContenu")
    public String delete(@PathVariable Long idContenu){
        return this.service.deleteContenu(idContenu);
    }
}
