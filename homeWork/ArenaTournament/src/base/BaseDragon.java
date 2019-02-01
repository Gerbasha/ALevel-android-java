package base;

public class BaseDragon extends ArenaFighter {

//    public static final int FIRE = 0b0001;
//    public static final int EARTH = 0b0010;
//    public static final int WATER = 0b0100;
//    public static final int WIND = 0b1000;
//    int power;
//    int powers[] = {FIRE, EARTH, WATER, WIND};
    Elements elements;

    public BaseDragon(String name, int health, int attack, double defense, Elements elements) {
        super(name, health, attack, defense);
        this.elements = elements;
    }

    public int getElements() {
        return elements.getValue();
    }

    public int getPowerMultiplier(int power) {
        int difPower = this.elements.getValue() ^ power;
        int count = 1;
        for (Elements p : Elements.values()) {
            count += (difPower & p.getValue()) > 0 ? 1 : 0;
        }
        return count;
    }

    public int countAttack(ArenaFighter fighter) {
        int bonusAttack = getPowerMultiplier(fighter instanceof BaseDragon ? ((BaseDragon) fighter).getElements() : 0);
        return fighter.getAttack() * bonusAttack;
    }

    @Override
    public void attackArenaFighter(ArenaFighter fighter) {
        int attack = countAttack(fighter);
        fighter.takeDamage(attack);
    }
}