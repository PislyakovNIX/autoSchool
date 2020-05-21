package Collections_5x2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//14. Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя». Проверить сколько людей имеют совпадающие с заданным имя или фамилию.

public class Collections_Ex_14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> surnameAndName = new HashMap<String, String>();

        // Заносим 10 записей «Фамилия» - «Имя»
        for (int i = 0; i < 5; i++) {
            surnameAndName.put("Фамилия_" + i, "Имя_" + i);
        }
        System.out.println("Введите Имя или Фамилию для поиска");
        String search = reader.readLine();
        int count = 0;
        for (Map.Entry<String, String> pair : surnameAndName.entrySet()) {
            if (pair.getKey().equals(search) || pair.getValue().equals(search)) count++;
        }
        System.out.println("Найдено " + count + " совпадений");
    }
}
