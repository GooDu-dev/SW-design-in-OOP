package q5;

public class FileLogger extends AbstractLogger {
    public FileLogger() {
        this.level = LogLevel.DEBUG;
    }

    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}