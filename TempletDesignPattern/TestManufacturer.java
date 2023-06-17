package LLD.TempletDesignPattern;

public class TestManufacturer {
    public static void main(String[] args) {
        ComputerManufacturer manufacturer1 = new DesktopComputer();
        manufacturer1.buildComputer();

        ComputerManufacturer manufacturer2 = new LaptopManufacturer();
        manufacturer2.buildComputer();
    }
}
