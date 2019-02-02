package base;

public class DarkKnight extends Knight {

    public int halfDamage;

    public DarkKnight(String name, int health, int attack, double defense, float shield) {
        super(name, health, attack, defense, shield);
    }

    private void heal() {
        setHealth(getHealth() + halfDamage);

    }

    public void getHalfDamage(ArenaFighter fighter) {
        halfDamage = fighter.attack / 2;
    }
}
