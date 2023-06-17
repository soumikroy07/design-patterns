package LLD.TempletDesignPattern;

public class LaptopManufacturer extends ComputerManufacturer{
    @Override
    int addHardDisk() {
        return 1024;
    }

    @Override
    int addRam() {
        return 16;
    }

    @Override
    String addKeyBoard() {
        return "Use in-build key board";
    }
}
