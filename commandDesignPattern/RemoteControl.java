package LLD.commandDesignPattern;

// invoker class
public class RemoteControl {
    private Command command;

    void pressButton(){
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
