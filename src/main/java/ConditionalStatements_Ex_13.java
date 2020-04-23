import java.io.IOException;

// Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
//Через пробел либо с новой строки.

public class ConditionalStatements_Ex_13 {
    public static void main(String[] args) throws IOException {
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

}
