import model.Dragon;

public class Main {
    public static void main(String[] args) {
        DragonCreator dragonCreator = new DragonCreator();
        Arena arena = new Arena();
        Dragon[] dragons = dragonCreator.createDragons();
        for (int i = 0; i < dragons.length; i++){
            System.out.println(dragons[i].getPower());
        }

        arena.fight(dragons[0], dragons[1]);


    }
}