package ruslan.homework.com.fighters;

abstract class ArenaFighter {
    private String name;
    private int health;
    private int attack;
    private double defense;
    private float fullHP;

    public ArenaFighter(String name, int health, int attack, double defense) {
        this.name = name;
        this.health = health;
        this.fullHP = health;
        this.attack = attack;
        this.defense = defense;
    }

    public void attackArenaFighter(ArenaFighter arenaFighter) {
        arenaFighter.takeDamage(attack);
    }

    public void takeDamage(int damage) {
        health -= damage * defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public boolean isAlive() {
        return health > 0;
    }
}