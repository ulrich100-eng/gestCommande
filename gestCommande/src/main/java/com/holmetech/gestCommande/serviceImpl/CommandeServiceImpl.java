package com.holmetech.gestCommande.serviceImpl;

import com.holmetech.gestCommande.model.Client;
import com.holmetech.gestCommande.model.Commande;
import com.holmetech.gestCommande.repos.CommandeRepos;
import com.holmetech.gestCommande.service.CommandeService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {
    CommandeRepos commandeRepos;

    public CommandeServiceImpl (CommandeRepos commandeRepos){
        this.commandeRepos=commandeRepos;
    }
    @Override
    public List<Commande> allCommande(){ return commandeRepos.findAll(); }



    @Override
    public Commande getCommande(Date date) { return commandeRepos.findByDateCommand(date);

    }




    @Override
    @Transactional
    public Commande saveCommande(Commande commande) {
        try { Commande bean = commandeRepos.findByDateCommand(commande.getDateCommand());
            if (bean != null && bean.getId() > 0) {
                return new Commande();
            }
            return commandeRepos.save(commande);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return new Commande();

        }
    }

    @Override
    @Transactional
    public Commande updateCommande(Commande commande) {
        try{ Commande bean = commandeRepos.findByDateCommand(commande.getDateCommand());
            if (bean != null && bean.getId()!= commande.getId()) {
                return new Commande();
            } return new Commande();
    }catch (Exception e){
            System.out.println(e.getMessage());
            return new Commande();
        }
    }

    @Override
    public String deleteCommande(Long id) {
        Commande bean = commandeRepos.findById(id).orElse(new Commande());
        commandeRepos.findById(id);
        if(bean.getId()>0){
            commandeRepos.delete(bean);
            return "Supprimer";
        }
        return "Error";

    }


}
