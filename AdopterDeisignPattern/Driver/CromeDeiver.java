package LLD.AdopterDeisignPattern.Driver;

public class CromeDeiver implements WbDriver{

    @Override
    public void getElement(){
        System.out.println("Get element from crome driver");
    }

    @Override
    public void selectElement() {
        System.out.println("Select element from crome driver");
    }
}
