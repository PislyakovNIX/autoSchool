package Collections_5x2;

import java.util.HashSet;
import java.util.Set;

//12. Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».

public class Collections_Ex_12 {
    public static void main(String[] args) {
        Set<String> listSet = new HashSet<String>();

        listSet.add("латать");
        listSet.add("латинизировать");
        listSet.add("лаять");
        listSet.add("лгать");
        listSet.add("лебезить");

        listSet.add("левитировать");
        listSet.add("легализировать");
        listSet.add("легировать");
        listSet.add("леденеть");
        listSet.add("леденить");

        listSet.add("лежать");
        listSet.add("лезть");
        listSet.add("лазать");
        listSet.add("лакать");
        listSet.add("лакействовать");

        listSet.add("лакировать");
        listSet.add("лакомиться");
        listSet.add("лапать");
        listSet.add("ласать");
        listSet.add("ласкаться");
    }
}
