package q5;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        this.level = LogLevel.ERROR;
    }

    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
