package Seminar4.task4;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;


import static org.mockito.Mockito.verify;


public class EmailSenderTestNew {

//    @ExtendWith(MockitoExtension.class)
    public class EmailSenderTest {

        @Mock
        private EmailService mockEmailService;

        @InjectMocks
        private EmailSender emailSender;

        @Test
        void testSendWelcomeEmail() {
// Вызываем метод, который мы хотим протестировать
            emailSender.sendWelcomeEmail("user@example.com");

// Проверяем, что метод sendEmail был вызван с ожидаемыми аргументами
            verify(mockEmailService).sendEmail("user@example.com", "Добро пожаловать!", "Добро пожаловать в наше приложение!");
        }
    }

}
