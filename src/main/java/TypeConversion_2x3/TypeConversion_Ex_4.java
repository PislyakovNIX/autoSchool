package TypeConversion_2x3;

import java.io.IOException;

//Даны три переменные a, b и c.
//        Изменить значения этих переменных так, чтобы в a хранилось значение a+b, в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c.
//        Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.

public class TypeConversion_Ex_4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 5;

        c = a + b + c;
        a = a + b;
        b = c + b - 2 * a;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }
}
