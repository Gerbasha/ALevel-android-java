package base;

public class Dragon extends ArenaFighter implements ActionPreFight{

    Elements[] elements;

    public Dragon(String name, int health, int attack, double defense, Elements[] elements) {
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

    public void countAttack(ArenaFighter fighter) {
        int bonusAttack = getPowerMultiplier(fighter instanceof Dragon ? ((Dragon) fighter).countByteMask() : 0);
        setAttack(getAttack() * bonusAttack);
    }

    @Override
    public void attackArenaFighter(ArenaFighter fighter) {
        fighter.takeDamage(attack);
    }

    @Override
    public void doActionPreFight() {

    }

    @Override
    public void doActionPreFight(ArenaFighter fighter) {
        countAttack(fighter);
    }

    @Override
    public void doActionFight() {

    }

    @Override
    public void doActionFight(ArenaFighter fighter) {
        attackArenaFighter(fighter);
    }
}