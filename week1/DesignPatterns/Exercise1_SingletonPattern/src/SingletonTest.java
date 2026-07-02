package SingletonPatternExample;

public class SingletonTest {
    public static void main(String[] args) {
        // Get Logger instance
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        // Get Logger instance again
        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");

        // Verify both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same!");
        } else {
            System.out.println("Different instances exist!");
        }
    }
}
