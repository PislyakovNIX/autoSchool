package ConditionalStatements_2x6;

import java.io.*;

//        Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
//        Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»

public class ConditionalStatements_Ex_5and6 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        System.out.println("Введите имя");
        String Name = bufferedReader.readLine();
        System.out.println("Введите возраст");
        int age = Integer.parseInt(bufferedReader.readLine());
        if (age < 18) System.out.println("Подрасти еще");
        if (age > 20) System.out.println("И 18-ти достаточно");

    }
}