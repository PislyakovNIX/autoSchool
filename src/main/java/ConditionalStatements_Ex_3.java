import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalStatements_Ex_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;

        // Вводим три числа
        System.out.println("Введите 3 числа");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        // Определяем МАКС число
        if (a > b && a > c) d1 = a;
        if (b > a && b > c) d1 = b;
        if (c > a && c > b) d1 = c;

        // Определяем МИН число
        if (a <= b && a < c) d3 = a;
        if (b < a && b <= c) d3 = b;
        if (c <= a && c < b) d3 = c;

        // Определяем среднее число
        if (a < d1 && a > d3) d2 = a;
        if (b < d1 && b > d3) d2 = b;
        if (c < d1 && c > d3) d2 = c;
        if (a == b) d2 = a;
        if (a == c) d2 = a;
        if (b == c) d2 = b;


        // Обрабатываем кейс если ВСЕ числа равны
        if (a == b && a == c && b == c) {
            d1 = a;
            d2 = b;
            d3 = c;
        }

        // Выводим числа в порядке убывания
        System.out.println("Упорядоченные числа");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);


    }
}
