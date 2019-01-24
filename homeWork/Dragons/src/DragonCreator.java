import model.Dragon;

import java.util.Random;

public class DragonCreator {
    public Dragon[] createDragons() {
        Dragon dragonA = new Dragon("dragonA",1000, 20, 40);
        dragonA.setPower(8);
        Dragon dragonB = new Dragon("dragonB",1000, 18, 30);
        dragonB.setPower(10);
        Dragon dragonC = new Dragon("dragonC",1000, 5, 3);
        Dragon dragonD = new Dragon("dragonD",1000, 5, 3);
        Dragon dragonE = new Dragon("dragonE",1000, 5, 3);
        Dragon dragonF = new Dragon("dragonF",1000, 5, 3);
        Dragon dragonG = new Dragon("dragonG",1000, 5, 3);
        Dragon dragonH = new Dragon("dragonH",1000, 5, 3);
        Dragon dragons[] = {dragonA, dragonB, dragonC, dragonD, dragonE, dragonF, dragonG, dragonH};




//        for (int i = 0; i < dragons.length; i++) {
////            Random random = new Random();
////            int randomValue = random.nextInt(15);
////            dragons[i].setPower(randomValue);
//            System.out.println(dragons[i].binaryConverter());
//        }

        return dragons;




    }
}
