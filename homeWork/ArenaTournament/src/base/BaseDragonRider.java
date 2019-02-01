package base;

public class BaseDragonRider extends ArenaFighter implements ActionPreFight {

    public int dragonsHealth;

    public BaseDragonRider(String name, int health, int attack, double defense) {
        super(name, health, attack, defense);


    }

    @Override
    public void attackArenaFighter(ArenaFighter fighter) {
        super.attackArenaFighter(fighter);
    }

    public int countAttack(BaseDragon dragon) {
        return this.getAttack() * dragon.getAttack();
    }

    private boolean isDragonAlive(BaseDragonRider rider) {
        if (rider.getHealth() > rider.getFullHP()) {
            return true;
        } else return false;
    }

    @Override
    public void goActionPreFight() {

    }
}
