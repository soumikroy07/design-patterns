package LLD.ChainOfResponsibility;

public abstract class Logger {
    
    public static int OUTPUTINFO = 1; // console logger
    public static int ERRORINFO = 2; // Error logger
    public static int DEBUGINFO = 3; // Debug logger
    protected int levels;
    protected Logger nextLevelLogger;

    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }
    
    public void logMessage(int levels, String message){
        if(this.levels <= levels){
            displayLogInfo(message);
        }
        if (nextLevelLogger != null){
            nextLevelLogger.logMessage(levels,message);
        }
    }

    protected abstract void displayLogInfo(String message);
}
