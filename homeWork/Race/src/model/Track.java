package model;

//Создаём класс Track, который будет отвечать за создание трассы, её поведение и параметры

public class Track {

    // Создаем параметры длины и загрязненности трека

    private int trackLength;
    private double dirtRate;

    // Создаём конструктор, который в последстрии будет создавать этот трек. Конструктору мы передаем параметры
    // Параметры - то что находится в скобочках (int trackLength, double dirtRate)
    // В строках this.--- = ---- мы указываем, что параметры которые мы неделаём конструктору - то что написано в скобочках,
    // является переменными нашего класса.

    public Track(int trackLength, double dirtRate) {
        this.trackLength = trackLength;
        this.dirtRate = dirtRate;
    }

    // Создаём методы get и set, для того, чтобы получать и задавать параметры соответственно.
    // Так метод public int getTrackLength() вернет нам длину Трека, которую мы задали в конструкторе.

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public double getDirtRate() {
        return dirtRate;
    }

    public void setDirtRate(double dirtRate) {
        this.dirtRate = dirtRate;
    }
}
