package model;

import java.util.Random;

public class DragonCreator {
    public Dragon[] createDragons() {
        Dragon dragonA = new Dragon("dragonA",2200, 5,0.12);
        Dragon dragonB = new Dragon("dragonB",2050, 9,0.10);
        Dragon dragonC = new Dragon("dragonC",2100, 7,0.18);
        Dragon dragonD = new Dragon("dragonD",2150, 6,0.13);
        Dragon dragonE = new Dragon("dragonE",1990, 8,0.15);
        Dragon dragonF = new Dragon("dragonF",2560, 5,0.11);
        Dragon dragonG = new Dragon("dragonG",3000, 6,0.13);
        Dragon dragonH = new Dragon("dragonH",2840, 9,0.12);
        Dragon dragons[] = {dragonA, dragonB, dragonC, dragonD, dragonE, dragonF, dragonG, dragonH};

        for (int i = 0; i < dragons.length; i++) {
            Random random = new Random();
            int randomValue = random.nextInt(15) + 1;
            dragons[i].setPower(randomValue);
        }
        return dragons;
    }


}