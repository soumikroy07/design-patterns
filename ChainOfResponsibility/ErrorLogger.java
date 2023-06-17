package LLD.ChainOfResponsibility;

public class ErrorLogger extends Logger{

    public ErrorLogger(int levels){
        this.levels = levels;
    }


    @Override
    protected void displayLogInfo(String message) {
        System.out.println("Error logger info : "+message);
    }
}
