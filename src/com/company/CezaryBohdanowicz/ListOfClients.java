package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Client;
import com.company.CezaryBohdanowicz.Human.Human;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ListOfClients extends Client {

    public Map<Integer, Client> listOfClients;

    public ListOfClients() {
        this.listOfClients = new HashMap<>();
    }


    @Override
    public String toString() {
        return "\nlistOfClients=";
    }

    public void addClient(Integer indexOfClient, Client client) {
        this.listOfClients.put(indexOfClient, client);
    }

    public void removeClient(Integer indexOfClient) {
        this.listOfClients.remove(indexOfClient);
    }

    public Client getClient(Integer indexOfClient) {
        return listOfClients.get(indexOfClient);
    }


}
