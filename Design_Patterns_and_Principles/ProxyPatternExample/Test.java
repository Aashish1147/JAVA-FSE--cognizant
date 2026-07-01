package ProxyPatternExample;

public class Test {

    public static void main(String[] args) {

        Image image = new ProxyImage("Nature.jpg");

        System.out.println("First Call:");
        image.display();

        System.out.println();

        System.out.println("Second Call:");
        image.display();

    }

}