package Collections_5x2;

import java.util.HashMap;
import java.util.Map;

//6. Коллекция HashMap из Object
//
//        Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
//        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//
//        Пример вывода (тут показана только одна строка):
//        Sim - 5
public class Collections_Ex_6 {
    public static void main(String[] args) {

        Map<String, Object> elements = new HashMap<String, Object>();

        // Создаем коллекцию
        for (int i = 0; i < 10; i++) {

            elements.put("Name_" + i, i);
        }
        // Выводим коллекцию
        for (Map.Entry<String, Object> pair : elements.entrySet()) {

            String key = pair.getKey(); //ключ

            Object value = pair.getValue(); //значение

            System.out.println(key + "-" + value);
        }
    }
}
