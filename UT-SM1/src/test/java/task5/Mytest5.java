package task5;

public class Mytest5 {
    public static void main(String[] args) {
        assertConditionA();
        assertOverflow(2000000,1000);
    }
    public static void assertConditionA(){
        String[] weeckends = {"Суббота","Воскресенье"};
        assert weeckends.length==2:"Что то не так";
        System.out.printf("В неделе %d дня выходных \n",weeckends.length);
    }

    public static void assertOverflow(int a, int b){

        assert ((double)(Integer.MAX_VALUE/b)<a):"Переполнение";
        System.out.printf("\n %d * %d = %d",a,b,a*b);
    }
}
