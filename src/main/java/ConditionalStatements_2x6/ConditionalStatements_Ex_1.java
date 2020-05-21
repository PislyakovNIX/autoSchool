package ConditionalStatements_2x6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ввести с клавиатуры два числа, и вывести на экран минимальное из них.

public class ConditionalStatements_Ex_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b;
        System.out.println("Введите число a");
        a = Integer.parseInt(reader.readLine());
        System.out.println("Введите число b");
        b = Integer.parseInt(reader.readLine());
        if (a < b) {
            System.out.print("Минимальное число a=");
            System.out.print(a);
        } else {
            System.out.print("Минимальное число b=");
            System.out.print(b);

        }
    }

}
