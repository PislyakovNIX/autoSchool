package Stream_API_5x4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Создайте список List<String> не короче 50 элементов разной длинны (наполнение не важно).
//        Добавьте вручную несколько пустых элементов ""
//        С помощью stream() выведите на консоль:
//        длинну каждого из элементов списка.
//        не пустые элементы списка не содержащие символ d
//        элементы списка в алфавитном порядке.

public class Stream_API_Ex {
    public static void main(String[] args) {
        String sourceText = "Loremipsumdolorsitamet,consecteturadipiscingelit.Crasnecultriciespurus.Suspendisseligulaquam,tinciduntacullamcorpernon,consequatvelnisl.Etiamhendrerit";
        List<String> list = new ArrayList<String>();
        int position1;

        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            position1 = random.nextInt(20 + 1);
            list.add(sourceText.substring(position1, position1 + 1 + random.nextInt(20 + 1)));
        }
        list.add("");
        list.add("");

        // Выводим длинну каждого из элементов списка
        System.out.println(" Выводим длинну каждого из элементов списка");
        list.stream().forEach(text -> System.out.println(text.length() + ":" + text));

        // Выводим не пустые элементы списка не содержащие символ d
        System.out.println("\nВыводим не пустые элементы списка не содержащие символ d");
        list.stream().filter(text -> !text.isEmpty() && !text.contains("d")).forEach(System.out::println);

        // Элементы списка в алфавитном порядке
        System.out.println("\nВыводим элементы списка в алфавитном порядке");
        list.stream().sorted().forEach(text -> System.out.println(text));
    }
}
