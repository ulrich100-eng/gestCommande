package com.holmetech.gestCommande.controller;

import com.holmetech.gestCommande.model.Article;
import com.holmetech.gestCommande.model.Commande;
import com.holmetech.gestCommande.model.Contenu;
import com.holmetech.gestCommande.model.Paiement;
import com.holmetech.gestCommande.service.ContenuService;
import com.holmetech.gestCommande.service.PaiementService;
import com.holmetech.gestCommande.utils.Constantes;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(Constantes.PATH+ "paiement")
@RestController
@CrossOrigin("*")
public class PaiementController {
    public PaiementService service;

    public PaiementController(PaiementService service){
        this.service=service;
    }
    @GetMapping("/")
    public List<Paiement> alls(){
        return service.allPaiement();
    }

    @GetMapping("/paiement/{value}")
    public Paiement getByPaiement(@PathVariable Commande commande) {
        return this.service.getPaiement(commande);
    }

    @PostMapping("/")
    public  Paiement create(@RequestBody Paiement paiement){
        return this.service.savePaiement(paiement);
    }
    @PutMapping("/")
    public Paiement update(@RequestBody Paiement paiement){
        return this.service.updatePaiement(paiement);
    }
    @DeleteMapping("/delete/{idPaiement")
    public String delete(@PathVariable Long idPaiement){
        return this.service.deletePaiement(idPaiement);
    }



}
