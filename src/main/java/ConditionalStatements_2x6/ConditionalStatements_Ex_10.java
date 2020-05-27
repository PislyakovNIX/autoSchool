package ConditionalStatements_2x6;

import java.io.*;

//Ввести с клавиатуры строку и число N.
//
//        Вывести на экран строку N раз, используя цикл while.
//        Пример ввода:
//        абв
//        2
//
//        Пример вывода:
//        абв
//        абв

public class ConditionalStatements_Ex_10 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите строку");
        String text = bufferedReader.readLine();
        System.out.println("Введите количество выводов N");
        int outputAmount = Integer.parseInt(bufferedReader.readLine());

        int i = 1;
        while (i <= outputAmount) {
            System.out.println(text);
            i++; //увеличение i на 1
        }
    }
}
