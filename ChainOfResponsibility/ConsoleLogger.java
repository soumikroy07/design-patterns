package LLD.ChainOfResponsibility;

public class ConsoleLogger extends Logger{

    public ConsoleLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String message){
        System.out.println("Console Logger Info : "+message);
    }

}
