import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Максимальное среди массива на 20 чисел
//
//        1. В методе initializeArray():
//        1.1. Создайте массив на 20 чисел
//        1.2. Считайте с консоли 20 чисел и заполните ими массив
//        2. Метод max(int[] array) должен находить максимальное число из элементов массива

public class Array_Ex_1 {

    int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] listt = new int[20];
        // Заполняем массив с клавиатуры
        System.out.println("Введите 20 элементов массива");
        for (int i = 0; i < 20; i++)
        {

            listt[i] = Integer.parseInt(reader.readLine());
        }
        return listt;
    }
    int max(int[] array) {
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > maxElement)
                maxElement = array[i];

        }
        return maxElement;
    }
    public static void main(String[] args) throws IOException {
        Array_Ex_1 exerciseOne = new Array_Ex_1();
        System.out.println("Максимальное число в массиве " + exerciseOne.max(exerciseOne.initializeArray()));
    }

    }
