import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//8. Самая длинная строка
//        1. Создай список строк.
//        2. Считай с клавиатуры 5 строк и добавь в список.
//        3. Используя цикл, найди самую длинную строку в списке.
//        4. Выведи найденную строку на экран.
//        5. Если таких строк несколько, выведи каждую с новой строки.

public class Collections_Ex_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();

        // Добавляем в массив 5 строчек
        System.out.println("Введите 5 строчек");
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        // Определяем самую длинную строку
        int lenMax = list.get(0).length();
        for (String i : list) {
            if (i.length() > lenMax) {
                lenMax = i.length();
            }
        }

        // Выводим самую длинную строку или строки
        for (String i : list) {
            if (i.length() == lenMax) {
                System.out.println("Самая длинная строка - " + i);
            }
        }
    }
}
