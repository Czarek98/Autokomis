package com.company.CezaryBohdanowicz.Human;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Client extends Human {

    public String firstname;
    public Double clientCash;

    public String roundTheNumber(Double notRound) {
        DecimalFormat df = new DecimalFormat(".00");
        return df.format(notRound);
    }

    @Override
    public String toString() {
        return "\nClient{" +
                "firstname='" + firstname + '\'' +
                ", clientCash=" + roundTheNumber(clientCash) +
                '}';
    }

    public Client() {
        this.firstname = nameClientGenerator();
        this.clientCash = clientCashGenerator();
    }

    public Double clientCashGenerator() {
        return clientCash = ThreadLocalRandom.current().nextDouble(5000.0, 1000000.0 + 1);
    }

    public String nameClientGenerator() {
        Random random = new Random();
        String[] clientNames = {"Tomek", "Ania", "Czarek", "Sebastian", "Mirek", "Janusz", "Grażyna", "Basia", "Arek", "Adam"};
        return firstname = clientNames[random.nextInt(clientNames.length)];
    }
}
