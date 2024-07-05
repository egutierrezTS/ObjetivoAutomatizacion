package steps;

import io.cucumber.java.en.*;
import pages.*;

public class SauceDemoSteps {

    InicioSesionSauseDemo inSesPage = new InicioSesionSauseDemo();
    InventarioSauseDemo inventarioPage = new InventarioSauseDemo();
    CarritoSauceDemo carritoPage = new CarritoSauceDemo();
    CheckoutPasoUnoSauseDemo checkPaso1 = new CheckoutPasoUnoSauseDemo();
    CheckoutPasoDosSauceDemo checkPaso2 = new CheckoutPasoDosSauceDemo();
    CheckoutCompletoSauceDemo checkCompleto = new CheckoutCompletoSauceDemo();

    @Given("El usuario navega a www.saucedemo.com")
    public void navigateToSD(){
        inSesPage.navigateToSauceDemo();
    }

    @When("El usuario ingresa sus credenciales de acceso")
    public void ingresoCredenciales(){
        inSesPage.ingresoUsuario("standard_user");
        inSesPage.ingresoContrasena("secret_sauce");
    }

    @Then("El usuario es redidigido a la pagina de inicio")
    public void loginButton(){
        inSesPage.clickLogin();
    }

    @Given("El usuario agrega productos al carrito de compras")
    public void agregaProductos(){
        inventarioPage.addToCart();
    }
    
    @When("El usuario debe visualizar y eliminar productos en el carrito")
    public void viewDelete(){
        inventarioPage.clickCarrito();
        carritoPage.eliminarProducto();
    }

    @Then("El usuario debe seguir el flujo de checkout")
    public void flujoCheckout(){
        carritoPage.continuarCompra();
        checkPaso1.ingresoDatosUsuario();
        checkPaso1.continuarCompra();
        checkPaso2.clickFinalizar();
        checkCompleto.volverInicio();
    }

}
