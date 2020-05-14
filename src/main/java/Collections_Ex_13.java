import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//13. Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//Удалить из множества все числа больше 10.

public class Collections_Ex_13 {
    public static void main(String[] args) {

        HashSet<Integer> numbersList = new HashSet<Integer>();

        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(8);
        numbersList.add(9);
        numbersList.add(10);
        numbersList.add(21);
        numbersList.add(22);
        numbersList.add(23);
        numbersList.add(24);
        numbersList.add(25);
        numbersList.add(26);
        numbersList.add(27);
        numbersList.add(28);
        numbersList.add(29);
        numbersList.add(30);

        // Удаляем элементы, которые больше 20
        Iterator<Integer> iterator = numbersList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 20) iterator.remove();
        }

        // Выводиим итоговое множество
        System.out.println("Итоговое множество:");
        for (Integer value : numbersList) {
            System.out.println(value);
        }
    }
}
