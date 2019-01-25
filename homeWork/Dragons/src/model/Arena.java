package model;

public class Arena {

    public Dragon fight(Dragon fstDgn, Dragon scndDgn) {
        int rounds = 0;
        countBonus(fstDgn, scndDgn);
        fstDgn.setFullHP(fstDgn.getHealth());
        scndDgn.setFullHP(scndDgn.getHealth());
        fstDgn.setBasicAttack(fstDgn.getAttack());
        scndDgn.setBasicAttack(scndDgn.getAttack());
        while (fstDgn.getHealth() > 0 && scndDgn.getHealth() > 0 && rounds < 10) {
            rounds++;
            countHealth(fstDgn, scndDgn);
            searchWinner(fstDgn, scndDgn, rounds);
        }

        Dragon winner = getWinner(fstDgn,scndDgn);
        return winner;
    }

    public void countBonus(Dragon fstDgn, Dragon scndDgn) {
        int tmpPower = fstDgn.getPower() ^ scndDgn.getPower();
        int complimentTmpPower = ~tmpPower;
        int dragon2Multiplier = complimentTmpPower | fstDgn.getPower();
        int dragon1Multiplier = complimentTmpPower | scndDgn.getPower();
        int complimentDragon2Multiplier = ~dragon2Multiplier;
        int complimentDragon1Multiplier = ~dragon1Multiplier;
        scndDgn.setBonusPower(complimentDragon2Multiplier * scndDgn.getAttack());
        fstDgn.setBonusPower(complimentDragon1Multiplier * fstDgn.getAttack());
    }

    public void countHealth(Dragon fstDgn, Dragon scndDgn) {
        int fsrDgnDeff = (int) (fstDgn.getDefense() * 100f);
        int scndDgnDeff = (int) (scndDgn.getDefense() * 100f);
        float fsrDgnAttack = fstDgn.getAttack() * fstDgn.getBonusPower() + fstDgn.getAttack();
        float scndDgnAttack = scndDgn.getAttack() * scndDgn.getBonusPower() + scndDgn.getAttack();
        fstDgn.setAttack(scndDgnDeff / 100f * fsrDgnAttack);
        scndDgn.setAttack(fsrDgnDeff / 100f * scndDgnAttack);
        fstDgn.setHealth(fstDgn.getHealth() - scndDgn.getAttack());
        scndDgn.setHealth(scndDgn.getHealth() - fstDgn.getAttack());
    }


    public void searchWinner(Dragon fstDgn, Dragon scndDgn, int rounds) {
        if (fstDgn.getHealth() <= 0) {
            System.out.println(scndDgn.getName() + " won, " + fstDgn.getName() + " dead in " + rounds + " round.");
        } else if (scndDgn.getHealth() <= 0) {
            System.out.println(fstDgn.getName() + " won, " + scndDgn.getName() + " dead in " + rounds + " round.");
        } else if (fstDgn.getHealth() < 0 && scndDgn.getHealth() < 0) {
            System.out.println("Oops, we have a dead heat.");
        }

        if (rounds >= 10) {
            if (fstDgn.getHealth() > scndDgn.getHealth()) {
                System.out.println("In 10th round " + fstDgn.getName() + " won with " + fstDgn.getHealth() + " HP.");
            } else {
                System.out.println("In 10th round " + scndDgn.getName() + " won with " + scndDgn.getHealth() + " HP.");
            }
        }
    }

    public Dragon getWinner(Dragon fstDgn, Dragon scndDgn){
        if (fstDgn.getHealth() > scndDgn.getHealth()) {
            fstDgn.setBonusPower(0);
            fstDgn.setHealth(fstDgn.getFullHP());
            fstDgn.setAttack(fstDgn.getBasicAttack());
            return fstDgn;
        } else if (fstDgn.getHealth() < scndDgn.getHealth()){
            scndDgn.setBonusPower(0);
            scndDgn.setHealth(scndDgn.getFullHP());
            scndDgn.setAttack(scndDgn.getBasicAttack());
            return scndDgn;
        } else {
            return null;
        }
    }
}