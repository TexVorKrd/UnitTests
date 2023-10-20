package HW6;

import java.util.ArrayList;
import java.util.List;

public class CompAvrList {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public CompAvrList(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public double avrList(List<Integer> list){

        if (list==null) throw new NullPointerException("Список должен быть определен");

        long sum=0;
        int size=list.size();
        double avr=0;

        for (int i = 0; i < size; i++) {
            //проверкаа переполнения при условии сохранения максмальной точности округления
            if ((list.get(i)>0&&Long.MAX_VALUE-list.get(i)<sum)
                    ||(list.get(i)<0&&Long.MIN_VALUE-list.get(i)>sum)){
                avr+=(double) sum/size;
                sum=0;
            }
            avr+=(double) sum/size;
        }
        return avr;
    }
}


