package Collections_5x2;

import java.util.*;

// 16. Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя». Удалить людей, имеющих одинаковые имена.

public class Collections_Ex_16 {
    public static void main(String[] args) {
        // Создаем мапу
        Map<String, String> nameSurnameList = new HashMap<String, String>();

        // Заполняем мапу
        nameSurnameList.put("Иванов", "Игорь");
        nameSurnameList.put("Петров", "Егор");
        nameSurnameList.put("Сидоров", "Иван");
        nameSurnameList.put("Доронин", "Антон");
        nameSurnameList.put("Покотилов", "Егор");
        nameSurnameList.put("Роганский", "Иван");
        nameSurnameList.put("Вольнянский", "Александр");
        nameSurnameList.put("Аврамиди", "Игорь");
        nameSurnameList.put("Сидоровян", "Валентин");
        nameSurnameList.put("Асташин", "Егор");

        // Создадим мапу, по которой будем удалять людей из списка. Ключ - Фамилия, значение - кол-во совпадений имени для этой фамилии
        Set<String> removeListSet = new HashSet<>();

        // Формируем removeList
        Iterator<Map.Entry<String, String>> iterator_i = nameSurnameList.entrySet().iterator();
        while (iterator_i.hasNext()) {
            Map.Entry<String, String> i = iterator_i.next();
            String searchName = i.getValue();
            String searchSurname = i.getKey();
            Iterator<Map.Entry<String, String>> iterator_j = nameSurnameList.entrySet().iterator();
            while (iterator_j.hasNext()) {
                Map.Entry<String, String> j = iterator_j.next();
                if (j.getValue().equals(searchName) & !j.getKey().equals(searchSurname)) {
                    removeListSet.add(j.getKey());
                }
            }
        }
        // Удаляем из списка людей с одинаковыми именами
        for (String text : removeListSet) {
            nameSurnameList.remove(text);
        }
        // Выводим итоговую мапу
        System.out.println();
        System.out.println("Выводим итоговую мапу");
        for (Map.Entry<String, String> pair : nameSurnameList.entrySet()) {
            String key = pair.getKey(); //ключ
            String value = pair.getValue(); //значение
            System.out.println(key + ":" + value);
        }
    }
}
