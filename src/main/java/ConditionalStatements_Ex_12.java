import java.io.IOException;

//Вывести на экран таблицу умножения 10х10 используя цикл while.
//        Числа разделить пробелом.
//        Example output:
//        1 2 3 4 5 6 7 8 9 10
//        2 4 6 8 10 12 14 16 18 20
//        3 6 9 12 15 18 21 24 27 30

public class ConditionalStatements_Ex_12 {

    public static void main(String[] args) throws IOException {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {

                System.out.print(i * j);
                System.out.print(" ");

                j++; //увеличение j на 1
            }
            System.out.println(" ");

            i++; //увеличение i на 1

        }


    }
}