package model;

public class Track {
    private int trackLength;
    private double dirtRate;

    public Track(int trackLength, double dirtRate) {
        this.trackLength = trackLength;
        this.dirtRate = dirtRate;
    }

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
