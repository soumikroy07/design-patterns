package LLD.ProxyDesignPattern;

public class RealInternetAccess implements OfficeInternetAccess{

    String employeeName;

    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grandInternetAccess(){
        System.out.println(this.employeeName + " your internet access is granted");
    }
}
