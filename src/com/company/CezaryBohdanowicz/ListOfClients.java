package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Client;
import com.company.CezaryBohdanowicz.Human.Human;

import java.util.Set;

public class ListOfClients extends Human {

    @Override
    public String toString() {
        return "ListOfClients{" +
                "listOfClients=" + listOfClients +
                ", listOfClientsCar=" + listOfClientsCar +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public Set<Client> listOfClients;
    public Set<Car> listOfClientsCar;

    public ListOfClients() {
        this.listOfClients = listOfClients;
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
