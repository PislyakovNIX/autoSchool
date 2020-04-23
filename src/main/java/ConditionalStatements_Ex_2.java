import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ввести с клавиатуры четыре числа, и вывести максимальное из них.

public class ConditionalStatements_Ex_2 {
    public static void main(String[] args) throws IOException {
        //Создаем массив на 4 ячейки
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max;
        int[] listt = new int[4];


        // Заполняем массив с клавиатуры
        System.out.println("Введите 4 числа");
        for (int i = 0; i < 4; i++) {

            listt[i] = Integer.parseInt(reader.readLine());

        }
        // Находим максимальное и выводим значение
        max = listt[0];
        for (int i = 1; i < 4; i++) {
            if (listt[i] > max) {
                max = listt[i];
            }
        }
        System.out.print("Макcимальное из выбранных равно ");
        System.out.print(max);
    }

}
