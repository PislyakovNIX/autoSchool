package ReferenceTypes_2x4;
//         Дана строка. Вывести первый, последний и средний (если он есть) символы.
//        Напишите программу, которая выводит часть строки до первой встреченной точки, включая точку. Также предусмотрите вывод количества пробелов.

import java.io.*;

public class ReferenceTypes_Ex_1 {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите текст");
        String text = bufferedReader.readLine();

        // Выводим первый символ
        String firstCharachter = String.valueOf(text.charAt(0));
        System.out.println("Первый символ " + firstCharachter);

        // Выводим средний символ. В случае с нечетным количеством символов это будет примерно средний
        if (text.length() % 2 != 0) {
            String middleCharachter = String.valueOf(text.charAt(text.length() / 2));
            System.out.println("Средний символ " + middleCharachter);
        }

        // Выводим последний символ
        String lastCharachter = String.valueOf(text.charAt(text.length() - 1));
        System.out.println("Последний символ " + lastCharachter);

        // Выводит часть строки до первой встреченной точки, включая точку
        int firstDotPosition = text.indexOf(".");
        if (firstDotPosition != -1) {
            System.out.println("Часть строки до первой встреченной точки, включая точку - " + text.substring(0, firstDotPosition + 1));
        }

        // Вывод количества пробелов
        int spacesAmount = text.length() - text.replaceAll(" ", "").length();
        System.out.println("Количество пробелов: " + spacesAmount);
    }
}
