package base;

public class HollyKnight extends Knight implements ActionPostFight{
    private int heal;

    public HollyKnight(String name, int health, int attack, double defense, float shield, int heal) {
        super(name, health, attack, defense, shield);
        this.heal = heal;
    }

    public void heal(){
        int healthGone = getFullHP() - getHealth();
        if (healthGone >= heal){
            setHealth(getHealth() + heal);
        } else {
            setHealth(getHealth() + (heal - healthGone));
        }


    }

    @Override
    public void doActionPostFight() {
        heal();
    }
}
