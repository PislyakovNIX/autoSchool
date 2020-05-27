package Array_2x5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Массив из чисел в обратном порядке
//
//        1. Создать массив на 10 чисел.
//        2. Ввести с клавиатуры 10 чисел и записать их в массив.
//        3. Расположить элементы массива в обратном порядке.
//        4. Вывести результат на экран, каждое значение выводить с новой строки.

public class Array_Ex_4 {
    public static void main(String[] args) throws IOException {
        //Создаем массив на 10 ячеек
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] listt = new int[10];

        // Заполняем массив с клавиатуры
        System.out.println("Введите 10 целочисленных элементов массива");
        for (int i = 0; i < 10; i++) {

            listt[i] = Integer.parseInt(reader.readLine());

        }
        // Переставляем элементы
        for (int i = 0; i < 5; i++) {
            int temp = listt[i];
            listt[i] = listt[9 - i];
            listt[9 - i] = temp;
        }
        // Выводим итоговый массив
        System.out.println("Преобразованный массив имеет вид:");
        for (int i = 0; i < 10; i++) {
            System.out.println(listt[i]);
        }
    }
}
