package com.company.CezaryBohdanowicz;

import java.util.Random;

public class Parts {

    public boolean brakes;
    public boolean suspension;
    public boolean engine;
    public boolean body;
    public boolean gearbox;

    public boolean getBrakes() {
        return this.brakes;
    }

    public boolean getSuspension() {
        return this.suspension;
    }

    public boolean getEngine() {
        return this.engine;
    }

    public boolean getBody() {
        return this.body;
    }

    public boolean getGearbox() {
        return this.gearbox;
    }


    public void setBrakes() {
        this.brakes = isBroken(true);
    }

    public void setSuspension() {
        this.suspension = isBroken(true);
    }

    public void setEngine() {
        this.engine = isBroken(true);
    }

    public void setbody() {
        this.body = isBroken(true);
    }

    public void setGearbox() {
        this.gearbox = isBroken(true);
    }


    public void setBrakesBroke() {
        this.brakes = isBroken(false);
        System.out.println("Brakes are broken");
    }

    public void setSuspensionBroke() {
        this.suspension = isBroken(false);
        System.out.println("Suspension is broken");
    }

    public void setEngineBroke() {
        this.engine = isBroken(false);
        System.out.println("Engine is broken");
    }

    public void setBodyBroke() {
        this.body = isBroken(false);
        System.out.println("body is broken");
    }

    public void setGearboxBroke() {
        this.gearbox = isBroken(false);
        System.out.println("Gearbox is broken");
    }

    public String checkBrakes() {
        if (!this.brakes) {
            return "Broken";
        } else {
            return "Good";
        }
    }

    public String checkSuspension() {
        if (!this.suspension) {
            return "Broken";
        } else {
            return "Good";
        }
    }

    public String checkEngine() {
        if (!this.engine) {
            return "Broken";
        } else {
            return "Good";
        }
    }

    public String checkBody() {
        if (!this.body) {
            return "Broken";
        } else {
            return "Good";
        }
    }

    public String checkGearbox() {
        if (!this.gearbox) {
            return "Broken";
        } else {
            return "Good";
        }
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
