import model.Dragon;

public class Arena {
    public void fight(Dragon fstDng, Dragon scndDgn){
        int rounds = 0;
        fstDng.setBonusPower(countBonus(fstDng,scndDgn));
        scndDgn.setBonusPower(countBonus(fstDng,scndDgn));
        while (fstDng.getHealth() != 0 && scndDgn.getHealth() !=0){

            fstDng.setHealth(fstDng.getHealth() - (scndDgn.getAttack() * scndDgn.getBonusPower()));
            scndDgn.setHealth(scndDgn.getHealth() - (fstDng.getAttack() * fstDng.getBonusPower()));

            rounds++;
            if (fstDng.getHealth() == 0){
                System.out.println(scndDgn.getName() + " won, " + fstDng.getName() + " lost in " + rounds + " round.");
            } else if (scndDgn.getHealth() == 0) {
                System.out.println(fstDng.getName() + " won, " + scndDgn.getName() + " lost in " + rounds + " round.");
            } else if (fstDng.getHealth() < 0 && scndDgn.getHealth() < 0){
                System.out.println("Oops, we have a dead heat.");
            }
        }
    }
    public int countBonus(Dragon dragon1, Dragon dragon2){
        int power = dragon1.getPower() | dragon2.getPower();
        return power;

    }
}
