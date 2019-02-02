package ruslan.homework.com.fighters;

import java.util.Random;

public class Knight extends ArenaFighter {
    float shield;
    Random random;

    public Knight(String name, int health, int attack,
                  double defense, float shield) {
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
