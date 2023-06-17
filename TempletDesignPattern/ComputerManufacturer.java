package LLD.TempletDesignPattern;

public abstract class ComputerManufacturer {
    void buildComputer(){
        int hardDiskSize = addHardDisk();
        int ramSize = addRam();
        String keyBoard = addKeyBoard();

        System.out.println("Hard disk size : " + hardDiskSize + "GB Ram size : " + ramSize + "GB " + keyBoard);
    }

    abstract int addHardDisk();
    abstract int addRam();
    abstract String addKeyBoard();
}
