package HwSeminar1.Ex1;

public class Calculator {

    public static float discount(float a,float b){

        if (a<=0) throw new ArithmeticException("Неверные Аргументы - сумма покупки меньше 0");
        if (b<0) throw new ArithmeticException("Неверные Аргументы - отрицательная скидка");
        if (b>100) throw new ArithmeticException("Неверные Аргументы - скидка больше 100%");

        return a*(1-b/100);
    }











}
