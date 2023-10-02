package Lection2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculater {
    static  Scanner scanner = new Scanner(System.in);

    public static int getOperator(){
        if (scanner.hasNextInt()){
            return scanner.nextInt();
        }else {
            if (scanner.hasNextInt()){
                return scanner.nextInt();
            }else throw new InputMismatchException("Должно быть число");
        }

    }
}
