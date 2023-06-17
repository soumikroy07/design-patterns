package LLD.commandDesignPattern;

public class OffCommand implements Command{
    Television television;

    OffCommand(Television television){
        this.television = television;
    }


    @Override
    public void execute() {
        television.switchOff();
    }
}
