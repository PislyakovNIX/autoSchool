package Array_2x5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2 массива
//
//        1. Создать массив на 10 строк.
//        2. Создать массив на 10 чисел.
//        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//        4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
//        5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.

public class Array_Ex_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        int[] len = new int[10];

        // Заполняем массив текстом с клавиатуры
        System.out.println("Введите 10 текстовых элементов массива");
        for (int i = 0; i < 10; i++) {
            list[i] = reader.readLine();
        }
        // Заполняем и сразу выводим числовой массив
        System.out.println("Массив длин введенных текстовых значений:");
        for (int i = 0; i < 10; i++) {
            len[i] = list[i].length();
            System.out.println(len[i]);
        }
    }
}
