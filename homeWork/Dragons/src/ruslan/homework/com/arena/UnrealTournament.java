package ruslan.homework.com.arena;


import ruslan.homework.com.fighters.Dragon;
import ruslan.homework.com.fighters.FightersCreator;

public class UnrealTournament {
    Arena arena = new Arena();

    public void startTournament(){
        finalTour();
    }

    public Dragon[] firstTour(){
        System.out.println("We start a first tour.");
        FightersCreator dragonCreator = new FightersCreator();
        Dragon[] dragonsFstTour = dragonCreator.createDragons();
        Dragon[] dragonsScndTour = new Dragon[dragonsFstTour.length / 2];
        int j = 0;

        System.out.println("List of all dragons: ");
        for (int i = 0; i < dragonsFstTour.length; i++){
            System.out.println("Name: " + dragonsFstTour[i].getName() + "; Health: " + dragonsFstTour[i].getHealth() +
                    "; Attack: " + dragonsFstTour[i].getAttack() + "; Defense: " + dragonsFstTour[i].getDefense() + ";");
        }

        for (int i = 0; i < dragonsFstTour.length - 1; i++){
                dragonsScndTour[j] = arena.fight(dragonsFstTour[i],dragonsFstTour[i+1]);
                j++;
                i++;
        }
        return dragonsScndTour;
    }

    public Dragon[] secondTour(){
        Dragon[] dragonsScndTour = firstTour();
        Dragon[] dragonsThirdTour = new Dragon[dragonsScndTour.length /2];
        int j = 0;
        System.out.println();
        System.out.println("We start a second tour.");
        for (int i = 0; i < dragonsScndTour.length; i++){
            dragonsThirdTour[j] = arena.fight(dragonsScndTour[i], dragonsScndTour[i+1]);
            j++;
            i++;
        }
        return dragonsThirdTour;
    }

    public void finalTour(){
        Dragon[] dragonsThirdTour = secondTour();
        System.out.println();
        System.out.println("We start a final tour.");
        int i = 0;
        Dragon winner = arena.fight(dragonsThirdTour[i], dragonsThirdTour[i+1]);
        System.out.println("And the winner is ..... " + winner.getName());
    }
}
