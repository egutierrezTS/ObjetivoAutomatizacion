package pages;

public class InventarioSauseDemo extends BasePage{

    private String btnAddtoCart1 = "//button[@id='add-to-cart-sauce-labs-backpack']";
    private String btnAddtoCart2 = "//button[@id='add-to-cart-sauce-labs-bike-light']";
    private String btnAddtoCart3 = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']";
    private String btnAddtoCart4 = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']";
    private String btnAddtoCart5 = "//button[@id='add-to-cart-sauce-labs-onesie']";
    private String btnAddtoCart6 = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']";
    private String btnCarrito = "//a[@class='shopping_cart_link']";

    
    public InventarioSauseDemo(){
        super(driver);
    }


    public void addToCart(){
        clickElement(btnAddtoCart1);
        clickElement(btnAddtoCart2);
        clickElement(btnAddtoCart3);
        clickElement(btnAddtoCart4);
        clickElement(btnAddtoCart5);
        clickElement(btnAddtoCart6);
    }

    public void clickCarrito(){
        clickElement(btnCarrito);
    }
}
