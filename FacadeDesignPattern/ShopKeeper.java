package LLD.FacadeDesignPattern;

// facade : It holds all complex code inside the class

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop oneplus;

    public ShopKeeper() {
        this.iphone = new IPhone();
        this.samsung = new Samsung();
        this.oneplus = new Oneplus();
    }

    public void iPhoneSale(){
        iphone.modelName();
        iphone.price();
    }

    public void samsungSale(){
        samsung.modelName();
        samsung.price();
    }

    public void oneplusSale(){
        oneplus.modelName();
        oneplus.price();
    }
}
