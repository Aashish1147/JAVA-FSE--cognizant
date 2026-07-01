package BuilderPatternExample;

public class Test {

    public static void main(String[] args) {

        Computer c1 = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam(8)
                .setStorage(256)
                .build();

        Computer c2 = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam(16)
                .setStorage(512)
                .build();

        System.out.println("Computer 1");
        c1.display();

        System.out.println();

        System.out.println("Computer 2");
        c2.display();
    }
}