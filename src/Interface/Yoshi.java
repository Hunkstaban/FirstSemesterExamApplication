package Interface;

public class Yoshi implements GameCharacter {
    private int health = 200;
    private boolean tongueActive = false;

    @Override
    public void jump() {
        System.out.println("Yoshi jumps!");
    }

    @Override
    public void moveLeft() {
        System.out.println("Yoshi moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("Yoshi moves right");
    }

    @Override
    public String getSpecialAbility() {
        String notActive = "Yoshi's special tongue ability is not active";
        String active = "Yoshi's special tongue ability is active! MLEM!";
        if (tongueActive == false) {
            return notActive;
        } else {
            return active;
        }
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println("Yoshi took damage!");
        health = health - damage;
        if (isAlive() == false) {
            System.out.println("GAME OVER! Yoshi died");
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
