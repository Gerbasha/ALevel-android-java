import model.Dragon;

public class Arena {
    public void fight(Dragon fstDng, Dragon scndDgn){
        int rounds = 0;
        countBonus(fstDng,scndDgn);
        while (fstDng.getHealth() >  0 && scndDgn.getHealth() > 0){

            fstDng.setHealth(fstDng.getHealth() - (scndDgn.getAttack() * scndDgn.getBonusPower()));
            scndDgn.setHealth(scndDgn.getHealth() - (fstDng.getAttack() * fstDng.getBonusPower()));

            rounds++;
            if (fstDng.getHealth() <= 0){
                System.out.println(scndDgn.getName() + " won, " + fstDng.getName() + " lost in " + rounds + " round.");
            } else if (scndDgn.getHealth() <= 0) {
                System.out.println(fstDng.getName() + " won, " + scndDgn.getName() + " lost in " + rounds + " round.");
            } else if (fstDng.getHealth() < 0 && scndDgn.getHealth() < 0){
                System.out.println("Oops, we have a dead heat.");
            }
        }
    }
    public void countBonus(Dragon dragon1, Dragon dragon2){
//        int tmpPower = dragon1.getPower() ^ dragon2.getPower();
//        int complimentTmpPower = ~tmpPower;
//        dragon2.setBonusPower(~(complimentTmpPower | dragon1.getPower()) * dragon2.getAttack());
//        dragon1.setBonusPower(~(complimentTmpPower | dragon2.getPower()) * dragon1.getAttack());


        int tmpPower = dragon1.getPower() ^ dragon2.getPower();
        int complimentTmpPower = ~tmpPower;
        int dragon2Multiplier = complimentTmpPower | dragon1.getPower();
        int dragon1Multiplier = complimentTmpPower | dragon2.getPower();
        int complimentDragon2Multiplier = ~dragon2Multiplier;
        int complimentDragon1Multiplier = ~dragon1Multiplier;
        dragon2.setBonusPower(complimentDragon2Multiplier * dragon2.getAttack());
        dragon1.setBonusPower(complimentDragon1Multiplier * dragon1.getAttack());



    }
}

