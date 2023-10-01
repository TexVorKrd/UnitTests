package HwSeminar1.Ex2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperationsTest {

    @Test
    public void sumListsTest(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,3,2,1));
        List<Integer> etalonList = new ArrayList<>(Arrays.asList(5,5,5,5));
        List<Integer> testList = ListOperations.sumLists(list1,list2);

        assertEquals(etalonList,testList,"Сумма списков не верна");
    }
    @Test
    public void findMaxTest(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        int result =4;

        assertEquals(result,ListOperations.findMax(list1),"Максимальное значение не верно");
    }

    @Test
    public void filterList(){
        List<String> list1 = new ArrayList<>(Arrays.asList("Один","Два","Три","Четыре","Пять","Шесть","Семь","Восемь","Девять","Десять"));
        List<String> result = new ArrayList<>(Arrays.asList("Один","Четыре","Пять","Шесть","Семь","Восемь","Девять","Десять"));
        int maxLen =4;

        assertEquals(result,ListOperations.filterStrings(list1,maxLen),"Максимальное значение не верно");
    }
}
