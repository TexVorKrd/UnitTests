package Seminar4.HW4;

/**
 *   Например, ISBN 978-5-386-01614-2
 *             Он состоит из пяти групп цифр.
 *             Первая группа – цифры 978 или 979 – используются для штрих-кодирования книг.
 *             Вторая группа – обозначает страну, или регион. Например, 0 – это США и другие англоговорящие страны, 5 — Россия и русский язык.
 *             Третья группа может включать в себя от двух до семи цифр и обозначает код издательства.
 *             Четвертая группа (до шести цифр) – фиксирует порядковый номер издания.
 *             Наконец, последняя пятая группа цифр или буква Х – это контрольная сумма, т.е. некая техническая информация.
 */

public class ISBN {
    int code;
    int countryCode;
    int publisherCode;
    int number;
    String controlSum;

    public ISBN(int code, int countryCode, int publisherCode, int number, int controlSum) {
        this.code = code;
        this.countryCode = countryCode;
        this.publisherCode = publisherCode;
        this.number = number;
        this.controlSum = Integer.toString(controlSum);
    }
    public ISBN(int code, int countryCode, int publisherCode, int number) {
        this.code = code;
        this.countryCode = countryCode;
        this.publisherCode = publisherCode;
        this.number = number;
        this.controlSum = "X";
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(code)
                .append("-")
                .append(countryCode)
                .append("-")
                .append(publisherCode)
                .append("-")
                .append(number)
                .append("-")
                .append(controlSum)
                .toString();
    }
}
