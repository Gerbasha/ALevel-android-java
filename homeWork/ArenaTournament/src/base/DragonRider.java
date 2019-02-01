package base;

public class DragonRider extends ArenaFighter implements ActionPreFight {

    private Dragon petDragon = null;

    public DragonRider(String name, int health, int attack, double defense) {
        super(name, health, attack, defense);
    }

    public void countHealth(){
          setHealth(getHealth() + petDragon.getHealth());
    }

    public void countAttack() {
        setAttack(getAttack() + petDragon.getAttack());
    }

    private boolean isDragonAlive(DragonRider rider) {
        if (rider.getHealth() > rider.getFullHP()) {
            return true;
        } else return false;
    }

    @Override
    public void attackArenaFighter(ArenaFighter fighter) {
        if (fighter instanceof Dragon){
            petDragon = (Dragon) fighter;
        }
    }

    @Override
    public void goActionPreFight() {

    }
}
