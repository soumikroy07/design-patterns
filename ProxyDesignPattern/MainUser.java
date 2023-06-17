package LLD.ProxyDesignPattern;

public class MainUser {
    public static void main(String[] args) {
        OfficeInternetAccess internet = new ProxyInternetAccess("Soumik");
        internet.grandInternetAccess();
    }
}
