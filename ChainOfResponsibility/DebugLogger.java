package LLD.ChainOfResponsibility;

public class DebugLogger extends Logger{

    public DebugLogger(int levels) {
        this.levels = levels;
    }


    @Override
    protected void displayLogInfo(String message) {
        System.out.println("Debug Logger Info : "+message);
    }
}
