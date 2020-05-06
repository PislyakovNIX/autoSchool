public class Hello {

    //    /**
//     * @param args
//     */
    public static void main(String[] args) throws InterruptedException {
        Cat ourcat = new Cat();
        ourcat.eat();
        ourcat.sleep();
        String say = ourcat.speak("Play with me");
        System.out.println(say);

    }
}
