package Lection2Test;

import Lection2.Calculater;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class CalculaterTest {

    @Test
    public void inputIntValid(){
        String testValue="9";
        ByteArrayInputStream in = new ByteArrayInputStream(testValue.getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);
        System.out.println(Calculater.getOperator());
        System.setIn(inputStream);
    }

    @Test
    public void inputIntNotValid(){
        String testValue="jjk";
        ByteArrayInputStream in = new ByteArrayInputStream(testValue.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        InputStream inputStream = System.in;
        System.setIn(in);
        System.setOut(new PrintStream(out));

        assertThatThrownBy(()->Calculater.getOperator())
                .isInstanceOf(IllegalStateException.class)
                .describedAs("ощибка ввода");
        System.setIn(inputStream);
        System.setOut(null);

        System.out.println(Calculater.getOperator());

        System.setIn(inputStream);
        System.setOut(null);
    }
}
