package LLD.FactoryMethodDP;

public abstract class Plan {
    protected int rate;
    abstract void getRate();
    public void calculateBill(int unit){
        System.out.println("Rate is this plan is " +this.rate);
        System.out.println("Total bill "+ (rate * unit));
    }
}
