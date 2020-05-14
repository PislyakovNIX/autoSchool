import java.util.HashMap;
import java.util.Map;

//17.
//
//        1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
//        2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
//        3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями. Обратить внимание на количество записей в получившейся коллекции.
//        4. Вывести содержимое Map на экран.

public class Collections_Ex_17 {
    public static void main(String[] args) {
        // Создаем мапу
        Map<String, String> nameSurnameList = new HashMap<String, String>();

        // Заполняем мапу
        nameSurnameList.put("Иванов", "Игорь");
        nameSurnameList.put("Иванов", "Егор");
        nameSurnameList.put("Сидоров", "Иван");
        nameSurnameList.put("Доронин", "Антон");
        nameSurnameList.put("Покотилов", "Егор");
        nameSurnameList.put("Роганский", "Иван");
        nameSurnameList.put("Вольнянский", "Александр");
        nameSurnameList.put("Аврамиди", "Игорь");
        nameSurnameList.put("Сидоровян", "Валентин");
        nameSurnameList.put("Асташин", "Егор");

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