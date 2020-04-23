import java.io.IOException;

//Даны три переменные a, b и c.
//        Изменить значения этих переменных так, чтобы в a хранилось значение a+b, в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c.
//        Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.

public class TypeConversion_Ex_4 {
    public static void main(String[] args) throws IOException {
//        int a = 0;
//        int b = 2;
//        int c = 5;

//        int a1 = a;
//        int b1 = b;
//        int c1 = c;
//
//        a = a1 + b1;
//        b = c1 - a1;
//        c = a1 + b1 + c1;

        int a = 0;
        int b = 2;
        int c = 5;

        int b1 = b;
        int c1 = c;

        a = b1 + a;
        b = c1 - a + b1;
        c = b1 + c1;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);

    }
}
