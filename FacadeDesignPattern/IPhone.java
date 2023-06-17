package LLD.FacadeDesignPattern;

public class IPhone implements MobileShop{

    @Override
    public void modelName() {
        System.out.println("iPhone 12 is available");
    }

    @Override
    public void price() {
        System.out.println("iPhone price is Rs.100000/-");
    }
}
