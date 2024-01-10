package Interface;

public class Mario implements GameCharacter {
    private int health = 500;
    private boolean mushroomActive = false;

    @Override
    public void jump() {
        System.out.println("Mario jumps! Wahoo");
    }

    @Override
    public void moveLeft() {
        System.out.println("Mario moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("Mario moves right");
    }

    @Override
    public String getSpecialAbility() {
        String notActive = "Mario has not eaten a mushroom";
        String active = "Mario has eaten a mushroom and is twice his size! WAHOO!";
        if (mushroomActive == false) {
            return notActive;
        } else {
            return active;
        }
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println("Mario took damage!");
        health = health - damage;
        if (isAlive() == false) {
            System.out.println("GAME OVER! Mario died");
        } else {
            System.out.println("His health is now: " + health);
        }
    }

    @Override
    public boolean isAlive() {
        if (health <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public int xp() {
        return 0;
    }
}
