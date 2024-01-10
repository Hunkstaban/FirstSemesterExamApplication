package Polymorphism;

public class Fridge implements Electronics {
    @Override
    public void turnOn() {
        System.out.println("Fridge is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fridge is turned off");
    }

    @Override
    public void execute() {
        cool();
    }

    void cool() {
        System.out.println("Fridge is cooling.");
    }


}
