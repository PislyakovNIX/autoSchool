import java.io.*;

//В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.

public class TypeConversion_Ex_2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите двухзначное число");
        int q = Integer.parseInt(bufferedReader.readLine());

        int firstNumber= q/10;
        int lastNumber = q - 10*firstNumber;
        int numbersSum = firstNumber + lastNumber;
        System.out.println("Сумма цифр числа равна ");
        System.out.print(numbersSum);

    }
}
