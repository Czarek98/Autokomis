package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Client;
import com.company.CezaryBohdanowicz.Human.Human;

import java.util.Set;

public class ListOfClients {

    public Set<Human> listOfClients;

    public ListOfClients(Set<Human> listOfClients) {
        this.listOfClients = listOfClients;
    }

    public void addClient(){
        this.listOfClients.add(new Client());
    }

    public void removeClient(Client client){
        this.listOfClients.remove(client);
    }

}
