package base;

public class BaseDragon extends ArenaFighter {

    Elements[] elements;

    public BaseDragon(String name, int health, int attack, double defense, Elements[] elements) {
        super(name, health, attack, defense);
        this.elements = elements;
    }

    public int countByteMask(){
        int byteMask = 0;
        for (Elements i : elements){
            byteMask |= i.getValue();
        }
        return byteMask;
    }

    public int getPowerMultiplier(int power) {
        int difPower = this.countByteMask() ^ power;
        int count = 1;
        for (Elements p : Elements.values()) {
            count += (difPower & p.getValue()) > 0 ? 1 : 0;
        }
        return count;
    }

    public int countAttack(ArenaFighter fighter) {
        int bonusAttack = getPowerMultiplier(fighter instanceof BaseDragon ? ((BaseDragon) fighter).countByteMask() : 0);
        return fighter.getAttack() * bonusAttack;
    }

    @Override
    public void attackArenaFighter(ArenaFighter fighter) {
        int attack = countAttack(fighter);
        fighter.takeDamage(attack);
    }
}