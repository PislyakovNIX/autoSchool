import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//9. Самая короткая строка
//
//        1. Создай список строк.
//        2. Считай с клавиатуры 5 строк и добавь в список.
//        3. Используя цикл, найди самую короткую строку в списке.
//        4. Выведи найденную строку на экран.
//        5. Если таких строк несколько, выведи каждую с новой строки

public class Collections_Ex_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();

        // Добавляем в массив 5 строчек
        System.out.println("Введите 5 строчек");
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        // Определяем самую короткую строку
        int lenMin = list.get(0).length();
        for (String i : list) {
            if (i.length() < lenMin) {
                lenMin = i.length();
            }
        }
        // Выводим самую короткую строку или строки
        for (String i : list) {
            if (i.length() == lenMin) {
                System.out.println("Самая короткая строка - " + i);
            }
        }
    }
}
