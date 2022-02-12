package com.holmetech.gestCommande.serviceImpl;

import com.holmetech.gestCommande.model.Commande;
import com.holmetech.gestCommande.model.Contenu;
import com.holmetech.gestCommande.model.Paiement;
import com.holmetech.gestCommande.repos.PaiementRepos;
import com.holmetech.gestCommande.service.PaiementService;
import org.apache.catalina.Store;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PaiementServiceImpl implements PaiementService{
    PaiementRepos paiementRepos;

    public PaiementServiceImpl(PaiementService paiementService){
        this.paiementRepos=paiementRepos;}

    @Override
    public List<Paiement> allPaiement() {
        return paiementRepos.findAll();}

    @Override
    public Paiement getPaiement(Commande commande) { return PaiementRepos.FindByCommand(commande);}

    @Override
    @Transactional
    public Paiement savePaiement(Paiement paiement) {
        try { Paiement bean = PaiementRepos.FindByCommand(paiement.getCommand());
            if (bean != null && bean.getId() > 0) {
                return new Paiement();
            }
            return paiementRepos.save(paiement);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return new Paiement();

        }
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        try { Paiement bean = PaiementRepos.FindByCommand(paiement.getCommand());
            if(bean != null && bean.getId()!= paiement.getId()) {
                return new Paiement();
            }

            return paiementRepos.save(paiement);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return new Paiement();

        }
    }

    @Override
    public String deletePaiement(Long id) {
        Paiement bean = paiementRepos.findById(id).orElse(new Paiement());
        paiementRepos.findById(id);
        if(bean.getId()>0){
            paiementRepos.delete(bean);
            return "Supprimer";
        }
        return "Error";

    }
}
