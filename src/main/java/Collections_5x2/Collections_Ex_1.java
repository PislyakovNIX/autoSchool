package Collections_5x2;

import java.util.HashSet;
import java.util.Set;

//1. HashSet из растений
//
//        Создать коллекцию HashSet с типом элементов String.
//        Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
//        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//        Посмотреть, как изменился порядок добавленных элементов.

public class Collections_Ex_1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String text : set) {
            System.out.println(text);
        }
    }
}