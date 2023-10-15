package Seminar4.HW4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    ISBN isbtTest;
    @BeforeEach
    public void setUp(){
        isbtTest=new ISBN(978,5,386,01614,2);

    }

    @Test
    void testIsSunnyTodayWithStub() {
// Создаем заглушку для сервиса информации.
        BookService bookService = mock(BookService.class);

// Устанавливаем жесткий ответ для метода getCurrentWeather
        when(bookService.getBoockInfo(isbtTest)).thenReturn("Самая лучшая книга");

// Проверяем, что метод isSunnyToday возвращает в соответствии с заготовленным ответом
        assertTrue(bookService.getBoockInfo(isbtTest).equals("Самая лучшая книга"));

    }
}