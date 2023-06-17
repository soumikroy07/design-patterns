package LLD.AdopterDeisignPattern.Driver;

public class Main {
    public static void main(String[] args) {
        CromeDeiver crome = new CromeDeiver();
        crome.getElement();
        crome.selectElement();

        IEDriver explorer = new IEDriver();
        explorer.findElement();
        explorer.clickElement();

        WbDriver adapter = new WebDriverAdapter(explorer);
        adapter.getElement();
        adapter.selectElement();
    }
}
