package Polymorphism;

import IO.Input;

public class Appliances {
    static void chooseAppliance() {
        int customAppliance = Input.getInt("Which appliance do you want? 1. Fridge, 2. Radio");
        if (customAppliance == 1) {
            Electronics electronics = new Fridge();
            electronics.turnOn();
            electronics.execute();
            electronics.turnOff();
        } else {
            Electronics electronics = new Radio();
            electronics.turnOn();
            electronics.execute();
            electronics.turnOff();
        }

    }
}
