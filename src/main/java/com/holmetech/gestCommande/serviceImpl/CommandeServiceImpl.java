package com.holmetech.gestCommande.serviceImpl;

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
    public List<Commande> getCommandesClient(Long clientId) {
        return null;
    }

    @Override
    public Commande getCommande() {
        return null;
    }


    @Override
    public Commande getCommande(Date date) { return commandeRepos.findByDateCommand(date);

    }


    @Override
    public int generateNumero(Long id) {
        int random = 1;
        int randNumb = (int) random(10000);
        Commande comm = commandeRepos.getById(id);
        try{
            List<Commande> commandeList = commandeRepos.findAll();
            for (Commande commande : commandeList){
                if (commande.getNumero() == randNumb){

                    int i = 10000;
                    int newRandNumb = (10000);
                    comm.setNumero(newRandNumb);

                    return newRandNumb;

                }
            }
            comm.setNumero(randNumb);
            return randNumb;
        }catch (Exception e) {
            System.out.println(e.getMessage());

            int i = 10000;
            int newRandNumb = (10000);
            comm.setNumero(newRandNumb);
            return newRandNumb;
        }

    }

    private Object random(int i) {
        return null;
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
