package hw6;

import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompAvrListTest {


    List<Integer> list1 = List.of(1, 2, 3);
    List<Integer> list2 = List.of(-1, -2, -3);
    List<Integer> list3 = List.of(0, 0, 0);
    List<Integer> list4 = List.of(0);
    List<Integer> list5 = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3);

    /**
     * Проверка реакции на корректные и некорректные данные;
     */


    @Test
    void correctionInputTest() {

        assertThrows(NullPointerException.class, () -> new CompAvrList(list1, null).avrComparer());
        assertThrows(NullPointerException.class, () -> new CompAvrList(null, null).avrComparer());
        assertThrows(NullPointerException.class, () -> new CompAvrList(null, list1).avrComparer());
    }

    /**
     * Проверка на корректность вычисления среднего значения
     */
    @Test
    void avrCorrectionCheckTest() {


        assertEquals(CompAvrList.avrList(list1), 2, 0.000000001);
        assertEquals(CompAvrList.avrList(list2), -2, 0.000000001);
        assertEquals(CompAvrList.avrList(list3), 0, 0.000000001);
        assertEquals(CompAvrList.avrList(list4), 0, 0.000000001);
        assertEquals(CompAvrList.avrList(list5), 4.8333333333, 0.000000001);
    }


    /**
     * Проверяем корректность потоков вывода
     */
    @Test
    void avrComparerL1moreL2Test() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new CompAvrList(list1, list1).avrComparer();
        assertEquals(outContent.toString(), "Средние значения равны\r\n");

        outContent.reset();
        new CompAvrList(list1, list2).avrComparer();
        assertEquals(outContent.toString(), "Первый список имеет большее среднее значение\r\n");

        outContent.reset();
        new CompAvrList(list2, list1).avrComparer();
        assertEquals(outContent.toString(), "Второй список имеет большее среднее значение\r\n");

        System.setOut(System.out);

    }
}