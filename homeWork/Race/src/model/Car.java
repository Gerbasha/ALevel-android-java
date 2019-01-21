package model;

public class Car {
    private String name;
    private String brand;
    private double fuelConsumption;
    private int fuelVol;
    private double dirtProtect;
    private int dirtRate;

    /** Creating of Car instance. Dirt protection have to be in bounds from 0.1 to 0.9*/
    public Car(String name, String brand, double fuelConsumption, int fuelVol, double dirtProtect, int dirtRate) {
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

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
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

    public void setDirtProtect(int dirtProtect) {
        this.dirtProtect = dirtProtect;
    }

    public int getDirtRate() {
        return dirtRate;
    }

    public void setDirtRate(int dirtRate) {
        this.dirtRate = dirtRate;
    }
}
