package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Client;
import com.company.CezaryBohdanowicz.Human.Human;

import java.util.HashSet;
import java.util.Set;

public class ListOfClients extends Client {

    public ListOfClients() {
        this.listOfClients = new HashSet<Client>();
    }

    public Set<Client> listOfClients;
    public Set<Car> listOfClientsCar;

    @Override
    public String toString() {
        return "\nListOfClients{" +
                "listOfClients=" + listOfClients +
                '}';
    }

    public void addClient() {
        this.listOfClients.add(new Client());
    }

    public void removeClient(Client client){
        this.listOfClients.remove(client);
    }

    public void addCar(Car car){
        this.listOfClientsCar.add(new Car());
    }
}
