package model;

public class Car {
    private String name;
    private String brand;
    private int fuelConsumption;
    private int fuelVol;
    private int dirtProtect;
    private int pollutionRate;

    /** Creating of Car instance. Dirt protection have to be in bounds from 0.1 to 0.9*/
    public Car(String name, String brand, int fuelConsumption, int fuelVol, int dirtProtect, int pollutionRate) {
        this.name = name;
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
        this.fuelVol = fuelVol;
        this.dirtProtect = dirtProtect;
        this.pollutionRate = pollutionRate;

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

    public int getDirtProtect() {
        return dirtProtect;
    }

    public void setDirtProtect(int dirtProtect) {
        this.dirtProtect = dirtProtect;
    }

    public int getPollutionRate() {
        return pollutionRate;
    }

    public void setPollutionRate(int pollutionRate) {
        this.pollutionRate = pollutionRate;
    }
}
