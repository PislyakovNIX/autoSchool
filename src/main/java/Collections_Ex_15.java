import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// 15. Создать словарь (Map<String, LocalDate>) и занести в него десять записей по принципу: «фамилия» - «дата рождения». Удалить из словаря всех людей, родившихся летом.

public class Collections_Ex_15 {
    public static void main(String[] args) {
        // Создаем мапу
        Map<String, LocalDate> birthMap = new HashMap<String, LocalDate>();

        //Заполняем мапу
        birthMap.put("Руслан", LocalDate.of(1981, 1, 10));
        birthMap.put("Иван", LocalDate.of(1990, 2, 20));
        birthMap.put("Василий", LocalDate.of(1993, 3, 15));
        birthMap.put("Герасим", LocalDate.of(1986, 5, 14));
        birthMap.put("Антон", LocalDate.of(1981, 6, 22));
        birthMap.put("Виталий", LocalDate.of(1972, 7, 27));
        birthMap.put("Александр", LocalDate.of(1945, 8, 9));
        birthMap.put("Владимир", LocalDate.of(2000, 9, 8));
        birthMap.put("Геннадий", LocalDate.of(1999, 10, 6));
        birthMap.put("Лукреций", LocalDate.of(1998, 12, 28));

        // Удалить из мапы всех людей, родившихся летом.
        Iterator<Map.Entry<String, LocalDate>> iterator = birthMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, LocalDate> pair = iterator.next();
            if (pair.getValue().getMonthValue() == 6 || pair.getValue().getMonthValue() == 7 || pair.getValue().getMonthValue() == 8)
                iterator.remove();
        }

        // Выводим финальную мапу
        for (Map.Entry<String, LocalDate> pair : birthMap.entrySet()) {
            String key = pair.getKey(); //ключ
            LocalDate value = pair.getValue(); //значение
            System.out.println(key + ":" + value);
        }
    }
}
