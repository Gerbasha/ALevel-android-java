package ruslan.homework.com.fighters;

public class DarkKnight extends Knight {

    private int heal;

    public DarkKnight(String name, int health, int attack, double defense, float shield, int heal) {
        super(name, health, attack, defense, shield);
        this.heal = heal;
    }

    public void heal(int damage){

    }
}
