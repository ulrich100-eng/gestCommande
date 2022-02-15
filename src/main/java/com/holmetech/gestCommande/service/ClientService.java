package com.holmetech.gestCommande.service;


import com.holmetech.gestCommande.model.Client;

import java.util.List;

public interface ClientService {
    List<Client> allClients();

    Client getClient(String email);

    List   <Client>  allClient();

    Client getClient(Long number);
    Client saveClient (Client client);
    Client updateClient (Client client);
    String deleteClient (Long id);
}
