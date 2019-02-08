package base;

import java.util.Random;

public class Knight extends ArenaFighter implements ActionFight{

    private float shield;
    private Random random;

    public Knight(String name, int health, int attack, double defense, float shield) {
        super(name, health, attack, defense);
        this.shield = shield;
        random = new Random();
    }

    @Override
    public void takeDamage(int damage) {
        double r = random.nextGaussian();
        if ( r > shield){
            super.takeDamage(damage);
        }

    }

    @Override
    public void doActionFight() {

    }

    @Override
    public void doActionFight(ArenaFighter fighter) {
        attackArenaFighter(fighter);
    }
}
