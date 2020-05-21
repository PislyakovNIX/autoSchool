package Array_2x5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Один большой массив и два маленьких
//
//        1. Создать массив на 20 чисел.
//        2. Ввести в него значения с клавиатуры.
//        3. Создать два массива на 10 чисел каждый.
//        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

public class Array_Ex_5 {
    public static void main(String[] args) throws IOException {
        //Создаем массив на 20 ячеек и два массива по 10 ячеек
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] listt = new int[20];
        int[] lis_1 = new int[10];
        int[] lis_2 = new int[10];


        // Заполняем массив с клавиатуры
        System.out.println("Введите 20 целочисленных элементов массива");
        for (int i = 0; i < 20; i++) {

            listt[i] = Integer.parseInt(reader.readLine());

        }
        // Заполняем первый массив lis_1 половиной значений из исходного массива
        for (int i = 0; i < 10; i++) {
            lis_1[i] = listt[i];
        }
        // Заполняем второй массив lis_2 второй половиной значений из исходного массива
        for (int i = 0; i < 10; i++) {
            lis_2[i] = listt[10+i];
        }
        // Выводим второй массив lis_2
        System.out.println("Выводим второй массив");
        for (int i = 0; i < 10; i++) {
            System.out.println(lis_2[i]);
        }
    }
}
