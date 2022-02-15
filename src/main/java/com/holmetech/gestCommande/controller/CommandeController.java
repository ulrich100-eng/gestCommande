package com.holmetech.gestCommande.controller;

import com.holmetech.gestCommande.model.Client;
import com.holmetech.gestCommande.model.Commande;
import com.holmetech.gestCommande.service.ClientService;
import com.holmetech.gestCommande.service.CommandeService;
import com.holmetech.gestCommande.utils.Constantes;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Enumeration;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(Constantes.PATH+ "commande")

public class CommandeController {
    public CommandeService service;

    public CommandeController(CommandeService service){
        this.service=service;

    }
    @GetMapping("/")
    public List<Commande> alls(){
        return service.allCommande();
    }
    @GetMapping("/commande/{value}")
    public Commande getByCommande(@PathVariable Date value) {
        return this.service.getCommande();
    }
    @PostMapping("/")
    public  Commande create(@RequestBody Commande commande){
        return this.service.saveCommande(commande);
    }
    @PutMapping("/")
    public Commande update(@RequestBody Commande commande){
        return this.service.updateCommande(commande);
    }
    @DeleteMapping("/delete/{idCommande")
    public String delete(@PathVariable Long idCommande){
        return this.service.deleteCommande(idCommande);
    }

}
