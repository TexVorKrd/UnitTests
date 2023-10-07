package Seminar3.View;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.desktop.SystemEventListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorViewTest {

    private static CalculatorView view = new CalculatorView();


    @Test
    void printMenu() {

        // Проверяем, что метод printMenu() выводит текст меню
        // Создаем объект ByteArrayOutputStream, чтобы перехватить вывод
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printMenu();

        // Проверяем, что вывод соответствует ожидаемому тексту меню
        assertEquals("Выберите операцию:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление\n5. Выход\n", outContent.toString());

        // Восстанавливаем стандартный поток вывода
        System.setOut(System.out);
    }

    @Test
    void printResult() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printResult(10);

        // Проверяем, что вывод соответствует ожидаемому тексту меню
        assertEquals("Результат: 10 (неверный формат)\r\n", outContent.toString());

        // Восстанавливаем стандартный поток вывода
        System.setOut(System.out);
    }

    @Test
    void getInput() {
        String msg ="10";
        ByteArrayInputStream testInputContent = new ByteArrayInputStream(msg.getBytes());
        System.setIn(testInputContent);
        assertEquals(10,view.getInput());
        System.setIn(System.in);
    }

    @Test
    void getInputExeption(){
        String msg ="qwer";
        ByteArrayInputStream testInputContent = new ByteArrayInputStream(msg.getBytes());
        System.setIn(testInputContent);
        assertThrows(InputMismatchException.class,()->view.getInput(),"Некорректный ввод");
        System.setIn(System.in);
    }


    @Test
    void printErrorMessage() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printErrorMessage("test");

        // Проверяем, что вывод соответствует ожидаемому тексту меню
        assertEquals("test (неправильный поток)\r\n", outContent.toString());

        // Восстанавливаем стандартный поток вывода
        System.setOut(System.out);
    }
}