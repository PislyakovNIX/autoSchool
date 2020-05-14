import java.util.HashMap;
import java.util.Map;

//5. Вывести на экран список значений
//
//        Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
//        Вывести на экран список значений, каждый элемент с новой строки.

public class Collections_Ex_5 {
    public static void main(String[] args) {

        Map<String, String> collection = new HashMap<String, String>();

        // Создаем коллекцию на 10 строк
        for (int i = 0; i < 10; i++) {
            collection.put("key_" + i, "value_" + i);
        }

        // Выводим список значений
        for (Map.Entry<String, String> pair : collection.entrySet()) {
            System.out.println(pair.getValue());
        }
    }
}
