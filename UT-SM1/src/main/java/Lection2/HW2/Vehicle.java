package Lection2.HW2;

public abstract class Vehicle {

    String company;
    String model;
    int yearRelease;
    int numWheels;
    int speed;

    abstract public void testDrive();

    abstract public void park();

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }
}
