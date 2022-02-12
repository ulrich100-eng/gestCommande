package com.holmetech.gestCommande.controller;


import com.holmetech.gestCommande.model.Client;
import com.holmetech.gestCommande.service.ClientService;
import com.holmetech.gestCommande.utils.Constantes;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(Constantes.PATH+ "client")
public class ClientController {

    public ClientService service;

    public ClientController(ClientService service){
        this.service=service;

    }
    @GetMapping("/")
    public List<Client> alls(){
        return service.allClient();
    }

    @GetMapping("/number/{value}")
    public Client getByNumber(@PathVariable Long value) {
        return this.service.getClient(value);
    }

    @PostMapping("/")
    public  Client create(@RequestBody Client client){
        return this.service.saveClient(client);
    }

    @PutMapping("/")
    public Client update(@RequestBody Client client){
        return this.service.updateClient(client);
    }

      @DeleteMapping("/delete/{idClient")
     public String delete(@PathVariable Long idClient){
    return this.service.deleteClient(idClient);
    }
}
