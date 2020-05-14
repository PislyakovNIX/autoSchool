import java.util.HashMap;
import java.util.Map;

//4. Вывести на экран список ключей
//
//        Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
//        Вывести на экран список ключей, каждый элемент с новой строки.

public class Collections_Ex_4 {
    public static void main(String[] args) {

        Map<String, String> collection = new HashMap<String, String>();

        // Создаем коллекцию на 10 строк
        for (int i = 0; i < 10; i++) {
            collection.put("key_" + i, "value_" + i);
        }

        // Выводим список ключей
        for (Map.Entry<String, String> pair : collection.entrySet()) {
            System.out.println(pair.getKey());
        }
    }
}
