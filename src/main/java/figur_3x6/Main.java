package figur_3x6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] namesList = new String[10]; // Это массив имен
        float[] areaList = new float[10]; // Это массив площадей фигур

        for (int i = 0; i < 10; i++) {
            // Генерируем случайное число 0, 1 или 2 для случайного заполнения массива
            Random random = new Random();
            int rand = random.nextInt(2 + 1);
            //Генерируем случайную фигуру
            switch (rand) {
                //case 0: Circle circle = new Circle();
                case 0:
                    Circle circle = new Circle();
                    circle.setName("Круг №" + i);
                    namesList[i] = circle.getName();
                    System.out.println("Создается фигура с именем " + circle.getName() + " введите ее диаметр");
                    circle.setDiameter(Integer.parseInt(reader.readLine()));
                    System.out.println("Площадь круга = " + circle.getArea());
                    areaList[i] = circle.getArea();
                    break;
                case 1:
                    Square square = new Square();
                    square.setName("Квадрат №" + i);
                    namesList[i] = square.getName();
                    System.out.println("Создается фигура с именем " + square.getName() + " введите ее сторону");
                    square.setSquareSide(Integer.parseInt(reader.readLine()));
                    System.out.println("Площадь квадрата = " + square.getArea());
                    areaList[i] = square.getArea();
                    break;
                case 2:
                    Triangle triangle = new Triangle();
                    triangle.setName("Треугольник №" + i);
                    namesList[i] = triangle.getName();
                    System.out.println("Создается фигура с именем " + triangle.getName() + " введите ее высоту и основание");
                    triangle.setBase(Integer.parseInt(reader.readLine()));
                    triangle.setHeight(Integer.parseInt(reader.readLine()));
                    System.out.println("Площадь треугольника = " + triangle.getArea());
                    areaList[i] = triangle.getArea();
                    break;
            }
        }
        // Упорядочиваем оба массива в зависимости от площади фигуры
        for (int i = 9; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (areaList[j] > areaList[j + 1]) {
                    float tmp = areaList[j];
                    areaList[j] = areaList[j + 1];
                    areaList[j + 1] = tmp;

                    String tmpName = namesList[j];
                    namesList[j] = namesList[j + 1];
                    namesList[j + 1] = tmpName;

                }
            }
        }
        // Выводим результатирующий массив
        System.out.println();
        System.out.println("Выводим отсортированный массив");
        for (int i = 0; i < 10; i++) {
            System.out.println(namesList[i] + ", S=" + areaList[i]);

        }
    }
}