import java.io.*;

//Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
//        Пример текста:
//        Света любит меня.
//        …

public class ConditionalStatements_Ex_17 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите имя");
        String text = bufferedReader.readLine();
        for (int i = 1; i <= 10; i++) {
            System.out.print(text);
            System.out.println(" любит меня!");
        }

    }
}
