package q5;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger() {
        this.level = LogLevel.INFO;
    }

    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
