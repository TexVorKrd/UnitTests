package Seminar4.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class EmailSenderTest {
    @Mock
    private EmailService mockEmailService;

    @BeforeEach
    void setUp() {
// Инициализируем моки
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSendWelcomeEmail() {
// Создаем экземпляр EmailSender с моком EmailService
        EmailSender emailSender = new EmailSender(mockEmailService);

// Вызываем метод, который мы хотим протестировать
        emailSender.sendWelcomeEmail("user@example.com");

// Проверяем, что метод sendEmail был вызван с ожидаемыми аргументами
        verify(mockEmailService).sendEmail("user@example.com", "Добро пожаловать!", "Добро пожаловать в наше приложение!");
        verify(mockEmailService).sendEmail(eq("user@example.com"), any(), any());
    }

    @Test
    void testSendWelcomeEmailNew() {
// Создаем шпиона для сервиса отправки email
        EmailService emailService = spy(new EmailService());

// Вызываем метод регистрации пользователя
        UserService userService = new UserService(emailService);
        userService.registerUser("user@example.com");

// Проверяем, что метод sendEmail был вызван с определенными аргументами
        verify(emailService).sendEmail("user@example.com", "Добро пожаловать!", "Добро пожаловать в наше приложение!");
    }


}