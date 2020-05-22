package ReferenceTypes_2x4;

import java.io.*;
import java.util.ArrayList;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class ReferenceTypes_Ex_3 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите несколько слов разделяя их пробелами. Система определит максимальное из них");
        String text = bufferedReader.readLine();
        String[] list = text.split(" ");
        int max = list[0].length();
        int index = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i].length() > max) {
                max = list[i].length();
                index = i;
            }
        }
        System.out.println("Самое длинное слово - " + list[index]);
    }
}
