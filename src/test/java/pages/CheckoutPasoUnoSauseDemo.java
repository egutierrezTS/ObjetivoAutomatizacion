package pages;

public class CheckoutPasoUnoSauseDemo extends BasePage{

    private String lblNombre = "//input[@id='first-name']";
    private String lblApellido = "//input[@id='last-name']";
    private String lblCodigoPostal = "//input[@id='postal-code']";
    private String btnContinuar = "//input[@id='continue']";


    public CheckoutPasoUnoSauseDemo(){
        super(driver);
    }

    public void ingresoDatosUsuario(){
        write(lblNombre, "Carlitos");
        write(lblApellido, "Lechuga");
        write(lblCodigoPostal, "12345");
    }

    public void continuarCompra(){
        clickElement(btnContinuar);
    }

}
