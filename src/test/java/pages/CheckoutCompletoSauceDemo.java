package pages;

public class CheckoutCompletoSauceDemo extends BasePage{

    private String btnBackHome = "//button[@id='back-to-products']";

    public CheckoutCompletoSauceDemo(){
        super(driver);
    }

    public void volverInicio(){
        clickElement(btnBackHome);
    }
    
}
