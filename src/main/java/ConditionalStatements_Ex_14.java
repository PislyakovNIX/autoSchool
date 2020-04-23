import java.io.*;

//Ввести с клавиатуры два числа m и n.
//
//        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
//        Пример: m=2, n=4
//        8888
//        8888

public class ConditionalStatements_Ex_14 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите число m");
        int m = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Введите число n");
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("8");
            }
            System.out.println(" ");
        }
    }


}

