package LLD.commandDesignPattern;

public class OnCommand implements Command{

    Television television;

    OnCommand(Television television){
        this.television = television;
    }
    @Override
    public void execute() {
        television.switchOn();
    }
}
