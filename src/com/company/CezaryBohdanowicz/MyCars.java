package com.company.CezaryBohdanowicz;

import java.util.HashMap;
import java.util.Map;

public class MyCars {

    public Map<Integer, Car> myCars;

    public MyCars() {

        this.myCars = new HashMap<>();
    }

    @Override
    public String toString() {
        return "\nmyCars{" +
                "myCars=";
    }

}
