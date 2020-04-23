import java.io.*;
import java.util.Random;

//        За семь попыток угадать число.
//        При каждой попытке вам будет выводиться сообщение - "Мало" или "Много".
//        Если угадаете, уложившись в семь попыток, то выводится сообщение "Угадал :)" и программа завершает работу.
//        Если по истечении 7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа.

public class ConditionalStatements_Ex_7 {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // Генерируем случайное число от 0 до 20
        Random random = new Random();
        int secret;
        secret = random.nextInt(20 + 1);
        System.out.println(secret);
        System.out.println("Угадайте число от 0 до 20");
        for (int i = 1; i < 8; i++) {
            System.out.print("Введите число! Попытка - ");
            System.out.println(i);
            int guess = Integer.parseInt(bufferedReader.readLine());
            if (guess > secret) System.out.println("Много!");
            if (guess < secret) System.out.println("Мало!");
            if (guess == secret) {
                System.out.println("Угадал! Поздравляю!");
                i = 9;
            }
            if (i == 7) System.out.println("Не угадал :(");

        }
    }
}
