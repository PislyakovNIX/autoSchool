package ConditionalStatements_2x6;

import java.io.*;

// Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».

public class ConditionalStatements_Ex_4 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // Вводим имена
        System.out.println("Введите два имени");
        String Name_1 = bufferedReader.readLine();
        String Name_2 = bufferedReader.readLine();


        if (Name_1.equals(Name_2)) System.out.println("Имена идентичны");
        else
        {
            if (Name_1.length() == Name_2.length()) System.out.println("Длины имен равны");

        }
    }
}

