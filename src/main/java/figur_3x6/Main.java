package figur_3x6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
                    figureList[i] = new Circle();
                    figureList[i].setName("Круг №" + i);
                    figureList[i].setDiameter(rnd.nextInt(9) + 1);
                    System.out.println(figureList[i].getName() + " S=" + figureList[i].getArea());
                    break;
                case 1:
                    figureList[i] = new Square();
                    figureList[i].setName("Квадрат №" + i);
                    figureList[i].setSquareSide(rnd.nextInt(9) + 1);
                    System.out.println(figureList[i].getName() + " S=" + figureList[i].getArea());
                    break;
                case 2:
                    figureList[i] = new Triangle();
                    figureList[i].setName("Треугольник №" + i);
                    figureList[i].setBase(rnd.nextInt(9) + 1);
                    figureList[i].setHeight(rnd.nextInt(9) + 1);
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
