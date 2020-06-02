package figur_3x6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        GeometryFig[] figureList = new GeometryFig[10]; // Это массив фигур
        Random rnd = new Random();

        System.out.println("Создаем фигуры:");
        for (int i = 0; i < 10; i++) {
            // Генерируем случайное число 0, 1 или 2 для случайного заполнения массива
            Random random = new Random();
            int rand = random.nextInt(2 + 1);

            //Генерируем случайную фигуру и добавляем ее в массив
            switch (rand) {
                case 0:
                    Circle circle = new Circle();
                    circle.setName("Круг №" + i);
                    circle.setDiameter(rnd.nextInt(9) + 1);
                    figureList[i] = circle;
                    System.out.println(figureList[i].getName() + " S=" + figureList[i].getArea());
                    break;
                case 1:
                    Square square = new Square();
                    square.setName("Квадрат №" + i);
                    square.setSquareSide(rnd.nextInt(9) + 1);
                    figureList[i] = square;
                    System.out.println(figureList[i].getName() + " S=" + figureList[i].getArea());
                    break;
                case 2:
                    Triangle triangle = new Triangle();
                    triangle.setName("Треугольник №" + i);
                    triangle.setBase(rnd.nextInt(9) + 1);
                    triangle.setHeight(rnd.nextInt(9) + 1);
                    figureList[i] = triangle;
                    System.out.println(figureList[i].getName() + " S=" + figureList[i].getArea());
                    break;
            }
        }

        // Упорядочиваем массив в зависимости от площади фигуры
        for (int i = 9; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (figureList[j].getArea() > figureList[j + 1].getArea()) {
                    GeometryFig tmp = figureList[j];
                    figureList[j] = figureList[j + 1];
                    figureList[j + 1] = tmp;
                }
            }
        }

        // Выводим результатирующий массив
        System.out.println();
        System.out.println("Выводим отсортированный массив");
        for (int i = 0; i < 10; i++) {
            System.out.println(figureList[i].getName() + ", S=" + figureList[i].getArea());
        }
    }
}
