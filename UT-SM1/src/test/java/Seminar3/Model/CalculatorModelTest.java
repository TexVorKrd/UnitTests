package Seminar3.Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorModelTest {

    private static CalculatorModel calculatorModel=new CalculatorModel();


    @BeforeEach
    public void setUp(){
        calculatorModel.setFirstNumber(10);
        calculatorModel.setSecondNumber(5);
    }

    @Test
    void getFirstNumber() {
        assertEquals(10,calculatorModel.getFirstNumber(),"Не верно возвращает первый элемент");
    }

    @Test
    void setFirstNumber() {
        calculatorModel.setFirstNumber(8);
        assertEquals(8,calculatorModel.getFirstNumber(),"Не верно установлен первый элемент");
    }

    @Test
    void getSecondNumber() {
        assertEquals(5,calculatorModel.getSecondNumber(),"Не верно возвращает второй элемент");
    }

    @Test
    void setSecondNumber() {
        calculatorModel.setSecondNumber(8);
        assertEquals(8,calculatorModel.getSecondNumber(),"Не верно установлен второй элемент");
    }

    @Test
    void add() {
        assertEquals(10+5,calculatorModel.add(),"Не верно выполняется суммирование");
    }

    @Test
    void subtract() {
        assertEquals(10-5,calculatorModel.subtract(),"Не верно выполняется вычитание");
    }

    @Test
    void multiply() {
        assertEquals(10*5,calculatorModel.multiply(),"Не верно выполняется умножение");
    }

    @Test
    void divide() {
        assertEquals(10/5,calculatorModel.divide(),"Не верно выполняется деление");
    }

    @Test
    void divideByZerro() {

        calculatorModel.setSecondNumber(0);
        assertThrows(ArithmeticException.class,()->calculatorModel.divide(),"Не обрабатывается джеление на ноль");
    }
}