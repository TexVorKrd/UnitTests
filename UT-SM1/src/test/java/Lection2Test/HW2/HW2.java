package Lection2Test.HW2;

import Lection2.HW2.Car;
import Lection2.HW2.Motorcycle;
import Lection2.HW2.Vehicle;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class HW2 {

    private Motorcycle motorcycle;
    private Car car;

/*
    Проект Vehicle. Написать следующие тесты с использованием JUnit5:
            -+ Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
            -+ Проверить, что объект Car создается с 4-мя колесами.
            -+ Проверить, что объект Motorcycle создается с 2-мя колесами.
            -+ Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
            -+ Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
            - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
            - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
*/


    @BeforeEach
    public void setUp() {
        this.motorcycle = new Motorcycle("BMV", "X5", 2023);
        this.car = new Car("LEXUS", "NX300", 2018);
    }

    @Test
    public void classTest() {
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    public void carWeelsTest() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void motorcycleWeelsTest() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void carTestDriveSpeedTest() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void motorcycleTestDriveSpeedTest() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void carparkTest() {
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void motorcycleparkTest() {
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
