package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class Mytest3 {


    @Test
    public void testAddition(){
        int result = add(3,5);
        assertEquals(8,result,"Сумма не верна");
    }

    @Test
    public void testDivision(){
        int dividen = 10;
        int divider =2;

        assertTrue(dividen%divider==0,"Деление без остатка");
    }

    private int add (int a,int b){
        return a+b;
    }




}
