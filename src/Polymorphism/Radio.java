package Polymorphism;

public class Radio implements Electronics {

    @Override
    public void turnOn() {
        System.out.println("Radio is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is turned off.");
    }

    @Override
    public void execute() {
        changeFrequency();
    }

    void changeFrequency() {
        System.out.println("Radio frequency changed");
    }
}