import base.Dragon;
import base.DragonRider;
import base.Elements;


public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("aa", 100,200,0.3, new Elements[]{Elements.WIND, Elements.FIRE});
        dragon.countByteMask();

        DragonRider rider = new DragonRider("asd",100,100,0.2);
        rider.attackArenaFighter(dragon);
        rider.countAttack();
        rider.countHealth();
    }
}
