package Stream_API_5x4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        // Создаем стрим из коллекции
        Stream<String> streamFromCollection_1 = list.stream();

        // Выводим длинну каждого из элементов списка
        System.out.println(" Выводим длинну каждого из элементов списка");
        streamFromCollection_1.forEach(s -> System.out.println(s.length() + ":" + s));

        // Выводим не пустые элементы списка не содержащие символ d
        Stream<String> streamFromCollection_2 = list.stream();
        System.out.println();
        System.out.println("Выводим не пустые элементы списка не содержащие символ d");
        streamFromCollection_2.filter(Objects::nonNull).filter(s -> !s.contains("d")).forEach(System.out::println);

        // Элементы списка в алфавитном порядке
        Stream<String> streamFromCollection_3 = list.stream();
        System.out.println();
        System.out.println("Выводим элементы списка в алфавитном порядке");
        streamFromCollection_3.sorted().collect(Collectors.toList()).forEach(s -> System.out.println(s));
    }
}
