package pages;

public class CarritoSauceDemo extends BasePage{

    private String btnEliminar1 = "//button[@id='remove-sauce-labs-backpack']";
    private String btnEliminar2 = "//button[@id='remove-sauce-labs-bike-light']";
    private String btnCheckout = "//button[@id='checkout']";

    
    public CarritoSauceDemo(){
        super(driver);
    }

    public void eliminarProducto(){
        clickElement(btnEliminar1);
        clickElement(btnEliminar2);
    }

    public void continuarCompra(){
        clickElement(btnCheckout);
    }


}
