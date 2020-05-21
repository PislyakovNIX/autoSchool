package Collections_5x2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//11. Удали последнюю строку и вставь её в начало
//        1. Создай список строк.
//        2. Добавь в него 5 строчек с клавиатуры.
//        3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
//        4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки

public class Collections_Ex_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();

        // Создаем список на 5 строк
        System.out.println("Введите 5 строчек");
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        // Удали последнюю строку и вставь её в начало. Повторить 13 раз.
        for (int i = 0; i < 13; i++) {
            list.add(0, list.get(4));
            list.remove(5);
        }
        // Выводим содержимое на экран
        System.out.println("Результат:");
        for (String i : list) {
            System.out.println(i);
        }
    }
}
