package LLD.FacadeDesignPattern;

public class Oneplus implements MobileShop{
    @Override
    public void modelName(){
        System.out.println("Onepuls 10 pro is available only");
    }

    @Override
    public void price(){
        System.out.println("Price of the model is Rs.70000/-");
    }
}
