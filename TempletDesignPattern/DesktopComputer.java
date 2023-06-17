package LLD.TempletDesignPattern;

public class DesktopComputer extends ComputerManufacturer{
    @Override
    public int addHardDisk(){
        return 500;
    }

    @Override
    int addRam() {
        return 8;
    }

    @Override
    String addKeyBoard() {
        return "Use external keyboard";
    }
}
