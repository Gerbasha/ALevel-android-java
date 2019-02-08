import model.Car;
import model.Track;

public class Main {

    // Создаем экземпляр класса Car. В конструктор класса передаём параметры, которые нам необходимы.

    public static Car racerMark = new Car("QS739", "Subaru", 2, 22, 0.4, 0);
    public static Car racerTom = new Car("RX502", "Toyota", 3, 25, 0.3, 0);
    public static Car racerJim = new Car("LT831", "BMW", 2, 30, 0.25, 0);

    // Создаем экземпляр класса Трасса.

    public static Track myTrack = new Track(4,0.42);
    public static int distance = 0;

    public static void main(String[] args) {

        // В методе main мы вызываем метод startRace() который создали ниже.

        startRace();
    }

    //Создание метода checkCar(). Метод нужен для того, чтобы заправить машину, помыть её, при необходимости.
    // Метод принимает экземпляры класса кар и трэк. Далее мы ледаем проверку с
    // помощью оператора сравнения if. Если (car.getFuelVol()/car.getFuelConsumption() < track.getTrackLength()) бензина
    // НЕ хватит на полный круг ( || ) или (car.getDirtRate() > 0.6) уровень загрязненности авто больше нормы (&&) и
    // (car.getStops() != 3) авто ещё НЕ (!=) сделало 3 остановки то....
    // Далее выполняется оператор ветвления свич кейс, как она работает: switch (условие) в нашем случае мы передаем в
    // условие марку авто. Для этого у авто вызываем метод getBrand(). Далее у нас идут ответвления, если марка Subaru,
    // то выполняется блок кода который записан в case "Subaru", если марка Toyota -  case "Toyota". В окончании каждого
    // кейса есть break; он нужен для того, чтобы закончилось выполнение switch case. Если break не будет, то будут
    // проверятся все остальные кейсы, а это нам не нужно, т.к. нужный кейс уже был выполнен.
    // В самом кейсе, для автомобиля вызываются методы заправки setFuelVol (задать колличество бензина),
    // мойки setDirtRate (установить значение загрязненности на 0) и мы указываем что машина сделал ещё одну остановку setStops().

    public static void checkCar(Car car, Track track){
        if(car.getFuelVol()/car.getFuelConsumption() < track.getTrackLength() || car.getDirtRate() > 0.6 && car.getStops() != 3){
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

    // Создаем метод circleRun, который принимает автоболить и трек. В этом методе описан процесс гонки после проезда 1 км.
    // Отнимается топливо на 1 км, машина становиться грязнее. setFuelVol - отнимает бензин. setDirtRate - увеличивает
    // загрязненность машины, setCarDistance задает машине преодаленную дистанцию. Далее проверка: есть машина проехала
    // 4 киллометра, то мы увеличиваем занчение кругов на 1. (1 круга = 4 км), а дистанцию (в км) мы ставим на 0, что
    // значит начало нового круга.

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

    // создаем метод для распечатки результата. Все автомобили сделали 3 остановки, в этом методе мы проверяем кто из
    // них победил: проехал больше всего кругов на 3 остановки.

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

    //В начале стартует этот метод. Метод выполняет действия с автомобилем, когда тот проезжает 1 км.
    // Он начинается с проверки условия (цикл while) в котором мы проверяем, сделал ли
    // гонщик 3 остановки. Как? Берем имя экземпляра класса и вызываем у него метод getStops() который вернет нам
    // колличество остановок. Если условие выполняется заходим в цикл и выполняем первый метод checkCar().
    // Этот метод создан выше. Далее выполняется метод circleRun. Далее выполняется всё то же самое для двух автомобилей.
    // В конце мы увеличиваем дистанцию в км на 1. Если колличество остановок у одного гонщика будет больше 3, этот
    // автомобиль НЕ будет заходить в цикл while, соответственно гонка для него закончится.
    // Когда мы выполники цикл while(колл-во остановок всех автобобилей = 3), вызывается метод для распечатки
    // результата result();

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
