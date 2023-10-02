package Lection2.HW2;

public class Car extends Vehicle {

    public Car(String company, String model, int year) {
        super.speed = 0;
        super.numWheels = 4;
        super.company = company;
        super.model = model;
        super.yearRelease = year;
    }

    @Override
    public void testDrive() {
        speed = 60;
    }


    @Override
    public void park() {
        speed = 0;
    }
}
