package model;

public class Dragon {
    private String name;
    private float health;
    private float attack;
    private double defense;
    private int power;
    private float bonusPower;
    private float fullHP;
    private float basicAttack;


    public Dragon(String name, int health, float attack, double defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public float getBonusPower() {
        return bonusPower;
    }

    public void setBonusPower(float bonusPower) {
        this.bonusPower = bonusPower;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAttack() {
        return attack;
    }

    public void setAttack(float attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getFullHP() {
        return fullHP;
    }

    public void setFullHP(float fullHP) {
        this.fullHP = fullHP;
    }

    public float getBasicAttack() {
        return basicAttack;
    }

    public void setBasicAttack(float basicAttack) {
        this.basicAttack = basicAttack;
    }
}