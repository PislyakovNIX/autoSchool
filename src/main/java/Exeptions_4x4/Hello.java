package Exeptions_4x4;

public class Hello {

    public static void main(String[] args) throws InterruptedException {
        Cat ourcat = new Cat();
        Dog dog = new Dog();
        ourcat.eat();
        String say = ourcat.speak("Play with me");
        System.out.println(say);
        dog.sleep();
    }
}
