package ConditionalStatements_2x6;

import java.io.*;

// Вывести на экран квадрат из 10х10 букв S используя цикл while.
//Буквы в каждой строке не разделять.

public class ConditionalStatements_Ex_11 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int i = 1;
        while (i <= 10) {

            System.out.println("SSSSSSSSSS");

            i++; //увеличение i на 1

        }
    }

}

