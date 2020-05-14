import java.util.HashMap;
import java.util.Map;

//3. Коллекция HashMap из котов
//
//        Есть класс Cat, с полем имя (name, String).
//        Создать коллекцию HashMap<String, Cat>.
//        Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
//        Вывести результат на экран, каждый элемент с новой строки.

public class Collections_Ex_3 {
    public static void main(String[] args) {

        Map<String, Cat> cats = new HashMap<String, Cat>();

        Cat[] list = new Cat[10];

        // Создаем 10 котов и помещаем их в коллекцию
        for (int i = 0; i < 10; i++) {
            list[i] = new Cat();

            list[i].setName("cat_" + i);

            cats.put(list[i].getName(), list[i]);
        }
        // Выводим коллекцию
        for (Map.Entry<String, Cat> pair : cats.entrySet()) {

            String key = pair.getKey(); //ключ

            Cat value = pair.getValue(); //значение

            System.out.println(key + ":" + value);
        }
    }
}
