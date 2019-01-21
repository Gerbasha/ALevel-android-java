package model;

public class Track {
    private int trackLength;
    private int dirtRate;

    public Track(int trackLength, int dirtRate) {
        this.trackLength = trackLength;
        this.dirtRate = dirtRate;
    }

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public int getDirtRate() {
        return dirtRate;
    }

    public void setDirtRate(int dirtRate) {
        this.dirtRate = dirtRate;
    }
}
