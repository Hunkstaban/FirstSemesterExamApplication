package Polymorphism;

public abstract class Motor implements Electronics {

    // defining variables and methods that should be available to all motors
    private int horsePower;
    private int oilLevel;
    boolean needOilchange;

    public Motor(int horsePower, int oilLevel) {
        this.horsePower = horsePower;
        this.oilLevel = oilLevel;
        this.needOilchange = false;
    }

    abstract void makeSound();


    void checkOilLevel() {
        if (oilLevel < 10) {
            needOilchange = true;
        }
    }
}
