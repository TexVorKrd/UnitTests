package task4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Mytest4 {

    @Test
    void testAssertEquials() {
        assertEquals(5, 2 + 3, "Сложение не правильное");
    }
    @Test
    void testAssertNotEquials() {
        assertNotEquals(10, 2 * 3, "Умножение не верное");

    }
    @Test
    void testAssertTrue() {
        assertTrue(5 > 3, "Утверждение не веное а должно быть верным");

    }
    @Test
    void testAssertFalse() {
        assertFalse(5 > 10, "Утверждение верно а должно быть неверным");

    }
    @Test
    void testAssertNull() {
        String text = null;
        assertNull(text, "Объект существует а не должен");

    }
    @Test
    void testAssertNotNull() {
        String text = "null";
        assertNotNull(text, "Объект не существует а должен");

    }
    @Test
    void testAssertSame() {
        String text1 = "null";
        String text2 = text1;
        assertSame(text1, text2, "Не один и тот же объект");
    }

    @Test
    void testAssertNotSame() {
        String text1 = "null";
        String text2 = new String("null");
        assertNotSame(text1, text2, "Объекты один и тот же объект а должны быть разными");
    }
}