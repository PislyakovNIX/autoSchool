package Exeptions_4x4;

public class Dog {

    public void sleep() throws InterruptedException, ArithmeticException {
        System.out.print("Sleeping zz-z-z-z...\n");
        Thread.sleep(3000);
        int zero = 5 / 0;
    }
}
