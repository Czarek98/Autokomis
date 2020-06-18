package com.company.CezaryBohdanowicz.Human;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Client extends Human {
    public Client() {
        this.firstname = nameClientGenerator();
        this.clientCash = clientCashGenerator();
    }

    public String firstname;
    public Double clientCash;

    public Double clientCashGenerator(){
        return clientCash = ThreadLocalRandom.current().nextDouble(5000.0, 1000000.0 + 1);
    }

    public String  nameClientGenerator(){
        Random random = new Random();
        String[] clientNames= {"Tomek", "Ania", "Czarek", "Sebastian", "Mirek", "Janusz", "Grażyna", "Basia", "Arek", "Adam"};
        return firstname = clientNames[random.nextInt(clientNames.length)];
    }
}
