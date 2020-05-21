package Array_2x5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Массив из строчек в обратном порядке
//
//        1. Создать массив на 10 строчек.
//        2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
//        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

public class Array_Ex_2 {
    public static void main(String[] args) throws IOException {
        //Создаем массив на 10 ячеек
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        // Заполняем массив 8-ю элементами (внимание! не 10)
        System.out.println("Введите 8 элементов массива");
        for (int i = 0; i < 8; i++) {
            list[i] = reader.readLine();
        }

        // Выводим массив
        System.out.println("Выводим массив");
        for (int i = 9; i > -1; i--) {
            System.out.println(list[i]);
        }
    }
}
