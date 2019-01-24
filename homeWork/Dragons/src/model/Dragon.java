package model;

public class Dragon {
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int power;
    private int bonusPower;

    public Dragon(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public String binaryConverter(){
        String x = "";
        while (power > 0){
            int a = power % 2;
            x = a + x;
            power = power / 2;
        }
        return x;
    }

    public int getBonusPower() {
        return bonusPower;
    }

    public void setBonusPower(int bonusPower) {
        this.bonusPower = bonusPower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
