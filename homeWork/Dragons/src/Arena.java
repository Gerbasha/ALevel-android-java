import model.Dragon;

public class Arena {

    public void fight(Dragon fstDng, Dragon scndDgn) {
        int rounds = 0;
        countBonus(fstDng, scndDgn);
        while (fstDng.getHealth() > 0 && scndDgn.getHealth() > 0 && rounds < 10) {
            rounds++;
            countHealth(fstDng, scndDgn);
            searchWinner(fstDng, scndDgn, rounds);
        }
    }

    public void countBonus(Dragon dragonA, Dragon dragonB) {
        int tmpPower = dragonA.getPower() ^ dragonB.getPower();
        int complimentTmpPower = ~tmpPower;
        int dragon2Multiplier = complimentTmpPower | dragonA.getPower();
        int dragon1Multiplier = complimentTmpPower | dragonB.getPower();
        int complimentDragon2Multiplier = ~dragon2Multiplier;
        int complimentDragon1Multiplier = ~dragon1Multiplier;
        dragonB.setBonusPower(complimentDragon2Multiplier * dragonB.getAttack());
        dragonA.setBonusPower(complimentDragon1Multiplier * dragonA.getAttack());
    }

    public void countHealth(Dragon dragonA, Dragon dragonB) {
        int DAAttack = dragonA.getAttack() * dragonA.getBonusPower() + dragonA.getAttack();
        int DBAttack = dragonB.getAttack() * dragonB.getBonusPower() + dragonB.getAttack();
        dragonA.setHealth(dragonA.getHealth() - DBAttack);
        dragonB.setHealth(dragonB.getHealth() - DAAttack);
    }

    public void searchWinner(Dragon fstDng, Dragon scndDgn, int rounds) {
        if (fstDng.getHealth() <= 0) {
            System.out.println(scndDgn.getName() + " won, " + fstDng.getName() + " lost in " + rounds + " round.");
        } else if (scndDgn.getHealth() <= 0) {
            System.out.println(fstDng.getName() + " won, " + scndDgn.getName() + " lost in " + rounds + " round.");
        } else if (fstDng.getHealth() < 0 && scndDgn.getHealth() < 0) {
            System.out.println("Oops, we have a dead heat.");
        }

        if (rounds >= 10) {
            if (fstDng.getHealth() > scndDgn.getHealth()) {
                System.out.println("In 10th round " + fstDng.getName() + " won with " + fstDng.getHealth() + " HP.");
            } else {
                System.out.println("In 10th round " + scndDgn.getName() + " won with " + scndDgn.getHealth() + " HP.");
            }
        }
    }
}