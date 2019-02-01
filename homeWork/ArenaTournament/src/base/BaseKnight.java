package base;

import java.util.Random;

public class BaseKnight extends ArenaFighter {

    float shield;
    Random random;

    public BaseKnight(String name, int health, int attack, double defense, float shield) {
        super(name, health, attack, defense);
        this.shield = shield;
        random = new Random();
    }

    @Override
    public void takeDamage(int damage) {
        if (random.nextGaussian() > 0.5)
        super.takeDamage(damage);
    }
}
