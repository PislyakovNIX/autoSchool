package Exeptions_4x4;

public class Cat {
    private int weight; // вес кота
    private String name; // имя кота
    private String color; //окрас кота

    public void eat() {
        try {
            int zero = 5 / 0;
            System.out.print("Eating...\n");
        } catch (ArithmeticException ex) {
            System.out.println("You shall not fall!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void sleep() throws InterruptedException {
//        System.out.print("Sleeping zz-z-z-z...\n");
//        Thread.sleep(3000);
//    }

    public String speak(String words) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
        }
        return words + "...mauu...\n";
    }
}
