package base;

import java.util.Random;

public class Knight extends ArenaFighter {

    private float shield;
    private Random random;

    public Knight(String name, int health, int attack, double defense, float shield) {
        super(name, health, attack, defense);
        this.shield = shield;
        random = new Random();
    }

    @Override
    public void takeDamage(int damage) {
        if (random.nextGaussian() > shield)
        super.takeDamage(damage);
    }
}
