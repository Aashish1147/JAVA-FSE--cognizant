package SingletonPatternExample;

public class Logger {
    // Volatile ensures visibility across threads
    private static volatile Logger instance;

    // Private constructor prevents instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Double-checked locking for thread safety
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Example logging method
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
