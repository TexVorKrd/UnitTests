package HW6;

import java.util.List;

public class Main {
     public static void main(String[] args) {


          CompAvrList comparer= new CompAvrList(List.of(1,2,3),List.of(2,3,4));
          System.out.println(comparer.avrList(List.of(1,2,3)));
     }


}
