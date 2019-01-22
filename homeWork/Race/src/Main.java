import model.Car;
import model.Track;

public class Main {

    public static Car racerMark = new Car("QS739", "Subaru", 2, 22, 0.4, 0);
    public static Car racerTom = new Car("RX502", "Toyota", 3, 25, 0.3, 0);
    public static Car racerJim = new Car("LT831", "BMW", 2, 30, 0.25, 0);

    public static Track myTrack = new Track(4,0.42);
    public static int distance = 0;

    public static void main(String[] args) {
        startRace();
    }

    public static void checkCar(Car car, Track track){
        if(car.getFuelVol()/car.getFuelConsumption() < track.getTrackLength() | car.getDirtRate() > 0.6 && car.getStops() != 3){
            System.out.println("Car " + car.getName() + " made a pit stop. \ndetails: " + " fuel = " + car.getFuelVol() + " litters. dirt rate = " + car.getDirtRate() + "\n" );
            switch (car.getBrand()) {
                case "Subaru":
                    car.setFuelVol(22);
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

    public static void circleRun(Car car, Track track){
        if (car.getStops() != 3){
            car.setFuelVol(car.getFuelVol() - car.getFuelConsumption());
            car.setDirtRate(track.getDirtRate() - (track.getDirtRate() * car.getDirtProtect()));
            car.setCarDistance(distance);
        }
        if (car.getCarDistance() % 4 > 0){
            car.setCircles(car.getCircles() + 1);
            car.setCarDistance(0);
        }
    }

    public static void result(){
        System.out.print("The race have been finished! \nThe winner is :");
        if (racerJim.getCircles() > racerTom.getCircles() && racerJim.getCircles() > racerMark.getCircles()){
            System.out.print(racerJim.getName());
        } else if (racerJim.getCircles() < racerTom.getCircles() && racerTom.getCircles() > racerMark.getCircles()){
            System.out.print(racerTom.getName());
        } else if (racerJim.getCircles() < racerMark.getCircles() && racerTom.getCircles() < racerMark.getCircles()){
            System.out.print(racerMark.getName());
        }
    }

    public static void startRace(){
        while (racerMark.getStops() < 3 || racerTom.getStops() < 3 || racerJim.getStops() < 3){
                checkCar(racerMark, myTrack);
                circleRun(racerMark, myTrack);

                checkCar(racerTom, myTrack);
                circleRun(racerTom, myTrack);

                checkCar(racerJim, myTrack);
                circleRun(racerJim, myTrack);
                distance++;
        }
        result();
    }
}
