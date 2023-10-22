package hw6;

import java.util.List;


/**
 * Класс для вычисления среднего значения двух списков и сравнения их среднего значения.
 */
public class CompAvrList {

    //Точность сравнения чисел типа Double.
    private final Double IS_EQUIALS_FOR_DOUBLE = 0.000000001D;

    /**
     * Первый список.
     */
    private final List<Integer> list1;

    /**
     * Второй список.
     */
    private final List<Integer> list2;

    /**
     * Сравнивая два списка и выдает соответствующие сообщения
     *
     * @param list1 - Первый список
     * @param list2 - Второй список
     */
    public CompAvrList(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    /**
     * Рассчитываем среднее арифметическое списка целых чисел
     * Контролируем переполнение переменной.
     *
     * @param list - список целых чисел
     * @return - среднее арифметическое списка
     */
    public static double avrList(List<Integer> list) {

        if (list == null) throw new NullPointerException("Список должен быть определен");
        return list.stream().mapToInt(a -> a).average().getAsDouble();
    }

    /**
     * Сравнивает среднее арифметические двух списков и выводи соответствующие сообщения.     *
     */
    public void avrComparer() {

        double l1 = avrList(list1);
        double l2 = avrList(list2);

        if ((l1 - l2) > IS_EQUIALS_FOR_DOUBLE) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if ((l1 - l2) < IS_EQUIALS_FOR_DOUBLE * -1) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }
    }
}


