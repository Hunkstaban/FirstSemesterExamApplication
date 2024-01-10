package Interface;

public class Luigi implements GameCharacter {
    private int health = 400;
    private boolean vacuumActive = false;

    @Override
    public void jump() {
        System.out.println("Luigi jumps!");
    }

    @Override
    public void moveLeft() {
        System.out.println("Luigi moves left");

    }

    @Override
    public void moveRight() {
        System.out.println("Luigi moves right");
    }

    @Override
    public String getSpecialAbility() {
        String notActive = "Luigi's vacuum is not active";
        String active = "Luigi's vacuum is active and sucking the ghosts! YAA!";
        if (vacuumActive == false) {
            return notActive;
        } else {
            return active;
        }
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println("Luigi took damage!");
        health = health - damage;
        if (isAlive() == false) {
            System.out.println("GAME OVER! Luigi died");
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
