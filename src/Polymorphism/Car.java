package Polymorphism;

import IO.Input;

public class Car {


    static void chooseMotor() {
        int customMotor = Input.getInt("Which motor do you want? 1. Electric, 2. Gas");
        if (customMotor == 1) {
            Motor motor = new ElectricMotor(200, 100);
            motor.turnOn();
            motor.makeSound();
            motor.turnOff();
        } else {
            Motor motor = new GasMotor(400, 100);
            motor.turnOn();
            motor.makeSound();
            motor.turnOff();
        }
    }

    static void badChooseMotor(Motor motor) {
        if (motor instanceof ElectricMotor) {
            motor = new ElectricMotor(400, 100);
            motor.turnOn();
            motor.makeSound();
            motor.turnOff();
        }
    }
}


