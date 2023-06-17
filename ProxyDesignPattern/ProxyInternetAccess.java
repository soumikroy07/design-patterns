package LLD.ProxyDesignPattern;

public class ProxyInternetAccess implements OfficeInternetAccess{

    String employeeName;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    RealInternetAccess internet;
    @Override
    public void grandInternetAccess() {
        if(getRoleRatting(employeeName) > 4){
            internet = new RealInternetAccess(employeeName);
            internet.grandInternetAccess();
        }else {
            System.out.println(this.employeeName+ " Sorry..!! your Internet Access is not granted ");
        }
    }

    private int getRoleRatting(String employeeName) {
        // fetch the data from DB

        return 5;
    }
}
