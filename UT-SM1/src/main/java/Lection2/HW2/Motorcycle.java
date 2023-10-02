package Lection2.HW2;

public class Motorcycle extends Vehicle {

    public Motorcycle(String company, String model, int year) {
        super.speed = 0;
        super.numWheels = 2;
        super.company = company;
        super.model = model;
        super.yearRelease = year;
    }

    @Override
    public void testDrive() {
        speed = 75;
    }


    @Override
    public void park() {
        speed = 0;
    }
}
