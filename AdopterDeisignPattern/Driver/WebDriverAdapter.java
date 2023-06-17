package LLD.AdopterDeisignPattern.Driver;

// This is used as adopter class

public class WebDriverAdapter implements WbDriver{

    IEDriver ieDriver;

    public WebDriverAdapter(IEDriver ieDriver) {
        this.ieDriver = ieDriver;
    }

    @Override
    public void getElement() {
        ieDriver.clickElement();
    }

    @Override
    public void selectElement() {
        ieDriver.findElement();
    }
}
