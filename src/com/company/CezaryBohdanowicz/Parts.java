package com.company.CezaryBohdanowicz;

import java.util.Random;

public class Parts {

    public boolean brakes;
    public boolean suspension;
    public boolean engine;
    public boolean body;
    public boolean gearbox;


    public String checkPart(boolean part) {
        if (part = isBroken(part)) {
            return "Broken";
        } else {
            return "Good";
        }
    }

    @Override
    public String toString() {
        return "\nParts{" +
                "brakes=" + checkPart(isBroken(brakes)) +
                ", suspension=" + checkPart(isBroken(suspension)) +
                ", engine=" + checkPart(isBroken(engine)) +
                ", body=" + checkPart(isBroken(body)) +
                ", gearbox=" + checkPart(isBroken(gearbox)) +
                '}' + "\n";
    }

    public Parts() {
        this.brakes = isBroken(new Random().nextBoolean());
        this.suspension = isBroken(new Random().nextBoolean());
        this.engine = isBroken(new Random().nextBoolean());
        this.body = isBroken(new Random().nextBoolean());
        this.gearbox = isBroken(new Random().nextBoolean());
    }

    public boolean isBroken(boolean isBroken) {
        return isBroken;
    }


}