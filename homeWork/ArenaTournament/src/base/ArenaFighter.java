package base;

abstract class ArenaFighter {
    String name;
    int health;
    int attack;
    double defense;
    int fullHP;

    public ArenaFighter(String name, int health, int attack, double defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.fullHP = health;
    }

    public void attackArenaFighter(ArenaFighter fighter){
        fighter.takeDamage(attack);
    }

    public void takeDamage(int damage){
        health -= damage * defense;
    }

    public boolean isAlive() {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
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

    public int getFullHP() {
        return fullHP;
    }

    public void setFullHP(int fullHP) {
        this.fullHP = fullHP;
    }
}

