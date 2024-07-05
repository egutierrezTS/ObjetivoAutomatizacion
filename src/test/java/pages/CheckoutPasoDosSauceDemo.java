package pages;

public class CheckoutPasoDosSauceDemo extends BasePage{

    private String btnFinish = "//button[@id='finish']";
    private String btnCancel = "//button[@id='cancel']";

    
    public CheckoutPasoDosSauceDemo(){
        super(driver);
    }

    public void clickFinalizar() {
        clickElement(btnFinish);
    }

}
