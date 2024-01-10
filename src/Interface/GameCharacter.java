package Interface;

public interface GameCharacter {
    void jump();

    void moveLeft();

    void moveRight();

    String getSpecialAbility();

    void takeDamage(int damage);

    boolean isAlive();

    int xp();
}
