package ConditionalStatements_2x6;

import java.io.*;

//Используя цикл for вывести на экран:
//        - горизонтальную линию из 10 восьмёрок
//        - вертикальную линию из 10 восьмёрок.

public class ConditionalStatements_Ex_16 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print("8");
        }
        System.out.println(" ");
        for (int j = 1; j <= 10; j++) {
            System.out.println("8");
        }
    }
}
