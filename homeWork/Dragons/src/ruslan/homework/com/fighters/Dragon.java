package ruslan.homework.com.fighters;

public class Dragon extends ArenaFighter{

    public static final int fire = 0b0001;
    public static final int earth = 0b0010;
    public static final int water = 0b0100;
    public static final int wind = 0b1000;
    private int power;
    int powers[] = {fire, earth, water, wind};

    public Dragon(String name, int health, int attack, double defense, int power) {
        super(name, health, attack, defense);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void attackArenaFighter(ArenaFighter arenaFighter) {
        int attack = countAttack(arenaFighter);
        arenaFighter.takeDamage(attack);

    }
    public int countAttack(ArenaFighter arenaFighter){
        int bonusAttack = getPowerMultiplier(arenaFighter instanceof Dragon ? ((Dragon)arenaFighter).getPower() : 0);
        return arenaFighter.getAttack() * bonusAttack;
    }

    public int getPowerMultiplier(int power){
        int difPower = this.getPower() ^ power;
        int count = 1;
        for (int p : powers){
            count += (difPower & p) > 0 ? 1 : 0;
        }
        return count;
    }
}