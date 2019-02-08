package ruslan.homework.com;

import ruslan.homework.com.fighters.Dragon;
import ruslan.homework.com.fighters.Knight;

public class Main {
    public static void main(String[] args) {

        Dragon dragonA = new Dragon("dragonA",100,15,0.6, Dragon.fire | Dragon.wind);

        Knight knightA = new Knight("knightA", 100,5,0.2, 0.9f);

        do {
            dragonA.attackArenaFighter(knightA);
            knightA.attackArenaFighter(dragonA);
        }while (dragonA.isAlive() && knightA.isAlive());
        System.out.println("Fight is over");
        if (dragonA.isAlive()){
            System.out.println(dragonA.getName() + " won");
        } else if (knightA.isAlive()){
            System.out.println(knightA.getName() + " won");
        } else
            System.out.println("Both are dead.");
    }
}