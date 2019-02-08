package base;

public class Arena {
    public ArenaFighter startFight(ArenaFighter firstFighter, ArenaFighter secondFighter) {
        ArenaFighter winner = null;

        checkFighters(firstFighter, secondFighter);

        preFight(firstFighter, secondFighter);
        preFight(secondFighter, firstFighter);

        int rounds = 0;

        while (rounds < 10 && firstFighter.getHealth() > 0 && secondFighter.getHealth() > 0){

            firstFighter.doActionFight(secondFighter);
            secondFighter.doActionFight(firstFighter);

            rounds++;
            System.out.println(rounds + " / " + firstFighter.health +" / " + secondFighter.health);
            winner = checkWinner(firstFighter, secondFighter);
        }
        return winner;
    }

    private void swapFighters(ArenaFighter firstFighter, ArenaFighter secondFighter) {
        ArenaFighter tempFighter;
        tempFighter = firstFighter;
        firstFighter = secondFighter;
        secondFighter = tempFighter;
    }

    private void checkFighters(ArenaFighter firstFighter, ArenaFighter secondFighter) {
        if (secondFighter instanceof ActionPreFight) {
            swapFighters(firstFighter, secondFighter);
        }
    }

    public ArenaFighter checkWinner(ArenaFighter firstFighter, ArenaFighter secondFighter){
        ArenaFighter winner = null;
        if (firstFighter.getHealth() <= 0){
            winner = secondFighter;
        } else if (secondFighter.getHealth() <= 0 ){
            winner = firstFighter;
        }
        return winner;
    }

    private void preFight(ArenaFighter firstFighter, ArenaFighter secondFighter){

        if (firstFighter instanceof ActionPreFight) {

            if (firstFighter instanceof Dragon){
                ((Dragon) firstFighter).doActionPreFight(secondFighter);
            } else if (secondFighter instanceof Dragon) {
                ((Dragon) secondFighter).doActionPreFight(firstFighter);

            }
            ((ActionPreFight) firstFighter).doActionPreFight(firstFighter);
        }
    }
}
