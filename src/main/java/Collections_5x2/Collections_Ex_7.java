package Collections_5x2;

import java.util.ArrayList;
import java.util.List;

//7. 5 различных строчек в списке
//
//        1. Создай список строк.
//        2. Добавь в него 5 различных строчек.
//        3. Выведи его размер на экран.
//        4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки

public class Collections_Ex_7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        // Добавляем в массив 5 строчек
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
        System.out.println("Размер равен " + list.size());

        // Выводим содержимое на экран
        for (Integer text : list) {
            System.out.println(text);
        }
    }
}
