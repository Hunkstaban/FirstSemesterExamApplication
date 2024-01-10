package Polymorphism;

public class GasMotor extends Motor implements Electronics {
    public GasMotor(int horsePower, int oilLevel) {
        super(horsePower, oilLevel);
        needOilchange = false;
    }

    @Override
    void makeSound() {
        System.out.println("The car says: Vrmmmm Vrmmmm");
    }

    @Override
    public void turnOn() {
        System.out.println("Gas car turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Gas car turned off");
    }

    @Override
    public void execute() {
        makeSound();
    }
}
