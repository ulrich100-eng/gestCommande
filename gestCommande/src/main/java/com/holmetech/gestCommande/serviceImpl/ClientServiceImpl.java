package com.holmetech.gestCommande.serviceImpl;

import com.holmetech.gestCommande.model.Client;
import com.holmetech.gestCommande.repos.ClientRepos;
import com.holmetech.gestCommande.service.ClientService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    ClientRepos clientRepos;

    public ClientServiceImpl (ClientRepos clientRepos){
        this.clientRepos=clientRepos;
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
        clientRepos.findById(id);
        if(bean.getId()>0){
            clientRepos.delete(bean);
            return "Supprimer";
        }
        return "Error";
    }
}
