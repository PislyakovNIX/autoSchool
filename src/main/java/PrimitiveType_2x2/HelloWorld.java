package PrimitiveType_2x2;

import java.io.*;

public class HelloWorld {

String printHelloName() throws IOException { //Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя, считывать введенное имя с консоли и выводить на экран приветствие “Exeptions.Hello, %name%”.
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    System.out.println("Введите имя");
    String name = bufferedReader.readLine();
    System.out.println("Exeptions.Hello, " + name);
    return name;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Exeptions.Hello, world!"); //Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Exeptions.Hello, world!”.
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printHelloName();
    }

}
