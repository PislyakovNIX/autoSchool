package TypeConversion_2x3;
// В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.

public class TypeConversion_Ex_3 {
    public static void main(String[] args) {

        double n = 3.94;
        int res = (int) Math.round(n);
        System.out.println(res);
    }
}
