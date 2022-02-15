package com.holmetech.gestCommande.serviceImpl;

import com.holmetech.gestCommande.model.Client;
import com.holmetech.gestCommande.repos.ClientRepos;
import com.holmetech.gestCommande.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientServiceImpl<ClientRepo> implements ClientService {

    @Autowired
    ClientRepos clientRepos;

    @Override
    public List<Client> allClients() {
        return null;
    }

    @Override
    public Client getClient(String email) {
        return null;
    }

    @Override
    public List<Client> allClient(){ return clientRepos.findAll(); }

    @Override

    public Client getClient(Long number){ return clientRepos.findByNumber(number); }

    @Override
    @Transactional
    public Client saveClient(Client client){
     try{
         Client bean = clientRepos.findByNumber(client.getNumber());
         if (bean != null && bean.getId() > 0) {
             return new Client();
         }
         return clientRepos.save(client);
     } catch(Exception e){
         System.out.println(e.getMessage());
         return new Client();
     }

    }

    @Override
    @Transactional
    public Client updateClient(Client client) {
        try{
            Client bean = clientRepos.findByNumber(client.getNumber());
            if(bean != null && bean.getId()!= client.getId())
            {
                return  new Client();
            }
            return new Client();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return new Client();
        }
    }

    @Override
    public String deleteClient(Long id) {
        Client bean = clientRepos.findById(id).orElse(new Client());
        if(bean.getId()>0){
            clientRepos.delete(bean);
            return "Supprimer";
        }
        return "Error";
    }
}
