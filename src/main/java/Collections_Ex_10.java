import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//10. 10 строчек в начало списка
//        1. Создай список строк в методе main.
//        2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//        3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.

public class Collections_Ex_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();

        // Добавляем 10 строчек
        System.out.println("Введите 10 строчек");
        for (int i = 0; i < 10; i++) {
            list.add(0, reader.readLine());
        }

        // Выводим содержимое на экран
        System.out.println("Результат:");
        for (String i : list) {
            System.out.println(i);
        }
    }
}
