import model.Car;
import model.Track;

public class Main {

    public static Car racerMark = new Car("QS739", "Subaru", 2, 20, 0.4, 0);
    public static Car racerTom = new Car("RX502", "Toyota", 3, 25, 0.3, 0);
    public static Car racerJim = new Car("LT831", "BMW", 2, 30, 0.25, 0);

    public static Track myTrack = new Track(4,0.5);
    public static int distance = 0;

    public static void main(String[] args) {
        startRace();

    }

    public static void checkCar(Car car, Track track){
        if(car.getFuelVol()/car.getFuelConsumption() < track.getTrackLength() | car.getDirtRate() > 0.6){
            System.out.println("Cat " + car.getName() + " made a pit stop. \n details: " + " fuel = " + car.getFuelVol() + "l. dirt rate = " + car.getDirtRate() + "\n" );
            switch (car.getBrand()) {
                case "Subaru":
                    car.setFuelVol(20);
                    car.setDirtRate(0);
                    car.setStops(car.getStops() + 1);
                    break;
                case "Toyota":
                    car.setFuelVol(25);
                    car.setDirtRate(0);
                    car.setStops(car.getStops() + 1);
                    break;
                case "BMW":
                    car.setFuelVol(30);
                    car.setDirtRate(0);
                    car.setStops(car.getStops() + 1);
                    break;
            }
        }
    }

    public static void checkCircles(Car car){
        if (car.getStops() == 3) {
            System.out.println("Car " + car.getName() + " made 3 stops, finished the game with score: " + car.getCircles() + " circles. \n");
        }
    }

    public static void circleRun(Car car, Track track){
        car.setFuelVol(car.getFuelVol() - car.getFuelConsumption());
        car.setDirtRate(track.getDirtRate() - (track.getDirtRate() * car.getDirtProtect()));
        car.setCircles(car.getCircles() + 1);

    }

    public static void startRace(){
        while (true){

//            if (racerMark.getStops() < 3){
//                checkCar(racerMark, myTrack);
//                circleRun(racerMark, myTrack);
//                checkCircles(racerMark);
//
//            }
//
//            if (racerTom.getStops() < 3) {
//                checkCar(racerTom, myTrack);
//                circleRun(racerTom, myTrack);
//                checkCircles(racerTom);
//
//            }
//            if (racerJim.getStops() < 3){
//                checkCar(racerJim, myTrack);
//                circleRun(racerJim, myTrack);
//                checkCircles(racerJim);
//
//            }

            /** !! Не dirtRate не увелисивается, **/
            while (racerMark.getStops() < 3){
                checkCar(racerMark, myTrack);
                circleRun(racerMark, myTrack);
                checkCircles(racerMark);

            }

            while (racerTom.getStops() < 3) {
                checkCar(racerTom, myTrack);
                circleRun(racerTom, myTrack);
                checkCircles(racerTom);
            }
            while (racerJim.getStops() < 3){
                checkCar(racerJim, myTrack);
                circleRun(racerJim, myTrack);
                checkCircles(racerJim);
            }
            distance++;
            break;
        }
    }
}
