package model;


public class UnrealTournament {
    Arena arena = new Arena();


    public void startTournament(){

        finalTour();

    }

    public Dragon[] firstTour(){

        System.out.println("We start a first tour.");

        DragonCreator dragonCreator = new DragonCreator();
        Dragon[] dragonsFstTour = dragonCreator.createDragons();

        Dragon[] dragonsScndTour = new Dragon[dragonsFstTour.length / 2];
        int j = 0;

//        for (int i = 0; i < dragonsFstTour.length; i++){
//            System.out.println(dragonsFstTour[i].getPower() + "  " + dragonsFstTour[i].getHealth() + "  " + dragonsFstTour[i].getBonusPower());
//        }

        for (int i = 0; i < dragonsFstTour.length; i++){
            System.out.println(dragonsFstTour[i].getDefense());
        }

        for (int i = 0; i < dragonsFstTour.length - 1; i++){
                dragonsScndTour[j] = arena.fight(dragonsFstTour[i],dragonsFstTour[i+1]);
                j++;
                i++;
        }


//        for (int t = 0; t < dragonsScndTour.length; t++) {
//            System.out.println(dragonsScndTour[t].getName());
//        }
        return dragonsScndTour;
    }

    public Dragon[] secondTour(){

        Dragon[] dragonsScndTour = firstTour();
        Dragon[] dragonsThirdTour = new Dragon[dragonsScndTour.length /2];
        int j = 0;

//        for (int i = 0; i < dragonsScndTour.length; i++){
//            System.out.println(dragonsScndTour[i].getPower() + "  " + dragonsScndTour[i].getHealth() + "  " + dragonsScndTour[i].getBonusPower());
//        }

        System.out.println();
        System.out.println("We start a second tour.");
        for (int i = 0; i < dragonsScndTour.length; i++){
            dragonsThirdTour[j] = arena.fight(dragonsScndTour[i], dragonsScndTour[i+1]);
            j++;
            i++;
        }
//        for (int t = 0; t < dragonsThirdTour.length; t++) {
//            System.out.println(dragonsThirdTour[t].getName());
//        }
        return dragonsThirdTour;
    }

    public void finalTour(){
        Dragon[] dragonsThirdTour = secondTour();
        System.out.println();
        System.out.println("We start a final tour.");
//        System.out.println(dragonsThirdTour.length);
        int i = 0;

        Dragon winner = arena.fight(dragonsThirdTour[i], dragonsThirdTour[i+1]);
        System.out.println("And the winner is ..... " + winner.getName());
    }
}
