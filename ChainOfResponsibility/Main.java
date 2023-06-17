package LLD.ChainOfResponsibility;

public class Main {

    public static Logger doChaining(){
        Logger consoleLogger = new ConsoleLogger(Logger.OUTPUTINFO);
        Logger errorLogger = new ErrorLogger(Logger.ERRORINFO);
        Logger debugLogger = new DebugLogger(Logger.DEBUGINFO);

        consoleLogger.setNextLevelLogger(errorLogger);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
        Logger chaining = doChaining();
        chaining.logMessage(Logger.OUTPUTINFO, "Enter the sequence of value");
        System.out.println();
        chaining.logMessage(Logger.DEBUGINFO, " An Error is occurred now");
        System.out.println();
        chaining.logMessage(Logger.DEBUGINFO, "This is an error debugging");
    }
}
