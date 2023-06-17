package LLD.FacadeDesignPattern;

public class Samsung implements MobileShop{

    @Override
    public void modelName() {
        System.out.println("Samsung S20 is available");
    }

    @Override
    public void price() {
        System.out.println("price of Samsung S20 Rs.60000/-");
    }
}
