package ruslan.homework.com.fighters;

import java.util.Random;

public class FightersCreator {

    public ArenaFighter[] createFighters() {
        Dragon dragonA = new Dragon("DragonA", 2500, 25, 0.6, Dragon.fire | Dragon.wind);

        ArenaFighter[] fighters = new ArenaFighter[]{dragonA};
        return fighters;
    }

//    public Dragon[] createDragons() {
//        };
//
//        for (int i = 0; i < dragons.length; i++) {
//            Random random = new Random();
//            int randomValue = random.nextInt(15) + 1;
//            dragons[i].setPower(randomValue);
//        }
//        return dragons;
//    }
}