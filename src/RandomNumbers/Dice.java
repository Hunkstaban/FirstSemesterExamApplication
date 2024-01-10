package RandomNumbers;

import java.util.Random;

public class Dice {

    private int sides;
    private Random random = new Random();

    public Dice(int sides) {
        this.sides = sides;
    }

    int rollDice(Dice dice) {
        return random.nextInt(sides) + 1;
    }


    public String printSides() {
        return "" + sides;
    }
}
