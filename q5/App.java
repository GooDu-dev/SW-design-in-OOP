package q5;

public class App {
    public static void main(String[] args) {
        AbstractLogger loggerChain = LoggerChain.getLoggerChain();

        loggerChain.logMessage(LogLevel.INFO, "This is an information.");
        loggerChain.logMessage(LogLevel.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(LogLevel.ERROR, "This is an error information.");
    }
}
