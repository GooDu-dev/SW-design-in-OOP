package q5;

public class LoggerChain {
    private static AbstractLogger loggerChain;

    static {
        ErrorLogger errorLogger = new ErrorLogger();
        FileLogger fileLogger = new FileLogger();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        loggerChain = errorLogger;
    }

    public static AbstractLogger getLoggerChain() {
        return loggerChain;
    }
}
