package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Human;

public interface Saleable {
    void Sell(Human player, Human client, Double price) throws Exception;
}
