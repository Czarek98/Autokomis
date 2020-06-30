package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Client;

import java.util.HashMap;
import java.util.Map;

public class ListOfClients extends Client {

    public Map<Integer, Client> listOfClients;

    public ListOfClients() {
        this.listOfClients = new HashMap<>();
    }


    @Override
    public String toString() {
        return "\nlistOfClients=";
    }



}
