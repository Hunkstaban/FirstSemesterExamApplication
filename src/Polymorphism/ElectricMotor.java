package Polymorphism;

public class ElectricMotor extends Motor implements Electronics {


    public ElectricMotor(int horsePower, int oilLevel) {
        super(horsePower, oilLevel);
        needOilchange = false;
    }

    @Override
    public void turnOn() {
        System.out.println("Electric car turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Electric car turned off");
    }

    @Override
    public void execute() {
        makeSound();
    }

    @Override
    void makeSound() {
        System.out.println("The car says: Bzzzz Bzzz");
    }
}
