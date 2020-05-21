package TypeConversion_2x3;

import java.io.*;

//        В переменных q и w хранятся два натуральных числа.
//        Создайте программу, выводящую на экран результат деления q на w с остатком.
//         Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке

public class TypeConversion_Ex_1 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите число q");
        int q = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Введите число w");
        int w = Integer.parseInt(bufferedReader.readLine());
        int res = q / w;
        int ostatok = q % w;

        System.out.print("Результат деления q/w=");
        System.out.print(res);
        System.out.print(" и " + ostatok + " в остатке");
    }
}
