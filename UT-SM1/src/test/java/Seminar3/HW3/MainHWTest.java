package Seminar3.HW3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    MainHW mainHW= new MainHW();

    @Test
    void evenOddNumberTrue() {
        assertEquals(true,mainHW.evenOddNumber(2),"Проверка на четность неверная");
    }

    @Test
    void evenOddNumberFalse() {
        assertEquals(false,mainHW.evenOddNumber(3),"Проверка на четность неверная");
    }


    @Test
    void isNumberInIntervalTrue() {
        assertEquals(true,mainHW.isNumberInInterval(30));

    }

    @Test
    void isNumberInIntervalFalse() {
        assertEquals(false,mainHW.isNumberInInterval(25));
        assertEquals(false,mainHW.isNumberInInterval(100));
        assertEquals(false,mainHW.isNumberInInterval(15));
    }

}