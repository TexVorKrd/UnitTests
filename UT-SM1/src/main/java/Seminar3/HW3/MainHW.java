package Seminar3.HW3;

public class MainHW {


    /**
     * Проверяет четное число или нет
     * @param n - проверяемое число
     * @return true - если четное
     */
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Проверяет число на вхождение в интервал (25,100)
     * @param n - проверяемое число
     * @return - true если входит
     */
    public boolean isNumberInInterval(int n) {
        if (n>25 && n<100) {
            return true;
        } else {
            return false;
        }
    }

}
