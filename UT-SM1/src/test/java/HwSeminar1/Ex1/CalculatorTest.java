package HwSeminar1.Ex1;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static HwSeminar1.Ex1.Calculator.discount;

public class CalculatorTest {
    public static void main(String[] args) {

        int a = 1000;
        int b = 7;

        // Проверяем на корректность
        Assertions.assertThat(discount(1000, 5)).isEqualTo(950);

        // Проверяем первый выброс ошибки при условии отрицательной покупки - должно быть
        //выброшено исключение
        Assertions.assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> discount(-10, 5));

        // Проверяем второй выброс ошибки при условии отрицательной скидки - должно быть
        //выброшено исключение
        Assertions.assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> discount(100, -5));

        // Проверяем первый выброс ошибки скидке больше 100% - должно быть
        //выброшено исключение
        Assertions.assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> discount(100, 101));

        System.out.println("Тесты прощли успешно");
        System.out.printf("Сумма покупки %d с учетом %d скидки равна  %.2f ", a, b, discount(a, b));
    }

}