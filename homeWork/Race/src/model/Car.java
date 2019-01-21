package model;

public class Car {
    private String name;
    private String brand;
    private int fuelConsumption;
    private int fuelVol;
    private double dirtProtect;
    private double dirtRate;
    private int circles;
    private int stops;

    /** Creating of Car instance. Dirt protection have to be in bounds from 0.1 to 0.9*/
    public Car(String name, String brand, int fuelConsumption, int fuelVol, double dirtProtect, int dirtRate) {
        this.name = name;
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
        this.fuelVol = fuelVol;
        this.dirtProtect = dirtProtect;
        this.dirtRate = dirtRate;

        if (dirtProtect == 0 || dirtProtect == 1){
            try {
                throw new IllegalArgumentException("Dirt protection is our of bound. Bounds: from 0.1 to 0.9");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelVol() {
        return fuelVol;
    }

    public void setFuelVol(int fuelVol) {
        this.fuelVol = fuelVol;
    }

    public double getDirtProtect() {
        return dirtProtect;
    }

    public void setDirtProtect(double dirtProtect) {
        this.dirtProtect = dirtProtect;
    }

    public double getDirtRate() {
        return dirtRate;
    }

    public void setDirtRate(double dirtRate) {
        this.dirtRate = dirtRate;
    }

    public int getCircles() {
        return circles;
    }

    public void setCircles(int circles) {
        this.circles = circles;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }
}
