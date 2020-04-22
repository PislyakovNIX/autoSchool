import java.io.*;
import java.util.ArrayList;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class ReferenceTypes_Ex_3 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите несколько слов разделяя их пробелами. После последнего слова пробел обязателен. Система определит максимальное из них");
        String text = bufferedReader.readLine();
        ArrayList<String> list = new ArrayList<String>();

        int maxTemp;
        String maxWordTemp;
        int max = 0;
        String maxWord = "Error";

        int wordEndPosition = 0;
        while (text.length() != 0) {
            wordEndPosition = text.indexOf(" "); // Определяет номер первой позиции пробела в строке
            maxTemp = wordEndPosition; // Так как номер позиции это и есть длина слова, то первое слово считаем что оно максимальное
            maxWordTemp = text.substring(0, maxTemp); // Сохраняем текущее максимальное слово
            if (maxTemp > max) { // Если встречается слово длиннее, чем уже имеющееся, то сохраняем новое слово как текущее самое большое
                max = maxTemp;
                maxWord = maxWordTemp;
            }
            text = text.substring(wordEndPosition + 1); //вырезаем из рабочей строки обработанное слово и пробел

        }

        System.out.println("Самое длинное слово - " + maxWord);

    }
}
